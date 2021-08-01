
package net.mock.dao;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.mock.entity.CMNDEntity;
import net.mock.entity.GKSEntity;
import net.mock.hibernate.HibernateUtil;

public class CMNDDAO {
	public String autoCMND() {
		String auto = null;

		while (getCMND(auto) == null) {

			Random generator = new Random();
			int i = generator.nextInt(1000000000);
			if (i < 10)
				auto = "99900000000" + i;
			else if (i < 100 && i > 9)
				auto = "9990000000" + i;
			else if (i < 1000 && i > 99)
				auto = "999000000" + i;
			else if (i < 10000 && i > 999)
				auto = "99900000" + i;
			else if (i < 100000 && i > 9999)
				auto = "9990000" + i;
			else if (i < 1000000 && i > 99999)
				auto = "999000" + i;
			else if (i < 10000000 && i > 999999)
				auto = "99900" + i;
			else if (i < 100000000 && i > 9999999)
				auto = "9990" + i;
			else if (i < 1000000000 && i > 99999999)
				auto = "999" + i;
			return auto;
		}
		return auto;
	}

	public boolean deleteCMND(String soCMND) {
		try {
			CMNDDAO cmndDao = new CMNDDAO();
			CMNDEntity cmnde = cmndDao.getCMND(soCMND);
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.delete(cmnde);
			session.getTransaction().commit();
//			sf.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public CMNDEntity getCMND(String soCMND) {

		CMNDEntity cmnde = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();

			cmnde = session.get(CMNDEntity.class, soCMND);

			session.getTransaction().commit();
//		sf.close();
			return cmnde;
		} catch (Exception e) {

			e.printStackTrace();
			return null;

		}
	}
	
	public List<CMNDEntity> listCMND() {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			List<CMNDEntity> list = session.createQuery("from CMNDEntity",CMNDEntity.class).list();

			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}
	

	public List<CMNDEntity> listCMNDCB() {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			
			String hql = "from CMNDEntity as s where NOT EXISTS" + 
			             "(FROM NhanKhauEntity as st WHERE s.soCMND = st.soCMND)";
			List<CMNDEntity> list = session.createQuery(hql, CMNDEntity.class).list();
			
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	
	public boolean addCMND(CMNDEntity cmnde) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(cmnde);
			session.getTransaction().commit();
//			sf.close();
			return true;
		} catch (Exception e
				) {
			e.printStackTrace();
			return false;
		}
	}

	public static void main(String[] args) {
//		System.out.println(new CMNDDAO().getCMND("032852336633").getTenCMND());
//		System.out.println(new CMNDDAO().autoCMND());
		

		List<CMNDEntity> list = new CMNDDAO().listCMNDCB();
		
		for (CMNDEntity gksEntity : list) {
			System.out.println(gksEntity.getSoCMND());
		}
	}
}
