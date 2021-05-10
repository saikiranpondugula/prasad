package database.mysql23;

import java.util.ArrayList;
import java.util.Arrays;


public class Saikiran {

	public static void main(String args[]) {
		/String strArray[]= {"rama","sita","sai","krishna"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(strArray));
		Object b[] = al.toArray();
		for(Object x:b) {
			System.out.println(x);
		}
	}/
	
	
}
