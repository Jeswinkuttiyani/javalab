 /*
 * file        :  frequencyofcharacter.java
 * Discription :  to find the frequency of a given character in a string
 * Author      :  Jeswin Jose
 * Date        :  3/10/2023
 * version     :  1.0
 */
package java2;
import java.util.Scanner;
public class frequencyofcharacter {
	public static void main(String[] args) {
		String input;
		char checkCharacter;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		input=sc.nextLine();
		System.out.println("enter the character whose frequency to be checked");
		checkCharacter = sc.next().charAt(0);
		int count=frequency(input,checkCharacter);
		if(count!=0)
		{
			System.out.println("the frequency of entered character="+count );
		}
		else
		{
			System.out.println("the character is not found");
		}
		
		
	}
	//this function will check the frequency of entered character and return the value
	static int frequency(String input,char checkCharacter){
		int count=0;
		char characterArray[]=input.toCharArray();
		for(int i=0;i<input.length();i++)
		{
			if(checkCharacter == characterArray[i])
			{
				count++;
			}
		}
		return count;
		
	}

}