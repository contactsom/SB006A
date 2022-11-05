package com.simplilearn.cookie;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieDemoServlet extends HttpServlet {

	protected void service(HttpServletRequest request , HttpServletResponse response) {
		
		String email =(String)request.getParameter("email");
		
		Cookie[] cookies=request.getCookies();
		
		if(cookies!=null) {
			
				if(cookies.length!=0) {
					
					for (Cookie cookie : cookies) {
						
						String cookiename=cookie.getName();
						System.out.println("Cookie Name"+cookiename);
						
						String cookievalue=cookie.getValue();
						System.out.println("Cookie Value"+cookievalue);
						
						
						String cookiepath=cookie.getPath();
						System.out.println("Cookie Path"+cookiepath);
						
					}
					
				}else {
					System.err.println("******* Alert-Cookie Not Found*******");
				}
			
		}else {
			
			System.err.println("******* Alert-Cookie Not Found*******");
		}
		
		
		/*How to send the data through Cookie */

		Cookie cookie1 = new Cookie("EMAIL", email);
		response.addCookie(cookie1);
		
		Cookie cookie2 = new Cookie("PHONE", "9876123");
		response.addCookie(cookie2);
		
	}
}
