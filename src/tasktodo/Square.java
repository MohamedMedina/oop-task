/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasktodo;

/**
 *
 * @author GT910564
 */
import java.util.Scanner;

public class Square implements Shape {

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the side of the square to calculate area");
		int side= sc.nextInt();
		
		int area = side*side;
		 System.out.println(" the areaof squre is :  = " + area);
		
	}

	@Override
	public void  calculatePermiter() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the side of the square");
		int side= sc.nextInt();
		
		int Perimeter = side*4;
		 System.out.println(" the Perimeter of the squre is  = " + Perimeter);
		
	}
}
