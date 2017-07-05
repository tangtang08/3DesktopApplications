//Tangy F.
//Which type of programming fits your personality

package frontbackfull;
//import scanner library 
import java.util.Scanner;

public class frontbackfullProgrammer {
	//declare the ARRAY length for front-end, back-end, full stack option
	static int userchoice[]={1,2};
	
	public static void main(String[] args) {
		// Welcome the user
		System.out.println("Would you like to find out, the type of Programmer you would like to be?");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Press 1) To find out, the type of Programming you will enjoy.");
		System.out.println("Press 2) To Exit");
		
		//add the scanner object
		Scanner keyboard=new Scanner(System.in);
		// get users input
		int menu=keyboard.nextInt();
		// show the users input
		//System.out.println(menu);
		
		
		//Add a switch statement. type 1 to continue or type 2 to end your session.
		switch (menu){
						//add space
				case 1:	System.out.println("");
					
						System.out.println("Great! Let's find out: ");
						System.out.println("");
						System.out.println("Press 1: If you enjoy the ARTISTIC side of things & making this aesthetically pleasing."); 
						System.out.println("");
						System.out.println("Press 2: If you enjoy making the MECHANICS of things  and the aesthetics wouldn't matter as much.");
						System.out.println("");
						System.out.println("Press 3: If you like the to make the MECHANICS of things; and enjoy creating the ARTISTIC look of things as well.");
						
						// receive the users input 
						//Create a scanner object
						Scanner aKeyboard=new Scanner(System.in);
						int frontBackfull=keyboard.nextInt();
						
						//show the users choice
						System.out.println(frontBackfull);
						
						if(frontBackfull==1){
							System.out.println("You will enjoy being a FRONT-END Developer");
							System.out.println("");
							System.out.println("According to PAYSCALE the National average");
							System.out.println("Entry level Front-end developer Salary is $50,000.-$63,000. ");
							
						}
						else if(frontBackfull==2){
							System.out.println(" You will enjoy being a JAVA BACK-END Programmer");
							System.out.println("");
							System.out.println("According to PAYSCALE the National average");
							System.out.println("Entry level Back-end Programmer Salary is $56,000-$65,000. ");
						}
						
						else{
							System.out.println("You will enjoy being a JAVA FULL STACK Programmer.");
							System.out.println("       **** A Big Shout Out to TK2!****           ");

							System.out.println("");
							System.out.println("According to PAYSCALE the National average");
							System.out.println("Entry level software developer salary is $56,000.-$73,000. ");
	
						}
						
						// add the users input in an array 
						int [] userchoice= {menu,frontBackfull};
						
						for (int y=0; y<userchoice.length; y++){

							System.out.println( userchoice[y]);
							System.out.println("The number that you pressed to get this answer ");
						}
						break;
				
									
				case 2: System.out.println("Good-bye"); 	
						break;
						
				default: System.out.println("Invaild entry");
		}	
		
		
	}

}
