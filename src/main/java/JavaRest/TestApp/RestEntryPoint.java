package Test.JavaRestServices;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bundles")
public class RestEntryPoint {

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bundle> test() {
    	List<Bundle> bundles= new ArrayList<Bundle>();
    	Bundle bundle1=new Bundle();
    	bundle1.setAppItemId("1");
    	bundle1.setDisplayName("bundle1");
    	
    	bundle1.setAppStatus("S");
    	bundle1.setZone("covid");
    	bundle1.setAppType("bundle");
    	bundle1.setDescription("bundle one");
    	
    	Bundle bundle2=new Bundle();
    	bundle2.setAppItemId("2");
    	bundle2.setDisplayName("bundle2");
    	
    	bundle2.setAppStatus("S");
    	bundle2.setZone("covid");
    	bundle2.setAppType("bundle");
    	bundle2.setDescription("bundle two");
    	
    	bundles.add(bundle1);
    	bundles.add(bundle2);
    	
        return bundles;
    }
    
    @POST
    @Path("/launch/{id}")    
    @Produces(MediaType.APPLICATION_JSON)
    public void LaunchBundle(@PathParam("id") String id) {
    	System.out.println("launch bundle rest end point called with " + id);
    }
}


