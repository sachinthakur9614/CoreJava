
/****Program Name: Write a program to demonstrate various data types and operators.*** */
/************************Author: sachinthakur9614*********************** */
import java.util.NoSuchElementException;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.*; 

import java.util.Scanner; 
import java.util.*;
// Main class of Core Java project
 class Hackathon extends Exception {

		 Integer userId;
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


public Hackathon(int userid,String firstName,String lastName)
{
		userId = this.userId;
		firstName=this.firstName;
		lastName= this.lastName;
}

public  Hackathon(int userId,String firstName,String lastName,Long mobileNo,String email)
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

		Writer w = new FileWriter("user.txt",true); 

		System.out.println("\nEnter User Id");		
		userId = sc.nextInt();
		w.write(" \n User id :");
		 w.write(userId.toString());  
            
		

		System.out.print("\nEnter First Name:");
		firstName = sc.next();	

		w.write(" \n First Name :");
		w.write(firstName);	

		System.out.println("\nEnter Last Name:");
		lastName = sc.next();

		w.write(" \n Last Name :");
		w.write(lastName);
		System.out.println("\nEnter Mobile Number:");
		mobileNo = sc.nextLong();

		w.write(" \n Mobile Number :");
		w.write(mobileNo.toString());
		System.out.println("\nEnter Email:");
		email = sc.next();
		
		w.write(" \n Email :");
		w.write(email);

		mobile = mobileNo.toString();
		

		
	w.close();	
	} 
	catch(InputMismatchException e)
	{
		System.out.print("Invalid input");
		readUserInfo();
	}
	catch(IOException x)
	{
		System.out.println("");
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

 try {


		 Reader reader = new FileReader("user.txt");  

            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = reader.read();  
            }  
            reader.close();  

        }
          catch( FileNotFoundException x)
        {

        }
        catch(IOException x)
        {

        }
      
		// System.out.println("\n \tDISPLAY USER BASIC INFORMATION");
		// System.out.println("\nUser Id:"+userId);
		// System.out.println("\nFirst Name:"+firstName);
		// System.out.println("\nLast Name:"+lastName);
		// System.out.println("\nMobile No.:"+mobileNo);
		// System.out.println("\nEmail:"+email);
		// // System.out.print("Password:"+password);
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
		private Integer teamMember;
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

 			FileWriter fw=new FileWriter("Events.txt",true);    
           fw.write("Welcome to javaTpoint.");    
             
			 
			 	System.out.println("\nEnter Event Name:");
				fw.write("\n Event Name:");
			 	eventName = scan.next();
			 	  fw.write("\nEvent Name");  
			 	  fw.write(eventName);	
           
			 	fw.write(eventName);
				System.out.print("\nEnter Organised By:");
				organisedBy = scan.next();
				fw.write("\n Organised By:");
				fw.write(organisedBy);


				System.out.print("\nEnter Organised Email:");
				organiserEmail = scan.next();		 
				fw.write("\n Organiser Email:");
				fw.write(organiserEmail);

				System.out.print("\nEnter Contact Person:");
				conatctPersonName = scan.next();
				fw.write("\n Contact Person Name:");
				fw.write(conatctPersonName);

				System.out.print("\nEnter Number Of Events :");
				numberOfEvents = scan.nextInt();
				fw.write("\n Number of Events:");
				fw.write(numberOfEvents.toString());

				System.out.print("\nEnter Event Charge:");
				eventCharge = scan.nextFloat();
				fw.write("\n Event Charge:");
			fw.write(eventCharge.toString());

				System.out.print("\nEnter Number of Team Member:");
				teamMember = scan.nextInt();
				fw.write("\n Team Member:");
				fw.write(teamMember.toString());
				System.out.print("\nEnter Expected Teams:");
				expectedTeams = scan.nextInt();
				fw.write("\n Expected Team:");
				fw.write(teamMember.toString());
				// System.out.print("\nEnter Start Date:");
				startDate = new Date();
				// System.out.print("\nEnter End Date:");
				endDate = new Date();
				System.out.print("\nContact Mobile Number:");
				contactMobileNo =scan.nextLong();
				mobile = contactMobileNo.toString();
				fw.write("\n Mobile Number:");
				fw.write(contactMobileNo.toString());



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
				fw.close();
			}
			catch(FileNotFoundException c)
			{
				System.out.print("File not found");

			}
			catch(IOException x)
			{ 
				System.out.print("File not found");
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

try {
	 	System.out.println("\n \tDISPLAY ORGANISER BASIC INFORMATION");
			
		 	 FileReader fr=new FileReader("Events.txt");    
          int i;   
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    

      }
      catch( FileNotFoundException x)
      {

      }
      catch(IOException l)
      {

      }


				// System.out.println("\nEvent Name:"+eventName);
				// System.out.println("\nOrganised By:"+organisedBy);
				// System.out.println("\nOrganised Email:" + organiserEmail);
				// System.out.println("\nContact Person:"+ conatctPersonName);
				// System.out.println("\nNumber Of Events:"+numberOfEvents.intValue());
				// System.out.println("\nEvent Charge:"+eventCharge.floatValue());
				// System.out.println("\nNumber of Team Members:"+teamMember);
				// System.out.println("\n Start Date:"+startDate);
				// System.out.println("\nEnd Date:"+endDate);
				// System.out.println("\nContact Mobile No.:"+contactMobileNo.longValue());
				// System.out.println("\nExpected Teams:"+expectedTeams.intValue());


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

		try {

			FileWriter writer = new FileWriter("Sponsor.txt",true);  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to javaTpoint.");  
   
			
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Sponsor Org Name:");	

		sponsorOrgName = sc.next();
		 buffer.write("\n Org Name:");
			 	buffer.write(sponsorOrgName);

		System.out.print("\nEnter Sponsor Org Email:");
		sponsorOrgEmail = sc.next();
		buffer.write("\n Sponsor Org Email:");
		buffer.write(sponsorOrgEmail);

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
		buffer.close();
		writer.close();
	}
	catch(FileNotFoundException n)
	{
		System.out.println("FileNotFoundException");
	}
	catch(IOException x)
	{
		System.out.println("FileNotFoundException");
		
	}
}
public void DisplaySponsorDetails()
	{

	// Scanner sc = new Scanner(System.in)




try {
		 	 FileReader fr=new FileReader("Sponsor.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  

          br.close();    
          fr.close();  
          }
          catch(FileNotFoundException n)
	{
		System.out.println("FileNotFoundException");
	}
	catch(IOException x)
	{
		System.out.println("FileNotFoundException");
		
	}  
			

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


String  path = "D://MCA III//JAVA LAB//CoreJava//LAB 10 IO Stream/input.txt";
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

		 	try{

FileWriter writer = new FileWriter("Participant.txt",true);  
    BufferedWriter buffer = new BufferedWriter(writer);  
		 
		 
			 	System.out.println("\nEnter Team Name:");
		
			 	teamName = scan.nextLine();
			 	buffer.write("\n Team Name:");
			 	buffer.write(teamName);
				System.out.print("\nEnter College Name:");
				collegeName = scan.next();
				buffer.write("\n College Name:");
				buffer.write(collegeName);
				System.out.print("\nEnter Mobile No.:");
				mobileNo = scan.nextLong();	 
				mobile = mobileNo.toString(); 
				buffer.write("\n Mobile Number:");
				buffer.write(mobile);
				buffer.close();
		
			

				mobile = mobileNo.toString();
				if(mobile.length()<=0||mobile.length()>10)
				{
					System.out.print("Invalid Number");
					System.out.println("\nEnter Mobile Number:");
				mobileNo = scan.nextLong();
				}


				buffer.close();
 				writer.close();  

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

try {
		 	 FileReader fr=new FileReader("Participant.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  

          br.close();    
          fr.close();  
          }
          catch(FileNotFoundException n)
	{
		System.out.println("FileNotFoundException");
	}
	catch(IOException x)
	{
		System.out.println("FileNotFoundException");
		
	}  
			 // 	System.out.println("\n \tDISPLAY PARTICIPANT BASIC INFORMATION");
				// System.out.println("\nTeam Name:"+teamName);
				// System.out.println("\nCollege Name:"+collegeName);
				// System.out.println("\nMobile No:" + mobileNo);
				
				

		 }
				
public  static  void main(String args[]) throws IOException
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
			Organiser org = new Organiser();
			Participant  participant = new Participant();

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
					case 3: 		

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







