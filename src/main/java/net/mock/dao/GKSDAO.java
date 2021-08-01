package net.mock.dao;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.mock.entity.GKSEntity;
import net.mock.entity.NhanKhauEntity;
import net.mock.hibernate.HibernateUtil;


public class GKSDAO {
	public String autoGKS() {
		String auto = null;

		while (getGKS(auto) == null) {

			Random generator = new Random();
			int i = generator.nextInt(100000);
			if (i < 10)
				auto = "DNGKS0000" + i;
			else if (i < 100 && i > 9)
				auto = "DNGKS000" + i;
			else if (i < 1000 && i > 99)
				auto = "DNGKS00" + i;
			else if (i < 10000 && i > 999)
				auto = "DNGKS0" + i;
			else if (i < 100000 && i > 9999)
				auto = "DNGKS" + i;

			return auto;
		}
		return auto;
	}

	public boolean addGKS(GKSEntity gks) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(gks);
			session.getTransaction().commit();
//			sf.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public GKSEntity getGKS(String soGKS) {

		GKSEntity gks = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();

			gks = session.get(GKSEntity.class, soGKS);

			session.getTransaction().commit();
//		sf.close();
			return gks;
		} catch (Exception e) {

			e.printStackTrace();
			return null;

		}
	}
	
	
	public List<GKSEntity> listGKSCB() {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			
			String hql = "from GKSEntity as s where NOT EXISTS" + 
			             "(FROM NhanKhauEntity as st WHERE s.soGKS = st.soGKS)";
			List<GKSEntity> list = session.createQuery(hql, GKSEntity.class).list();
			
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	
	public List<NhanKhauEntity> listNKCB(int to) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			List<NhanKhauEntity> list = session.createQuery("from NhanKhauEntity qt where qt.trangthai = :id  and qt.id_SHK.id_ToDanPho.id_ToDanPho = '" + to + "'",NhanKhauEntity.class).setParameter("id","Chờ duyệt").list();

			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}
	
	public boolean deleteGKS(String soGKS) {
		try {
			GKSDAO gksdao = new GKSDAO();
			GKSEntity GKSe = gksdao.getGKS(soGKS);
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.delete(GKSe);
			session.getTransaction().commit();
//			sf.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static void main(String[] args) {

		List<GKSEntity> list = new GKSDAO().listGKSCB();
		
		for (GKSEntity gksEntity : list) {
			System.out.println(gksEntity.getSoGKS());
		}
}}