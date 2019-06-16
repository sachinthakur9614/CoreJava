import java.util.Scanner; 
import java.util.*;
 class Hackathon{
		private int userId;
		private	String firstName;
		private	String lastName;
		private	String userName;
		private	byte password;
		private long mobileNo;
		private String email;
	public void Hackathon(int userId,String firstName,String lastName, byte password,long mobileNo,String email)
	{
			userId = this.userId;
			firstName = this.firstName;
			lastName = this.lastName;
			password = this.password;
			mobileNo = this.mobileNo;
			email = this.email;

	}
	public void readUserInfo()
	{
		System.out.println("BASIC INFORMATION");
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter User Id");
		userId = sc.nextInt();
		System.out.print("Enter First Name:");
		firstName = sc.nextLine();
		System.out.print("Enter Last Name:");
		lastName = sc.nextLine();
		System.out.print("Enter Password:");
		while(sc.hasNext())
		{
			password=sc.nextByte(16);
		}
	}
	public void  DisplayUSerInfo()
	{
		System.out.println("USER BASIC INFORMATION");
		System.out.println("User Id:"+userId);
		System.out.print("First Name:"+firstName);
		System.out.print("Last Name:"+lastName);
		System.out.print("Password:"+password);
	}
}

public class Organiser extends Hackathon{
	String eventName;
	String organisedBy;
	String organiserEmail;
	String conatctPersonName;
	short numberOfEvents;
	float eventCharge;
	Date startDate;
	Date endDate;
	int teamMember;
	long  contactMobileName;
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
		 	Scanner sc = new Scanner(System.in); 
		 	System.out.print("Enter Event Name:");
		 	eventName = sc.nextLine();
			System.out.print("Enter Organised By:");
			organisedBy = sc.nextLine();
			System.out.print("Enter Organised Email:");
			organiserEmail = sc.nextLine();		 
			System.out.print("Enter Contact Person:");
			conatctPersonName = sc.nextLine();
			System.out.print("Enter Number Of Events :");
			numberOfEvents = sc.nextShort();
			System.out.print("Enter Event Charge:");
			eventCharge = sc.nextFloat();
			System.out.print("Enter Number of Team Member:");
			teamMember = sc.nextInt();
			System.out.print("Enter Start Date:");
			startDate = new Date();
			System.out.print("Enter End Date:");
			endDate = new Date();
			System.out.print("Conact Mobile Number:");
			contactMobileName = sc.nextLong();

	 }
 public void displayEventDetails()
		 {
			System.out.print("Event Name:"+eventName);
			System.out.print("Organised By:"+organisedBy);
			System.out.print("Organised Email:" + organiserEmail);
			System.out.print("Contact Person:"+ conatctPersonName);
			System.out.print("Number Of Events:"+numberOfEvents);
			System.out.print("Event Charge:"+eventCharge);
			System.out.print("Number of Team Members:"+teamMember);
			System.out.print("Enter Start Date:"+startDate);
			System.out.print("Enter End Date:"+endDate);
		 }
public static void main(String args[])
		{
			System.out.print("***Program Name: Write a program to demonstrate various data types and operators.***");
			System.out.print("***********************Author: Sachin Thakur***********************");
			System.out.print("***********************Reg. No: 1847250***********************");
			Hackathon user = new Hackathon();
			System.out.print("USER INFORMATION!");
			user.readUserInfo();
			System.out.print("USER INFORMATION!");
			user.DisplayUSerInfo();
			Organiser org = new Organiser();
			org.eventDetails();
			org.displayEventDetails();
		}
}