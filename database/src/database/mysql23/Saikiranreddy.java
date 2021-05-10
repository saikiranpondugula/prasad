package database.mysql23;

import java.util.Enumeration;
import java.util.Hashtable;

public class Saikiranreddy {
	public static void main(String args[]) {
		Hashtable<String,String> df = new Hashtable<String,String>();
		//df.add("Andhra Pradesh","amaravathi");
		df.put("Telangana", "hyderabad");
		df.put("Andhra Pradesh","Amarvathi");
		df.put("sikkim", "gangtok");
		df.put("maharastra","mumbai");
		
		
		Enumeration<String>keys = df.keys();
		while(keys.hasMoreElements() ) {
			String k = keys.nextElement();
			String b = df.get(k);
			System.out.println(k + " - "+ b);
		}
		
		
	}

}
