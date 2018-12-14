package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;

public class Log4JInitServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public Log4JInitServlet() {
		super();
	}
	
	public void init(ServletConfig config) {
		System.out.println("Log4JInitServlet 正在初始化 log4j日志设置信息");
		String log4jLocation = config.getInitParameter("log4j-properties-location");
	}
}
