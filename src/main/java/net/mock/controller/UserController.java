
package net.mock.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.jni.Mmap;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.hql.internal.ast.tree.IsNullLogicOperatorNode;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.mock.dao.CMNDDAO;
import net.mock.dao.GBTDAO;
import net.mock.dao.GKSDAO;
import net.mock.dao.NhanKhauDAO;
import net.mock.dao.QTHTDAO;
import net.mock.dao.STTDAO;
import net.mock.dao.STVDAO;
import net.mock.dao.SoHoKhauDAO;
import net.mock.dao.TATSDAO;
import net.mock.dao.TinTucDAO;
import net.mock.entity.CMNDEntity;
import net.mock.entity.GBTEntity;
import net.mock.entity.GKSEntity;
import net.mock.entity.STVEntity;
import net.mock.entity.NhanKhauEntity;
import net.mock.entity.QTHTEntity;
import net.mock.entity.STTEntity;
import net.mock.entity.SoHoKhauEntity;
import net.mock.entity.TATSEntity;
import net.mock.entity.TinTucEntity;
import net.mock.hibernate.HibernateUtil;
import net.mock.ma.CMNDModelAttribute;
import net.mock.ma.CMNDNhanKhauModelAttribute;
import net.mock.ma.CMTTModelAttribute;
import net.mock.ma.GBTModelAtribute;
import net.mock.ma.GKSModelAttribute;
import net.mock.ma.GTVModelAttribute;
import net.mock.ma.NhanKhauModelAttribute;
import net.mock.ma.QTHTModelAttribute;
import net.mock.ma.SHKModelAttribute;

@Controller
public class UserController {

	@RequestMapping(value = "home")
	public String homePage(ModelMap mm, HttpServletRequest request) {
		request.getSession().invalidate();
		/*
		 * mm.put("hello",
		 * "Hello, Welcome to Da Nang. Hoang Sa - Truong Sa belong to Viet Nam!!!.<br>"
		 * );
		 */
		return "home";
	}

	@RequestMapping(value = "thudientu")
	public String thuDienTu(ModelMap mm, HttpServletRequest request) {
		request.getSession().invalidate();

		return "thudientu";
	}

	@RequestMapping(value = "thoat")
	public String thoat(ModelMap mm, HttpServletRequest request) {
		request.getSession().invalidate();
		/*
		 * mm.put("hello",
		 * "Hello, Welcome to Da Nang. Hoang Sa - Truong Sa belong to Viet Nam!!!.<br>"
		 * );
		 */
		return "mainhome";
	}

	@RequestMapping(value = "mainhome")
	public String mainHome(ModelMap mm, HttpSession session) {
		session.setAttribute("session", "mainhome");

		return "mainhome";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@ModelAttribute(value = "shk") SHKModelAttribute shke, ModelMap mm, HttpSession session,
			HttpServletRequest request) {
		SoHoKhauDAO shkd = new SoHoKhauDAO();

		if (shkd.checkSHKCMND(shke.getShk(), shke.getSoCMND())) {
			SoHoKhauEntity shk = shkd.getSoHoKhau(shke.getShk());
			mm.put("shke", shk);
			request.getSession().setAttribute("shke", shk);
			NhanKhauDAO nkd = new NhanKhauDAO();
			nkd.getNhanKhau(shk.getId_SHK());
			mm.put("nkde", nkd);
			request.getSession().setAttribute("sohokhau", shk.getId_SHK());
			List<NhanKhauEntity> list = nkd.listNhanKhauSHK(shk.getId_SHK());
			mm.put("list", list);
			List<STTEntity> list1 = new STTDAO().listTT(shke.getShk());
			mm.put("list1", list1);
			return "nguoidan/hokhau";
		}

		else {
			mm.put("hello", "sai");
//		   String myURI = request.getAttribute("javax.servlet.forward.request_uri").toString();
			String x = (String) session.getAttribute("session");
			return x;
//		   return new UrlPathHelper().getOriginatingRequestUri(request);
		}

	}

	@RequestMapping(value = "viewNKSHK")
	public String viewNKSHK(@ModelAttribute(value = "id") String id_shk, ModelMap mm, HttpSession ss,
			HttpServletRequest request) {

		List<NhanKhauEntity> list = new NhanKhauDAO().listNhanKhauSHK(id_shk);
		mm.put("list", list);
		mm.put("id_shk", id_shk);
		return "canbo/listNK";
	}

	@RequestMapping(value = "view")
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
		return "viewNK";
	}

//	@RequestMapping(value = "tintuc")
//	public String tintuc(@ModelAttribute(value = "id") String id_SHK, ModelMap mm, HttpSession ss,
//			HttpServletRequest request) {
//		mm.put("list", new TinTucDAO().listTinTuc(id_SHK));
//		mm.put("count", 6);
//
//		mm.put("offset", 0);
//		mm.put("max", 3);
//		return "tintuc";
//	}

	@RequestMapping(value = "tintuc", method = RequestMethod.GET)
	public String showList(@ModelAttribute(value = "id") String id_SHK,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "limit", required = false) Integer limit, ModelMap mm) {
		if (page == null)
			page = 0;
		if (limit == null)
			limit = 2;
		List<TinTucEntity> list = new TinTucDAO().listTinTuc(id_SHK);
		mm.put("page", page);
		mm.put("limit", limit);
		mm.put("total", new TinTucDAO().count());
		mm.put("totalpage", (int) Math.ceil((double) new TinTucDAO().count() / limit));
		mm.put("list", list);

		return "tintuc";
	}

	@RequestMapping(value = "noidungTT")
	public String showTT(@ModelAttribute("id") String id_tt, ModelMap mm) {
		TinTucEntity tte = new TinTucDAO().getTinTuc(id_tt);
		mm.put("tte", tte);
		return "showTT";
	}
//	@RequestMapping(value = "view")
//	public String viewSHK(@ModelAttribute(value = "id") String id_shk, ModelMap mm, HttpSession ss) {
//
//		SoHoKhauEntity shke = new SoHoKhauEntity();
//		NhanKhauEntity nke = new NhanKhauEntity();
//		HibernateUtil hu = new HibernateUtil();
//		SessionFactory sf = hu.getSessionFactory();
//		Session session = sf.openSession();
//		session.beginTransaction();
//		shke = session.get(SoHoKhauEntity.class, id_shk);
//
//		shke = nke.getSoHoKhau();
//		mm.put("nke", nke);
//		mm.put("shke", shke);
//		session.getTransaction().commit();
////		sf.close();
//		ss.setAttribute("session", "viewNK");
//		return "viewNK";
//	}

	@RequestMapping(value = "viewCMND")
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
		return "viewCMND";
	}

	@RequestMapping(value = "viewGKS")
	public String viewGKS(@ModelAttribute(value = "id") String soGKS, ModelMap mm, HttpSession ss) {

		GKSEntity gkse = new GKSEntity();
		HibernateUtil hu = new HibernateUtil();
		SessionFactory sf = hu.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		gkse = session.get(GKSEntity.class, soGKS);
		mm.put("gks", gkse);

//		mm.put("cha", new NhanKhauDAO().getNhanKhau(gkse.getId_cha()).getSoCMND().getTenCMND());
//		mm.put("me", new NhanKhauDAO().getNhanKhau(gkse.getId_me()).getSoCMND().getTenCMND());

		session.getTransaction().commit();
//		sf.close();	
		return "viewGKS";
	}

	@RequestMapping(value = "viewQTHT", method = RequestMethod.GET)
	public String viewQTHT(ModelMap mm, @ModelAttribute(value = "id") String id_nk) {

		QTHTDAO ttd = new QTHTDAO();
		List<QTHTEntity> list = ttd.listQTHT(id_nk);
		/*
		 * if (list.isEmpty()) { return "viewNK"; }
		 */
		mm.put("list", list);
		return "viewQTHT";
	}

	@RequestMapping(value = "viewTATS", method = RequestMethod.GET)
	public String viewTATS(ModelMap mm, @ModelAttribute(value = "id") String id_nk) {

		List<TATSEntity> list = new TATSDAO().listTATS(id_nk);

		mm.put("list", list);
		return "viewTATS";
	}

	@RequestMapping(value = "viewTV", method = RequestMethod.GET)
	public String viewTV(ModelMap mm, @ModelAttribute(value = "id") String id_nk) {

		List<STVEntity> list = new STVDAO().listTV(id_nk);
		mm.put("id", id_nk);
		mm.put("list", list);
		return "viewTV";
	}

	@RequestMapping(value = "addTV", method = RequestMethod.GET)
	public String addTV(ModelMap mm, @ModelAttribute(value = "id") String id_nk) {

		mm.put("id", id_nk);

		return "addTV";
	}

	@RequestMapping(value = "addTV", method = RequestMethod.POST)
	public String addTV(@ModelAttribute(value = "tv") GTVModelAttribute gtvma, ModelMap mm) {
		STVEntity gtve = new STVEntity(new STVDAO().autoGTV(), gtvma.getNoiDi(), gtvma.getLyDo(),
				gtvma.getNgayTamVang(), "chờ duyệt", new NhanKhauDAO().getNhanKhau(gtvma.getId_nk()));
		if (new STVDAO().addGTV(gtve)) {
			NhanKhauEntity nke = null;
			CMNDEntity cmnde = null;
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			nke = session.get(NhanKhauEntity.class, gtvma.getId_nk());
			cmnde = nke.getSoCMND();
			mm.put("nke", nke);
			mm.put("cmnde", cmnde);
			session.getTransaction().commit();
			return "viewNK";
		} else {
			mm.put("id", gtvma.getId_nk());
			return "addTV";
		}
	}

	@RequestMapping(value = "addQTHT", method = RequestMethod.GET)
	public String addQTHT(ModelMap mm, @ModelAttribute(value = "id") String id_nk) {

		mm.put("id", id_nk);

		return "addQTHT";
	}

	@RequestMapping(value = "addQTHT", method = RequestMethod.POST)
	public String addQTHT(@ModelAttribute(value = "qtht") QTHTModelAttribute qthtma, ModelMap mm) {
		NhanKhauEntity nke = new NhanKhauDAO().getNhanKhau(qthtma.getId_nk());
		QTHTEntity qthte = new QTHTEntity(new QTHTDAO().autoQTHT(), "chờ duyệt", nke, qthtma.getNgayBatDau(),
				qthtma.getNgayKetThuc(), qthtma.getNoiHocTap(), qthtma.getDiaChi());

		if (new QTHTDAO().addQTHT(qthte)) {
			CMNDEntity cmnde = null;
			HibernateUtil hu = new HibernateUtil();
			SessionFactory sf = hu.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			nke = session.get(NhanKhauEntity.class, qthtma.getId_nk());
			cmnde = nke.getSoCMND();
			mm.put("nke", nke);
			mm.put("cmnde", cmnde);
			session.getTransaction().commit();
			return "viewNK";
		} else {
			mm.put("qt", qthtma);
			mm.put("id", qthtma.getId_nk());
			return "addQTHT";
		}
	}

	@RequestMapping(value = "addGBT")
	public String addViewGBT(ModelMap mm, @ModelAttribute(value = "id_nk") String id_nk) {
		mm.put("id_nk", id_nk);
		return "addGBT";
	}

	@RequestMapping(value = "saveGBT", method = RequestMethod.POST)
	public String saveGBT(@ModelAttribute(value = "gbt") GBTModelAtribute gbtmd, ModelMap mm,
			HttpServletRequest request) {
		GBTDAO gbtdao = new GBTDAO();
		NhanKhauEntity nke = new NhanKhauDAO().getNhanKhau(gbtmd.getId_nk());
		GKSEntity gkse = new GKSDAO().getGKS(nke.getSoGKS().getSoGKS());
		int namsinh = gkse.getNgaySinh().getYear();
		int tuoi = gbtmd.getNgayMat().getYear() - namsinh;
		GBTEntity gbte = new GBTEntity(gbtdao.autoGBT(), gbtmd.getLyDo(), gbtmd.getTenNguoiLamGiay(), gbtmd.getNote(),
				gbtmd.getNoiMat(), "Chờ Duyệt", gbtmd.getNgayMat(), tuoi, nke);
		new GBTDAO().addGBT(gbte);
		SoHoKhauEntity shk = (SoHoKhauEntity) request.getSession().getAttribute("shke");
		List<NhanKhauEntity> list = new NhanKhauDAO().listNhanKhauSHK(shk.getId_SHK());
		mm.put("list", list);
		List<STTEntity> list1 = new STTDAO().listTT(shk.getId_SHK());
		mm.put("list1", list1);

		return "nguoidan/hokhau";
	}

	@GetMapping(value = "addCMTT")
	public String addCMTT(ModelMap mm, @ModelAttribute("id") String id_shk) {
		mm.put("id_shk", id_shk);
		return "addCMTT";
	}

	@RequestMapping(value = "addCMTT", method = RequestMethod.POST)
	public String addCMTT(@ModelAttribute(value = "cmtt") CMTTModelAttribute cmttma, ModelMap mm,
			HttpServletRequest request) {
		if (!cmttma.getAnh().isEmpty()) {
			try {
				String relativeWebPath = "/resources/images";
				String absoluteFilePath = request.getServletContext().getRealPath(relativeWebPath);
				// String absoluteFilePath =
				// "C:\\Users\\Admin\\eclipse-workspace\\MockTeam\\src\\main\\webapp\\resources\\images\\";
				byte[] bytes = cmttma.getAnh().getBytes();
				File dir = new File(absoluteFilePath);
				if (!dir.exists()) {
					dir.mkdirs();
				}
				File uploadFile = new File(
						dir.getAbsolutePath() + File.separator + cmttma.getAnh().getOriginalFilename());

				BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(uploadFile));
				outputStream.write(bytes);
				outputStream.flush();
				outputStream.close();
				CMNDEntity cmnde = new CMNDEntity(cmttma.getSoCMND(), cmttma.getTenCMND(), cmttma.getDanToc(),
						cmttma.getTonGiao(), cmttma.getNoiLamCMND(), cmttma.getNote(),
						cmttma.getAnh().getOriginalFilename(), cmttma.getNgayCapCMND());
				new CMNDDAO().addCMND(cmnde);
				SoHoKhauEntity shke = new SoHoKhauDAO().getSoHoKhau(cmttma.getId_SHK());
				STTEntity stte = new STTEntity(new STTDAO().autoSTT(), "chờ duyệt", cmttma.getLyDo(),
						cmttma.getNgayDi(), cmttma.getNgayVe(), cmnde, shke);
				new STTDAO().addSTT(stte);
				return "nguoidan/hokhau";
			} catch (Exception e) {
				return "nguoidan/hokhau";

			}

		}
		return "nguoidan/hokhau";

	}

	@GetMapping(value = "addGKS")
	public String addGKS(ModelMap mm, @ModelAttribute("id_shk") String id_shk) {
		mm.put("id_shk", id_shk);
		mm.put("list", new NhanKhauDAO().listNhanKhauSHK(id_shk));
		return "addGKS";
	}

	@PostMapping(value = "addGKS")
	public String addGKS(@ModelAttribute("gkse") GKSModelAttribute gksmda, ModelMap mm) {

		GKSDAO gksDao = new GKSDAO();
		GKSEntity gkse = new GKSEntity(gksDao.autoGKS(), gksmda.getTen(), gksmda.getGioiTinh(), gksmda.getQuocTich(),
				gksmda.getQueQuan(), gksmda.getNoiSinh(), gksmda.getTenNguoiLamGiay(), gksmda.getNoiLamGKS(),
				gksmda.getTrangThai(), gksmda.getId_cha(), gksmda.getId_me(), gksmda.getNgayLamGKS(),
				gksmda.getNgaySinh());
		gksDao.addGKS(gkse);
		mm.put("gkse", gkse);
		mm.put("id_shk", gksmda.getId_shk());
		return "chonAddGKS";
	}

	@RequestMapping(value = "addNKCMND")
	public String addNKCMND(@ModelAttribute("soGKS") String soGKS, @ModelAttribute("id_shk") String id_shk,
			ModelMap mm) {

		mm.put("gkse", new GKSDAO().getGKS(soGKS));
		mm.put("id_shk", id_shk);
		return "addNK1";
	}

	@RequestMapping(value = "addNKCMND", method = RequestMethod.POST)
	public String addNKCMND(@ModelAttribute(value = "nk") CMNDNhanKhauModelAttribute cmndnk, ModelMap mm,
			HttpServletRequest request, HttpSession session) {
		NhanKhauDAO nkDao = new NhanKhauDAO();

		if (!cmndnk.getAnh().isEmpty()) {
			try {
				String relativeWebPath = "/resources/images";
				String absoluteFilePath = request.getServletContext().getRealPath(relativeWebPath);
				// String absoluteFilePath =
				// "C:\\Users\\Admin\\eclipse-workspace\\MockTeam\\src\\main\\webapp\\resources\\images\\";
				byte[] bytes = cmndnk.getAnh().getBytes();
				File dir = new File(absoluteFilePath);
				if (!dir.exists()) {
					dir.mkdirs();
				}
				File uploadFile = new File(
						dir.getAbsolutePath() + File.separator + cmndnk.getAnh().getOriginalFilename());

				BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(uploadFile));
				outputStream.write(bytes);
				outputStream.flush();
				outputStream.close();

				NhanKhauEntity nke = new NhanKhauEntity();
				nke.setId_NK(nkDao.autoNK());
				nke.setTrinhDoVanHoa(cmndnk.getTrinhDoVanHoa());
				nke.setNgheNghiep(cmndnk.getNgheNghiep());
				nke.setNoiLamViec(cmndnk.getNoiLamViec());
				nke.setQuanHeVoiChuHo(cmndnk.getQuanHeVoiChuHo());
				nke.setTrangthai("chờ duyệt");
				nke.setNgaySHK(new Date(cmndnk.getNgaySHK().getYear(), cmndnk.getNgaySHK().getMonth(),
						cmndnk.getNgaySHK().getDate()));

				nke.setAnh(cmndnk.getAnh().getOriginalFilename());

				GKSEntity gkse = new GKSEntity();
				gkse.setSoGKS(cmndnk.getSoGKS());
				nke.setSoGKS(gkse);

				SoHoKhauEntity shke = new SoHoKhauEntity();
				shke.setId_SHK(cmndnk.getId_SHK());
				nke.setId_SHK(shke);

				nke.setSoCMND(null);

				nkDao.addNK(nke);

				SoHoKhauEntity shk = new SoHoKhauDAO().getSoHoKhau(cmndnk.getId_SHK());
				mm.put("shke", shk);
				List<NhanKhauEntity> list = new NhanKhauDAO().listNhanKhauSHK(cmndnk.getId_SHK());
				mm.put("list", list);
				session.setAttribute("list", list);
				List<STTEntity> list1 = new STTDAO().listTT(cmndnk.getId_SHK());
				mm.put("list1", list1);
				return "nguoidan/hokhau";
			} catch (Exception e) {
				e.printStackTrace();
				mm.put("gkse", new GKSDAO().getGKS(cmndnk.getSoGKS()));
				mm.put("id_shk", cmndnk.getId_SHK());
				return "addNK";
			}
		}
		return "nguoidan/hokhau";
	}

	@RequestMapping(value = "saveNKCMND")
	public String saveNKCMND(@ModelAttribute("soGKS") String soGKS, @ModelAttribute("id_shk") String id_shk,
			ModelMap mm) {

		mm.put("gkse", new GKSDAO().getGKS(soGKS));
		mm.put("id_shk", id_shk);
		return "addNK";
	}

	@RequestMapping(value = "saveNKCMND", method = RequestMethod.POST)
	public String addNKTT(@ModelAttribute(value = "nk") CMNDNhanKhauModelAttribute cmndnk, ModelMap mm,
			HttpServletRequest request, HttpSession session) {
		NhanKhauDAO nkDao = new NhanKhauDAO();
		CMNDDAO cmndDao = new CMNDDAO();

		if (!cmndnk.getAnh().isEmpty()) {
			try {
				String relativeWebPath = "/resources/images";
				String absoluteFilePath = request.getServletContext().getRealPath(relativeWebPath);
				// String absoluteFilePath =
				// "C:\\Users\\Admin\\eclipse-workspace\\MockTeam\\src\\main\\webapp\\resources\\images\\";
				byte[] bytes = cmndnk.getAnh().getBytes();
				File dir = new File(absoluteFilePath);
				if (!dir.exists()) {
					dir.mkdirs();
				}
				File uploadFile = new File(
						dir.getAbsolutePath() + File.separator + cmndnk.getAnh().getOriginalFilename());

				BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(uploadFile));
				outputStream.write(bytes);
				outputStream.flush();
				outputStream.close();

				NhanKhauEntity nke = new NhanKhauEntity();
				nke.setId_NK(nkDao.autoNK());
				nke.setTrinhDoVanHoa(cmndnk.getTrinhDoVanHoa());
				nke.setNgheNghiep(cmndnk.getNgheNghiep());
				nke.setNoiLamViec(cmndnk.getNoiLamViec());
				nke.setQuanHeVoiChuHo(cmndnk.getQuanHeVoiChuHo());
				nke.setTrangthai("chờ duyệt");
				nke.setNgaySHK(new Date(cmndnk.getNgaySHK().getYear(), cmndnk.getNgaySHK().getMonth(),
						cmndnk.getNgaySHK().getDate()));
				nke.setAnh(cmndnk.getAnh().getOriginalFilename());

				GKSEntity gkse = new GKSEntity();
				gkse.setSoGKS(cmndnk.getSoGKS());
				nke.setSoGKS(gkse);

				SoHoKhauEntity shke = new SoHoKhauEntity();
				shke.setId_SHK(cmndnk.getId_SHK());
				nke.setId_SHK(shke);

				CMNDEntity cmnde = new CMNDEntity(cmndDao.autoCMND(), cmndnk.getTenCMND(), cmndnk.getDanToc(),
						cmndnk.getTonGiao(), cmndnk.getNoiLamCMND(), cmndnk.getNote(),
						cmndnk.getAnh().getOriginalFilename(), cmndnk.getNgayCapCMND(), gkse);

				cmndDao.addCMND(cmnde);

				nke.setSoCMND(cmnde);

				nkDao.addNK(nke);

				SoHoKhauEntity shk = new SoHoKhauDAO().getSoHoKhau(cmndnk.getId_SHK());
				mm.put("shke", shk);
				List<NhanKhauEntity> list = new NhanKhauDAO().listNhanKhauSHK(cmndnk.getId_SHK());
				mm.put("list", list);
				session.setAttribute("list", list);
				List<STTEntity> list1 = new STTDAO().listTT(cmndnk.getId_SHK());
				mm.put("list1", list1);
				return "nguoidan/hokhau";
			} catch (Exception e) {
				e.printStackTrace();
				mm.put("gkse", new GKSDAO().getGKS(cmndnk.getSoGKS()));
				mm.put("id_shk", cmndnk.getId_SHK());
				return "addNK";
			}
		}
		return "nguoidan/hokhau";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"), false));
	}

}