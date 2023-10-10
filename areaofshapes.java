/*
 * file        :  area of shapes.java
 * Discription :  to find the area of triangle,rectangle and circle using method overloading.
 * Author      :  Jeswin Jose
 * Date        :  10/10/2023
 * version     :  1.0
 */
package java2;
import java.util.Scanner;
public class areaofshapes {
	public static void main(String[] args) {
		int length,breadth;
		float base,height,radius;
		Scanner sc =new Scanner (System.in);
		Shapes shapes=new Shapes();
		System.out.println("enter the base and height of triangle");
		base=sc.nextFloat();
		height=sc.nextFloat();
		System.out.println("enter the length and breadth of rectangle");
		length=sc.nextInt();
		breadth=sc.nextInt();
		System.out.println("enter the radius of circle");
		radius=sc.nextFloat();
		shapes.Area(base,height);
		shapes.Area(length,breadth);
		shapes.Area(radius);
			
		
		}

	}
	 class Shapes
	{
		float area;
		public void Area(float base,float height)
		{

			area=base*height*0.5f;
			System.out.println("area of triangle="+area);
		}
		public void Area(int length,int breadth)
		{
			area=length*breadth;
			System.out.println("area of rectangle="+area);
		}
		public void Area(float radius)
		{
			area=3.14f*radius*radius;
			System.out.println("area of circle="+area );
		}

	}
