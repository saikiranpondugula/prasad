package database.mysql23;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ram");
		list.add("harish");
		list.add("anusha");
		list.add("saikiran");
		
		ListIterator<String> listIt = list.listIterator();
		System.out.println("forward direction");
		while(listIt.hasNext()) {
			System.out.println(listIt.next());
		}
		System.out.println("backward direction");
		while(listIt.hasPrevious()) {
			System.out.println(listIt.previous());
		}
	}
}
