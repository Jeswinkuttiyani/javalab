/*
 * file        :  employeedetails.java
 * Discription :  to store the data of employee
 * Author      :  Jeswin Jose
 * Date        :  17/10/2023
 * version     :  1.0
 */
package java2;
import java.util.Scanner;
public class employeedetails {
	public static void main(String[]args) {
		System.out.println("officer details");
		Officer officer=new Officer();
		officer.employedetails();
		officer.officerdetails();
		officer.printdetails();
		officer.printdetail();
		System.out.println("manager details");
		Manager manager=new Manager();
		manager.employedetails();
		manager.managerdetail();
		manager.printdetails();
		manager.printdetail();
	}
	
	

}
class employee{
String name,address;
int age;
int salary;
long phoneNo;
Scanner sc=new Scanner(System.in);
public void employedetails(){
	System.out.println("enter the employe name:");
	name=sc.nextLine();
	System.out.println("enter the employe age:");
	age=sc.nextInt();
	System.out.println("enter the employe phone number:");
	phoneNo=sc.nextLong();
	System.out.println("enter the employe address:");
	address=sc.nextLine();
	sc.nextLine();
	System.out.println("enter the employe salary:");
	salary=sc.nextInt();
	}
public void printdetails() {
	System.out.println("name:"+name);
	System.out.println("age:"+age);
	System.out.println("phone Number:"+phoneNo);
	System.out.println("adress:"+address);
	System.out.println("salary:"+salary);
}
}
class Officer extends employee{
String  specialization;
public void officerdetails() {
System.out.println("enter the specialization:");
sc.nextLine();
specialization=sc.next();
}
public void printdetail() {
	System.out.println("specialization:"+specialization);
}
}
class Manager extends employee{
	String department;
	public void managerdetail() {
	System.out.println("enter the department:");
	sc.nextLine();
	department=sc.next();
	}
	public void printdetail() {
		System.out.println("department:"+department);
	}
}



	
