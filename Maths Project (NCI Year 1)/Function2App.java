/*
* Function2App.java
* @author: Brian Murphy
* 12/11/2012
*/


import javax.swing.JOptionPane;


import java.util.Scanner;

	public class Function2App{
		public static void main (String args[]){

		//data types
		int x, y;
		boolean conjunction;
		boolean disjunction;
		boolean negation;
		boolean error;

		//Scanner
		Scanner keyboard = new Scanner(System.in);
		ProjectFunction2 device = new ProjectFunction2();


		//Input
		System.out.print("Enter a number for x:");
		x = keyboard.nextInt();

		System.out.print("Enter a number for y:");
		y = keyboard.nextInt();

		device.setX(x);
		device.setY(y);

		device.compute();

		//get methods
		conjunction = device.getConjunction();
		disjunction = device.getDisjunction();
		negation = device.getNegationP();
		error = device.getError();

		System.out.println("The Conjunction is: " + conjunction);
		System.out.println("The Disjunction is: " + disjunction);
		System.out.println("The Negation is: " + negation);

	}

}