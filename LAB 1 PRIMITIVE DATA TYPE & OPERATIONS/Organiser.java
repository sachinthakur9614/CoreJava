/****Program Name: Write a program to demonstrate various data types and operators.*** */
/************************Author: sachinthakur9614*********************** */


import java.util.NoSuchElementException;
import java.io.IOException; 
import java.util.Scanner; 
import java.util.*;
 class Hackathon{
		private short userId;
		String firstName;
		private	String lastName;
		private	String userName;
		private int mobileNo;
		private String email;
	public void Hackathon(short userId,String firstName,String lastName,int mobileNo,String email)
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
		mobileNo = sc.nextInt();
		System.out.println("\nEnter Email:");
		email = sc.nextLine();
				sc.close();
	

	}
	public void  DisplayUSerInfo()
	{
		System.out.println("\n \tDISPLAY USER BASIC INFORMATION");
		System.out.println("\nUser Id:"+userId);
		System.out.println("\nFirst Name:"+firstName);
		System.out.println("\nLast Name:"+lastName);
		System.out.println("\nMobile No.:"+lastName);
		System.out.println("\nEmail:"+lastName);
		// System.out.print("Password:"+password);
	}
}

public class Organiser extends Hackathon{
	private String eventName;
	private  String organisedBy;
	private String organiserEmail;
	private String conatctPersonName;
	private short numberOfEvents;
	private float eventCharge;
	private Date startDate;
	private Date endDate;
	private int teamMember;
	private long  contactMobileName;
		public void Organiser(String eventName,String organisedBy,String organiserEmail,String conatctPersonName,short numberOfEvents,
							float eventCharge,int teamMember,long contactMobileName) 
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
		 	System.out.println("\n \tREADING ORGANISER BASIC INFORMATION");
		 	Scanner sc = new Scanner(System.in); 
		 	System.out.print("\nEnter Event Name:");
		 	eventName = sc.nextLine();
			System.out.print("\nEnter Organised By:");
			organisedBy = sc.nextLine();
			System.out.print("\nEnter Organised Email:");
			organiserEmail = sc.nextLine();		 
			System.out.print("\nEnter Contact Person:");
			conatctPersonName = sc.nextLine();
			System.out.print("\nEnter Number Of Events :");
			numberOfEvents = sc.nextShort();
			System.out.print("\nEnter Event Charge:");
			eventCharge = sc.nextFloat();
			System.out.print("\nEnter Number of Team Member:");
			teamMember = sc.nextInt();
			System.out.print("\nEnter Start Date:");
			startDate = new Date();
			System.out.print("\nEnter End Date:");
			endDate = new Date();
			System.out.print("\nConact Mobile Number:");
			contactMobileName = sc.nextLong();

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
			System.out.println("\nEnter Start Date:"+startDate);
			System.out.println("\nEnter End Date:"+endDate);
		 }
public static void main(String args[])
		{
			System.out.println("***Program Name: Write a program to demonstrate various data types and operators.***\n");
			System.out.println("***********************Author: Sachin Thakur***********************\n");
			System.out.println("***********************Reg. No: 1847250***********************\n");
			Hackathon user = new Hackathon();
			System.out.println("\n\tUSER INFORMATION!\n");
			try { 
			user.readUserInfo();
		
			}

		catch (Exception e)
		 {
	 			user.readUserInfo();
        
  		  } 
    	
			
			user.DisplayUSerInfo();
			Organiser org = new Organiser();
			System.out.println("ORGANISER INFORMATION!\n");
			org.eventDetails();
			org.displayEventDetails();
		}
}