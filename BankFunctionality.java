package java2;
import java.util.Scanner;
public class BankFunctionality {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("How many number of customers do you want to input:");
		int Number=sc.nextInt();
		Customer customer=new Customer();
		customer.getsDetails();
		customer.printDetails();
		
	}
}
class Customer{
	Scanner sc=new Scanner(System.in);
		String Name,AcType;
		int AcNo,Balance;
		public  void getsDetails() {
			System.out.print("Enter account number:");
			AcNo =sc.nextInt();
		    System.out.print("enter account type:");
		    AcType=sc.next();
		    System.out.print("enter customer name:");
		    Name=sc.next();
		    System.out.print("enter the balance");
		    Balance=sc.nextInt();
	}
		public void printDetails() {
			System.out.println("customer name:"+Name);
			System.out.println("Accout no:"+AcNo);
			System.out.println("Account type:"+AcType);
			System.out.println("Account Balance:"+Balance);
			
		}
}
