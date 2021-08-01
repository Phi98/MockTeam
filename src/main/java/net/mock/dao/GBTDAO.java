package net.mock.dao;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javassist.expr.NewArray;
import net.mock.entity.GBTEntity;
import net.mock.hibernate.HibernateUtil;

public class GBTDAO {

	public boolean addGBT(GBTEntity gbt) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(gbt);
			session.getTransaction().commit();
//			sf.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public GBTEntity getGBT(String id_gbt) {

		GBTEntity gbt = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();

			gbt = session.get(GBTEntity.class, id_gbt);

			session.getTransaction().commit();
//		sf.close();
			return gbt;
		} catch (Exception e) {

			e.printStackTrace();
			return null;

		}
	}

	public String autoGBT() {
		String auto = null;

		while (getGBT(auto) == null) {

			Random generator = new Random();
			int i = generator.nextInt(100000);
			if (i < 10)
				auto = "DNGBT0000" + i;
			else if (i < 100 && i > 9)
				auto = "DNGBT000" + i;
			else if (i < 1000 && i > 99)
				auto = "DNGBT00" + i;
			else if (i < 10000 && i > 999)
				auto = "DNGBT0" + i;
			else if (i < 100000 && i > 9999)
				auto = "DNGBT" + i;

			return auto;
		}
		return auto;
	}

	public List<GBTEntity> listGBTCB(int to) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			List<GBTEntity> list = session.createQuery("from GBTEntity qt where qt.trangthai = :id  and qt.id_nk.id_SHK.id_ToDanPho.id_ToDanPho = '" + to + "'",GBTEntity.class).setParameter("id","chờ duyệt").list();
	
			

			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}

	public boolean deleteGBT(String soGBT) {
		try {
			GBTDAO gbtDao = new GBTDAO();
			GBTEntity GBTe = gbtDao.getGBT(soGBT);
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.delete(GBTe);
			session.getTransaction().commit();
//			sf.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static void main(String[] args) {

//		GBTDAO sc = new GBTDAO();
//		List<GBTEntity> a = sc.listGBTCB(1);
//
		System.out.println(new GBTDAO().autoGBT());
//		for (GBTEntity qthtEntity : a) {
//			System.out.println(qthtEntity.getTenNguoiLamGiay());
//		}

	}}
