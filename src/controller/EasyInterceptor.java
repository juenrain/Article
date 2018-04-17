package controller;

import java.util.Calendar;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class EasyInterceptor extends HandlerInterceptorAdapter {
	private int openingTime;  
	private int closingTime;  
	public void setOpeningTime(int openingTime) {  
		this.openingTime = openingTime;  
	}  
	  
	public void setClosingTime(int closingTime) {  
		this.closingTime = closingTime;  
	}  
	  
	@Override  
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {  
		String path = request.getServletPath();
		path = path + "---" + request.getServerName();
		path = path + "---" + request.getServerPort();
		path = path + "---" + request.getRequestURI();
//		System.out.println(path);
		Calendar cl = Calendar.getInstance();  
		int hour = cl.get(Calendar.HOUR_OF_DAY);  
		if(hour<openingTime || hour>=closingTime){  
			response.sendRedirect("http://www.baidu.com");  
			return false;  
		}
		return true;  
	}  
}
