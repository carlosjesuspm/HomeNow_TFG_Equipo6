package ifp.homenow.utility;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ifp.homenow.bean.UsuarioBean;
/**
 * This class provides utility operation for Servlet container like forward,
 * redirect, handle generic exception=same time exception, manage success and
 * error message, manage default Bean and List, manage pagination parameters
 * 
 * @author Navigable Set
 * @version 1.0
 * @Copyright (c) Navigable Set
 */
public class ServletUtility {
	
	static String Error = "Invalid data";
	static String SucessMessage = "Done";
	
	
	//Reenviar página
	public static void forward(String page, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		RequestDispatcher rd = request.getRequestDispatcher(page);
		System.out.println(page);
		rd.forward(request, response);
	}
	
	//Redirigir página
	public static void redirect(String page, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.sendRedirect(page);
	}
	
	//Enviar mensajes de error
	public static void handleException(Exception e, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	    request.setAttribute("exception", e);
	    ServletUtility.forward("Error Message", request, response);
	    e.printStackTrace();
	}
	
	
	
	public static String getErrorMessage(String property, HttpServletRequest request) {
		String val = (String) request.getAttribute(property);
		if (val == null) {
		  return "";
		} else {
		  return val;
		}
	
	}
	
	
	public static String getMessage(String property, HttpServletRequest request) {
	    String val = (String) request.getAttribute(property);
	    if (val == null) {
	      return "";
	    } else {
	      return val;
	    }
	}
	
	
	public static void setErrorMessage(String msg, HttpServletRequest request) {
		request.setAttribute(Error, msg);
	}
	
	
	public static String getErrorMessage(HttpServletRequest request) {
	    String val = (String) request.getAttribute(Error);
	    if (val == null) {
	      return "";
	    } else {
	      return val;
	    }
	}
	
	
	
	public static void setSuccessMessage(String msg, HttpServletRequest request) {
		request.setAttribute(SucessMessage, msg);
	}
	
	
	public static String getSuccessMessage(HttpServletRequest request) {
	    String val = (String) request.getAttribute(SucessMessage);
	    if (val == null) {
	      return "";
	    } else {
	      return val;
	    }
	}
	
	
	
	public static String getParameter(String property, HttpServletRequest request) {
	    String val = (String) request.getParameter(property);
	    if (val == null) {
	      return "";
	    } else {
	      return val;
	    }
	}
	
	
	
	//Obtener y establecer listas
	@SuppressWarnings("rawtypes")
	public static void setList(List list, HttpServletRequest request) {
		request.setAttribute("list", list);
	}
	
	
	public static void setUser(UsuarioBean usuario, HttpServletRequest request) {
		request.setAttribute("usuario", usuario);
	}
	
	
	@SuppressWarnings("rawtypes")
	public static List getList(HttpServletRequest request) {
		return (List) request.getAttribute("list");
	}
	
	
 
}
