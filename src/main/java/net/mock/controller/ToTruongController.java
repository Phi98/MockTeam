package net.mock.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.mock.dao.CMNDDAO;
import net.mock.dao.ChinhSuaDAO;
import net.mock.dao.GBTDAO;
import net.mock.dao.GKSDAO;
import net.mock.dao.NhanKhauDAO;
import net.mock.dao.QTHTDAO;
import net.mock.dao.STTDAO;
import net.mock.dao.STVDAO;
import net.mock.dao.SoHoKhauDAO;
import net.mock.dao.TinTucDAO;
import net.mock.dao.ToTruongDAO;
import net.mock.entity.CMNDEntity;
import net.mock.entity.ChinhSuaEntity;
import net.mock.entity.GBTEntity;
import net.mock.entity.GKSEntity;
import net.mock.entity.NhanKhauEntity;
import net.mock.entity.QTHTEntity;
import net.mock.entity.STTEntity;
import net.mock.entity.STVEntity;
import net.mock.entity.SoHoKhauEntity;
import net.mock.entity.TinTucEntity;
import net.mock.entity.ToDanPhoEntity;
import net.mock.entity.ToTruongEntity;
import net.mock.hibernate.HibernateUtil;
import net.mock.ma.CMNDModelAttribute;
import net.mock.ma.GBTModelAtribute;
import net.mock.ma.GKSModelAttribute;
import net.mock.ma.GTVModelAttribute;
import net.mock.ma.NhanKhauModelAttribute;
import net.mock.ma.QTHTModelAttribute;
import net.mock.ma.SHKCHModelAttribute;
import net.mock.ma.SHKModelAttribute;
import net.mock.ma.STTModelAttribute;
import net.mock.ma.TTModelAttribute;
import net.mock.ma.searchNKModelAttribute;
import net.mock.ma.searchSHKModelAttribute;

@Controller

public class ToTruongController {
	@RequestMapping(value = "totruong")
	public String homePage(ModelMap mm) {

		return "totruong";
	}

	@RequestMapping(value = "resetPass")
	public String resetPass(ModelMap mm) {

		return "canbo/resetPass";
	}

	@RequestMapping(value = "thoatTT")
	public String thoatTT(ModelMap mm, HttpServletRequest request) {
		request.getSession().invalidate();
		return "mainhome";
	}

	@RequestMapping(value = "addCMND", method = RequestMethod.GET)
	public String addCMND(ModelMap mm) {
		List<GKSEntity> list = new GKSDAO().listGKSCB();
		mm.put("list", list);
		return "canbo/addCMND";
	}

	@RequestMapping(value = "viewCMNDCB")
	public String viewCMND(@ModelAttribute(value = "id") String soCMND, ModelMap mm, HttpSession ss) {

		CMNDEntity cmnde = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		cmnde = session.get(CMNDEntity.class, soCMND);
		NhanKhauDAO nkd = new NhanKhauDAO();
		NhanKhauEntity nke = nkd.getNhanKhauCMND(soCMND);
		mm.put("nke", nke);
		SoHoKhauEntity shke = nke.getId_SHK();
		SoHoKhauDAO shkd = new SoHoKhauDAO();
		shke = shkd.getSoHoKhau(shke.getId_SHK());
		mm.put("shke", shke);
		mm.put("cmnde", cmnde);
		mm.put("anh1", cmnde.getGvt1());
		session.getTransaction().commit();
//		sf.close();	
		return "canbo/viewCMNDCB";
	}
	
	@PostMapping(value = "addCMND")
	public String addCMND(@ModelAttribute("cmnd") CMNDModelAttribute cmndmda, ModelMap mm, Model model,
			HttpServletRequest request) {
		if (!cmndmda.getAnh().isEmpty()) {
			try {
				String relativeWebPath = "/resources/images";
				String absoluteFilePath = request.getServletContext().getRealPath(relativeWebPath); // String
				absoluteFilePath = "C:\\Users\\Admin\\eclipse-workspace\\MockTeam\\src\\main\\webapp\\resources\\images\\";
				byte[] bytes = cmndmda.getAnh().getBytes();

				File dir = new File(absoluteFilePath);
				if (!dir.exists()) {
					dir.mkdirs();
				}
				File uploadFile = new File(
						dir.getAbsolutePath() + File.separator + cmndmda.getAnh().getOriginalFilename());

				BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(uploadFile));
				outputStream.write(bytes);
				outputStream.flush();

				outputStream.close();

				CMNDDAO cmnddao = new CMNDDAO();
				CMNDEntity cmnde = new CMNDEntity(cmnddao.autoCMND(), cmndmda.getTenCMND(), cmndmda.getDanToc(),
						cmndmda.getTonGiao(), cmndmda.getNoiLamCMND(), cmndmda.getNote(),
						cmndmda.getAnh().getOriginalFilename(), cmndmda.getNgayCapCMND(),
						new GKSDAO().getGKS(cmndmda.getSoGKS()));

				cmnddao.addCMND(cmnde);

				mm.put("cmnde", cmnde);
				return "viewCMND";
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "viewCMND";
	}

//	   @RequestMapping(value = "hello")
//	   public String hello(ModelMap mm) {
//
//
//		
//			HibernateUtil hu = new HibernateUtil();
//			SessionFactory sf = hu.getSessionFactory();
//			Session session = sf.openSession();
//			session.beginTransaction();
//			CMNDEntity cmnde1 = session.get(CMNDEntity.class, "999678023055");
//			mm.put("anh", cmnde1.getAnh2()+ "\\" +cmnde1.getAnh1());
//			session.getTransaction().commit();
//	      return "hello";
//	   }	  

	@RequestMapping(value = "viewNKCB")
	public String viewNK(@ModelAttribute(value = "id") String id_nk, ModelMap mm, HttpSession ss,
			HttpServletRequest request) {

		NhanKhauEntity nke = null;
		CMNDEntity cmnde = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		nke = session.get(NhanKhauEntity.class, id_nk);
		cmnde = nke.getSoCMND();
		request.getSession().setAttribute("id_nk", id_nk);
		mm.put("nke", nke);
		mm.put("cmnde", cmnde);
		session.getTransaction().commit();
//		sf.close();
		ss.setAttribute("session", "viewNK");
		return "canbo/viewNKTT";
	}

	@RequestMapping(value = "addNKTT")
	public String addNKTT(ModelMap mm) {
		GKSDAO gks = new GKSDAO();
		CMNDDAO cmnd = new CMNDDAO();
		SoHoKhauDAO shk = new SoHoKhauDAO();

		List<GKSEntity> listGKS = gks.listGKSCB();
		List<CMNDEntity> listCMND = cmnd.listCMNDCB();
		List<SoHoKhauEntity> listSHK = shk.listSHK();

		mm.put("listGKS", listGKS);
		mm.put("listCMND", listCMND);
		mm.put("listSHK", listSHK);
		return "canbo/addNKTT";
	}

	@RequestMapping(value = "saveNKTT", method = RequestMethod.POST)
	public String addNKTT(@ModelAttribute(value = "nk") NhanKhauModelAttribute nkma, ModelMap mm,
			HttpServletRequest request) {
		NhanKhauDAO nkDao = new NhanKhauDAO();

		if (!nkma.getAnh().isEmpty()) {
			try {
				String relativeWebPath = "/resources/images";
				String absoluteFilePath = request.getServletContext().getRealPath(relativeWebPath);
//			String absoluteFilePath = "C:\\Users\\Admin\\eclipse-workspace\\MockTeam\\src\\main\\webapp\\resources\\images\\";
				byte[] bytes = nkma.getAnh().getBytes();

				File dir = new File(absoluteFilePath);
				if (!dir.exists()) {
					dir.mkdirs();
				}
				File uploadFile = new File(
						dir.getAbsolutePath() + File.separator + nkma.getAnh().getOriginalFilename());

				BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(uploadFile));
				outputStream.write(bytes);

				outputStream.flush();

				outputStream.close();
//
				if (nkma.getId_SHK().equals("")) {
					nkma.setId_SHK(null);
				}

				NhanKhauEntity nke = new NhanKhauEntity(new NhanKhauDAO().autoNK(), nkma.getTrinhDoVanHoa(),
						nkma.getNgheNghiep(), nkma.getNoiLamViec(), nkma.getQuanHeVoiChuHo(), "Xác nhận",
						nkma.getAnh().getOriginalFilename(), nkma.getNgaySHK(), new GKSDAO().getGKS(nkma.getSoGKS()),
						new CMNDDAO().getCMND(nkma.getSoCMND()), new SoHoKhauDAO().getSoHoKhau(nkma.getId_SHK()));

				nkDao.addNK(nke);

				ToTruongEntity tte = (ToTruongEntity) request.getSession().getAttribute("tte");
				ChinhSuaEntity cse = new ChinhSuaEntity(new ChinhSuaDAO().autoChinhSua(), "NKE", "add" + nke.getId_NK(),
						nke, nke.getId_SHK(), tte.getId_ToDanPho(), tte, new Date());
				new ChinhSuaDAO().addChinhSua(cse);
				int to = tte.getId_ToDanPho().getId_ToDanPho();
				ToTruongDAO ttd = new ToTruongDAO();
				List<NhanKhauEntity> list = ttd.listNKtt(to, "", "", "", "", "", "");
				mm.put("to", to);
				mm.put("list", list);
				return "canbo/listNK";
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "canbo/chon";
	}

	@RequestMapping(value = "editCMND", method = RequestMethod.GET)
	public String addCMND(ModelMap mm, @ModelAttribute(value = "cmnd") String so_cmnd) {
		CMNDDAO cmndDao = new CMNDDAO();
		mm.put("cmnd", cmndDao.getCMND(so_cmnd));
		return "canbo/editCMND";
	}

	@RequestMapping(value = "addTinTuc", method = RequestMethod.GET)
	public String addTinTuc(ModelMap mm, @ModelAttribute(value = "id") String username) {
		mm.put("username", username);
		return "canbo/addTinTuc";
	}

	@RequestMapping(value = "addTinTuc", method = RequestMethod.POST)
	public String addTinTuc(ModelMap mm, HttpServletRequest request, @RequestParam("tieuDe") String tieuDe,
			@RequestParam("noiDungNgan") String noiDungNgan, @RequestParam("noiDungDai") String noiDungDai) {
		ToTruongEntity tte = (ToTruongEntity) request.getSession().getAttribute("tte");
		TinTucEntity ttuc = new TinTucEntity(new TinTucDAO().autoTinTuc(), tte, tieuDe, noiDungNgan, noiDungNgan,
				new Date());
		new TinTucDAO().addTinTuc(ttuc);
		return "canbo/chon";
	}

	@RequestMapping(value = "editCMND", method = RequestMethod.POST)
	public String editCMND(@ModelAttribute(value = "cmnd") CMNDModelAttribute cmndmda, ModelMap mm, HttpSession ss) {
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();

			CMNDEntity cmnde = (CMNDEntity) session.get(CMNDEntity.class, cmndmda.getSoCMND());
			cmnde.setNgayCapCMND(cmndmda.getNgayCapCMND());
			cmnde.setNoiLamCMND(cmndmda.getNoiLamCMND());
			cmnde.setNote(cmndmda.getNote());
			cmnde.setAnh(cmnde.getAnh());
			cmnde.setDanToc(cmndmda.getDanToc());
			cmnde.setTonGiao(cmndmda.getTonGiao());
			session.update(cmnde);
			session.getTransaction().commit();
			mm.put("cmnde", cmnde);
			return "mainhome";
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@RequestMapping(value = "loginTT", method = RequestMethod.POST)
	public String loginTT(@ModelAttribute(value = "totruong") ToTruongEntity tt, ModelMap mm,
			HttpServletRequest request, HttpSession session) {

		ToTruongDAO ttd = new ToTruongDAO();
		ToTruongEntity tte = ttd.getTT(tt.getUsername(), tt.getPw());
		if (tte != null) {
			mm.put("to", tte.getId_ToDanPho().getId_ToDanPho());
			request.getSession().setAttribute("to", tte.getId_ToDanPho().getId_ToDanPho());
			request.getSession().setAttribute("tte", tte);
			request.getSession().setAttribute("id", tte.getId_NK().getId_NK());
			return "canbo/chon";
		}

		else {
			return "totruong";
		}

	}

	@RequestMapping(value = "listSHK", method = RequestMethod.GET)
	public String listSHK(ModelMap mm, @ModelAttribute(value = "id") int to) {

		ToTruongDAO ttd = new ToTruongDAO();
		List<SoHoKhauEntity> list = ttd.listSHKtt(to, "", "", "");
		mm.put("to", to);
		mm.put("list", list);
		return "canbo/listSHK";
	}

	@RequestMapping(value = "searchSHK", method = RequestMethod.POST)
	public String searchSHK(ModelMap mm, @ModelAttribute(value = "id") searchSHKModelAttribute sshkma) {

		ToTruongDAO ttd = new ToTruongDAO();
		List<SoHoKhauEntity> list = ttd.listSHKtt(Integer.parseInt(sshkma.getTo()), "", sshkma.getDiaChi(),
				sshkma.getId_SHK());
		mm.put("to", sshkma.getTo());
		mm.put("list", list);
		return "canbo/listSHK";
	}

	@RequestMapping(value = "listNK", method = RequestMethod.GET)
	public String listNK(ModelMap mm, @ModelAttribute(value = "id") int to) {

		NhanKhauDAO nke = new NhanKhauDAO();
		List<NhanKhauEntity> list = nke.listNhanKhauTo(to);
		mm.put("to", to);
		mm.put("list", list);
		return "canbo/listNK";
	}

	@RequestMapping(value = "searchNK", method = RequestMethod.POST)
	public String searchNK(ModelMap mm, @ModelAttribute(value = "id") searchNKModelAttribute snkma) {

		ToTruongDAO ttd = new ToTruongDAO();
		List<NhanKhauEntity> list = ttd.listNKtt(Integer.parseInt(snkma.getTo()), "", snkma.getId_SHK(),
				snkma.getDiaChi(), snkma.getTenCMND(), snkma.getSoCMND(), "");
		mm.put("to", snkma.getTo());
		mm.put("list", list);
		return "canbo/listNK";
	}

	@RequestMapping(value = "listGKS", method = RequestMethod.GET)
	public String listGKS(ModelMap mm, @ModelAttribute(value = "id") int to) {

		// ToTruongDAO ttd = new ToTruongDAO();
		// List<GKSEntity> list = ttd.listGKStt();
		mm.put("to", to);
		// mm.put("list", list);
		return "canbo/listGKS";
	}

	@RequestMapping(value = "changepassTT", method = RequestMethod.GET)
	public String viewChangePassTT(ModelMap mm) {
		return "canbo/changepass";
	}

	@RequestMapping(value = "changepassTT", method = RequestMethod.POST)
	public String changepassTT(@ModelAttribute(value = "tt") TTModelAttribute tt, ModelMap mm,
			HttpServletRequest request, HttpSession session) {
		ToTruongDAO ttd = new ToTruongDAO();
		if (tt.getRePass() != tt.getRePass1()) {
			mm.put("message", "Repass must equals Repass1 !!!");
			return "canbo/changepass";
		}
		if (ttd.getTT(tt.getUserName(), tt.getPass()) == null) {
			mm.put("ms", "please check username or password !!!");
			return "canbo/changepass";
		}
		if (ttd.changePass(tt.getUserName(), tt.getPass(), tt.getRePass(), tt.getRePass1())) {
			return "mainhome";
		} else {
			return "canbo/changepass";
		}
	}

	@RequestMapping(value = "resetPassTT", method = RequestMethod.POST)
	public String resetPass(@ModelAttribute(value = "username") String username, ModelMap mm,
			HttpServletRequest request, HttpSession session) {

		ToTruongDAO ttd = new ToTruongDAO();
		ToTruongEntity tte = ttd.getTTusername(username);
		if (tte == null) {
			mm.put("no", "no");
			mm.put("tte", tte);
			return "canbo/resetPass";
		}
		if (ttd.sendEmail(tte)) {
			mm.put("tte", tte);
			mm.put("ok", "ok");
			return "totruong";
		} else {
			mm.put("no", "no");
			mm.put("tte", tte);
			return "canbo/resetPass";
		}
	}

	@RequestMapping(value = "listQTHTCB", method = RequestMethod.GET)
	public String listQTHTCB(ModelMap mm, @ModelAttribute(value = "id") int to) {

		QTHTDAO ttd = new QTHTDAO();
		List<QTHTEntity> list = ttd.listQTHTCB(to);

		mm.put("list", list);
		return "canbo/viewQTHTCB";
	}

	@RequestMapping(value = "deleteQTHTCB")
	public String deleteQTHTCB(ModelMap mm, @ModelAttribute(value = "id_qtht") String id_qtht,
			HttpServletRequest request) {
		QTHTEntity qthte = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		qthte = session.get(QTHTEntity.class, id_qtht);
		QTHTDAO ttd = new QTHTDAO();
		NhanKhauEntity nke = qthte.getId_nk();
		SoHoKhauEntity shke = nke.getId_SHK();
		ToTruongEntity tte = (ToTruongEntity) request.getSession().getAttribute("tte");
		ChinhSuaEntity cse = new ChinhSuaEntity(new ChinhSuaDAO().autoChinhSua(), "QTHT", "xóa:" + qthte.getId_qtht(),
				nke, shke, tte.getId_ToDanPho(), tte, new Date());
		new ChinhSuaDAO().addChinhSua(cse);
		ttd.deleteQTHT(id_qtht);
		List<QTHTEntity> list = ttd.listQTHTCB(tte.getId_ToDanPho().getId_ToDanPho());

		mm.put("list", list);
		return "canbo/viewQTHTCB";

	}

	@RequestMapping(value = "addQTHTCB")
	public String addViewQTHTCB(ModelMap mm, @ModelAttribute(value = "qtht") String id_qtht, HttpSession ss,
			HttpServletRequest request) {
		QTHTEntity qthte = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		qthte = session.get(QTHTEntity.class, id_qtht);

		mm.put("list", qthte);
		session.getTransaction().commit();
//		sf.close();
		ss.setAttribute("session", "viewNK");
		return "canbo/editQTHTCB";
	}

	@RequestMapping(value = "addQTHTCB", method = RequestMethod.POST)
	public String addQTHTCB(@ModelAttribute(value = "qtht") QTHTModelAttribute qthtma, ModelMap mm, HttpSession ss,
			HttpServletRequest request) {

		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();
			NhanKhauEntity nke = new NhanKhauDAO().getNhanKhau(qthtma.getId_nk());

			QTHTEntity qthte = (QTHTEntity) session.get(QTHTEntity.class, qthtma.getId_qtht());

			qthte.setDiaChi(qthtma.getDiaChi());
			qthte.setId_nk(nke);
			qthte.setNgayBatDau(qthtma.getNgayBatDau());
			qthte.setNgayKetThuc(qthtma.getNgayKetThuc());
			qthte.setNoiHocTap(qthtma.getNoiHocTap());
			qthte.setTrangthai("Xác nhận");

			session.update(qthte);

			SoHoKhauEntity shke = nke.getId_SHK();
			ToTruongEntity tte = (ToTruongEntity) request.getSession().getAttribute("tte");
			ChinhSuaEntity cse = new ChinhSuaEntity(new ChinhSuaDAO().autoChinhSua(), "QTHT",
					"thêm:" + qthte.getId_qtht(), nke, shke, tte.getId_ToDanPho(), tte, new Date());
			new ChinhSuaDAO().addChinhSua(cse);
			session.getTransaction().commit();
			mm.put("qthte", qthte);
			QTHTDAO ttd = new QTHTDAO();
			List<QTHTEntity> list = ttd.listQTHTCB(tte.getId_ToDanPho().getId_ToDanPho());

			mm.put("list", list);
			return "canbo/viewQTHTCB";
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@RequestMapping(value = "listGBTCB", method = RequestMethod.GET)
	public String listGBTCB(ModelMap mm, @ModelAttribute(value = "id") int to) {

		GBTDAO ttd = new GBTDAO();
		List<GBTEntity> list = ttd.listGBTCB(to);

		mm.put("list", list);
		return "canbo/viewGBTCB";
	}

	@RequestMapping(value = "deleteGBTCB")
	public String deleteGBTCB(ModelMap mm, @ModelAttribute(value = "id_gbt") String id_gbt,
			HttpServletRequest request) {
		GBTEntity gbte = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		gbte = session.get(GBTEntity.class, id_gbt);
		session.getTransaction().commit();
		GBTDAO ttd = new GBTDAO();
		NhanKhauEntity nke = gbte.getId_nk();
		SoHoKhauEntity shke = nke.getId_SHK();
		ToTruongEntity tte = (ToTruongEntity) request.getSession().getAttribute("tte");
		ChinhSuaEntity cse = new ChinhSuaEntity(new ChinhSuaDAO().autoChinhSua(), "GBT", "xóa:" + gbte.getId_gbt(), nke,
				shke, tte.getId_ToDanPho(), tte, new Date());
		new ChinhSuaDAO().addChinhSua(cse);
		ttd.deleteGBT(id_gbt);
		mm.put("gbte", gbte);

		List<GBTEntity> list = ttd.listGBTCB(tte.getId_ToDanPho().getId_ToDanPho());

		mm.put("list", list);
		return "canbo/viewGBTCB";

	}

	@RequestMapping(value = "addGBTCB")
	public String viewGBTCB(ModelMap mm, @ModelAttribute(value = "gbt") String id_gbt, HttpSession ss,
			HttpServletRequest request) {
		GBTEntity gbte = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		gbte = session.get(GBTEntity.class, id_gbt);

		mm.put("list", gbte);
		session.getTransaction().commit();
//		sf.close();
		ss.setAttribute("session", "viewNK");
		return "canbo/editGBTCB";
	}

	@RequestMapping(value = "addGBTCB", method = RequestMethod.POST)
	public String addGBTCB(@ModelAttribute(value = "gbt") GBTModelAtribute gbtma, ModelMap mm, HttpSession ss,
			HttpServletRequest request) {

		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();
//			GBTEntity gbte = new GBTDAO().getGBT(gbtma.getId_gbt());

			GBTEntity gbt = (GBTEntity) session.get(GBTEntity.class, gbtma.getId_gbt());

			NhanKhauEntity nke = new NhanKhauDAO().getNhanKhau(gbtma.getId_nk());
			gbt.setLyDo(gbtma.getLyDo());
			gbt.setId_nk(nke);

			gbt.setTenNguoiLamGiay(gbtma.getTenNguoiLamGiay());
			gbt.setNote(gbtma.getNote());
			gbt.setNoiMat(gbtma.getNoiMat());
			gbt.setNgayMat(gbtma.getNgayMat());
			GKSEntity gkse = new GKSDAO().getGKS(nke.getSoGKS().getSoGKS());
			int namsinh = gkse.getNgaySinh().getYear();
			int tuoi = gbtma.getNgayMat().getYear() - namsinh;
			gbt.setTuoi(tuoi);
			gbt.setTrangthai("Xác nhận");
			session.update(gbt);
//			NhanKhauEntity nke1 = session.get(NhanKhauEntity.class, gbt.getId_nk().getId_NK());
			nke.setTrangthai("mất");
			session.update(nke);
			SoHoKhauEntity shke = nke.getId_SHK();
			ToTruongEntity tte = (ToTruongEntity) request.getSession().getAttribute("tte");
			ChinhSuaEntity cse = new ChinhSuaEntity(new ChinhSuaDAO().autoChinhSua(), "GBT", "thêm:" + gbt.getId_gbt(),
					nke, shke, tte.getId_ToDanPho(), tte, new Date());
			new ChinhSuaDAO().addChinhSua(cse);
			session.getTransaction().commit();
			mm.put("gbte", gbt);

			GBTDAO ttd = new GBTDAO();
			List<GBTEntity> list = ttd.listGBTCB(tte.getId_ToDanPho().getId_ToDanPho());

			mm.put("list", list);
			return "canbo/viewGBTCB";
		} catch (Exception e) {
			e.printStackTrace();
			return "canbo/viewGBTCB";

		}

	}

	// -------------------------------- Sổ tạm Vắng---------

	@RequestMapping(value = "listSTVCB", method = RequestMethod.GET)
	public String listSTVCB(ModelMap mm, @ModelAttribute(value = "id") int to) {

		STVDAO stv = new STVDAO();
		List<STVEntity> list = stv.listSTV(to);

		mm.put("list", list);
		return "canbo/viewSTVCB";
	}

	@RequestMapping(value = "deleteSTVCB")
	public String deleteSTVCB(ModelMap mm, @ModelAttribute(value = "id_GiayTamVang") String id_GiayTamVang,
			HttpServletRequest request) {
		STVEntity stve = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		stve = session.get(STVEntity.class, id_GiayTamVang);
		STVDAO ttd = new STVDAO();
		NhanKhauEntity nke = stve.getId_nk();
		SoHoKhauEntity shke = nke.getId_SHK();
		ToTruongEntity tte = (ToTruongEntity) request.getSession().getAttribute("tte");
		ChinhSuaEntity cse = new ChinhSuaEntity(new ChinhSuaDAO().autoChinhSua(), "QTHT",
				"xóa:" + stve.getId_GiayTamVang(), nke, shke, tte.getId_ToDanPho(), tte, new Date());
		new ChinhSuaDAO().addChinhSua(cse);
		ttd.deleteSTV(id_GiayTamVang);
		STVDAO stv = new STVDAO();
		List<STVEntity> list = stv.listSTV(tte.getId_ToDanPho().getId_ToDanPho());

		mm.put("list", list);
		return "canbo/viewSTVCB";

	}

	@RequestMapping(value = "addSTVCB")
	public String viewSTVCB(ModelMap mm, @ModelAttribute(value = "stv") String id_GiayTamVang, HttpSession ss,
			HttpServletRequest request) {
		STVEntity stve = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		stve = session.get(STVEntity.class, id_GiayTamVang);

		mm.put("list", stve);
		session.getTransaction().commit();
//		sf.close();
		ss.setAttribute("session", "viewNK");

		return "canbo/editSTVCB";
	}

	@RequestMapping(value = "addSTVCB", method = RequestMethod.POST)
	public String addSTVCB(@ModelAttribute(value = "stv") GTVModelAttribute stvma, ModelMap mm, HttpSession ss,
			HttpServletRequest request) {

		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();
//			GBTEntity gbte = new GBTDAO().getGBT(gbtma.getId_gbt());

			STVEntity stv = (STVEntity) session.get(STVEntity.class, stvma.getId_GiayTamVang());

			NhanKhauEntity nke = new NhanKhauDAO().getNhanKhau(stvma.getId_nk());

			stv.setId_nk(nke);

			stv.setNoiDi(stvma.getNoiDi());
			stv.setLyDo(stvma.getLyDo());
			stv.setNgayTamVang(stvma.getNgayTamVang());
			stv.setTrangthai(stvma.getTrangthai());

			stv.setTrangthai("Xác nhận");
			session.update(stv);

			SoHoKhauEntity shke = nke.getId_SHK();
			ToTruongEntity tte = (ToTruongEntity) request.getSession().getAttribute("tte");
			ChinhSuaEntity cse = new ChinhSuaEntity(new ChinhSuaDAO().autoChinhSua(), "GBT",
					"thêm:" + stv.getId_GiayTamVang(), nke, shke, tte.getId_ToDanPho(), tte, new Date());
			new ChinhSuaDAO().addChinhSua(cse);
			session.getTransaction().commit();
			mm.put("stve", stv);
			STVDAO stccv = new STVDAO();
			List<STVEntity> list = stccv.listSTV(tte.getId_ToDanPho().getId_ToDanPho());

			mm.put("list", list);
			return "canbo/viewSTVCB";

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}

	}

	// -------------------------------- Add gks---------

	@RequestMapping(value = "listGKSCB", method = RequestMethod.GET)
	public String listGKSCB(ModelMap mm, @ModelAttribute(value = "id") int to) {

		GKSDAO ttd = new GKSDAO();
		List<NhanKhauEntity> list = ttd.listNKCB(to);

		mm.put("list", list);
		return "canbo/viewGKSCB";
	}

	@RequestMapping(value = "addGKSNK", method = RequestMethod.GET)
	public String addGKSNK(ModelMap mm, HttpServletRequest request) {

		List<NhanKhauEntity> list = new NhanKhauDAO().listNK();

		mm.put("list", list);

		return "canbo/addGKSNK";
	}

	@RequestMapping(value = "addGKSNK", method = RequestMethod.POST)
	public String addGKSNK(@ModelAttribute("gkse") GKSModelAttribute gksmda, ModelMap mm, HttpServletRequest request) {

		GKSDAO gksDao = new GKSDAO();
		GKSEntity gkse = new GKSEntity(gksDao.autoGKS(), gksmda.getTen(), gksmda.getGioiTinh(), gksmda.getQuocTich(),
				gksmda.getQueQuan(), gksmda.getNoiSinh(), gksmda.getTenNguoiLamGiay(), gksmda.getNoiLamGKS(),
				gksmda.getTrangThai(), gksmda.getId_cha(), gksmda.getId_me(), gksmda.getNgayLamGKS(),
				gksmda.getNgaySinh());
		gksDao.addGKS(gkse);

		ToTruongEntity tte = (ToTruongEntity) request.getSession().getAttribute("tte");
		ChinhSuaEntity cse = new ChinhSuaEntity(new ChinhSuaDAO().autoChinhSua(), "GKS", "add" + gkse.getSoGKS(), null,
				null, tte.getId_ToDanPho(), tte, new Date());
		new ChinhSuaDAO().addChinhSua(cse);
		int to = tte.getId_ToDanPho().getId_ToDanPho();
		ToTruongDAO ttd = new ToTruongDAO();
		List<NhanKhauEntity> list = ttd.listNKtt(to, "", "", "", "", "", "");
		mm.put("to", to);
		mm.put("list", list);
		return "canbo/listNK";

	}

	@RequestMapping(value = "addCMNDNK", method = RequestMethod.GET)
	public String addCMNDNK(ModelMap mm, HttpServletRequest request) {

		List<GKSEntity> list = new GKSDAO().listGKSCB();

		mm.put("listGKS", list);

		return "canbo/addCMNDNK";
	}

	@RequestMapping(value = "addCMNDNK", method = RequestMethod.POST)
	public String addCMNDNK(@ModelAttribute("cmnde") CMNDModelAttribute cmndma, ModelMap mm,
			HttpServletRequest request) {
		GKSEntity gkse = new GKSDAO().getGKS(cmndma.getSoGKS());
		try {
			String relativeWebPath = "/resources/images";
			String absoluteFilePath = request.getServletContext().getRealPath(relativeWebPath);
			// String absoluteFilePath =
			// "C:\\Users\\Admin\\eclipse-workspace\\MockTeam\\src\\main\\webapp\\resources\\images\\";
			byte[] bytes = cmndma.getAnh().getBytes();

			File dir = new File(absoluteFilePath);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			File uploadFile = new File(dir.getAbsolutePath() + File.separator + cmndma.getAnh().getOriginalFilename());

			BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(uploadFile));
			outputStream.write(bytes);
			outputStream.flush();

			outputStream.close();
			CMNDEntity cmnde = new CMNDEntity(cmndma.getSoCMND(), cmndma.getTenCMND(), cmndma.getDanToc(),
					cmndma.getTonGiao(), cmndma.getNoiLamCMND(), cmndma.getNote(),
					cmndma.getAnh().getOriginalFilename(), null, null, cmndma.getNgayCapCMND(), gkse);
			new CMNDDAO().addCMND(cmnde);
			ToTruongEntity tte = (ToTruongEntity) request.getSession().getAttribute("tte");
			int to = tte.getId_ToDanPho().getId_ToDanPho();
			ChinhSuaEntity cse = new ChinhSuaEntity(new ChinhSuaDAO().autoChinhSua(), "SHK", "add" + cmnde.getSoCMND(),
					null, null, tte.getId_ToDanPho(), tte, new Date());
			new ChinhSuaDAO().addChinhSua(cse);
			ToTruongDAO ttd = new ToTruongDAO();
			List<NhanKhauEntity> list = ttd.listNKtt(to, "", "", "", "", "", "");
			mm.put("to", to);
			mm.put("list", list);
			return "canbo/listNK";

		} catch (Exception e) {
			// TODO: handle exception
			return "canbo/listNK";
		}
	}

	@RequestMapping(value = "addSHKNK", method = RequestMethod.GET)
	public String addSHKNK(ModelMap mm, HttpServletRequest request) {

//		List<GKSEntity> list = new GKSDAO().listGKSCB();
//
//		mm.put("list", list);

		CMNDDAO cmnd = new CMNDDAO();

		List<CMNDEntity> listCMND = cmnd.listCMND();

		mm.put("listCMND", listCMND);

		return "canbo/addSHKNK";
	}

	@RequestMapping(value = "addSHKNK", method = RequestMethod.POST)
	public String addSHKNK(@ModelAttribute("shk") SHKCHModelAttribute shkchma, ModelMap mm, HttpServletRequest request)
			throws IOException {

		String relativeWebPath = "/resources/images";
		String absoluteFilePath = request.getServletContext().getRealPath(relativeWebPath);
		// String absoluteFilePath =
		// "C:\\Users\\Admin\\eclipse-workspace\\MockTeam\\src\\main\\webapp\\resources\\images\\";
		byte[] bytes = shkchma.getAnh().getBytes();

		File dir = new File(absoluteFilePath);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File uploadFile = new File(dir.getAbsolutePath() + File.separator + shkchma.getAnh().getOriginalFilename());

		BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(uploadFile));
		outputStream.write(bytes);
		outputStream.flush();

		outputStream.close();
		String id_nk = new NhanKhauDAO().autoNK();
		ToTruongEntity tte = (ToTruongEntity) request.getSession().getAttribute("tte");
		int to = tte.getId_ToDanPho().getId_ToDanPho();
		CMNDEntity cmnde = new CMNDDAO().getCMND(shkchma.getSoCMND());
		GKSEntity gkse = new GKSDAO().getGKS(cmnde.getSoGKS().getSoGKS());

		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		ToDanPhoEntity tdpe = session.get(ToDanPhoEntity.class, tte.getId_ToDanPho().getId_ToDanPho());
		SoHoKhauEntity shke = new SoHoKhauEntity(new SoHoKhauDAO().autoSHK(), id_nk, shkchma.getDiaChi(), tdpe,
				shkchma.getNgayCapSo());
		NhanKhauEntity nke = new NhanKhauEntity(id_nk, shkchma.getTrinhDoVanHoa(), shkchma.getNgheNghiep(),
				shkchma.getNoiLamViec(), "chủ hộ", "sống", shkchma.getAnh().getOriginalFilename(), shkchma.getNgaySHK(),
				gkse, cmnde, shke);
		session.save(shke);
		session.getTransaction().commit();

		new NhanKhauDAO().addNK(nke);
		ChinhSuaEntity cse = new ChinhSuaEntity(new ChinhSuaDAO().autoChinhSua(), "SHK", "add" + shke.getId_SHK(), nke,
				shke, tte.getId_ToDanPho(), tte, new Date());
		new ChinhSuaDAO().addChinhSua(cse);
		ChinhSuaEntity cse1 = new ChinhSuaEntity(new ChinhSuaDAO().autoChinhSua(), "NK", "add" + nke.getId_NK(), nke,
				shke, tte.getId_ToDanPho(), tte, new Date());
		new ChinhSuaDAO().addChinhSua(cse1);
		ToTruongDAO ttd = new ToTruongDAO();

		List<SoHoKhauEntity> list = ttd.listSHKtt(to, "", "", "");
		mm.put("to", to);
		mm.put("list", list);
		return "canbo/listSHK";

	}

	@RequestMapping(value = "deleteGKSCB")
	public String deleteGKSCB(ModelMap mm, @ModelAttribute(value = "id_nk") String id_NK, HttpServletRequest request) {

		NhanKhauEntity nke = new NhanKhauDAO().getNhanKhau(id_NK);
		GKSEntity gkse = new GKSDAO().getGKS(nke.getSoGKS().getSoGKS());
		ToTruongEntity tte = (ToTruongEntity) request.getSession().getAttribute("tte");
		SoHoKhauEntity shke = new SoHoKhauDAO().getSoHoKhau(nke.getId_SHK().getId_SHK());

		new NhanKhauDAO().deleteNK(id_NK);

		if (nke.getSoCMND() != null) {

			new CMNDDAO().deleteCMND(new CMNDDAO().getCMND(nke.getSoCMND().getSoCMND()).getSoCMND());
		}
		new GKSDAO().deleteGKS(gkse.getSoGKS());

		ChinhSuaEntity cse = new ChinhSuaEntity(new ChinhSuaDAO().autoChinhSua(), "NhanKhau", "xóa:" + nke.getId_NK(),
				nke, shke, tte.getId_ToDanPho(), tte, new Date());
		new ChinhSuaDAO().addChinhSua(cse);

		List<NhanKhauEntity> list = new GKSDAO().listNKCB(tte.getId_ToDanPho().getId_ToDanPho());
		mm.put("list", list);
		return "canbo/viewGKSCB";
	}

	@RequestMapping(value = "addGKSCB")
	public String viewGKSCB(ModelMap mm, @ModelAttribute(value = "gks") String id_NK, HttpSession ss,
			HttpServletRequest request) {
		NhanKhauEntity nke = new NhanKhauDAO().getNhanKhau(id_NK);
		mm.put("nke", nke);

//			sf.close();
		ss.setAttribute("session", "viewNK");
		return "canbo/editGKSCB";
	}

	@RequestMapping(value = "addGKSCB", method = RequestMethod.POST)
	public String addGKSCB(@ModelAttribute(value = "nke") NhanKhauModelAttribute nkmda, ModelMap mm, HttpSession ss,
			HttpServletRequest request) {

		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();
//				GBTEntity gbte = new GBTDAO().getGBT(gbtma.getId_gbt());

			NhanKhauEntity nke = new NhanKhauDAO().getNhanKhau(nkmda.getId_NK());

			nke.setTrinhDoVanHoa(nkmda.getTrinhDoVanHoa());
			nke.setNgheNghiep(nkmda.getNgheNghiep());
			nke.setNoiLamViec(nkmda.getNoiLamViec());
			nke.setTrangthai("Sống");

			session.update(nke);

			ToTruongEntity tte = (ToTruongEntity) request.getSession().getAttribute("tte");
			ChinhSuaEntity cse = new ChinhSuaEntity(new ChinhSuaDAO().autoChinhSua(), "NhanKhau",
					"thêm:" + nke.getId_NK(), nke, nke.getId_SHK(), tte.getId_ToDanPho(), tte, new Date());
			new ChinhSuaDAO().addChinhSua(cse);
			session.getTransaction().commit();
			List<NhanKhauEntity> list = new GKSDAO().listNKCB(nke.getId_SHK().getId_ToDanPho().getId_ToDanPho());
			mm.put("list", list);
			return "canbo/viewGKSCB";
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}

	}

	// -------------------------------- Sổ tạm trú---------

	@RequestMapping(value = "listSTTCB", method = RequestMethod.GET)
	public String listSTTCB(ModelMap mm, @ModelAttribute(value = "id") int to) {

		STTDAO stt = new STTDAO();
		List<STTEntity> list = stt.listSTT(to);
		mm.put("list", list);
		return "canbo/viewSTTCB";
	}

	@RequestMapping(value = "deleteSTTCB")
	public String deleteSTTCB(ModelMap mm, @ModelAttribute(value = "id_TamTru") String id_TamTru,
			HttpServletRequest request) {
		STTEntity stte = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		stte = session.get(STTEntity.class, id_TamTru);
		STTDAO ttd = new STTDAO();

		ttd.deleteSTT(id_TamTru);
		ToTruongEntity tte = (ToTruongEntity) request.getSession().getAttribute("tte");
		ChinhSuaEntity cse = new ChinhSuaEntity(new ChinhSuaDAO().autoChinhSua(), "QTHT", "xóa:" + stte.getId_TamTru(),
				stte.getSoCMND().getSoGKS().getId_NK(), stte.getId_SHK(), tte.getId_ToDanPho(), tte, new Date());
		new ChinhSuaDAO().addChinhSua(cse);
		session.getTransaction().commit();
		STTDAO stt = new STTDAO();
		ToTruongEntity ttez = (ToTruongEntity) request.getSession().getAttribute("tte");
		List<STTEntity> list = stt.listSTT(ttez.getId_ToDanPho().getId_ToDanPho());
		mm.put("list", list);
		return "canbo/viewSTTCB";
	}

	@RequestMapping(value = "addSTTCB")
	public String viewSTTCB(ModelMap mm, @ModelAttribute(value = "stt") String id_stt, HttpSession ss,
			HttpServletRequest request) {
		STTEntity stte = null;
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		stte = session.get(STTEntity.class, id_stt);

		mm.put("list", stte);
		session.getTransaction().commit();
//			sf.close();
//			ss.setAttribute("session", "viewNK");
		STTDAO stt = new STTDAO();
//		List<STTEntity> list = stt.listSTT(to);
//		mm.put("list", list);
		return "canbo/editSTTCB";
	}

	@RequestMapping(value = "addSTTCB", method = RequestMethod.POST)
	public String addSTTCB(@ModelAttribute(value = "stv") STTModelAttribute sttma, ModelMap mm, HttpSession ss,
			HttpServletRequest request) {

		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		try (Session session = sf.openSession()) {
			session.beginTransaction();
//				GBTEntity gbte = new GBTDAO().getGBT(gbtma.getId_gbt());

			STTEntity stt = (STTEntity) session.get(STTEntity.class, sttma.getId_TamTru());

			SoHoKhauEntity shke = new SoHoKhauDAO().getSoHoKhau(sttma.getId_SHK());

			CMNDEntity cmnde = new CMNDDAO().getCMND(sttma.getSoCMND());

			stt.setId_SHK(shke);
			stt.setSoCMND(cmnde);

			stt.setNgayDi(sttma.getNgayDi());
			stt.setNgayVe(sttma.getNgayVe());
			stt.setLyDo(sttma.getLyDo());
			stt.setTrangThai("Xác nhận");
			session.update(stt);

			NhanKhauEntity nke = new NhanKhauDAO().getNhanKhauCMND(cmnde.getSoCMND());

			ToTruongEntity tte = (ToTruongEntity) request.getSession().getAttribute("tte");
			ChinhSuaEntity cse = new ChinhSuaEntity(new ChinhSuaDAO().autoChinhSua(), "GBT",
					"thêm:" + stt.getId_TamTru(), nke, shke, tte.getId_ToDanPho(), tte, new Date());
			new ChinhSuaDAO().addChinhSua(cse);
			session.getTransaction().commit();
			mm.put("stte", stt);
			STTDAO sttz = new STTDAO();
			ToTruongEntity ttez = (ToTruongEntity) request.getSession().getAttribute("tte");
			List<STTEntity> list = sttz.listSTT(ttez.getId_ToDanPho().getId_ToDanPho());
			mm.put("list", list);
			return "canbo/viewSTTCB";
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}

	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"), false));
	}

}