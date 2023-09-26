/*
 * file        :  sumofpositivenumbers.java
 * Discription :  find sum of positive numbers
 * Author      :  Jeswin Jose
 * Date        :  26/09/2023
 * version     :  1.0
 */
package java2;
import java.util.Scanner;
public class additionof2numbers {
	public static void main(String[] args) {
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to be added:");
		number=sc.nextInt();
		while(number > 0)
		{
			sum = sum+number;
			System.out.println("enter the next number to be added:");
			number=sc.nextInt();
			
		}
		
			System.out.println("the sum is :"+sum);
		
		}
		}
	
