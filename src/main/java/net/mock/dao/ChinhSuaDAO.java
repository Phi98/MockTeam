package net.mock.dao;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.mock.entity.ChinhSuaEntity;

import net.mock.hibernate.HibernateUtil;

public class ChinhSuaDAO {
	public String autoChinhSua() {
		String auto = null;

		while (new ChinhSuaDAO().getChinhSua((auto)) == null) {

			Random generator = new Random();
			int i = generator.nextInt(10000);
			if (i < 10)
				auto = "DNSUA0000" + i;
			else if (i < 100 && i > 9)
				auto = "DNSUA000" + i;
			else if (i < 1000 && i > 99)
				auto = "DNSUA00" + i;
			else if (i < 10000 && i > 999)
				auto = "DNSUA0" + i;	

			return auto;
		}
		return auto;
	}
	public ChinhSuaEntity getChinhSua(String soChinhSua) {

		ChinhSuaEntity ChinhSuae = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();

			ChinhSuae = session.get(ChinhSuaEntity.class, soChinhSua);

			session.getTransaction().commit();
//		sf.close();
			return ChinhSuae;
		} catch (Exception e) {

			e.printStackTrace();
			return null;

		}
	}
	public boolean addChinhSua(ChinhSuaEntity ChinhSuae) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(ChinhSuae);
			session.getTransaction().commit();
//			sf.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
