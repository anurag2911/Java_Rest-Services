package JavaRest.TestApp;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println( "Hello World!" );
         
         try {
 			Thread hostThread = new Thread(new RestServicesHost());
 			hostThread.start();
 		} catch (Exception e) {
 			 			e.printStackTrace();
 		}
       
    }
}
