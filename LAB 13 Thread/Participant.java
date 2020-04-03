
/****Program Name: Write a program to demonstrate various data types and operators.*** */
/************************Author: sachinthakur9614*********************** */
import java.util.NoSuchElementException;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.*; 
import java.util.Scanner; 
import java.util.*;



import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.ArithmeticException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;





class date extends Thread{                                              	 // thread to display date
	public void run(){
		Date today = new Date();
		Date currentDate = new java.sql.Date(today.getTime());
		System.out.println("current date: " + currentDate);
	}
}

class time extends Thread{													 // thread to display time
	public void run(){
		Date today = new Date();
		Date currentTime = new java.sql.Time(today.getTime());
		System.out.println("current time: " + currentTime);
	}
}
// Main class of Core Java project
 class Hackathon extends Exception {
		private short userId;
		String firstName;
		private	String lastName;
		private	String userName;
		private Long mobileNo;
	 String mobile;
	 private String email;
		boolean check;
		// Basic Constructor of Hackathon class
	
public  Hackathon()
{
		userId=0;
		firstName=lastName=email="";
}


public Hackathon(short userid,String firstName,String lastName)
{
		userId = this.userId;
		firstName=this.firstName;
		lastName= this.lastName;
}

public  Hackathon(short userId,String firstName,String lastName,Long mobileNo,String email)
{
		userId = this.userId;
		firstName = this.firstName;
		lastName = this.lastName;	
		mobileNo = this.mobileNo;
		email = this.email;
}

Hackathon(String str) { super(str); }


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

		displayUSerInfo();	


	}
	


		


}


public void displayUSerInfo(short id) throws IOException
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
		
		readUserInfo(userId);
		
	} 
	catch(InputMismatchException e)
	{
		System.out.print("Invalid input");
		readUserInfo();
	}
	catch(NullPointerException e)
	{
		System.out.println("NullPointerException"); 

	}

	if(mobile.length()<=0||mobile.length()>10)
			{
				System.out.print("Invalid Number");
				System.out.println("\nEnter Mobile Number:");
			mobileNo = sc.nextLong();
			mobile = mobileNo.toString();


			if (mobile.length() >10)
			{
				throw new ArithmeticException("Mobile No is invalid!");  
    
			}


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

  class Organiser  extends Hackathon {
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


	public   void eventDetails(boolean che)
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
	public  void displayEventDetails( boolean che)
	{	
			if (che==true)
			 	{
					 	System.out.println("Event Name:"+eventName);
			 			System.out.println("\nContact Person:"+ conatctPersonName);
			 			System.out.println("\nEvent Charge:"+eventCharge.floatValue());

			}
	}
		//Definition of read method to read the data from user 
	public  void eventDetails()
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
				System.out.print("\nContact Mobile Number:");
				contactMobileNo =scan.nextLong();
				mobile = contactMobileNo.toString();


				if(numberOfEvents<1)
				{

						Hackathon hac = new Hackathon("invalid Events!");	
						throw hac;
						
				}


				if(mobile.length()<=0||mobile.length()>10)
				{
					System.out.print("Invalid Number");
					System.out.println("\nEnter Mobile Number:");
				contactMobileNo = scan.nextLong();
				Hackathon hac = new Hackathon("invalid Mobile Number!");	
						throw hac;

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
		catch(Hackathon el){

			el.printStackTrace();
		}


	 }
	 // Definition Displaying the Event information



	public  void totalFees() 
		{
					totalFee =  expectedTeams * eventCharge;			
					System.out.print("\nTotal Amount Collected  \t\t\t");
					System.out.print("\t\t "+totalFee);
				
		}



public  void displayEventDetails()
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





 class Sponsor extends Organiser
{ 

String sponsorOrgName;
String sponsorOrgEmail;
int sponsorType;
String sponosorOfficeLoc;


	public void Sponsor(String sponsorOrgName,String sponsorOrgEmail, int sponsorType,String sponosorOfficeLoc)
	{
		sponsorOrgName= this.sponsorOrgName;
		sponsorOrgEmail = this.sponsorOrgEmail;
		sponsorType= this.sponsorType;
		sponosorOfficeLoc= this.sponosorOfficeLoc;

	}
	public void readSponsorDetails()
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
public void DisplaySponsorDetails()
	{

	// Scanner sc = new Scanner(System.in)


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
}




  



public class Participant extends Sponsor {


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


public void readParticiapntInfo() throws IOException
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
				
public  static  void main(String args[]) throws IOException
	{

  Thread t=new Thread();
  try {
    t.sleep(4000);
}
catch(InterruptedException x)
{
	
}
			System.out.println("***Program Name: Write a program to demonstrate various data types and operators.***\n");
			System.out.println("***********************Author: Sachin Thakur***********************\n");
			System.out.println("***********************Reg. No: 1847250***********************\n");
			int choice;
			byte ch;
			boolean che;
			short id;
			 
			Scanner scan = new Scanner(System.in); 
			Hackathon usern = new Hackathon();
			Organiser org = new Organiser();
			Participant  participant = new Participant();


	date d = new date();
   	d.start();		

			 // Organiser org = new  Organiser();
			while(true)
			{
				System.out.println("\n1. User information");
				System.out.println("2. Event information");
				System.out.println("3. Participant information");
				System.out.println("4. Sponsot information");
				System.out.println("5. Exit");
			 	System.out.println("Enter Your Choice!");
			 	choice = scan.nextInt();
				switch(choice){
					case 1:
						 	System.out.println("\n\t\t \t USER INFORMATION!\n");
						 	printLine();	


						 		Thread t4 = new Thread(new Participant().new openNotepad());
			t4.start();
			try{
				t4.join();
			}
			catch(Exception p){
				System.out.println("Exception!");
			}	
			
							usern.readUserInfo();
							printLine();	
						 	usern.displayUSerInfo();
						 	printLine();
						 	break;			 	
			 		case 2:		
				 			cls();	 	
							System.out.println("\n\t \t \t ORGANISER INFORMATION!");
							printLine();
							try {


							
							 	org.eventDetails();
							 	printLine();
								org.displayEventDetails();
								printLine();					
								System.out.println("\n\t\t \t Total Fee Collection!\n");
								printLine();
								System.out.println("\n\t \t \t EVENT USE FUll INFORMATION!");
								printLine();
								org.totalFees();
								System.out.println("\n\n\nDO you want Change Event Name, Contact Person Name and Event Charge(true=YES/false=NO) ");
								che = scan.nextBoolean();
								if (che==true)
								{
									org.eventDetails(che);
									org.displayEventDetails(che);
									org.totalFees();
								}	
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
							org.totalFees();
							break;
					case 4: cls();
							System.out.println("\n\t \t \t  SPONSOR INFORMATION!");
							printLine();
							Sponsor spn = new Sponsor();
							System.out.println("\n\t \t \t  READ SPONSOR INFORMATION!");
							spn.readSponsorDetails();
							System.out.println("\n\t \t \t  DISPLAY SPONSOR INFORMATION!");
							spn.DisplaySponsorDetails();
							break;		
					case 5: System.exit(0);
					
					
							 	
			 		default:
			 			System.out.print("Signing Off!");
			 } 
			






	}




}class openNotepad extends Thread {
		public void run(){
			synchronized(this){
				//public void openNotepad(){
				Runtime rt = Runtime.getRuntime();
				try{
       				rt.exec("C:\\Windows\\System32\\notepad.exe reportcard.txt");
    			}
     			catch (IOException ex){
     				System.out.println(ex); 
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
public static  void cls()
	{
		try {
        	if (System.getProperty("os.name").contains("Windows"))
            	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        	else
            	Runtime.getRuntime().exec("clear");
    	} catch (IOException | InterruptedException ex) {}
    	finally
        { 
            System.out.println("buffer cleared!\n");
        } 
	}


}







