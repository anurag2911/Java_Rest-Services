package Test.JavaRestServices;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import static spark.Spark.*;

public class RestServiceHost implements Runnable {

	public void run() {
		 while (true) {
			ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
			context.setContextPath("/");
			Server jettyServer = new Server(7268);
			jettyServer.setHandler(context);
			ServletHolder jerseyServlet = context.addServlet(org.glassfish.jersey.servlet.ServletContainer.class, "/*");
			jerseyServlet.setInitOrder(0);
			// Tells the Jersey Servlet which REST service/class to load.
			jerseyServlet.setInitParameter("jersey.config.server.provider.classnames",
					RestEntryPoint.class.getCanonicalName());
			try {
				jettyServer.start();
				jettyServer.join();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				jettyServer.destroy();
			} 
		}
		
	}

}
