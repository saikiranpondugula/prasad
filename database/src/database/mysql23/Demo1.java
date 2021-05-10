package database.mysql23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee12 implements Comparable{
	int empno;
	String ename;
	public Employee12() {
		System.out.println("default comsturctor");
	}
	public Employee12(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		return this.empno- empno;
	}
		
	
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> emplist = new ArrayList<Employee>();
		Employee  e1 =  new Employee(1,"sai");
		Employee  e2 =  new Employee(2,"kiran");
		
		emplist.add(e1);
		emplist.add(e2);
		 
		System.out.println("before sorting employee data");
        emplist.forEach(x->System.out.println(x.getEmpNo()+""+x.getEname()));
        Collections.sort(emplist);
        System.out.println("aftr sorting employee data");
        emplist.forEach(x->System.out.println(x.getEmpNo()+""+x.getEname()));
		
		
		}
}
