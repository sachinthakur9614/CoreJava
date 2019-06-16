/****Program Name: Write a program to demonstrate various data types and operators.*** */
/************************Author: sachinthakur9614*********************** */


import java.util.NoSuchElementException;
import java.io.IOException;
import java.io.*; 
import java.util.Scanner; 
import java.util.*;
 class Hackathon {
		private short userId;
		String firstName;
		private	String lastName;
		private	String userName;
		private Long mobileNo;
		private String email;
	public void Hackathon(short userId,String firstName,String lastName,Long mobileNo,String email)
	{
			userId = this.userId;
			firstName = this.firstName;
			lastName = this.lastName;	
			mobileNo = this.mobileNo;
			email = this.email;

	}
	public void readUserInfo()
	{ 
	
		System.out.println("\n\tREAD USER BASIC INFORMATION!");
		Scanner sc = new Scanner(System.in); 
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
		sc.close();
	

	}
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

public class Organiser extends Hackathon 
{
	int eventName;
	String organisedBy;
	String organiserEmail;
	String conatctPersonName;
	short numberOfEvents;
	private float eventCharge;
	private Date startDate;
	private Date endDate;
	private int teamMember;
	private Long  contactMobileName;
	public void Organiser(int eventName, String organisedBy, String organiserEmail, String conatctPersonName, short numberOfEvents,
							float eventCharge, int teamMember, Long contactMobileName) 
		{
			eventName = this.eventName;
			organisedBy = this.organisedBy;
			organiserEmail = this.organiserEmail;
			conatctPersonName = this.conatctPersonName;
			numberOfEvents= this.numberOfEvents;
			eventCharge = this.eventCharge;
			teamMember = this.teamMember;
			contactMobileName = this.contactMobileName;
		}
	public void eventDetails()
		 {
		 	
		 	System.out.print("\n\tREADING ORGANISER BASIC INFORMATION");
		 	Scanner scan = new Scanner(System.in); 
		 	cls();
		 	System.out.println("\nEnter Event Name:");
		 	eventName = scan.nextInt();
			System.out.print("\nEnter Organised By:");
			organisedBy = scan.next();
			System.out.print("\nEnter Organised Email:");
			organiserEmail = scan.next();		 
			System.out.print("\nEnter Contact Person:");
			conatctPersonName = scan.next();
			System.out.print("\nEnter Number Of Events :");
			numberOfEvents = scan.nextShort();
			System.out.print("\nEnter Event Charge:");
			eventCharge = scan.nextFloat();
			System.out.print("\nEnter Number of Team Member:");
			teamMember = scan.nextInt();
			System.out.print("\nEnter Start Date:");
			startDate = new Date();
			System.out.print("\nEnter End Date:");
			endDate = new Date();
			System.out.print("\nConact Mobile Number:");
			contactMobileName =scan.nextLong();
			scan.close();

	 }
 public void displayEventDetails()
		 {	System.out.println("\n \tDISPLAY ORGANISER BASIC INFORMATION");
			System.out.println("\nEvent Name:"+eventName);
			System.out.println("\nOrganised By:"+organisedBy);
			System.out.println("\nOrganised Email:" + organiserEmail);
			System.out.println("\nContact Person:"+ conatctPersonName);
			System.out.println("\nNumber Of Events:"+numberOfEvents);
			System.out.println("\nEvent Charge:"+eventCharge);
			System.out.println("\nNumber of Team Members:"+teamMember);
			System.out.println("\n Start Date:"+startDate);
			System.out.println("\nEnd Date:"+endDate);
			System.out.println("\nContact Mobile No.:"+endDate);
				
		 }
public static void main(String args[]) throws Exception
		{
			System.out.println("***Program Name: Write a program to demonstrate various data types and operators.***\n");
			System.out.println("***********************Author: Sachin Thakur***********************\n");
			System.out.println("***********************Reg. No: 1847250***********************\n");
			
			
				
			 


			 int choice;
			int ch;
			 Scanner scan = new Scanner(System.in); 
			 System.out.println("Enter Your Choice!");
			 choice = scan.nextInt();
try {


			 do {

			 switch(choice){


			 	case 1:
			 	System.out.println("\n\tUSER INFORMATION!\n");
			 	Hackathon usern = new Hackathon();
			 	usern.readUserInfo();
				usern.displayUSerInfo();



			 	break;
			 	case 2:

				 System.out.println("\n\tORGANISER INFORMATION!");
			 	Organiser org = new  Organiser();
			 	org.eventDetails();
				org.displayEventDetails();

			 	break;
			 	
			 	default:
			 	System.out.print("End Off!");
			 }

			  System.out.print("You Want To Continue(Y==1/N==2)!");
			   ch = scan.nextInt();

		
 
			} while(ch==1);
}
catch(Exception e)
System.out.print(e);

			

  		 		 
			
}

// This function definition clear the screen of cmd 
public static void cls()
{
	try 
	{
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

	} catch(Exception e)
	{
		
	} 
}
}