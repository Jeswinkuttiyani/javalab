package java2;
import java.util.Scanner;
class InvalidAmountException extends Exception{
	InvalidAmountException(String str){
		super(str);
	}
}
class InsufficientAmountException extends Exception{
	InsufficientAmountException(String str2){
		super(str2);
	}
}
public class Banking {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		InvalidAmountException amountException=new InvalidAmountException("Invalid amount ");
		InsufficientAmountException amountException2=new InsufficientAmountException("insufficient balance");
		int limit,i,choice;
		System.out.print("Enter the number customers you want to enter:");
		limit=sc.nextInt();
		Customer[] customer=new Customer[limit];
		for(i=0;i<limit;i++) {
			customer[i]=new Customer();
		customer[i].set_customer_details();
	    }
		for(i=0;i<limit;i++) {
		customer[i].printdetails();
		}
		do {
			System.out.print(" 1.Display account details\n "
					+ "2.Search by account number\n 3. Deposit the amount\n "
					+ "4.Withdraw the amount\n 5.Exit\n");;
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice) {
		     case 1:
				for(i=0;i<limit;i++) {
					customer[i].printdetails();
					}
				break;
		     case 2:
		    	 int searchaccNo;
	    	   System.out.println("Enter the account number you want to search:");
		       searchaccNo=sc.nextInt();
		       for(i=0;i<limit;i++) {
		    	   if(customer[i].acc_no==searchaccNo) {
					customer[i].printdetails();
					}   
		       }
		       else {
		    	   System.out.println("acc not found");
		       }
		       break;
		     case 3:
		    	   System.out.println("Enter the account number you want to deposit amount:");
			       searchaccNo=sc.nextInt();
			       try {
			       System.out.println("Enter the amount to deposit:");
			       int depositamount=sc.nextInt();
			       if(depositamount<=0) {
			    	   throw amountException;
			       }
			       else {
			       for(i=0;i<limit;i++) {
			    	   if(customer[i].acc_no==searchaccNo) {
			    		   customer[i].balance= customer[i].balance+depositamount;
						customer[i].printdetails();
						}
			       }
			       }
			}
			       catch(InvalidAmountException e) {
			    	   System.out.println(e.getMessage());
			       }
			       break;
		     case 4:
		    	 System.out.println("Enter the account number you want to withdraw amount:");
			       searchaccNo=sc.nextInt();
			       try {
			       System.out.println("Enter the amount to be deposited:");
			       int withdrawAmount=sc.nextInt();
			       if (withdrawAmount<=0) {
			    	   throw amountException;
			       }
			       else {
			    	   for(i=0;i<limit;i++) {
				    	   if(customer[i].acc_no==searchaccNo) {
				    		 if(withdrawAmount>customer[i].balance)  {
				    			 throw amountException2;
				    		 }
				    		 else
				    		 {
				    			 customer[i].balance=customer[i].balance-withdrawAmount;
				    			 customer[i].printdetails();
				    		 }
				    		 
			       }
			       }
			       }
			       }
			       catch(InvalidAmountException e) {
			    	   System.out.println(e.getMessage());  
			       }
			       catch(InsufficientAmountException e) {
			    	   System.out.println(e.getMessage());
			       }
			       break;
			default:
			}
		}
		while(choice!=5);

}}
 class Customer{
	 Scanner sc=new Scanner(System.in);
	int acc_no,balance;
	String name,accountType;
	public void set_customer_details()
	{
		System.out.print("Enter the name:");
		name=sc.nextLine();
		System.out.print("Enter the account number:");
		acc_no=sc.nextInt();
		System.out.print("Enter the account type:");
		accountType=sc.next();
		System.out.print("Enter the balance:");
		balance=sc.nextInt();

	}
	public void printdetails()
	{
		System.out.println("________________________________");
		System.out.println("Customer details are:");
		System.out.println("Customer name: "+name);
		System.out.println("Balance: "+balance);
		System.out.println("Accountnumber: "+acc_no);
		System.out.println("Accounttype: "+accountType);
		System.out.println("________________________________");
	}
	public void searchAccountNumber(){
		
	}
}
