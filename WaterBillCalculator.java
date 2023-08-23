

import java.util.Scanner;

public class WaterBillCalculator {

	public static void main(String[] args) {
		int charge =0;
		int meterCharge=75;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of units consumed:");
		int unit = sc.nextInt();
		
		
		
		if(unit<=100)
		{
			charge = unit*5;
		}
		else if(unit<=250&&unit>100)
		{
			charge=unit*10;
			
		}
		else if(unit>250) 
		{
			charge = unit*20;
		}
		
		System.out.println("The total water bill is:  "+(charge+meterCharge));
	}

}