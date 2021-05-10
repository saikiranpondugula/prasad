package database.mysql23;

import java.util.ArrayList;

class Employee{
	
	int empno;
	String ename;
	public Employee(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + "]";
	}	
}
class Student1{
	int sno;
	String sname;
	public Student1(int sno,String sname) {
		this.sno= sno;
		this.sname= sname;
	}
	@Override
	public String toString() {
		return "Student1 [sno=" + sno + ", sname=" + sname + "]";
	}
	
}
public class reddy {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		list.add(new Employee(10,"samantha"));
		list.add(new Employee(11,"thammana"));
		list.add(new Employee(12,"trisha"));
		
		
		list.add(new Student1(1,"sai"));
		list.add(new Student1(2,"kiran"));
		list.add(new Student1(3,"pandu"));
		
		list.add("reddy");
		Object b[] =  list.toArray();
		for(Object x: b ) {
			if(x instanceof Employee) {
				Employee e =(Employee)x;
				System.out.println("employee info");
				System.out.println(e.empno+""+e.ename);
			}
			if(x instanceof Student1) {
				Student1 e = (Student1)x;
				System.out.println("student info");
				System.out.println(e.sno+""+e.sname);
			}
			if(x instanceof String) {
				System.out.println(x.toString());
			}
				
			}
		}	
}

