/*
 * file        :  matrix multiplication.java
 * Discription :  to find product of two matrix
 * Author      :  Jeswin Jose
 * Date        :  10/10/2023
 * version     :  1.0
 */
package java2;
import java.util.Scanner;
public class matrixmultiplication {
public static void main(String[]args) {
	int row1,col1,row2,col2,i,j,k;
	Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of rows and coloums in first matrix");
	row1=sc.nextInt();
	col1=sc.nextInt();
	System.out.println("enter the number of rows and coloums in second matrix");
	row2=sc.nextInt();
	col2=sc.nextInt();
	int[][]matrix1=new int[row1][col1];
	int[][]matrix2=new int[row2][col2];
	int[][]product=new int[row1][col2];
	if(row2!=col1) {
		System.out.println("the order is invalid");
	}
	else
	{
	System.out.println("enter the number of matrix1");
	 {
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
	 }
	 System.out.println("enter the number of matrix2");
	 {
		for( i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
	 }
	 
	 System.out.println("matrix1");
	 {
		 for(i=0;i<row1;i++)
			{
				for(j=0;j<col1;j++)
				{
					System.out.print(matrix1[i][j]+"\t");
			    }  
				System.out.println();
		    }
	 }
	 System.out.println("matrix2");
	 {
		 for(i=0;i<row2;i++)
			{
				for(j=0;j<col2;j++)
				{
					System.out.print(matrix2[i][j]+"\t");
			    }  
				System.out.println();
		    }
	 }
		
	 System.out.println("multiplied matrix:");
			 for( i=0;i<row1;i++)
				{
					for(j=0;j<col2;j++)
					{
					 product[i][j]=0;
					  for(k=0;k<col1;k++)
					   {
						product[i][j]=product[i][j]+matrix1[i][k]*matrix2[k][j];
					   }
						System.out.print(product[i][j]+"\t");
							
					}
					System.out.println();
								
						
				}
				}
				

			}

		}