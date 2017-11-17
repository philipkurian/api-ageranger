package test;

import org.junit.*;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

public class FunctionalTest2 {
	
	
	@BeforeClass
	public static void setup(){
		
//		String port = System.getProperty("server.port");
//		if(port ==  null){
//			RestAssured.port = Integer.valueOf(8080);
//		}
//		else {
//			RestAssured.port = Integer.valueOf(port);
//		}
//		
//		String basePath = System.getProperty("server.base");
//		if(basePath == null) {
//			basePath = "/rest-garage-sample/";
//		}
//		
//		RestAssured.basePath = basePath;
		
		String baseHost = System.getProperty("server.host");
		if(baseHost == null) {
			baseHost = "http://ageranger.azurewebsites.net/api/AgeRanger/";
		}
		
		RestAssured.baseURI = baseHost;
		
	}

}