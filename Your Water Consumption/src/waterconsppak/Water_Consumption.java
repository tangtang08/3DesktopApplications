//Tangy F.
//How much water should you consume based on your body weight?

package waterconsppak;
//Step 1. Import the Scanner Library 
import java.util.Scanner;

public class Water_Consumption {

public static void main(String[] args) {
	
	System.out.println("Hi! Check out the water consumption app");
	System.out.println("Enter your weight in Pounds");
	
	//Step 2. declare the scanner object 
	Scanner keyboard=new Scanner(System.in);
	
	//Step 3. Get the users input
	int lbs=keyboard.nextInt();
	
// The start if conditions
	if(lbs==100 || lbs<=119){
	System.out.println(" The suggested amout of water is 40 oz.");
	}
	
	else if (lbs==120 || lbs<=139){
		System.out.println(" The suggested amout of water is 48 oz.");
		}
		
	else if (lbs==140 || lbs<=159){
		System.out.println(" The suggested amout of water is 54 oz.");
		}
		
	else if (lbs==160 || lbs<=179){
		System.out.println(" The suggested amout of water is 64 oz.");
		}
		
	else if (lbs==180 || lbs<=199){
		System.out.println(" The suggested amout of water is 72 oz.");
		}
		
	else if (lbs==200 || lbs<=219){
		System.out.println(" The suggested amout of water is 80 oz.");
		}
		
	else if (lbs==220 || lbs<=239){
		System.out.println(" The suggested amout of water is 88 oz.");
		}
		
	else if (lbs==240 || lbs<=259){
		System.out.println(" The suggested amout of water is 96 oz.");
		}
	else if (lbs==260 || lbs<=279){
		System.out.println(" The suggested amout of water is 104 oz.");
		}
	
	else if (lbs==280 || lbs<=299){
		System.out.println(" The suggested amout of water is 112 oz.");
		}

	else if (lbs==300 || lbs<=319){
		System.out.println(" The suggested amout of water is 120 oz.");
		}
	
	else if (lbs==320 ){
		System.out.println(" The suggested amout of water is 128 oz.");
		}
	
	else {
		System.out.println(" Please enter a weight between 100-320. Thank you");
		}
}

	
	
}
