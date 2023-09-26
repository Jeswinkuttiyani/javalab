/*
 * file        :  grade.java
 * Discription :  find grade
 * Author      :  Jeswin Jose
 * Date        :  26/09/2023
 * version     :  1.0
 */
package java2;
import java.util.Scanner;
public class attendancemark {
	public static void main(String[] args) {
		int markpercentage,grade;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mark percentage");
		markpercentage=sc.nextInt();
				if(markpercentage >= 90)
				{
		System.out.println("grade=s");
				}
				else if(markpercentage <90 && markpercentage >=85 )
		{
			
			System.out.println("grade=A+");
			
		}
				else if(markpercentage <85 && markpercentage >=80 )
		{
			
			System.out.println("grade=A");
			
		}
				else if(markpercentage <80 && markpercentage>=75 )
		{
			
			System.out.println("grade=B+");
			
		}
				else if(markpercentage <75 && markpercentage>=70 )
		{
			
			System.out.println("grade=B");
			
		}
				else if(markpercentage <70 && markpercentage>=65 )
		{
			
			System.out.println("grade=c+");
			
		}
				else if(markpercentage <65 && markpercentage>=60)
		{
			
			System.out.println("grade=c");
			
		}
				else if(markpercentage <60 && markpercentage>=55 )
		{
			
			System.out.println("grade=D+");
			
		}
				else if(markpercentage <55 && markpercentage>=50 )
		{
			
			System.out.println("grade=D");
			
		}
		else 
		{

			System.out.println("fail");
		}
		
		
	}

}
