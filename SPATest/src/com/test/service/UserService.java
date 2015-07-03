package com.test.service;

import com.test.dao.*;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/user")
public class UserService {

	@GET
	@Path("/{idd}/{pass}")
	@Produces("application/json")
	public String hello() {
		// System.err.println("hello");
		Map<String, String> data = new HashMap<String, String>();
		data.put("message", "Hello world");
		// return Response.ok().entity(data).build();
		return "{\"message\":\"Hello \"}";
	}
	
	@POST
	@Path("/{idd}/{pass}")
	@Produces("application/json")
	public String userPost(@PathParam("idd") String id, @PathParam("pass") String pass) {
		
		Map<String, String> data = new HashMap<String, String>();
		DAOLayer ob=new DBService();
		String q="insert into user values("+id+","+pass+")";
		int count=ob.updateData(q);
		return "{\"message\":\"Success\"}";
		}
}
