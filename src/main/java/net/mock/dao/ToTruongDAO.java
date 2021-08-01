package net.mock.dao;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.mock.entity.CMNDEntity;
import net.mock.entity.NhanKhauEntity;
import net.mock.entity.STTEntity;
import net.mock.entity.SoHoKhauEntity;
import net.mock.entity.ToTruongEntity;
import net.mock.hibernate.HibernateUtil;

public class ToTruongDAO {

	public ToTruongEntity getTT(String username, String pw) {

		ToTruongEntity tt = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();

			tt = session.get(ToTruongEntity.class, username);

			session.getTransaction().commit();
			if (tt.getPw().equals(pw))
				return tt;
			else
				return null;
//				sf.close();

		} catch (Exception e) {

			e.printStackTrace();
			return null;

		}

	}

	public ToTruongEntity getTTusername(String username) {

		ToTruongEntity tt = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();

			tt = session.get(ToTruongEntity.class, username);

			session.getTransaction().commit();
			return tt;

		} catch (Exception e) {

			e.printStackTrace();
			return null;

		}

	}

	public List<ToTruongEntity> listTT() {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			String hql = "from ToTruongEntity";
			List<ToTruongEntity> list = session.createQuery(hql, ToTruongEntity.class).list();

			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	public ToTruongEntity getPass(String username) {

		ToTruongEntity tt = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();

			tt = session.get(ToTruongEntity.class, username);

			session.getTransaction().commit();
			if (tt.getUsername().equals(username))

				return tt;

			else
				return null;
//				sf.close();

		} catch (Exception e) {

			e.printStackTrace();
			return null;

		}

	}

	public boolean sendEmail(ToTruongEntity tte) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.port", 587);

		// get Session
		javax.mail.Session session = javax.mail.Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("myduyenlethi116@gmail.com", "duchx123");
			}
		});

		// compose message
		try {
			NhanKhauEntity nke = new NhanKhauDAO().getNhanKhau(tte.getId_NK().getId_NK());
			MimeMessage message = new MimeMessage(session);
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(tte.getEmail()));
			CMNDEntity cmnde = new CMNDDAO().getCMND(nke.getSoCMND().getSoCMND());
			message.setSubject(tte.getId_ToDanPho().getId_ToDanPho() + " |" + cmnde.getTenCMND());
			message.setText(tte.getPw());

			// send message
			Transport.send(message);

			System.out.println("Message sent successfully");
			return true;
		} catch (MessagingException e) {
			return false;

		}
	}

	public boolean changePass(String username, String opw, String npass, String npass2) {
		if (!npass.equals(npass2))
			return false;
		else if (new ToTruongDAO().getTT(username, opw) == null)
			return false;
		else {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			ToTruongEntity tte = new ToTruongDAO().getTT(username, opw);
			tte.setPw(npass);
			session.update(tte);
			session.getTransaction().commit();
			return true;
		}
	}

	public List<SoHoKhauEntity> listSHKtt(int id_todanpho, String idCH, String diaChi, String id_shk) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			List<SoHoKhauEntity> list = session.createQuery("from SoHoKhauEntity shk where shk.id_ToDanPho.id_ToDanPho="
					+ id_todanpho + "and shk.id_ChuHo like'%" + idCH + "%' and shk.diaChi like'%" + diaChi
					+ "%'and shk.id_SHK like'%" + id_shk + "%'", SoHoKhauEntity.class).list();
			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}

	public List<NhanKhauEntity> listNKtt(int id_todanpho, String idCH, String id_shk, String diaChi, String ten,
			String CMND, String id_nk) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			List<NhanKhauEntity> list = session.createQuery(
					"from NhanKhauEntity nke where nke.id_SHK.id_ToDanPho.id_ToDanPho=" + id_todanpho
							+ "and nke.id_SHK.id_ChuHo like'%" + idCH + "%' and nke.id_SHK.diaChi like'%" + diaChi
							+ "%' and nke.id_SHK.id_SHK like'%" + id_shk + "%' and nke.soCMND.tenCMND like'%" + ten
							+ "%'and nke.id_NK like'%" + id_nk + "%'and nke.soCMND.soCMND like'%" + CMND + "%'",
					NhanKhauEntity.class).list();

			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}

	public boolean addTT(ToTruongEntity tte) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(tte);
			session.getTransaction().commit();
//			sf.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

//	 public List<GKSEntity> listGKS(String id_NK) {
//			try {
//				HibernateUtil hu = new HibernateUtil();
//				SessionFactory sf = hu.getSessionFactory();
//				Session session = sf.openSession();
//				session.beginTransaction();
//		
//				List<GKSEntity> list = session.createQuery("from GKSEntity gks where gks.id_NK",GKSEntity.class).list();
//			session.getTransaction().commit();
//			return list;
//			} catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//				return null;
//			}
//			
//
//		}
	public List<NhanKhauEntity> listNKC(int id_todanpho) {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			List<NhanKhauEntity> list = session
					.createQuery("from NhanKhauEntity nke where nke.id_SHK.id_ToDanPho.id_ToDanPho=" + id_todanpho + "",
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

	public static void main(String[] args) {

//		ToTruongDAO dao = new ToTruongDAO();
//	System.out.println(dao.getTT("tt01","123").getUsername());
//	System.out.println(dao.getTTusername("tt01"));
//		if(dao.lo) {
//			System.out.println("oke");
//		}
//		else {
//			System.out.println("ceom");
//		}
	List<NhanKhauEntity> list1 = new ToTruongDAO().listNKtt(1, "", "", "", "", "", "");
		for (NhanKhauEntity toTruongEntity : list1) {
			System.out.println(toTruongEntity.getId_NK());
		}
//	System.out.println("xx");
//	List<NhanKhauEntity> list = new ToTruongDAO().listNKC(1);
//	for (NhanKhauEntity toTruongEntity : list) {
//		System.out.println(toTruongEntity.getId_NK());
//	}
	}

}
