package com.mycompany.rest;

import javax.ws.rs.*;

@Path("/restservice/")
public class GetQuoteResource {
		
		@POST
	    @Path("/getQuote/")
	    @Produces("application/json")
	    public String getQuote(String input) {	
	        return null;
		}
}
