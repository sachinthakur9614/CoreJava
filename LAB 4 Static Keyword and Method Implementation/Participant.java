/****Program Name: Write a program to demonstrate various data types and operators.*** */
/************************Author: sachinthakur9614*********************** */
import java.util.NoSuchElementException;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.*; 
import java.util.Scanner; 
import java.util.*;
// Main class of Core Java project
 class Hackathon {
		private short userId;
		String firstName;
		private	String lastName;
		private	String userName;
		private Long mobileNo;
		String mobile;
		private String email;
		boolean check;
		// Basic Constructor of Hackathon class
	
public void Hackathon()
{
		userId=0;
		firstName=lastName=email="";
}


public void Hackathon(short userid,String firstName,String lastName)
{
		userId = this.userId;
		firstName=this.firstName;
		lastName= this.lastName;
}

public void Hackathon(short userId,String firstName,String lastName,Long mobileNo,String email)
{
		userId = this.userId;
		firstName = this.firstName;
		lastName = this.lastName;	
		mobileNo = this.mobileNo;
		email = this.email;
}
public void readUserInfo(short id)
{
	System.out.println("\n\t MODIFY USER INFORMATION");
	Scanner sc = new Scanner(System.in); 

	System.out.println("Do you want to modify details");
	check = sc.nextBoolean();
	if (check== true)
	{

		System.out.println("\nUser Id:"+id);
		System.out.print("\nEnter First Name:");
		firstName = sc.next();		
		System.out.println("\nEnter Last Name:");
		lastName = sc.next();

		displayUSerInfo(id);	


	}
	


		


}


public void displayUSerInfo(short id)
{
		System.out.println("\n\t MODIFIED USER INFORMATION");
		System.out.println("\nUser Id:"+id);
		System.out.println("\nFirst Name:"+firstName);
		System.out.println("\nLast Name:"+lastName);

}
	// Definition input function for reading User Info
	public void readUserInfo()
	{ 	
		System.out.println("\n\tREAD USER BASIC INFORMATION!");
		Scanner sc = new Scanner(System.in); 
		int count=0;
	try {
		System.out.println("\nEnter User Id");		
		userId = sc.nextShort();
		System.out.print("\nEnter First Name:");
		firstName = sc.next();		
		System.out.println("\nEnter Last Name:");
		lastName = sc.next();
		System.out.println("\nEnter Mobile Number:");
		mobileNo = sc.nextLong();
		System.out.println("\nEnter Email:");
		email = sc.next();
		mobile = mobileNo.toString();
		if(mobile.length()<=0||mobile.length()>10)
		{
			System.out.print("Invalid Number");
			System.out.println("\nEnter Mobile Number:");
		mobileNo = sc.nextLong();
		}

		readUserInfo(userId);
		
	} 
	catch(InputMismatchException e)
	{
		System.out.print("Invalid input");
		readUserInfo();
	}
	}
	// Difinition input function for display User Info
	public void  displayUSerInfo()
	{
		System.out.println("\n \tDISPLAY USER BASIC INFORMATION");
		System.out.println("\nUser Id:"+userId);
		System.out.println("\nFirst Name:"+firstName);
		System.out.println("\nLast Name:"+lastName);
		System.out.println("\nMobile No.:"+mobileNo);
		System.out.println("\nEmail:"+email);
		// System.out.print("Password:"+password);
	}


 static class Organiser 
{
	 static String eventName;
	static String organisedBy;
	static String organiserEmail;
	static String conatctPersonName;
	static Integer numberOfEvents;
static	Float eventCharge;
static	private Date startDate;
static	private Date endDate;
static	private int teamMember;
 static	Long  contactMobileNo;
static Integer expectedTeams;
static Float totalFee;
	static String mobile;

	static int  expectedTeam; 
 	static float eventCharges;

	// Calling constructor of Main class
	public void Organiser(String eventName, String organisedBy, String organiserEmail, String conatctPersonName, Integer  numberOfEvents,
							float eventCharge, int teamMember, Long contactMobileNo) 
		{
			eventName = this.eventName;
			organisedBy = this.organisedBy;
			organiserEmail = this.organiserEmail;
			conatctPersonName = this.conatctPersonName;
			numberOfEvents= this.numberOfEvents;
			eventCharge = this.eventCharge;
			teamMember = this.teamMember;
			contactMobileNo = this.contactMobileNo;
		}

		public void Organiser(){

			eventName=organisedBy=organiserEmail=conatctPersonName="";
	
		}

	public void Organiser(String eventName,String conatctPersonName, float eventCharge)
	{
		eventName= this.eventName;
		conatctPersonName = this.conatctPersonName;
		eventCharge= this.eventCharge;

	}	


public  static void eventDetails(boolean che)
{

 	Scanner scan = new Scanner(System.in); 

 	if (che==true)
 	{
 	System.out.println("\nEnter Event Name:");
	eventName = scan.next();
	System.out.print("\nEnter Contact Person:");
 	conatctPersonName = scan.next();
 	System.out.print("\nEnter Event Charge:");
	eventCharge = scan.nextFloat();
}
	


}


public static void displayEventDetails( boolean che)
		 {	

if (che==true)
 	{
		 	System.out.println("Event Name:"+eventName);
 			System.out.println("\nContact Person:"+ conatctPersonName);
 			System.out.println("\nEvent Charge:"+eventCharge.floatValue());

}
}
		//Definition of read method to read the data from user 
	public static void eventDetails()
		 {
		 	
		 	System.out.print("\n\tREADING ORGANISER BASIC INFORMATION");
		 	Scanner scan = new Scanner(System.in); 
		 	// cls();
		 	try
		 	{
			 	System.out.println("\nEnter Event Name:");
		
			 	eventName = scan.next();
				System.out.print("\nEnter Organised By:");
				organisedBy = scan.next();
				System.out.print("\nEnter Organised Email:");
				organiserEmail = scan.next();		 
				System.out.print("\nEnter Contact Person:");
				conatctPersonName = scan.next();
				System.out.print("\nEnter Number Of Events :");
				numberOfEvents = scan.nextInt();
				System.out.print("\nEnter Event Charge:");
				eventCharge = scan.nextFloat();
				System.out.print("\nEnter Number of Team Member:");
				teamMember = scan.nextInt();
				System.out.print("\nEnter Expected Teams:");
				expectedTeams = scan.nextInt();
				// System.out.print("\nEnter Start Date:");
				startDate = new Date();
				// System.out.print("\nEnter End Date:");
				endDate = new Date();
				System.out.print("\nConact Mobile Number:");
				contactMobileNo =scan.nextLong();
				mobile = contactMobileNo.toString();
				if(mobile.length()<=0||mobile.length()>10)
				{
					System.out.print("Invalid Number");
					System.out.println("\nEnter Mobile Number:");
				contactMobileNo = scan.nextLong();
				}
				
			}
		catch(InputMismatchException e)
			{
				System.out.print("Invalid input");
				eventDetails();
			}
		catch(NoSuchElementException e)
			{
				System.out.print("Invalid input");
				//eventDetails();
			}
	 }
	 // Definition Displaying the Event information

  static {
    expectedTeam = expectedTeams;
 eventCharges =eventCharge;

  }


public static void totalFees() {



	

		totalFee =  expectedTeam * eventCharges;			
				System.out.print("\nTotal Amount Collected  \t\t\t");
				System.out.print("\t\t "+totalFee);
			
			



}



public static void displayEventDetails()
		 {	
			 	System.out.println("\n \tDISPLAY ORGANISER BASIC INFORMATION");
				System.out.println("\nEvent Name:"+eventName);
				System.out.println("\nOrganised By:"+organisedBy);
				System.out.println("\nOrganised Email:" + organiserEmail);
				System.out.println("\nContact Person:"+ conatctPersonName);
				System.out.println("\nNumber Of Events:"+numberOfEvents.intValue());
				System.out.println("\nEvent Charge:"+eventCharge.floatValue());
				System.out.println("\nNumber of Team Members:"+teamMember);
				System.out.println("\n Start Date:"+startDate);
				System.out.println("\nEnd Date:"+endDate);
				System.out.println("\nContact Mobile No.:"+contactMobileNo.longValue());
				System.out.println("\nExpected Teams:"+expectedTeams.intValue());


		 }
				



}


}
// Main class of Core Project

// Static class Implementations

public class Participant extends Hackathon {


String teamName;
String collegeName;
Long mobileNo;
String mobile;





public void Participant(String teamName,String collegeName, Long mobileNo)
{

	teamName = this.teamName;
	collegeName = this.collegeName;
	mobileNo = this.mobileNo;

}


public void readParticiapntInfo()
{
			System.out.print("\n\tREADING PARTICIPANT BASIC INFORMATION");
		 	Scanner scan = new Scanner(System.in); 
		 	// cls();
		 	try
		 	{
			 	System.out.println("\nEnter Team Name:");
		
			 	teamName = scan.next();
				System.out.print("\nEnter College Name:");
				collegeName = scan.next();
				System.out.print("\nEnter Mobile No.:");
				mobileNo = scan.nextLong();	 

				mobile = mobileNo.toString();
				if(mobile.length()<=0||mobile.length()>10)
				{
					System.out.print("Invalid Number");
					System.out.println("\nEnter Mobile Number:");
				mobileNo = scan.nextLong();
				}

			}
			catch(InputMismatchException e)
			{
				System.out.print("Invalid input");
				readParticiapntInfo();
			}
			catch(NoSuchElementException e)
			{
				System.out.print("Invalid input");
				readParticiapntInfo();
			}




}





public  void displayParticipantDetails()
		 {	
			 	System.out.println("\n \tDISPLAY PARTICIPANT BASIC INFORMATION");
				System.out.println("\nTeam Name:"+teamName);
				System.out.println("\nCollege Name:"+collegeName);
				System.out.println("\nMobile No:" + mobileNo);
				
				

		 }
				




	public static  void main(String args[])
	{

			System.out.println("***Program Name: Write a program to demonstrate various data types and operators.***\n");
			System.out.println("***********************Author: Sachin Thakur***********************\n");
			System.out.println("***********************Reg. No: 1847250***********************\n");
			int choice;
			byte ch;
			boolean che;
			short id;
			Scanner scan = new Scanner(System.in); 
			Hackathon usern = new Hackathon();
			Participant  participant = new Participant();
			 // Organiser org = new  Organiser();
			cls();
			while(true)
			{
				System.out.println("\n1. User information");
				System.out.println("2. Event information");
				System.out.println("3. Participant information");
				System.out.println("4. Exit");
			 	System.out.println("Enter Your Choice!");
			 	choice = scan.nextInt();
				switch(choice){
					case 1:
						 	System.out.println("\n\t\t \t USER INFORMATION!\n");
						 	printLine();	
							usern.readUserInfo();
							printLine();	
						 	usern.displayUSerInfo();
						 	printLine();
						 	break;			 	
			 		case 2:		
				 			cls();	 	
							System.out.println("\n\t \t \t ORGANISER INFORMATION!");
							printLine();	
						 	Organiser.eventDetails();
						 	printLine();
							Organiser.displayEventDetails();
							printLine();					
							System.out.println("\n\t\t \t Total Fee Collection!\n");
							printLine();
							System.out.println("\n\t \t \t EVENT USE FUll INFORMATION!");
							printLine();
							Organiser.totalFees();
							System.out.println("\n\n\nDO you want Change Event Name, Contact Person Name and Event Charge(true=YES/false=NO) ");
							
							
							che = scan.nextBoolean();
							if (che==true)
							{
								Organiser.eventDetails(che);
								Organiser.displayEventDetails(che);
								Organiser.totalFees();
								
							}			
							break;
					case 3: cls();	 	
							System.out.println("\n\t \t \t  PARTICIPANT INFORMATION!");
							printLine();
							participant.readParticiapntInfo();
							participant.displayParticipantDetails();
							System.out.println("\n\t\t \t Total Fee Payment!\n");
							printLine();
							Organiser.totalFees();







							break;		
					case 4: System.exit(0);
							 	
			 		default:
			 			System.out.print("End Off!");
			 } 
			






	}




}



//This function definition print the  == line where ever this is  call of this  function as printLine() 
public static void printLine()
	{
		for(int i=0;i<=70;i++)
		{
			System.out.print("=");

		}
	}
// This function definition clear the screen of cmd 
public static void cls()
	{
		try 
		{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

		} catch(Exception e)
		{
			System.out.print(e);
		} 
	}

}








