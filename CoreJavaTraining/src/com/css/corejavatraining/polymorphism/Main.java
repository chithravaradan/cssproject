package com.css.corejavatraining.polymorphism;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList<Vehicle> vehicle=new ArrayList<>();
		vehicle.add(new Vehicle(100,"Bmw","Black",21333));
		vehicle.add(new Vehicle(101,"ford","Blue",27890));
		vehicle.add(new Vehicle(102,"audi","Silver",2870));
	
		
		ShopManager shopmanager=new ShopManager(1011,"Nexon",vehicle);
		System.out.println(shopmanager.getVehicle(101));
		
		System.out.println(shopmanager.getModel(21333).toString());
		System.out.println(shopmanager.getVehicle("Blue").toString());
	}

}
