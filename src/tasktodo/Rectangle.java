/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasktodo;

import java.util.Scanner;

/**
 *
 * @author GT910564
 */
public class Rectangle  implements Shape{

	@Override
	public void calculateArea() 
        {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the width to calculte area of rectangle ");
		int width= sc.nextInt();
		System.out.println("please enter the length to calculte area of rectangle ");
		int length= sc.nextInt();
		int area = width+length;
		System.out.println("area of the rectangle is :"+ area);
		
	}

	@Override
	public void calculatePermiter() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the width to calculate  Perimeter of rectangle");
		int width= sc.nextInt();
		System.out.println("please enter the length to calcualte Perimeter of rectangle");
		int length= sc.nextInt();
		int Perimeter = (width+length)*2;
	        System.out.println("the Perimeter for the rectangle is :"+Perimeter);
		
	}

}
