import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.ArithmeticException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



//If the corresponding Test.class file is not found 
//during compilation then we will get Run-time Exception
//saying Exception in thread "main" java.lang.NoClassDefFoundError
class Addteacher extends Exception
{

  static String department, email,phno,tname;
  static long empno;
  static Double prorated_salary,paid_with_each_checks,asalary,twd;
  static int teawd,noc;
  static Double dpr;
  //static Double dpr=10/0; //ExceptionInInitializerError
  
  //default constructor 
  Addteacher() {}

  //perameterize constructor
  Addteacher(String str) { super(str); }


  public void adteacher()
  {
  
    Scanner in = new Scanner(System.in);

    System.out.println("\tPLEASE ENTER TEACHER'S DETAILS");

    System.out.println("TEACHER'S NAME:");
    tname=in.next();

    System.out.println("EMPLOYEE NUMBER:");
    empno=in.nextLong();

    System.out.println("DEPARTMENT:");
    department=in.next();

    //user-defined exception for validating phone no
    try
    {
      System.out.println("PHONE NO:");
      phno=in.next();

      Pattern pattern = Pattern.compile("\\d{3}-\\d{7}");
      Matcher matcher = pattern.matcher(phno);
      boolean match= matcher.matches();

      if (match == true)
      {
        System.out.println("Phone Number Valid");
      }
      else
      {
        Addteacher me=new Addteacher("Phone Number must be in the form XXX-XXXXXXX");
        throw me;  
      }
    }
    catch(Addteacher ex)
    {
      ex.printStackTrace();
    }
    //end of exception

    System.out.println("EMAIL:");
    email=in.next();

    System.out.println("ANNUAL SALARY:");
    asalary=in.nextDouble();

    //user defined exception for checking if tod is >= teawd or not
    try
    {
      System.out.println("TOTAL WORKING DAYS:");
      twd=in.nextDouble();

      System.out.println("TEACHER WORKING DAYS:");
      teawd=in.nextInt();

      if(twd<teawd)
      {
        Addteacher me=new Addteacher("Total working days cannot be less than teacher working days");
        throw me;
      }
    }
    catch(Addteacher e)
    {
      e.printStackTrace();
    }
    //end of exception
        
    System.out.println("NO OF CHECKS REMAINING:");
    noc=in.nextInt();

    System.out.println("**************************************");
    System.out.println();  

    dispteacher(tname,empno,department,phno,email);

  }

  public void dispteacher(String tname,long empno,String department, String phno,  String email)
  {
    System.out.println("\t----------TEACHER'S DETAILS----------");

    System.out.println("TEACHER'S NAME:" + tname);
        
    System.out.println("EMPLOYEE NUMBER:" + empno);

    System.out.println("DEPARTMENT:" + department);

    System.out.println("PHONE NO:" + phno);
    
    System.out.println("EMAIL:" + email);
  }


  public static void main(String args[])throws InterruptedException
  {
    //InterruptedException
    Thread t=new Thread();
    t.sleep(1000);

    //IllegalThreadStateException when we uncomment thread
    //t.start();
    //t.start();

    //NullPointerException it only throws exception when there is FileNotFoundException  
    FileInputStream fis = null;
    BufferedReader reader = null;
      
    try
    {
      fis = new FileInputStream("header.txt"); //FileNotFoundException
      reader = new BufferedReader(new InputStreamReader(fis));
      
      String line = reader.readLine();
      while(line != null)
      {
        System.out.println(line);
        line = reader.readLine();
      }               
    } 
    catch (FileNotFoundException e) 
    {
      Logger.getLogger(Addteacher.class.getName()).log(Level.SEVERE, null, e);
    } 
    catch (IOException e) 
    {
      Logger.getLogger(Addteacher.class.getName()).log(Level.SEVERE, null, e);   
    } 
    finally 
    {
      try 
      {
        reader.close();
        fis.close();
      }
      catch (IOException e) 
      {
        Logger.getLogger(Addteacher.class.getName()).log(Level.SEVERE, null, e);
      }
    }

    System.out.println("\n**************************************");
        System.out.println("\tTHREADS DEMONSTARTION");
        System.out.println("**************************************\n");
        Thread t1 = new Thread(new Addteacher().new RunnableImpl());
        t1.start();
        Thread t2 = new Thread(new Addteacher().new RunnableImp2());
        t2.start();

      String admin;
      char pass;

      Scanner inn = new Scanner(System.in);

      System.out.println("******************************************");
      System.out.println();
      System.out.println("PLEASE LOGIN IF ADMIN, IF NOT DON'T BOTHER");
      System.out.println("******************************************");
      System.out.println();



      System.out.println("USERNAME:");
      admin = inn.next();

      System.out.println("PASSWORD:");
      pass = inn.next().charAt(0);

      if(admin.equals("saurav") && pass=='a')
      {

        while(true)
        {
          System.out.println("******************************************");
          System.out.println();
          System.out.println("1. ENTER TEACHER'S DETAILS");
          System.out.println("2. ENTER ACCOUNTANT'S DETAILS");
          System.out.println("3. EXIT");
          System.out.println();

          System.out.println("ENTER YOUR CHOICE");
          int ch=inn.nextInt();
          System.out.println("**************************************");
          System.out.println();

          switch(ch)
          {
            case 1:  

                  Addteacher myobj = new Addteacher();
                  myobj.adteacher();  
                  
                  dpr=asalary/twd; 
                     
                  prorated_salary=dpr*teawd;

                  paid_with_each_checks=prorated_salary/noc;

                  System.out.println("DAILY PAY RATE:" + dpr); 

                  System.out.println("PRORATED SALARY:" + prorated_salary);

                  System.out.println("PAID WITH EACH CHECKS:" + paid_with_each_checks);

            break;

            case 2:  

                    Addaccountant myobj3 = new Addaccountant();
                    myobj3.addaccountant();  

            break;

            case 3: 

                    System.exit(0);
            
            break;

            default: System.out.println("Wrong choice");
          }

        }
          
      }

      else
      {
          System.out.println("INVALID ID OR PASSWORD");
      }

  }

private class RunnableImpl implements Runnable 
    {

        public void run() 
        {
            System.out.println("Thread 1 : "+Thread.currentThread().getName() + ", executing run() method!");
            System.out.println(java.time.LocalTime.now());  
        }
    }
    private class RunnableImp2 implements Runnable 
    {
        public void run() 
        {
            System.out.println("Thread 2 : "+Thread.currentThread().getName() + ", executing run() method!");
            System.out.println(java.time.LocalDate.now()); 
        } 
    }
  
}




class Addaccountant
{

  public String aname, aemail, aphno;
  public long ano;
  public Double asalary,abonus,aprofit,acommission,total_pay;

   public void addaccountant()
   {

      Scanner in = new Scanner(System.in);

      System.out.println("\tPLEASE ENTER ACCOUNTANT'S DETAILS");

      System.out.println("ACCOUNTANT'S NAME:");
      aname=in.next();

      System.out.println("ACCOUNTANT NUMBER:");
      ano=in.nextLong();

      System.out.println("PHONE NO:");
      aphno=in.next();

      //NumberFormatException
        try
        {
          Long phone_no=Long.parseLong(aphno);
        }
        catch(NumberFormatException e)
        {
          System.out.println("Invalid phone no");
        }

      System.out.println("EMAIL:");
      aemail=in.next();

      System.out.println("ENTER SALARY OF THE ACCOUNTANT:");
      asalary=in.nextDouble();

      System.out.println("ENTER BONUS TO BE GIVEN:");
      abonus=in.nextDouble();

      System.out.println("ENTER PROFIT SHARING TO BE GIVEN:");
      aprofit=in.nextDouble();

      System.out.println("ENTER COMMISSION TO BE GIVEN:");
      acommission=in.nextDouble();

      System.out.println("******************************************");
      System.out.println();


      dispaccountant(aname,ano,aphno,aemail);
  
       
   }

   public void dispaccountant(String aname,long ano,String aphno,String aemail)
   {
      System.out.println("\t---------------ACCOUNTANT'S DETAILS---------------");

      System.out.println("ACCOUNTANT'S NAME: "+aname);
      
      System.out.println("ACCOUNTANT NUMBER: "+ano);
      
      System.out.println("PHONE NO: "+aphno);
      
      System.out.println("EMAIL: "+aemail);
      
      total_pay=asalary+abonus+aprofit+acommission;

      System.out.println("THE TOTAL SALARY IS:"+ total_pay);
   }

  
 }