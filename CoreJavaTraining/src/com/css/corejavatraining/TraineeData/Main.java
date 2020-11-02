package com.css.corejavatraining.TraineeData;

//import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//ArrayList<Trainee> trainees=new ArrayList<>();
		Trainee[] t=new Trainee[3];
		t[0]=new Trainee(123,"Chithra","Female",22);
		t[1]=new Trainee(124,"roy","Male",22);
		t[2]=new Trainee(125,"ram","Male",23);
		 Batch batch=new Batch("1A1","2020-9-11","2020-11-11",t);
		 //Batch batch1=new Batch("1A2","2020-10-19","2020-11-11",t);
		 batch.setTrainees(t);
		//batch1.setTrainees(t);
		 
		 for(Trainee tr: batch.getTrainees())
			{
				System.out.println(tr);
			}
		 System.out.println(batch);
		 Trainee getTrainee=batch.gettrainees("Female");
			if(getTrainee !=null) {
				System.out.println("The details are : " + getTrainee);
			}
		
		

	}
	

}
