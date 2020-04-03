import java.util.*;
import java.io.*;
//import java.io.BufferedReader;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.lang.ArithmeticException;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;


class Addteacher implements Serializable
{

  static String department, email,tname;
  static long empno,phno;
  static Double prorated_salary,paid_with_each_checks,asalary,twd;
  static int teawd,noc;
  static Double dpr;
  
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

    System.out.println("PHONE NO:");
    phno=in.nextLong();

    System.out.println("EMAIL:");
    email=in.next();

    System.out.println("ANNUAL SALARY:");
    asalary=in.nextDouble();

    System.out.println("TOTAL WORKING DAYS:");
    twd=in.nextDouble();

    System.out.println("TEACHER WORKING DAYS:");
    teawd=in.nextInt();

        
    System.out.println("NO OF CHECKS REMAINING:");
    noc=in.nextInt();

    System.out.println("**************************************");
    System.out.println();  
  }

  
  public String gettname()
  {return tname;}
  public void settname(String tname) {
  this.tname = tname;
  }

    public long getempno()
  {return empno;}
  public void setempno(long empno) {
  this.empno = empno;
  }

    public String getdepartment()
  {return department;}
  public void setdepartment(String department) {
  this.department = department;
  }

    public long getphno()
  {return phno;}
  public void setphno(long phno) {
  this.phno = phno;
  }

    public String getemail()
  {return email;}
  public void setemail(String email) {
  this.email = email;
  }

    public double getasalary()
  {return asalary;}
  public void setasalary(double asalary) {
  this.asalary = asalary;
  }

    public double gettwd()
  {return twd;}
  public void settwd(double twd) {
  this.twd = twd;
  }

    public int getteawd()
  {return teawd;}
  public void setteawd(int teawd) {
  this.teawd = teawd;
  }

    public int getnoc()
  {return noc;}
  public void setnoc(int noc) {
  this.noc = noc;
  }

  
  public static void main(String args[])
  {
    Addteacher myobj = new Addteacher();

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
                  myobj.adteacher(); 

                  myobj.settname(tname);
                  myobj.setempno(empno);
                  myobj.setdepartment(department);
                  myobj.setphno(phno);
                  myobj.setemail(email);
                  myobj.setasalary(asalary);
                  myobj.settwd(twd);
                  myobj.setteawd(teawd);
                  myobj.setnoc(noc);

                  
                  try {
                        FileOutputStream fos = new FileOutputStream("teacherrecord.txt");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(myobj);
                        oos.close();

                        } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                        }

                  FileInputStream fis;
                  ObjectInputStream ois;
                  try {

                        fis = new FileInputStream("teacherrecord.txt");
                        ois = new ObjectInputStream(fis);
                        Addteacher obj1 = (Addteacher)ois.readObject();

                        System.out.println("\t----------TEACHER'S DETAILS----------");

                        System.out.println("TEACHER'S NAME:" + obj1.tname);
                            
                        System.out.println("EMPLOYEE NUMBER:" + obj1.empno);

                        System.out.println("DEPARTMENT:" + obj1.department);

                        System.out.println("PHONE NO:" + obj1.phno);
                        
                        System.out.println("EMAIL:" + obj1.email);

                  }
                  catch (FileNotFoundException e) {
                  e.printStackTrace();
                  } 
                  catch (IOException e) {
                  e.printStackTrace();
                  }
                  catch(Exception e) {
                  e.printStackTrace();
                  }
                  
                  dpr=asalary/twd; 
                     
                  prorated_salary=dpr*teawd;

                  paid_with_each_checks=prorated_salary/noc;

                  System.out.println("DAILY PAY RATE:" + dpr); 

                  System.out.println("PRORATED SALARY:" + prorated_salary);

                  System.out.println("PAID WITH EACH CHECKS:" + paid_with_each_checks);

            break;

            case 2:  
                    System.out.println("Wrong choice");
                    //Addaccountant myobj3 = new Addaccountant();
                    //myobj3.addaccountant();  

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
}




class Addaccountant
{

  public String aname, aemail;
  public long ano,aphno;
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


      
  
       
   }

   public String getaname()
  {return aname;}
  public void setaname(String aname) {
  this.aname = aname;
  }

    public long getano()
  {return ano;}
  public void setano(long ano) {
  this.ano = ano;
  }

    public String getaphno()
  {return aphno;}
  public void setaphno(String aphno) {
  this.aphno = aphno;
  }

    public String getaemail()
  {return aemail;}
  public void setaemail(String aemail) {
  this.aemail = aemail;
  }

    public double getasalary()
  {return asalary;}
  public void setasalary(double asalary) {
  this.asalary = asalary;
  }

    public double getabonus()
  {return abonus;}
  public void setabonus(double abonus) {
  this.abonus = abonus;
  }

    public double getaprofit()
  {return aprofit;}
  public void setaprofit(double aprofit) {
  this.aprofit = aprofit;
  }

    public double getacommission()
  {return acommission;}
  public void setacommission(double acommission) {
  this.acommission = acommission;
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