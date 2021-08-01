
package net.mock.dao;



import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.mock.entity.NhanKhauEntity;
import net.mock.entity.SoHoKhauEntity;
import net.mock.hibernate.HibernateUtil;

public class SoHoKhauDAO {
	public String autoSHK() {
		String auto = null;

		while (new SoHoKhauDAO().getSoHoKhau(auto) == null) {

			Random generator = new Random();
			int i = generator.nextInt(100000);
			if (i < 10)
				auto = "DNSHK0000" + i;
			else if (i < 100 && i > 9)
				auto = "DNSHK000" + i;
			else if (i < 1000 && i > 99)
				auto = "DNSHK00" + i;
			else if (i < 10000 && i > 999)
				auto = "DNSHK0" + i;
			else if (i < 100000 && i > 9999)
				auto = "DNSHK" + i;

			return auto;
		}
		return auto;
	}

	public List<SoHoKhauEntity> listSHK() {
		try {
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();

			List<SoHoKhauEntity> list = session.createQuery("from SoHoKhauEntity",SoHoKhauEntity.class).list();

			session.getTransaction().commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}
//	}	public SoHoKhauEntity getSoHoKhau(String id_SHK) {
		try {
			SoHoKhauEntity shke = null;
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			shke = session.get(SoHoKhauEntity.class, id_SHK);
			session.getTransaction().commit();
//			sf.close();
			return shke;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	
	}

public boolean checkSHKCMND(String id_shk,String soCMND) {
	if(new SoHoKhauDAO().getSoHoKhau(id_shk)==null ) return false; 
	NhanKhauDAO nkd = new NhanKhauDAO();
	SoHoKhauEntity shke = new SoHoKhauDAO().getSoHoKhau(id_shk);
	NhanKhauEntity nke = nkd.getNhanKhauCMND(soCMND);
	
	if(shke.getId_SHK().equals(nke.getId_SHK().getId_SHK())) return true;
	else 	return false;	
}
public static void main(String[] args) {	
	NhanKhauDAO nkd = new NhanKhauDAO();
//	NhanKhauEntity nke = nkd.getNhanKhauCMND("032852336633");
//	System.out.println(nke.getId_SHK().getId_SHK());
//	System.out.println( new SoHoKhauDAO().getSoHoKhau("DNSHK00000").getId_SHK());
//	if(new SoHoKhauDAO().checkSHKCMND("DNSHK00000", "032852669322")) System.out.println("hi");;
//	List<SoHoKhauEntity> shk = new SoHoKhauDAO().listSHK();
//	for (SoHoKhauEntity soHoKhauEntity : shk) {
//		System.out.println(soHoKhauEntity.getId_SHK());
//	}
	System.out.println(new SoHoKhauDAO().autoSHK());
	System.out.println(new SoHoKhauDAO().getSoHoKhau("DNSHK00000"));
}
}