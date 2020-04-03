/*
LAB-12
Design a GUI application with two threads.
One thread to show the current date and 
other one to show the current time on the GUI form
*/

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.regex.*;

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

class Registration{
	Scanner sc = new Scanner(System.in);

		//Primitive datatypes
    	static byte subjectCode;                             				 // Tell which subject the student is going to give exam.
    	short passMark = 35;
    	long phoneNumber;
    	float average;							      		  
    	boolean pass = true;
    	char ans;
    	static int rightAns;
    	static int wrongAns;

    	//Wrapper datatypes
    	Character grade;
    	Integer registrationNumber; 
    	Double percentage;		
    	Integer totalMarks;	
    	Byte age;		   					  

    	//Non-Primitive datatype
    	String name = "";

	public static void clrscr(){     						    		  		//Clear the buffer
    	try {
        	if (System.getProperty("os.name").contains("Windows"))
            	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        	else
            	Runtime.getRuntime().exec("clear");
    	} catch (IOException | InterruptedException ex) {}
	}

    public void EnterDetails(){                            
    	try{                                                           			 // try...catch block to avoid any exceptions
    		System.out.println("Enter name:");
    		name = sc.nextLine();

    		System.out.println("Enter Registration Number:");
    		registrationNumber = sc.nextInt();

    		System.out.println("Enter Subject Code:");
    		System.out.println("01 for Science,02 for Computer");
    		subjectCode = sc.nextByte();

    		if (subjectCode >= 03) {                                     		 	//subjectCode validation 
    			System.out.println("Invalid Input! Pls try again");
    			System.out.println("01 for Science,02 for Computer");
    			subjectCode = sc.nextByte();
    		}
    	}

    	catch(Exception e){
    		clrscr();
    		System.out.println("Invalid Input! Pls try again");
    		EnterDetails();
    	}
    }

    public void DisplayDetails(){	
    	System.out.println("Name:" + name);
    	System.out.println("Registration Number:" + registrationNumber.intValue());  //object to primitive i.e., unboxing
    	System.out.println("Subject Code:" + subjectCode);
    }
}

class Examination extends Registration{

	public int startExam() {

   		System.out.println("Time Duration - 45 mins\n");
   		time t = new time();
   		t.start();

   		try{
			Thread.sleep(4000);
		}
		catch(Exception ex){
			System.out.println(ex);
		}

		if (subjectCode == 01) {  
			System.out.println("===> Science Exam <===\n");
			System.out.println("Q1. What is the chemical formula of Sulphuric Acid?\n");
			System.out.println("A. H2O");
			System.out.println("B. H2SO4");
			System.out.println("C. O2");
			System.out.println("D. CO2");
			ans = sc.next().charAt(0);
			if (ans == 'b' || ans == 'B') {
			 	System.out.println("Correct");
			 	rightAns++;
			} else {
				System.out.println("Incorrect");
			 	wrongAns++;
			}

			System.out.println("Q2. Electric bulb filament is made up of?\n");
			System.out.println("A. Copper");
			System.out.println("B. Aluminum");
			System.out.println("C. Lead");
			System.out.println("D. Tungsten");
			ans = sc.next().charAt(0);
			if (ans == 'd' || ans == 'D') {
			 	System.out.println("Correct");
			 	rightAns++;
			} else {
				System.out.println("Incorrect");
			 	wrongAns++;
			}

			System.out.println("Q3. Which of the following is used in pencils?\n");
			System.out.println("A. Graphite");
			System.out.println("B. Silicon");
			System.out.println("C. Charcoal");
			System.out.println("D. Phosphorus");
			ans = sc.next().charAt(0);
			if (ans == 'a' || ans == 'A') {
			 	System.out.println("Correct");
			 	rightAns++;
			} else {
				System.out.println("Incorrect");
			 	wrongAns++;
			}
		}

		else if (subjectCode == 02) {
			System.out.println("Computer Exam");			   	 			//This section will be modified later
		}
	
		return 0;

	}
}

// class openNotepad extends Thread {
// 	public void openNotepad(){
// 		Runtime rt = Runtime.getRuntime();
// 		try{
//        		rt.exec("C:\\Windows\\System32\\notepad.exe reportcard.txt");
//     	}
//      	catch (IOException ex){
//      		System.out.println(ex); 
//     	} 
// 	}
// }

class generateReport extends Examination {

	private static DecimalFormat df2 = new DecimalFormat("#.##");   		 //format specifier

	public void Report() throws IOException{

		FileOutputStream fout = null;

		totalMarks = (rightAns*4) - wrongAns;                     		     //Correct answers +4 Wrong answers -1
		System.out.println("===> Report <===");
		System.out.println("total Marks: " + totalMarks);
		percentage = (totalMarks*100) / 12.00;
		System.out.println("Percentage: "+df2.format(percentage)+"%");	

		if (totalMarks<=12 && totalMarks>=10) {
			grade = 'A';
		}
		else if (totalMarks<=9 && totalMarks>=7) {
			grade = 'B';
		}
		else if (totalMarks<=6 && totalMarks>=4) {
			grade = 'C';
		}
		else{
			pass = false;                        						   	//students fails
			grade = 'F';
		}

		Character c = Character.valueOf(grade);    							//converting char into character
		Character c1 = c;													//autoboxing, now compiler will write Integer.valueOf(a) internally  
		System.out.println("Grade: " + c1);

		if (pass == true) 
			System.out.println("Status: Pass");
		else
			System.out.println("Status: Failed");

		// Sending everything to external file as reportCard.
		try
		{
			fout = new FileOutputStream("reportcard.txt");
			String str1 = "===> Report <==="; 
			fout.write(str1.getBytes());
			fout.write("\n\ntotal Marks: ".getBytes());
			fout.write(String.valueOf(totalMarks).getBytes());
			fout.write("\nPercentage: ".getBytes());
			fout.write(String.valueOf(df2.format(percentage)).getBytes());
			fout.write("%".getBytes());
			fout.write("\nGrade: ".getBytes());
			fout.write(String.valueOf(grade).getBytes());
			
			if (pass == true)
				fout.write("\nStatus: Pass".getBytes());
			else
				fout.write("\nStatus: Failed".getBytes());
			
			//fout.close();
		}

		catch (FileNotFoundException ex)
    	{
     		System.out.println("File not Found!");
    	}

	}

}


public class onlineExam{

   	public static void main(String args[]) {
   	
   	date d = new date();
   	d.start();		

   	Scanner sc = new Scanner(System.in); 
   	Registration obj = new Registration();
   	Examination obj2 = new Examination();
   	generateReport obj3 = new generateReport();
	System.out.println("======> Online Examamination System <======");


	for (;;){
		System.out.println("\n===> Menu <===");
   		System.out.println("1. Registration");
		System.out.println("2. Display Profile");
		System.out.println("3. Start Exam");
		System.out.println("4. Generate Report");
		System.out.println("5. Exit");

		int choice = sc.nextInt();

		switch(choice){
			case 1:
			obj.EnterDetails();
			clrscr();
			break;

			case 2:
			obj.DisplayDetails();
			break;

			case 3:
			clrscr();
			obj2.startExam();
			break;

			case 4:
			clrscr();

			Thread t4 = new Thread(new onlineExam().new openNotepad());
			t4.start();
			try{
				obj3.Report();
			}
			catch(Exception ex){
				System.out.println(ex);
			}

			// Thread t4 = new Thread(new onlineExam().new openNotepad());
			// t4.start();
			// try {
			// 	t4.join();
			// } catch (Exception p) {
			// 	System.exit(0);
			// }
			break;

			case 5:
			System.exit(0);
			break;

			default:
			System.out.println("Wrong Input!");
			break;
		}
	}}

	public static void clrscr(){           //Clear the buffer
    try {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    } catch (IOException | InterruptedException ex) {}
	}

	class openNotepad extends Thread {
	public void openNotepad(){
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
