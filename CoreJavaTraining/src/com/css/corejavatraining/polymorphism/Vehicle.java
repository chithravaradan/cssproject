package com.css.corejavatraining.polymorphism;

public class Vehicle {
	private int vehicleID;
	private String vehicleName;
	private String color;
	private int model;
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public Vehicle(int vehicleID, String vehicleName, String color, int model) {
		super();
		this.vehicleID = vehicleID;
		this.vehicleName = vehicleName;
		this.color = color;
		this.model = model;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleID=" + vehicleID + ", vehicleName=" + vehicleName + ", color=" + color + ", model="
				+ model + "]";
	}
	
	
}
