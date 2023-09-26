/*
 * file        :  attendancepercentage.java
 * Discription :  find attendance mark
 * Author      :  Jeswin Jose
 * Date        :  26/09/2023
 * version     :  1.0
 */
package java2;
import java.util.Scanner;
public class attendancepercentage {
	public static void main(String[] args) {
		int attendancepercentage,attendancemark;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the attendancepercentage");
		attendancepercentage=sc.nextInt();
				if(attendancepercentage >= 90)
				{
		System.out.println("mark=10");
				}
		if(attendancepercentage < 90)
		{
			attendancemark=attendancepercentage/10;
			System.out.println("mark:"+attendancemark);
			
		}
	}

}
