
/************************Author: sachinthakur9614*********************** */
import pack.Org;
import pack.User;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.*; 
import java.util.Scanner; 
import java.util.*;


class Hackathon implements  Org {

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
		int  expectedTeam; 
		float eventCharges;


// Sponsor Details Vairbale 

String sponsorOrgName;
String sponsorOrgEmail;
int sponsorType;
String sponosorOfficeLoc;


	 public	 void getSponsorDetail()
	 	 {

			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter Sponsor Org Name:");	
			sponsorOrgName = sc.next();
			System.out.print("\nEnter Sponsor Org Email:");
			sponsorOrgEmail = sc.next();
			System.out.print("\n Select Sponsor Type:");
			System.out.println("1. Platinum");
			System.out.println("2. Gold");
			System.out.println("3. Silver");
			sponsorType = sc.nextInt();	 

			if(sponsorType!=1||sponsorType!=2|| sponsorType!=3)
			{
					System.out.print("Invalid Selection");	
					System.out.print("\n Select Sponsor Type:");
					System.out.println("1. Platinum");
					System.out.println("2. Gold");
					System.out.println("3. Silver");
					sponsorType = sc.nextInt();	 
			}


		 }


   public void setSponsorDetail()
  {


		System.out.println("\n Sponsor Org Name:"+sponsorOrgName);
		
		System.out.print("\n Sponsor Org Email:"+sponsorOrgEmail);
		if(sponsorType==1)
		{
			System.out.println("Sponsor Type: Platinum");
		}
		else if(sponsorType==2)
		{
			System.out.println(" Sponsor Type: Gold");
		}
		else if(sponsorType==1)
		{
			System.out.println("Sponsor Type: Silver");
		}
		
}

		public void getEventDetails(){

			try
				 	{

				 		Scanner scan = new Scanner(System.in);

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
						getEventDetails();
					}
				catch(NoSuchElementException e)
					{
						System.out.print("Invalid input");
						//eventDetails();
					}
  }




		public void setEventDetails()
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

		public  void totalFees() 
		{
					totalFee =  expectedTeams * eventCharge;			
					System.out.print("\nTotal Amount Collected  \t\t\t");
					System.out.print("\t\t "+totalFee);
				
		}









}





public class Participant implements User {


String teamName;
String collegeName;
Long mobileNo;
String mobile;



// User Info 

private short userId;
		String firstName;
		private	String lastName;
		private	String userName;
		// private Long mobileNo;
	 // String mobile;
	 private String email;
		boolean check;





public void getUserDetails()
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

			// getUserDetails();

			
		} 
		catch(InputMismatchException e)
		{
			System.out.print("Invalid input");
			getUserDetails();

		}

  
}


 public void setUserDetails(){

		System.out.println("\n \tDISPLAY USER BASIC INFORMATION");
		System.out.println("\nUser Id:"+userId);
		System.out.println("\nFirst Name:"+firstName);
		System.out.println("\nLast Name:"+lastName);
		System.out.println("\nMobile No.:"+mobileNo);
		System.out.println("\nEmail:"+email);System.out.println("\n \tDISPLAY USER BASIC INFORMATION");
		System.out.println("\nUser Id:"+userId);
		System.out.println("\nFirst Name:"+firstName);
		System.out.println("\nLast Name:"+lastName);
		System.out.println("\nMobile No.:"+mobileNo);
		System.out.println("\nEmail:"+email);

 }





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
				
public  static  void main(String args[])
	{

			System.out.println("***Program Name: Write a program to demonstrate various data types and operators.***\n");
			System.out.println("***********************Author: Sachin Thakur***********************\n");
			System.out.println("***********************Reg. No: 1847250***********************\n");
			int choice;
			byte ch;
			boolean che;
			short id;
			Scanner scan = new Scanner(System.in); 
			Hackathon hack = new Hackathon();
			// Organiser org = new Organiser;
			Participant  participant = new Participant();

			 // Organiser org = new  Organiser();
			while(true)
			{
				System.out.println("\n1. User information");
				System.out.println("2. Event information");
				System.out.println("3. Participant information");
				// System.out.println("4. Sponsot information");
				System.out.println("4. Exit");
			 	System.out.println("Enter Your Choice!");
			 	choice = scan.nextInt();
				switch(choice){
					case 1:
						 	System.out.println("\n\t\t \t USER INFORMATION!\n");
						 	printLine();	
							participant.getUserDetails();
							printLine();	
						 	participant.setUserDetails();
						 	printLine();
						 	break;			 	
			 		case 2:		
				 			cls();	 	
							System.out.println("\n\t \t \t ORGANISER INFORMATION!");
							printLine();
							try {


	
	
							hack.getEventDetails();
							 	// org.eventDetails();
							 	printLine();
							 	hack.setEventDetails();

								// .displayEventDetails();
								printLine();					
								System.out.println("\n\t\t \t Total Fee Collection!\n");
								printLine();
								System.out.println("\n\t \t \t EVENT USE FUll INFORMATION!");
								printLine();
								hack.totalFees();
									
							}	
							catch(NullPointerException ex)	
							{
								System.out.println("Exception"+ex);
							}	
							break;
					case 3: cls();	 	
							System.out.println("\n\t \t \t  PARTICIPANT INFORMATION!");
							printLine();
							participant.readParticiapntInfo();
							participant.displayParticipantDetails();
							System.out.println("\n\t\t \t Total Fee Payment!\n");
							printLine();
							hack.totalFees();
							break;
					case 4:  System.exit(0);
					
					// 		System.out.println("\n\t \t \t  SPONSOR INFORMATION!");
					// 		printLine();
					// 		// Sponsor spn = new Sponsor();
					// 		System.out.println("\n\t \t \t  READ SPONSOR INFORMATION!");
					// 		// spn.readSponsorDetails();
					// 		System.out.println("\n\t \t \t  DISPLAY SPONSOR INFORMATION!");
					// 		// spn.DisplaySponsorDetails();
							break;		
					
					
							 	
			 		default:
			 			System.out.print("Signing Off!");
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
public static  void cls()
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







