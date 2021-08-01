package net.mock.dao;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.mock.entity.STVEntity;
import net.mock.hibernate.HibernateUtil;

public class STVDAO {
	
	public List<STVEntity> listTV( String id) {
		try {
	
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			List<STVEntity> list = session.createQuery("from STVEntity qt  where  qt.id_nk.id_NK= '"+id+"'and qt.trangthai <>:idd", STVEntity.class).setParameter("idd","Chờ duyệt").list();
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}
	
	public List<STVEntity> listSTV(int to) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			List<STVEntity> list = session.createQuery("from STVEntity qt where qt.trangthai = :id  and qt.id_nk.id_SHK.id_ToDanPho.id_ToDanPho = '" + to + "'",STVEntity.class).setParameter("id","chờ duyệt").list();
	
			

			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}
	
	
	public String autoGTV() {
		String auto = null;

		while (new STVDAO().getGTV((auto)) == null) {

			Random generator = new Random();
			int i = generator.nextInt(100000);
			if (i < 10)
				auto = "DNGTV0000" + i;
			else if (i < 100 && i > 9)
				auto = "DNGTV000" + i;
			else if (i < 1000 && i > 99)
				auto = "DNGTV00" + i;
			else if (i < 10000 && i > 999)
				auto = "DNGTV0" + i;
			else if (i < 100000 && i > 9999)
				auto = "DNGTV" + i;

			return auto;
		}
		return auto;
	}
	public STVEntity getGTV(String soGTV) {

		STVEntity gtve = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();

			gtve = session.get(STVEntity.class, soGTV);

			session.getTransaction().commit();
//		sf.close();
			return gtve;
		} catch (Exception e) {

			e.printStackTrace();
			return null;

		}
	}
	public boolean addGTV(STVEntity gtve) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(gtve);
			session.getTransaction().commit();
//			sf.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public boolean deleteSTV(String soTV) {
		try {
			STVDAO STVDAO = new STVDAO();
			STVEntity STVe = STVDAO.getGTV(soTV);
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.delete(STVe);
			session.getTransaction().commit();
//			sf.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(new STVDAO().autoGTV());


	}

	
}
