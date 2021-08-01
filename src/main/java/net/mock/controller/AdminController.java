package net.mock.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.mock.dao.AdminDao;
import net.mock.dao.ChinhSuaDAO;
import net.mock.dao.GBTDAO;
import net.mock.dao.GKSDAO;
import net.mock.dao.NhanKhauDAO;
import net.mock.dao.SoHoKhauDAO;
import net.mock.dao.ToTruongDAO;
import net.mock.entity.AdminEntity;
import net.mock.entity.CMNDEntity;
import net.mock.entity.ChinhSuaEntity;
import net.mock.entity.CountREntity;
import net.mock.entity.GBTEntity;
import net.mock.entity.GKSEntity;
import net.mock.entity.NhanKhauEntity;
import net.mock.entity.STTEntity;
import net.mock.entity.SoHoKhauEntity;
import net.mock.entity.ToDanPhoEntity;
import net.mock.entity.ToTruongEntity;
import net.mock.hibernate.HibernateUtil;
import net.mock.ma.NhanKhauModelAttribute;
import net.mock.ma.SHKModelAttribute;
import net.mock.ma.TTAModelAttribute;

@Controller
public class AdminController {

	@RequestMapping(value = "admin")
	public String loginAD() {
		return "admin/loginAD";
	}

	@RequestMapping(value = "loginAD", method = RequestMethod.POST)
	public String loginAD(@RequestParam(value = "userName") String username, @RequestParam(value = "pw") String pw,
			ModelMap mm, HttpServletRequest request) {

		if (username.equals("admin") && pw.equals("admin")) {

			List<ToTruongEntity> list = new ToTruongDAO().listTT();
			mm.put("lists", list);
			request.getSession().setAttribute("admin", "admin");
		
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			List<CountREntity> list1  = session.createQuery("from CountREntity",CountREntity.class).list();
			CountREntity count = list1.get(list1.size() - 1);
			int count1 = count.getCount();
			request.getSession().setAttribute("count", count1);
			session.getTransaction().commit();
			return "admin/adminHome";
		} else {
			return "admin/loginAD";
		}

	}

	/*
	 * @RequestMapping(value = "add") public String addTT() {
	 * 
	 * 
	 * return "admin/addTT"; }
	 */

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String addTT(ModelMap mm) {
		List<NhanKhauEntity> list = new NhanKhauDAO().listNK();
		List<ToDanPhoEntity> listt = new NhanKhauDAO().listTDP();

		mm.put("list", list);
		mm.put("listt", listt);
		return "admin/addTT";

	}

	@RequestMapping(value = "addTT", method = RequestMethod.POST)
	public String addTTadmin(@ModelAttribute(value = "tte") TTAModelAttribute ttmda, ModelMap mm, HttpSession ss,
			HttpServletRequest request) {
		if(new AdminDao().isValid(ttmda.getEmail())==false) {
			mm.put("email", "email");
			List<NhanKhauEntity> list = new NhanKhauDAO().listNK();
			List<ToDanPhoEntity> listt = new NhanKhauDAO().listTDP();

			mm.put("list", list);
			mm.put("listt", listt);
			return "admin/addTT";
			
		}
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();
//				GBTEntity gbte = new GBTDAO().getGBT(gbtma.getId_gbt());

			NhanKhauEntity nke = new NhanKhauDAO().getNhanKhau(ttmda.getId_NK());
			ToDanPhoEntity tdpe = session.get(ToDanPhoEntity.class, Integer.parseInt(ttmda.getId_ToDanPho()));
			ToTruongEntity tte = new ToTruongEntity(ttmda.getUsername(), nke, ttmda.getPw(), tdpe, ttmda.getEmail());

			session.save(tte);
			session.getTransaction().commit();
			List<ToTruongEntity> list = new ToTruongDAO().listTT();
			mm.put("lists", list);

	
		
			return "admin/adminHome";
		}
		catch (Exception e) {
			// TODO: handle exception
			return "admin/adminHome";
		}
	}

	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String editTT(ModelMap mm, @ModelAttribute(value = "id") String username) {
		ToTruongEntity tte = new ToTruongDAO().getTTusername(username);
		mm.put("tte", tte);
//		List<NhanKhauEntity> list = new NhanKhauDAO().listNK();
//		List<ToDanPhoEntity> listt = new NhanKhauDAO().listTDP();
//		List<ToTruongEntity> listtt = new ToTruongDAO().listTT();
//
//		
//		mm.put("list", list);
//	   mm.put("listt", listt);
//	   mm.put("listtt", listtt);
		return "admin/editTT";

	}

	@RequestMapping(value = "thoatAD")
	public String thoatAD(ModelMap mm, HttpServletRequest request) {

		request.getSession().invalidate();
		return "admin/loginAD";

	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public String editTT(ModelMap mm, @RequestParam(value = "username") String username,
			@RequestParam(value = "pw") String pw, @RequestParam(value = "email") String email) {
		ToTruongEntity tte = new ToTruongDAO().getTTusername(username);
		tte.setPw(pw);
		tte.setEmail(email);
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();
			session.update(tte);
			session.getTransaction().commit();
			List<ToTruongEntity> list = new ToTruongDAO().listTT();
			mm.put("lists", list);

			return "admin/adminHome";

		}

	}

}
