/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;
import java.io.*;
import java.util.*;
/**
 *
 * @author sinha
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
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
    //  System.out.println(str.get(k));
   } 
   for(int i=0;i<num+1;i++){
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
   //   System.out.println(dif);
      // check for prime string
      if( dif%3!=0|| dif%5!=0|| dif%7!=0){
         res.add("Casual String");
      }
      else{
         res.add("Prime String");
      }
   }

   // printing result
   for(int k=0;k<num+1;k++){
      System.out.println(res.get(k));
   }



}


}



  
  

