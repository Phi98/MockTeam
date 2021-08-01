package net.mock.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import net.mock.entity.TATSEntity;
import net.mock.hibernate.HibernateUtil;

public class TATSDAO {

		
		public List<TATSEntity> listTATS( String id_nk) {
			try {
				HibernateUtil hu = new HibernateUtil();
				SessionFactory sf = hu.getSessionFactory();
				Session session = sf.openSession();
				session.beginTransaction();

				List<TATSEntity> list = session.createQuery("from TATSEntity qt  where  qt.id_nk.id_NK= '"+id_nk+"'", TATSEntity.class).list();
				session.getTransaction().commit();
				return list;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return null;
			}

		}
	
		

	}
