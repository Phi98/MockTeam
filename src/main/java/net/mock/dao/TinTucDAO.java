package net.mock.dao;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import javassist.expr.NewArray;

import net.mock.entity.NhanKhauEntity;
import net.mock.entity.SoHoKhauEntity;
import net.mock.entity.TinTucEntity;
import net.mock.hibernate.HibernateUtil;

public class TinTucDAO {
	public List<TinTucEntity> listTinTuc(String id_SHK) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			SoHoKhauEntity shke = new SoHoKhauDAO().getSoHoKhau(id_SHK);
			int to = shke.getId_ToDanPho().getId_ToDanPho();
			String hql = "from TinTucEntity nk where nk.username.id_ToDanPho.id_ToDanPho =" + to + "";
			Query query = session.createQuery(hql);
//			query.setFirstResult(f);
//			query.setMaxResults(m);
			List<TinTucEntity> list = query.list();
//		List<TinTucEntity> list = session.createQuery("from TinTucEntity nk where nk.username.id_ToDanPho.id_ToDanPho ="+to+"",TinTucEntity.class).list();
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}
//    public int count() {
//      return 10;
//    }

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<TinTucEntity> findAll(Integer offset) {
		SessionFactory sessionFactory = new HibernateUtil().getSessionFactory();
		return sessionFactory.openSession().createCriteria(TinTucEntity.class).setFirstResult(2).setMaxResults(5)
				.list();
	}

	@SuppressWarnings("unchecked")
	public Long count() {
		SessionFactory sessionFactory = new HibernateUtil().getSessionFactory();
		return (Long) sessionFactory.openSession().createCriteria(TinTucEntity.class)
				.setProjection(Projections.rowCount()).uniqueResult();
	}

	public String autoTinTuc() {
		String auto = null;

		while (new TinTucDAO().getTinTuc((auto)) == null) {

			Random generator = new Random();
			int i = generator.nextInt(10000);
			if (i < 10)
				auto = "DNTIN0000" + i;
			else if (i < 100 && i > 9)
				auto = "DNTIN000" + i;
			else if (i < 1000 && i > 99)
				auto = "DNTIN00" + i;
			else if (i < 10000 && i > 999)
				auto = "DNTIN0" + i;

			return auto;
		}
		return auto;
	}

	public TinTucEntity getTinTuc(String soTinTuc) {

		TinTucEntity TinTuce = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();

			TinTuce = session.get(TinTucEntity.class, soTinTuc);

			session.getTransaction().commit();
//		sf.close();
			return TinTuce;
		} catch (Exception e) {

			e.printStackTrace();
			return null;

		}
	}

	public boolean addTinTuc(TinTucEntity TinTuce) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(TinTuce);
			session.getTransaction().commit();
//			sf.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static void main(String[] args) {
		TinTucEntity tte = new TinTucDAO().getTinTuc("DNTIN00761");
		System.out.println(tte.getNoiDung());
	}
}
