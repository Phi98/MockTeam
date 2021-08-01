package net.mock.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.mock.entity.CountREntity;
import net.mock.hibernate.HibernateUtil;

/**
 * Servlet Filter implementation class AdminFilter
 */
public class AdminFilter implements Filter {
	
    /**
     * Default constructor. 
     */
    public AdminFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String servletPath = req.getServletPath();
		System.out.println(servletPath);
		if(servletPath.equals("/edit")||servletPath.equals("/add")||servletPath.equals("/adminHome")) {
			String admin = (String) req.getSession().getAttribute("admin");
			if(admin.isEmpty()) res.sendRedirect("admin");
//			{
//				RequestDispatcher rd = request.getRequestDispatcher("/admin/loginAD");
//				  rd.forward(request, response);}
			else   {
				chain.doFilter(request, response);
		
				HibernateUtil hu = new HibernateUtil();
				SessionFactory sf = hu.getSessionFactory();
				Session session = sf.openSession();
				session.beginTransaction();
				CountREntity count = new CountREntity();
				session.save(count);				
				session.getTransaction().commit();
			}
				
		}
		else {
			   chain.doFilter(request, response);

				HibernateUtil hu = new HibernateUtil();
				SessionFactory sf = hu.getSessionFactory();
				Session session = sf.openSession();
				session.beginTransaction();
				CountREntity count = new CountREntity();
				session.save(count);				
				session.getTransaction().commit();
		}
		
		// pass the request along the filter chain
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}


}
