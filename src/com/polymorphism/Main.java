package com.polymorphism;

/* this com.polymorrphism package is example of method over loading and overriding
 * 
 */

public class Main { // main class contain method method
	public static void main(String[] args) { // main method
		
		MethodOverriding methodOveriding =new MethodOverriding(); // object of MethodOverriding Class 
		System.out.println("methodoverriding" + " " + methodOveriding.additionOverloading(5, 5, 5));// reference variable for MethodOverriding class and prints result. 
		
		System.out.println("\n");// just for little space.
		
		MethodOverloading methodOverloading=new MethodOverloading();// object for MethodOverloading class 
		System.out.println("interest rate of parent class : " + methodOverloading.interest(10));// reference variable for methodOverloading class and prints result
		
		
		SBIBank sbibank=new SBIBank();// object for SBIBANK class 
		System.out.println("interest rate of SBIBANK: " + sbibank.interest(10));
		sbibank.interest(10);// reference variable for SBIBank class and prints result
		
		ICICIBank icicibank= new ICICIBank();// object for ICICIBank class 
		System.out.println("interest rate of ICICIBANK: " + icicibank.interest(10));// reference ICICIBank class and prints result
		
	
		HDFCBank hdfcbank=new HDFCBank();// object for HDFCBank class 
		System.out.println("interest rate of HDFCBANK: " + hdfcbank.interest(10));// reference variable for HDFCBank class and prints result
		
	}

}

class MethodOverriding{ // Example class for methodOverriding
	
	
	public int additionOverloading(int num1, int num2) { // this method returns addition of two number 
		
		return num1+num2;
	}
	
	public int additionOverloading(int num1, int num2, int num3) { // method Overridden by three parameters.
		
		return num1+num2+num3;
	}
	
}

class MethodOverloading{ // Example class for Method overloading
	
	public int interest(int interest1) { // interest method returns 2 % of any value which is more that 0 
		
		if (interest1 < 0) {
			System.out.println("Please enter valid number");
		}
		return 2 % interest1;
	}	
	
}

class SBIBank extends MethodOverloading{ // SBI class extended Method overloading class to over load the interest method
	
	public int interest(int interestSBI) { // interest method overloaded by parent class
		
		if (interestSBI < 0) {
			System.out.println("Please enter valid number for SBI Interest");
		}
		return 3 % interestSBI; //  3 % interest
		
	}
	
}

class ICICIBank extends MethodOverloading{// ICICI class extended Method overloading class to over load the interest method
	
	
	
	public int interest(int interestICICI) {// interest method overloaded by parent class
		
		if (interestICICI < 0) {
			System.out.println("Please enter valid number for ICICI Interest");
		}
		return 1 % interestICICI; // 1 % interest
	}
	
}
class HDFCBank extends MethodOverloading{// HDFC class extended Method overloading class to over load the interest method
	
	public int interest(int interestHDFC) {// interest method overloaded by parent class
		
		if (interestHDFC < 0) {
			System.out.println("Please enter valid number for ICICI Interest");
		}
		return 4 % interestHDFC; // 4 % interest
	}
	
}



