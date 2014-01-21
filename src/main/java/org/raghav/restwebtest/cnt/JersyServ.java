package org.raghav.restwebtest.cnt;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/jrsy")
public class JersyServ {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnout()
	{
		
		return "Jersy class call";
		
		
	}
	
	

}
