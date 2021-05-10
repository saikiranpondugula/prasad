package database.mysql23;

import java.util.Comparator;
import java.util.TreeSet;
class MyComparator implements Comparator<StringBuffer>{

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		// TODO Auto-generated method stub
		String m1 = o1.toString();
		String m2 = o2.toString();
		return o1.compareTo(o2);
	}
}
public class Devil {
	public static void main(String args[]) {
	
		TreeSet<StringBuffer> r = new TreeSet<StringBuffer>
		(new MyComparator());
		r.add(new StringBuffer("ORANGE"));
		r.add(new StringBuffer("muskmelon"));
		r.add(new StringBuffer("banana"));
		r.forEach(x->System.out.println(x));
		
	}
}

