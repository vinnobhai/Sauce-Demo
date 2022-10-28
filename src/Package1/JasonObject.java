package Package1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.simple.JSONObject;

public class JasonObject 
{
 public static void main(String[] args) throws FileNotFoundException {
	
	 JSONObject jo = new JSONObject();
	 
	 jo.put("Firstname", "Vinod");
	 jo.put("Lastname","Patil");
	 jo.put("Birth Placed", "Amalner");
	 jo.put("Age", 24);
	 
	 PrintWriter Pw = new PrintWriter("JasonExample.json");
	 Pw.write(jo.toJSONString());
	 Pw.flush();
	 System.out.println("success");
	 
}
}
