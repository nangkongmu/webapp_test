package kku.ac.kku.cs.wp.seok.demo;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class HelloServlet extends HttpServlet {
	private String greeting = null;

	@Override
	public void init(ServletConfig config) throws ServletException {
		greeting = config.getInitParameter("greeting");
		super.init(config);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    log("Hello Servlet");
	    String html = """
	            <html>
	            <head></head>
	            <body>
	            """ + greeting + """
	            </body>
	            </html>
	            """;
	    resp.getWriter().println(html);
	}

	@Override
	public void destroy() {
		log("Hello was destroyed");
		super.destroy();
	}
	
		
		
	}
