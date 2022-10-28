package Package1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JasonProject
{
	public static void main(String[] args) throws FileNotFoundException {
       
		JSONObject jo = new JSONObject();
		jo.put("FirstName", "Vinod");
		jo.put("LastName", "Patil");
		jo.put("Age", 25);
	
		Map m= new LinkedHashMap(3);
		
		m.put("City", "Jalgaon");
		m.put("Colony", "Ganesh-Coloney");
		m.put("Pincode", 425113);
		
		
		jo.put("address", m);
		JSONArray ja = new JSONArray();
		
		m= new LinkedHashMap(2);
		m.put("Company", "Axyya");
		m.put("Employee", 01-02);
		
		jo.put("Company Add", m);
		
		PrintWriter Pw = new PrintWriter("JSONEmployee.json");
		Pw.write(jo.toJSONString());
		Pw.flush();
		System.out.println("Success...");
		
		
	}
}
