/**Student Name: First Last
*Date Completed:03/30/2022

*Project No. and Page No. in the book: Chapter 4 PP 1

*Extra Credit: Yes 

*Project Description:
*This project is a mock meeting request system, by using the scanner class to retrieve users input , 
*while also using if else statements and switch statements to display a designated output to the user depending on the user's input.

**/

package request;

import java.util.Scanner;

public class MeetingRequestSystem {

	public static void main(String[] args) {
	
	//---------
	// Declaring necessary variables and calling for the scanner class
	//---------
	int MAX_OCCUPANCY = 50 , guestAttending;
	String guestName ;
	Scanner scan = new Scanner(System.in);
		
	System.out.println("Welcome to the Blue Bird company meeting system.");
	
	System.out.println(); // blank space for easier readability
	
	System.out.println("What is your full name?");
	guestName = scan.nextLine(); 
	
	System.out.println();
	
	System.out.println("Hello " + guestName + ",\nHow many people will attend the meeting?");
	guestAttending = scan.nextInt();
	
	//-----
	// Setting parameters using the if else statements to display a message to the user depending on users input
	//-----
	
	if (guestAttending == 50)
		System.out.println(guestName + ", your request has been granted.");
	
	else if (guestAttending > 50)
		System.out.println(guestName + ", Your request has been denied.\nYou have exceeded the room capacity by " 
							+ (int)(guestAttending - MAX_OCCUPANCY ) + " people.");
		
	else 
		System.out.println(guestName + ", your request has been granted.\nYou can still invite " + (MAX_OCCUPANCY - guestAttending) + 
							" people.");
	
	
	
	
	//----
	//using the switch statement to displayed a particular message if it fits the case
	// case 50 & default will print along with the if else statements above
	switch (guestAttending)
	{
	case 10:
		System.out.println("There are only 10 people attending the meeting");
		break;
	case 20:
		System.out.println("There are only 20 people attending the meeting");
		break;
	case 30:
		System.out.println("There are only 30 people attending the meeting");
		break;
	case 40:
		System.out.println("There are only 40 people attending the meeting");
		break;
	case 50:
		System.out.println("There are 50 people attending the meeting and that is exactly enough to fill the conference room.");
		break;
	default :
		System.out.println("The number of people attending is either greater than 50 or cannot be measured in tens.");
	}
	
	System.out.println();
	System.out.println("Thank you " + guestName + " for using the Blue Bird meeting system.\nHave a nice day!");
	
	}

}
