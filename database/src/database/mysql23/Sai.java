package database.mysql23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sai {
	public static void main(String args[]) {
	//ArrayList<String> ds = new ArrayList<String>();
	//String strArray[] = {"ram","sai","pavani","pramod"};
	//Collections.addAll(ds, strArray);
	//ds.forEach(System.out::println);
		String strArray[]= {"rama","sai","kiran"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(strArray));
		al.add("sai");
		al.add("kiran");
		al.add("reddy");
		Collections.sort(al);
		//Collections.synchronizedList(al);converting nonsynchorized version to sychronised version of arraylist
		al.forEach(System.out::println);
	}
}
//ArrayList ki = new ArrayList();
//List s =collections.synchornizedList(ki));


//HashSet sdf= new HashSet();
//Set d = Collections.sychornisedList(sdf);

//HashMap h = new HashMap();
//Map m = Collections.synchronizedList(h);

//TreeMap e = new TreeMap();
//SortedMap s = Collections.synchronizedList(e);


