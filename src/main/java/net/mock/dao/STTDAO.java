package net.mock.dao;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.mock.entity.STTEntity;
import net.mock.hibernate.HibernateUtil;

public class STTDAO {
	
	public String autoSTT() {
		String auto = null;

		while (getSTT(auto) == null) {

			Random generator = new Random();
			int i = generator.nextInt(100000);
			if (i < 10)
				auto = "DNSTT0000" + i;
			else if (i < 100 && i > 9)
				auto = "DNSTT000" + i;
			else if (i < 1000 && i > 99)
				auto = "DNSTT00" + i;
			else if (i < 10000 && i > 999)
				auto = "DNSTT0" + i;
			else if (i < 100000 && i > 9999)
				auto = "DNSTT" + i;

			return auto;
		}
		return auto;
	}
	public STTEntity getSTT(String soSTT) {

		STTEntity gtve = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();

			gtve = session.get(STTEntity.class, soSTT);

			session.getTransaction().commit();
//		sf.close();
			return gtve;
		} catch (Exception e) {

			e.printStackTrace();
			return null;

		}
	}
	
	public boolean deleteSTT(String soTT) {
		try {
			STTDAO sttDAO = new STTDAO();
			STTEntity stte = sttDAO.getSTT(soTT);
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.delete(stte);
			session.getTransaction().commit();
//			sf.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public boolean addSTT(STTEntity gtve) {
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
	public List<STTEntity> listTT( String id) {
		try {
	
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			List<STTEntity> list = session.createQuery("from STTEntity qt  where  qt.id_SHK.id_SHK= '"+id+"' and qt.trangThai<>:idd", STTEntity.class).setParameter("idd","chờ duyệt").list();
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}
	
	public List<STTEntity> listSTT(int to) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			List<STTEntity> list = session.createQuery("from STTEntity qt where qt.trangThai = :id  and qt.id_SHK.id_ToDanPho.id_ToDanPho = '" + to + "'",STTEntity.class).setParameter("id","chờ duyệt").list();

			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}
	
	
	public static void main(String[] args) {
		
		List<STTEntity> list  = new STTDAO().listTT("DNSHK00000");
		for (STTEntity sttEntity : list) {
			System.out.println(sttEntity.getSoCMND().getSoCMND());
		}



	}
	
}
