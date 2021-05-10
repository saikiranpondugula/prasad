package database.mysql23;

import java.util.HashSet;
import java.util.LinkedList;
class Emp{
	int empno;
	String ename;
	public Emp(int empno,String ename) {
		this.empno = empno;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	public int hashCode() {
		return this.empno;
	}
	public boolean equals(Object obj) {
		Emp e = (Emp)obj;
		return this.empno == e.empno && this.ename== e.ename;
		
	}
}
public class Saikirancomparator {
public static void main(String args[]) {
	HashSet<Emp> empSet = new HashSet<Emp>();
	Emp e1 = new Emp(10,"anu");
	Emp e2 = new Emp(10,"anu");
	Emp e3 = new Emp(1,"sai");
	
	empSet.add(e1);
	empSet.add(e2);
	empSet.add(e3);
	empSet.forEach(System.out::println);
	
	
	
	//LinkedList<String> df = new LinkedList<String>();
	/*df.add("d");
	df.add("sai");
	df.addFirst("saikiran");
	df.addLast("saiiii");
	df.add(1,"sw");
	System.out.println(df);
	df.removeFirst();
	df.removeLast();
	System.out.println("after removing ="+df);
	df.remove("d");
	df.remove(1);
	System.out.println(df);
	String sd = df.get(0);
	System.out.println(sd);
	System.out.println("afeter "+df);
	*/
	//LinkedList<String> copy = (LinkedList<String>) df.clone();
	//System.out.println("clonwd ="+copy);
}
}
