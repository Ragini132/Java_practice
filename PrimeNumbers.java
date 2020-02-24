import java.util.*;
class PrimeNumbers{

public static void main(String[] args){
 Scanner sc = new Scanner(System.in); 
        int a, b; 
  
        a = sc.nextInt(); 
  
        b = sc.nextInt();
        int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";

  
      int range=b-a;
  
      if(a>b || a<=0 || b<=0 || range==1 || a==b)
      {
          System.out.println("Provide valid input");
      }
        else
        {
            for (i = a; i <= b; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }
       System.out.println(primeNumbers);
       
       
       
        } // end first else 
    }
}