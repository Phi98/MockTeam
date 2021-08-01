package net.mock.dao;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.mock.entity.QTHTEntity;
import net.mock.hibernate.HibernateUtil;

public class QTHTDAO {
	
	public List<QTHTEntity> listQTHT( String id_nk) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			List<QTHTEntity> list = session.createQuery("from QTHTEntity qt  where  qt.id_nk.id_NK= '"+id_nk+"'and qt.trangthai <> :id", QTHTEntity.class).setParameter("id","chờ duyệt").list();
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}
	public String autoQTHT() {
		String auto = null;

		while (new QTHTDAO().getQTHT((auto)) == null) {

			Random generator = new Random();
			int i = generator.nextInt(10000);
			if (i < 10)
				auto = "DNQTHT000" + i;
			else if (i < 100 && i > 9)
				auto = "DNQTHT00" + i;
			else if (i < 1000 && i > 99)
				auto = "DNQTHT0" + i;
			else if (i < 10000 && i > 999)
				auto = "DNQTHT" + i;	

			return auto;
		}
		return auto;
	}
	public QTHTEntity getQTHT(String soQTHT) {

		QTHTEntity QTHTe = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();

			QTHTe = session.get(QTHTEntity.class, soQTHT);

			session.getTransaction().commit();
//		sf.close();
			return QTHTe;
		} catch (Exception e) {

			e.printStackTrace();
			return null;

		}
	}
	public boolean addQTHT(QTHTEntity QTHTe) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(QTHTe);
			session.getTransaction().commit();
//			sf.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteQTHT(String soQTHT) {
		try {
			QTHTDAO qthtDao = new QTHTDAO();
			QTHTEntity QTHTe = qthtDao.getQTHT(soQTHT);
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.delete(QTHTe);
			session.getTransaction().commit();
//			sf.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public List<QTHTEntity> listQTHTCB(int to) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			List<QTHTEntity> list = session.createQuery("from QTHTEntity qt where qt.trangthai = :id and qt.id_nk.id_SHK.id_ToDanPho.id_ToDanPho = '"+to+"'", QTHTEntity.class).setParameter("id","chờ duyệt").list();
			
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}
	
	
	public static void main(String[] args) {

		QTHTDAO sc = new QTHTDAO();
		List<QTHTEntity> a = sc.listQTHTCB(1);

		for (QTHTEntity qthtEntity : a) {
			System.out.println(qthtEntity.getId_qtht());
		}
}}
