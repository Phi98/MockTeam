package net.mock.dao;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.mock.entity.GKSEntity;
import net.mock.entity.NhanKhauEntity;
import net.mock.entity.ToDanPhoEntity;
import net.mock.hibernate.HibernateUtil;

public class NhanKhauDAO {
	public List<NhanKhauEntity> listNhanKhauSHK(String id_SHK) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			List<NhanKhauEntity> list = session.createQuery(
					"from NhanKhauEntity nk where nk.id_SHK.id_SHK='" + id_SHK + "' and nk.trangthai <> :id",
					NhanKhauEntity.class).setParameter("id", "Chờ duyệt").list();
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}

	public List<NhanKhauEntity> listNhanKhauTo(int to) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			List<NhanKhauEntity> list = session
					.createQuery("from NhanKhauEntity nk where nk.id_SHK.id_ToDanPho.id_ToDanPho=" + to + " ",
							NhanKhauEntity.class)
					.list();
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}

	public String autoNK() {
		String auto = null;

		while (getNhanKhau(auto) == null) {

			Random generator = new Random();
			int i = generator.nextInt(1000000);
			if (i < 10)
				auto = "DNNK00000" + i;
			else if (i < 100 && i > 9)
				auto = "DNNK0000" + i;
			else if (i < 1000 && i > 99)
				auto = "DNNK000" + i;
			else if (i < 10000 && i > 999)
				auto = "DNNK00" + i;
			else if (i < 100000 && i > 9999)
				auto = "DNNK0" + i;
			else if (i < 1000000 && i > 99999)
				auto = "DNNK" + i;

			return auto;
		}
		return auto;
	}

	public NhanKhauEntity getNhanKhau(String id_nk) {

		NhanKhauEntity nke = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();

			nke = session.get(NhanKhauEntity.class, id_nk);

			session.getTransaction().commit();
//		sf.close();
			return nke;
		} catch (Exception e) {

			e.printStackTrace();
			return null;

		}

	}

	public boolean addNK(NhanKhauEntity nke) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(nke);
			session.getTransaction().commit();
//			sf.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteNK(String id_nk) {
		try {
			NhanKhauDAO nkDao = new NhanKhauDAO();
			NhanKhauEntity nke = nkDao.getNhanKhau(id_nk);
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.delete(nke);
			session.getTransaction().commit();
//			sf.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public NhanKhauEntity getNhanKhauCMND(String soCMND) {

		NhanKhauEntity nke = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();
			// CMNDEntity cmnd = new CMNDDAO().getCMND(soCMND);
			nke = (NhanKhauEntity) session
					.createQuery("from NhanKhauEntity nk where nk.soCMND.soCMND='" + soCMND + "'", NhanKhauEntity.class)
					.uniqueResult();

			session.getTransaction().commit();
//		sf.close();
			return nke;
		} catch (Exception e) {

			e.printStackTrace();
			return null;

		}
	}

	public List<NhanKhauEntity> listNhanKhau(String id_nk) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			List<NhanKhauEntity> list = session
					.createQuery("from NhanKhauEntity nk where nk.id_nk.id_nk='" + id_nk + "'", NhanKhauEntity.class)
					.list();
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}

	public List<NhanKhauEntity> listNK() {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			String hql = "from NhanKhauEntity";
			List<NhanKhauEntity> list = session.createQuery(hql, NhanKhauEntity.class).list();

			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	public List<ToDanPhoEntity> listTDP() {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			String hql = "from ToDanPhoEntity";
			List<ToDanPhoEntity> list = session.createQuery(hql, ToDanPhoEntity.class).list();

			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		List<NhanKhauEntity> list = new NhanKhauDAO().listNhanKhauTo(1);
		for (NhanKhauEntity nhanKhauEntity : list) {
			System.out.println(nhanKhauEntity.getId_NK());
		}
	}

}
