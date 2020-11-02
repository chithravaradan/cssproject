package com.css.corejavatraining.stringserviceprovider;

public class StringServiceProvider {
	public void stringReverse(){
	String  string="HelloWorld";   
    System.out.print("Reversed string is: ");  
	for(int i=string.length()-1;i>=0;--i)                  
	{  
	System.out.print(string.charAt(i));            
	}  
	}
	
public  void linearSearch(){	  
	int arr[] = { 2, 3, 4, 10, 40 };
	int x = 10;
	int n = arr.length;
	for(int i=0;i<n;i++) 
		{
		if(arr[i] == x) {
		System.out.println("\nElement present at index: "+ i);
		break;
		}
		if(i>arr.length)
	    System.out.print("\nElement not present in array");
		}
	}
public void findAndReplace(){
	
	       String str = "To replape a string in java";
	       System.out.println("String: "+str);
	       int position = 8;
	       char replace = 'c';
	       String res = str.substring(0, position) + replace + str.substring(position + 1);
	       System.out.println("String after replacing a character: "+res);
	    
	
}	
public static void main(String args[]){
		StringServiceProvider obj = new StringServiceProvider();
		obj.stringReverse();
		obj.linearSearch();
		obj.findAndReplace();
		
	    }
}
