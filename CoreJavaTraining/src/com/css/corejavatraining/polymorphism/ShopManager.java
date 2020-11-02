package com.css.corejavatraining.polymorphism;
import java.util.ArrayList;
public class ShopManager {
	private int vehicleShopID;
	private String ShopName;
	private ArrayList<Vehicle> vehicle=new ArrayList<>();
	
	public int getBatchID() {
		return vehicleShopID;
	}
	public void setBatchID(int batchID) {
		this.vehicleShopID = batchID;
	}
	public String getBatchName() {
		return ShopName;
	}
	public void setBatchName(String ShopName) {
		this.ShopName = ShopName;
	}
	public ArrayList<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setTrainees(ArrayList<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	public ShopManager(int vehicleShopID, String ShopName, ArrayList<Vehicle> vehicle) {
		super();
		this.vehicleShopID = vehicleShopID;
		this.ShopName = ShopName;
		this.vehicle = vehicle;
	}
	public ShopManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vehicle getVehicle(int vehicleShopID) {
		Vehicle foundVehicle=null;
		for(Vehicle vehicle:vehicle) {
			if(vehicle.getVehicleID()==vehicleShopID) {
				foundVehicle=vehicle;
			}
		}
		return foundVehicle;
	}
	public ArrayList<Vehicle> getVehicle(String color){
		ArrayList<Vehicle> foundVehicle=new ArrayList<Vehicle>();
		for(Vehicle vehicle:vehicle) 
			if(vehicle.getColor().equals(color))
				foundVehicle.add(vehicle);
		
		return foundVehicle;
	}
	
	public ArrayList<Vehicle> getModel(int model){
		ArrayList<Vehicle> foundVehicle=new ArrayList<Vehicle>();
		for(Vehicle vehicle:vehicle) 
			if(vehicle.getModel()==model)
				foundVehicle.add(vehicle);
		
		return foundVehicle;
	}
	
}
