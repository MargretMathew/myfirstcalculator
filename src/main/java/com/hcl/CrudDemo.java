package com.hcl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

class Employee{
	private int empno;
	private String ename;
	private int salary;
	
	Employee(int empno, String ename, int salary){
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	
	public int getEmpno() {
		return empno;
	}
	public int getSalary() {
		return salary;
	}
	public String getEname() {
		return ename;
	}
	public String toString() {
		return empno+" "+ename+" "+salary;
	}
}
public class CrudDemo {

	public static void main(String[] args) {
		
		Collection<Employee> c = new ArrayList<Employee>();
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		// TODO Auto-generated method stub
		int ch;
		do {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Delete");
			System.out.println("4.Update");
			System.out.println("Enter your choice: ");
			ch = s.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter Empno: ");
				int eno = s.nextInt();
				System.out.println("Enter EmpName: ");
				String ename = s.next();
				System.out.println("Enter Salary: ");
				int salary = s.nextInt();
				
				c.add(new Employee(eno,ename,salary));
				break;
			case 2:
				System.out.println("-------------");
				Iterator<Employee> i = c.iterator();
				while(i.hasNext()) {
					Employee e = i.next();
					System.out.println(e);
				}
				System.out.println("-------------");
				break;
			case 3:
				boolean found = false;
				System.out.println("Enter Empno to be deleted:");
				int empno = s.nextInt();
				System.out.println("-------------");
				i = c.iterator();
				 while(i.hasNext()) {
					 Employee e = i.next();
					 if(e.getEmpno()== empno) {
						 i.remove();
						 found = true;
					 }
				 }
				 
				 if(!found) {
					 System.out.println("Record Not Found");
				 }else {
					 System.out.println("Record is Deleted Successfully");
				 }
				 break;
			case 4:
				found = false;
				System.out.println("Enter Empno to be update:");
				empno = s.nextInt();
				System.out.println("-------------");
				ListIterator<Employee>li = ((ArrayList<Employee>) c).listIterator();
				 while(li.hasNext()) {
					 Employee e = li.next();
					 if(e.getEmpno()== empno) {
						System.out.println("Enter new name:");
						ename = s1.nextLine();
						System.out.println("Enter new salary: ");
						salary = s1.nextInt();
						li.set(new Employee(empno,ename,salary));
						 found = true;
					 }
				 }
				 
				 if(!found) {
					 System.out.println("Record Not Found");
				 }else {
					 System.out.println("Record is Updated Successfully");
				 }
				 break;
			}
		}while(ch!=0);
	}

}
