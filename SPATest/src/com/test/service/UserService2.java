package com.test.service;

import com.test.*;
import com.test.dao.DAOLayer;
import com.test.dao.DBService;

import javax.ws.rs.*;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Path("/user2")
public class UserService2 {

	@POST
	@Path("/{t}")
	@Produces("application/json")
	public JSONObject testUser(@PathParam("t") String t){
		
		/*Student student = new Student();
		student.setId(Integer.parseInt(t));
		student.setName("Ram");
		student.setCollegeName("UP College");
		student.setAge(25);*/
		//return student;
		JSONObject obj = new JSONObject();

	      try {
			obj.put("name", "foo");
//			obj.put("num", new Integer(100));
//		    obj.put("balance", new Double(1000.21));
//		    obj.put("is_vip", new Boolean(true));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      

	      System.out.print(obj);
		
		//return "{\"message\":\"success\"}";
	      return obj;
		
	}
	
	
	@GET
	@Path("/{t}")
	@Produces("application/json")
	public Object testUser2(@PathParam("t") String t){
		
		DAOLayer ob=new DBService();
		String q="insert into user2 values("+t+")";
		int count=ob.updateData(q);
		
		return "{\"message\":\"success from GET\"}";
	}
}
