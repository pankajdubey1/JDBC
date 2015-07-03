package com.xebia.NB.server;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

//import com.yesbank.billpay.config.AppConfig;


@WebServlet("/NBServer")
public class NBServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public NBServer() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello world from get");
		HttpClient client = new DefaultHttpClient();
		
		//register
	   /* HttpPost post = new HttpPost("http://localhost:8080/BillPay/api/customer/register");
	    try {	       
	      List<NameValuePair> list=new ArrayList<NameValuePair>(1);
	      list.add(new BasicNameValuePair("fldReqId","<FAML><HEADER><REQID>REQASBA</REQID><EXTSYSTEMID>WHITESPACES</EXTSYSTEMID></HEADER><DATA><EXTSYSTEMSESSIONID>SDFSD34234SD</EXTSYSTEMSESSIONID><EXTSYSTEMSESSIONIDP>SDF432IYT2342</EXTSYSTEMSESSIONIDP><CUSTID>184355</CUSTID><USERID>chetanap</USERID><REQUESTID></REQUESTID><USERROLE>RETAIL1~RETAILS2</USERROLE><ACCTHOLDERNAME>Janaki</ACCTHOLDERNAME><ACCTNO>4444444444~123456789123456~8888888888~9860180475~023456789123456~654123789321456~000190600004080</ACCTNO><ACCTREL>023456789123456~SOW,654123789321456~SOW</ACCTREL><EMAILID>pradnyak@winsoftech.com</EMAILID><MOBILENO>919881029144</MOBILENO><ACTION>login</ACTION><APPID>WHITESPACES</APPID><RQTTIME>20120928:151416</RQTTIME><ACCTBALLIST>2173253.126~0.0~40809.8</ACCTBALLIST><CHKID>3178450974</CHKID><TXNID>OTS</TXNID></DATA></FAML>"));
	       post.setEntity(new UrlEncodedFormEntity(list));	      
	      HttpResponse response1 = client.execute(post);
	      StatusLine status=response1.getStatusLine();  
	      System.out.println(response1);
	      System.out.println(status.getStatusCode());
	      String status2=status.toString();
	      
	      if(status.getStatusCode()==200){
	    	  
	    	  response.sendRedirect("https://www.facebook.com/pages/YES-Bank/417405105079270?sk=app_1580282222187545" + "&app_data=NB_" + 184355);
	      }
	      else{
	    	  response.sendRedirect("https://www.facebook.com/pages/YES-Bank/417405105079270?sk=app_1580282222187545" + "&app_data=NB_" + 184355); 
	      }
	    } catch (IOException e) {
	      e.printStackTrace();
	    }*/
	    
	    
	    //deregister
	    
	    HttpPost post = new HttpPost("http://localhost:8080/BillPay/api/customer/deregister");
	    try {	       
	      List<NameValuePair> list=new ArrayList<NameValuePair>(1);
	      list.add(new BasicNameValuePair("fldReqId","<FAML><HEADER><REQID>REQASBA</REQID><EXTSYSTEMID>WHITESPACES</EXTSYSTEMID></HEADER><DATA><EXTSYSTEMSESSIONID>SDFSD34234SD</EXTSYSTEMSESSIONID><EXTSYSTEMSESSIONIDP>SDF432IYT2342</EXTSYSTEMSESSIONIDP><CUSTID>184355</CUSTID><USERID>chetanap</USERID><REQUESTID></REQUESTID><USERROLE>RETAIL1~RETAILS2</USERROLE><ACCTHOLDERNAME>Janaki</ACCTHOLDERNAME><ACCTNO>4444444444~123456789123456~8888888888~9860180475~023456789123456~654123789321456~000190600004080</ACCTNO><ACCTREL>023456789123456~SOW,654123789321456~SOW</ACCTREL><EMAILID>pradnyak@winsoftech.com</EMAILID><MOBILENO>919881029144</MOBILENO><ACTION>login</ACTION><APPID>WHITESPACES</APPID><RQTTIME>20120928:151416</RQTTIME><ACCTBALLIST>2173253.126~0.0~40809.8</ACCTBALLIST><CHKID>3178450974</CHKID><TXNID>OTS</TXNID></DATA></FAML>"));
	       post.setEntity(new UrlEncodedFormEntity(list));	      
	      HttpResponse response1 = client.execute(post);
	      StatusLine status=response1.getStatusLine();  
	      System.out.println(response1);
	      System.out.println(status.getStatusCode());
	      String status2=status.toString();
	      
	      if(status.getStatusCode()==200){
	    	  
	    	  System.out.println("customer deregistered successfully");
	      }
	      else{
	    	  System.out.println("deregistration failed");   
	      }
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	    
	  }
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello world from post");
	}

}
