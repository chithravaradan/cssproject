package com.css.corejavatraining.TraineeData;

import java.util.ArrayList;
//import java.util.Arrays;

public class Batch extends Trainee {
	private String batchCode;
	private String startdate;
	private String enddate;
	private Trainee[] trainees;
	//private ArrayList<Trainee> trainees=new ArrayList<>();

	public String getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public Trainee[] getTrainees() {
		return trainees;
	}
	public void setTrainees(Trainee[] trainees) {
		this.trainees = trainees;
	}
	public Batch(String batchCode, String startdate, String enddate, Trainee[] trainees) {
		super();
		this.batchCode = batchCode;
		this.startdate = startdate;
		this.enddate = enddate;
		this.trainees = trainees;
	}
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Batch(int i, String string, ArrayList<Trainee> trainees2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startdate=" + startdate + ", enddate=" + enddate + ", trainees="
				+ trainees + "]";
	}
	public char[] getTrainee(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public Trainee gettrainees(String gender) {
		Trainee foundTrainee = null;
		for(Trainee t : this.trainees) {
			if(t.getGender()==gender) {
				foundTrainee=t;
				//break;
			}
		}
		return foundTrainee;
	
	}
	public Trainee getTrainee(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
