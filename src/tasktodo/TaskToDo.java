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
public class TaskToDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ShapeFactory shapeFactory = new ShapeFactory();


	      //get an object of Rectangle and call its draw method.
	      Shape shape2 = shapeFactory.getShape("RECTANGLE");

	      //call draw method of Rectangle
	      shape2.calculateArea();
	      shape2.calculatePermiter();

	      //get an object of Square and call its draw method.
	      Shape shape3 = shapeFactory.getShape("SQUARE");

	      //call draw method of square
	      shape3.calculateArea();
	      shape3.calculatePermiter();
	   }
}
