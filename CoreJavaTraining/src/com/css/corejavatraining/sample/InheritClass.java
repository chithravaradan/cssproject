package com.css.corejavatraining.sample;
	class addition{
		void add(int x , int y)
		{
			System.out.println(x+y);
		}
	}
	public class InheritClass extends addition{
		void sub(int x,int y) {
			System.out.println(x-y);
		}
		InheritClass()
		{
			this(6);
			System.out.println("All completed");
			
		}
		InheritClass(int x){ //parametrized constructor
			System.out.println(x);
			add(5,10);
			sub(3,2);
		}
		
		public static void main(String[] args) {
			new InheritClass();
			
		
	}

}

