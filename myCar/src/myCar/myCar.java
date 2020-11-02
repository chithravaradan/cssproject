package myCar;

public class myCar {
	
	String color;
	String type;
	int serialNumber;
	static int carCount;
	static {
		setCarCount(3);
	}
	
	public static void setCarCount(int c) {
		carCount=c;
	}
	myCar(){
		carCount++;
		serialNumber=carCount;
	}
	void printDescription()
	{
	System.out.println(" my Car color : "+ color + " and type : "+type);
	}

	public static void main(String[] args)
	{
	myCar mycar=new myCar();
	mycar.color="Green";
	mycar.type="Sedan";
	mycar.printDescription();
	

	}
}
