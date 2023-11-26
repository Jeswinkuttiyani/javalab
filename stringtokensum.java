package oopj;
import java.util.Scanner;
import java.util.StringTokenizer;
public class strtokensum1 {
	public static void main(String[] args) {
	String str;
	int num,sum=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the numbers:");
	str=sc.nextLine();
	StringTokenizer tkn=new StringTokenizer(str);
	while(tkn.hasMoreElements()) {
	num =Integer.parseInt(tkn.nextToken());
	sum=sum+num;
	}
System.out.println("sum is "+sum);
	}

}
