package org.raghav.restwebtest.cnt;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/jrsy/")
public class JersyServ {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String returnout()
	{	
		return "Jersy : class call";
	}
	
	@GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String sayPlainTextHello() {
	    return "Hello Jersey Plain";
	  }

	  // This method is called if XML is request
	  @GET
	  @Produces(MediaType.TEXT_XML)
	  public String sayXMLHello() {
	    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey XML" + "</hello>";
	  }

	  // This method is called if HTML is request
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public String sayHtmlHello() {
	    return "<html> " + "<title>" + "Hello Jersey HTML" + "</title>"
	        + "<body><h1>" + "Hello Jersey HTML" + "</body></h1>" + "</html> ";
	  }

	
	

}
