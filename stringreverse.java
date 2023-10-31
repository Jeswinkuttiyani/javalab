/*
 * file        :  stringreverse.java
 * Discription :  to print the reverse of a string.
 * Author      :  Jeswin Jose
 * Date        :  31/10/2023
 * version     :  1.0
*/
package java2;
import java.util.Scanner;
public class stringreverse {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	String st;
	int length,i;
	System.out.println("enter the string:");
	st=sc.next();
	length=st.length();
	char a[]=st.toCharArray();
	System.out.println("the reversed string");
    for(i=length-1;i>=0;i--){
     System.out.print(""+a[i]);
}
}
}
