package java2;
import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	char ch='y';
	int Number1,Number2 ,Result;
	while(ch=='y')
	{
	System.out.println("Program to perform division");
	System.out.print("Enter first numbers:");
	Number1=sc.nextInt();
	System.out.print("Enter second number:");
	Number2=sc.nextInt();
	try {
		Result=Number1/Number2;
		System.out.println("Result="+Result);
	}
	catch (ArithmeticException e){
		System.out.println("/ by zero");
	}
	finally {
		System.out.println("end of the operation");
		System.out.println("Do you want to continue y or n:");
		ch=sc.next().charAt(0);
	}
	

	}

}
}