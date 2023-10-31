/*
 * file        :  primeornot.java
 * Discription :  to check wheather the number is prime or not
 * Author      :  Jeswin Jose
 * Date        :  31/10/2023
 * version     :  1.0
 */
package java2;
import java.util.Scanner;
public class primeornot {
public static void main(String[] args) {
		int i,number,count=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number to be checked");
		number=sc.nextInt();
		for(i=1;i<=number;i++) {
			if(number%i==0) {
				count=count+1;
			}
		}
		if(count==2) {
			System.out.println("the number is prime");
		}
		else {
			System.out.println("the number is not prime");
		}
}
}
