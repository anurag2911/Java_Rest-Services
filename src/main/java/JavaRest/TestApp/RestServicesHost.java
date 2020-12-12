package JavaRest.TestApp;
import static spark.Spark.*;
import static spark.Spark.get;
import static spark.Spark.port;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class RestServicesHost implements Runnable {
	public void run() {
		 while (true) {
			 port(7268); 
			 Bundle bndl=new Bundle();
			 bndl.setAppItemId("1");
			 bndl.setDisplayName("bundle1");
			 Bundle bndl1=new Bundle();
			 bndl1.setAppItemId("2");
			 bndl1.setDisplayName("bundle2");
			 List<Bundle> list=new ArrayList<Bundle>();
			 list.add(bndl);
			 list.add(bndl1);
			 String bundleall="{{appItemId:ec4c74f39152c5c6f674ec0324c61a5e,appType:0,displayName:test-zapp-linux-01,zone:covid-zone,flags:0,version:0,iconData:null,appStatus:null,iconIsGrayed:null,description:null,passesSystemRequirements:null,isBlocked:null,contacts:null,isLeaf:null,shouldBeShownInZapp:null,appStatusCode:null,isFavourite:null,iconDataWithOverlay:null},{appItemId:3f909b5133f0645dbc0a825c6be0b9e5,appType:0,displayName:zapp-linux-02,zone:covid-zone,flags:0,version:0,iconData:null,appStatus:null,iconIsGrayed:null,description:null,passesSystemRequirements:null,isBlocked:null,contacts:null,isLeaf:null,shouldBeShownInZapp:null,appStatusCode:null,isFavourite:null,iconDataWithOverlay:null}}";
			 Gson gson = new Gson();
			 
		        get("/hello", (request, response) -> "Hello World!");
		        get("/bundles/all","application/json",(request,response) -> {return bundleall;});
		        get("agent/ping","application/json",(request,response) -> {return true;});
		        get("agent/refresh/initial-status","application/json",(request,response) -> {return true;});
		        post("/bundles/launch/:bundleId", (request, response) -> 
		        {
		        	String id = request.params(":bundleId");
		        	System.out.println("bundle id is " + id);
		        	return true;
		        }
		        );
		       
		}
		
	}

	

}