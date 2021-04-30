package seconwk;

import java.util.Scanner;

public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p13 p13 = new p13();
		Scanner scan = new Scanner(System.in);
		//System.out.println("Print the Menu(#Unit): ");
		//p13.showUnits();
		
		System.out.println("Convert from:");
	    String fromUnit = scan.nextLine();
	    System.out.println("Convert to: ");
	    String toUnit = scan.nextLine();
	    
	    UnitConverter from = new UnitConverter(fromUnit);
	    UnitConverter to = new UnitConverter(toUnit);

	    System.out.println("Value:");
	    double val = scan.nextDouble();

	    double meters = from.toMeters(val);
	    double converted = to.fromMeters(meters);

	    System.out.println(val + " " + fromUnit + " = " + converted + " " + toUnit);
	  }
	/*public void showUnits() {
		System.out.println("#Units");
		System.out.println("1. cm");
		System.out.println("2. m");
		System.out.println("3. mm");
		System.out.println("4. km");
		System.out.println("5. mile");
		System.out.print("--> ");
	}
	*/
}
	class UnitConverter {
		static double METERS = 1;
		static double MILES = 1609.35;
		static double MILLIMETERS = 0.001;
		static double CENTIMETERS = 0.01;
		static double KILOMETERS = 1000;
		
		private double val ,meters ,converted;
		String afromUnit;
	 
	 public UnitConverter(String fromUnit) {
		 afromUnit = fromUnit;
	 }
		
	 public double toMeters(double val) {
		 if(afromUnit.equals("mi")) {
			 meters = (val*MILES);
		 } else if(afromUnit.equals("mm")) {
			 meters = (val*MILLIMETERS);
		 } else if(afromUnit.equals("cm")) {
			 meters = (val*CENTIMETERS);
		 } else if(afromUnit.equals("m")) {
			 meters = (val*METERS);
		 } else {
			 meters = (val*KILOMETERS);
		 }
		 return meters;	
	 }
	 
	 public double fromMeters(double meters) {
		 if (afromUnit.equals("mi")) {
			 converted = Math.round(meters*0.0006213688756330196);
		 } else if(afromUnit.equals("mm")) {
			 converted = Math.round(meters*1000);
		 } else if(afromUnit.equals("cm")) {
			 converted = Math.round(meters*100);
		 } else if(afromUnit.equals("m")) {
			 converted = Math.round(meters*1);
		 } else {
			 converted = Math.round(meters*0.001);
		 }
	  
		 return converted;
	 }	
}		
	    
	    
/*  
		while(true) {
			p7.showUnits();
			int n = scan.nextInt();
			p7.getMenu(n);
			System.out.println(" ");
		}
	}
	
	public void getMenu(int a) {
		System.out.println("get menu started");
		Scanner scan = new Scanner(System.in);
		if (a == 1) {
			System.out.println("cm");
			
		}
	}
	public void menu() {
		System.out.println("#Menu");
		System.out.println("Input a Number: ");
	}
	
	
}
*/