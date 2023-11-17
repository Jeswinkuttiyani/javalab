/*
 * file        :  abstractclass.java
 * Discription :  to print the no sides of triangle,rectangle and hexagon using abstract method.
 * Author      :  Jeswin Jose
 * Date        :  27/10/2023
 * version     :  1.0
*/
package java2;

public class abstractclass {
	public static void main(String[]args) {
		Triangle triangle=new Triangle();
        Rectangle rectangle= new Rectangle();
        Hexagon hexagon=new Hexagon();
		triangle.numberofsides();
		rectangle.numberofsides();
		hexagon.numberofsides();
	}

}
 abstract class shapes
{
	 abstract public void numberofsides(); 	 
}
class Triangle extends shapes
{
	public void numberofsides()
	{
		System.out.println("number of sides of triangle:"+3);
	}
}
class Rectangle extends shapes
{
	public void numberofsides()
	{
		System.out.println("number of sides of rectangle:"+4);
	}
}
class Hexagon extends shapes
{
	public void numberofsides()
	{
		System.out.println("number of sides of hexagon:"+6);
	}
}

	
	

