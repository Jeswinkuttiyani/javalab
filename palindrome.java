/*
 * file        :  palindrome.java
 * Discription :  to check wheather the string is palindrome or not
 * Author      :  Jeswin Jose
 * Date        :  3/10/2023
 * version     :  1.0
 */
package java2;
import java.util.Scanner;
public class palindrome {
public static void main(String[] args) {
		String string;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a string to be checked");
		string=sc.next();
		boolean check=ispalindrome(string);
		if(check==true)
		{
			System.out.println("the string is palindrome");
		}
		else 
		{
			System.out.println("the string is not palindrome");
		}
	}
	/* this function is used to recieve a string and return true or false accordingly*/
	static boolean ispalindrome(String string)
	{
		char characterArray[] = string.toCharArray();
		int length=string.length();
		for(int i=0;i<length;i++)
		{
			if(characterArray[i]!=characterArray[length-i-1]) {
				return false;
			}
			
		}
		return true;
	}
}

