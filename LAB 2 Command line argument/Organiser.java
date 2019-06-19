/****Program Name: Write a program to implement command line arguments ****/
/************************Author: sachinthakur9614************************/
import java.util.NoSuchElementException;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.*; 
import java.util.Scanner; 
import java.util.*;
// Main class of Core Java project
 class Hackathon {
		private int userId;
		String firstName;
		private	String lastName;
		private	String userName;
		private Long mobileNo;
		String mobile;
		private String email;
		// Basic Constructor of Hackathon class
	public void Hackathon(int userId,String firstName,String lastName,Long mobileNo,String email)
	{
			userId = this.userId;
			firstName = this.firstName;
			lastName = this.lastName;	
			mobileNo = this.mobileNo;
			email = this.email;
	}
// this fucntion pass the Hackathon user data to organiser event
	public void getNameGetId(int id, String first,String last)
	{
		userId = id;
		firstName = first;
		lastName = last;	
		System.out.print("\t\t\t\t Basic User information!");
		System.out.println("userId:"+userId);
		System.out.println("firstName:"+firstName);
		System.out.print("lastName:"+lastName);		
	}


	// Definition nput function for reading User Info
	public void readUserInfo(int id,String first,String last)
	{ 	
		System.out.println("\n\tREAD USER BASIC INFORMATION!");
		Scanner sc = new Scanner(System.in); 
		int count=0;
	try {
		System.out.println("\nEnter User Id");		
		userId = id;
		System.out.print("\n First Name Is Taken!");
		firstName = first;
		System.out.println("\n Last Name is Taken");
		lastName = last;
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
		getNameGetId(userId,firstName,lastName);
		sc.close();
	} 
	catch(InputMismatchException e)
	{
		System.out.print("Invalid input");
		readUserInfo(userId,firstName,lastName);
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
}
// Main class of Core Project
public class Organiser extends Hackathon 
{
	String eventName;
	String organisedBy;
	String organiserEmail;
	String conatctPersonName;
	Integer numberOfEvents;
	 Float eventCharge;
	private Date startDate;
	private Date endDate;
	private int teamMember;
 	Long  contactMobileNo;
	Integer expectedTeams;
	Float totalFee;
	String mobile;
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
		//Definition of read method to read the data from user 
	public void eventDetails()
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
				startDate = new Date();
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
				scan.close();
			}
		catch(InputMismatchException e)
			{
				System.out.print("Invalid input");
				eventDetails();
			}
		catch(NoSuchElementException e)
			{
				System.out.print("Invalid input");
				
			}
	 }
	 // Definition Displaying the Event information

public void displayEventDetails()
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

public void totalFees(){
				totalFee =expectedTeams * eventCharge;			
				System.out.print("\nTotal Amount Collected  \t\t\t");
				System.out.print("\t\t "+totalFee.floatValue());
				System.out.println("");
				printLine();
} 
public static void main(String args[]) 
		{
			System.out.println("***Program Name: Write a program to demonstrate various data types and operators.***\n");
			System.out.println("***********************Author: Sachin Thakur***********************\n");
			System.out.println("***********************Reg. No: 1847250***********************\n");
			int choice;
			byte ch;
			Scanner scan = new Scanner(System.in); 
			Hackathon usern = new Hackathon();
			Organiser org = new  Organiser();		
		if(args.length<0 || args.length>3)
		{	
			cls();
			printLine();
			System.out.print("\n");
			System.out.println("Pass only  three command line arguments");
			System.exit(0);
		}		
		else {	
		  	int id= Integer.parseInt(args[2]);
			String firstName = args[0];
			String lastName=  args[1];
			while(true)
			{
				System.out.println("\n1. User information");
				System.out.println("2. Event information");
				System.out.println("3. Exit");
			 	System.out.println("Enter Your Choice!");
			 	choice = scan.nextInt();
				switch(choice){
					case 1:
					 	System.out.println("\n\t\t \t USER INFORMATION!\n");
					 	printLine();		 	
						usern.readUserInfo(id,firstName,lastName);
						printLine();
					 	usern.displayUSerInfo();
					 	printLine();
					 	break;			 	
			 		case 2:		
			 		cls();	 
						System.out.println("\n\t \t \tORGANISER INFORMATION!");
						printLine();	
						org.getNameGetId(id, firstName,lastName);//getting user info from base class
					 	org.eventDetails();
					 	printLine();
						org.displayEventDetails();
						printLine();					
						System.out.println("\n\t\t \t Total Fee Collection!\n");
						printLine();
						org.totalFees();
						break;
					case 3: System.exit(0);
			 		default:
			 			System.out.print("End Off!");
			 } 
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

