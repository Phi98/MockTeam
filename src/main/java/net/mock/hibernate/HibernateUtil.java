package net.mock.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() { 
		if (sessionFactory == null) {
			try {
				Configuration conf = new Configuration();
				conf.addResource("net/mock/CMND.hbm.xml");
				conf.addResource("net/mock/GKS.hbm.xml");
				conf.addResource("net/mock/ToDanPho.hbm.xml");
				conf.addResource("net/mock/SoHoKhau.hbm.xml");		
				conf.addResource("net/mock/NhanKhau.hbm.xml");
				conf.addResource("net/mock/ToTruong.hbm.xml");
				conf.addResource("net/mock/TinTuc.hbm.xml");
				conf.addResource("net/mock/CountR.hbm.xml");
				conf.addResource("net/mock/STT.hbm.xml");
				conf.addResource("net/mock/QTHT.hbm.xml");
				conf.addResource("net/mock/ChinhSua.hbm.xml");
				conf.addResource("net/mock/TATS.hbm.xml");
				conf.addResource("net/mock/GTV.hbm.xml");
				conf.addResource("net/mock/GBT.hbm.xml");
				conf.configure("net/mock/hibernate.cfg.xml");

				ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
				sessionFactory = conf.buildSessionFactory(sr);

				return sessionFactory;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return sessionFactory;
	}
}
