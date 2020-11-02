package com.css.corejavatraining.sample;

public class Car {
		String color;
		String type;
		
		void printDescription()
		{
		System.out.println(" my Car color : "+ color + " and type : "+type);
		}
		
		

		public static void main(String[] args)
		{
		Car mycar=new Car();
		mycar.color="Green";
		mycar.type="Sedan";
		mycar.printDescription();
		
		

		}
}
	



