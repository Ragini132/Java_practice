/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here

   //input
   Scanner input=new Scanner(System.in);
   int num=input.nextInt();
     // System.out.println(num);

   // input list of string
   ArrayList<String> str=new ArrayList<String>();

   //final result string
   ArrayList<String> res=new ArrayList<String>();

   // input array of string
   for(int p=0;p<num+1;p++){
      String str2=input.nextLine();
      str.add(str2);
   }
   for(int k=0;k<num+1;k++){
     // System.out.println(str.get(k)+" "+k);
   } 
   
   
   for(int i=1;i<num+1;i++){
       int even=0;
      int odd=0;
      int dif=0;
      // store one string str in str1
      String str1=str.get(i);

      // characters array
      char[] char1=new char[str1.length()];
      
      
   
      for(int j=0;j<str1.length();j++){
         char1[j]=str1.charAt(j);
         if(j%2==0){
            int ascii = (int) char1[j];
            even=even+ascii;
         }
         else{
            int ascii = (int) char1[j];
            odd=odd+ascii;
         }
      }
   //   System.out.println(odd+" "+even);
      dif=Math.abs(even-odd);
     // System.out.println(dif);
      // check for prime string
      if( dif%3==0|| dif%5==0|| dif%7==0){
         res.add("Prime String");
      }
      else{
         res.add("Casual String");
      }
      
   }

   // printing result
   
   for(int k=0;k<num;k++){
      System.out.println(res.get(k));
   }



   }
}
