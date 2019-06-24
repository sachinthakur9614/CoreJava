import java.util.Scanner; 
import java.io.*;
import java.util.*;
class Exam2 {
	
	public static void main(String args[])
	{

	int num, product, sum=0;
	 int number=0, rem=0;
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter the Number");
	num = sc.nextInt();
	System.out.println("Enter the Product");
	product = sc.nextInt();

int i=0;
 while(num>0)
 {

 	if(product%num==0)
 	{
 		i= product/num;
 		System.out.println(i);
 	}

 	num--;
 }


}


}


