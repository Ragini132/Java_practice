import java.util.*;
class PanCard{
    public static void main(String[] args){
        // input
        
        Scanner input=new Scanner(System.in);
        
        String pan;
        System.out.println("Enter the PAN no:");
        pan=input.nextLine();
        
        // checking length of pan no.
        int num;
        num=pan.length();
        
        if(num==10){
            

        // Creating array of string length 
        char[] ch = new char[pan.length()]; 
  
        // Copy character by character into array 
        for (int i = 0; i < pan.length(); i++) { 
            ch[i] = pan.charAt(i); 
        } 
        
        // checking validity
    
    int count1=0;
    int count2=0;
    int count3=0;
    
        for(int j=0;j<num;j++){
            if(j>=5 && j<=8){
               Boolean flag = Character.isDigit(pan.charAt(j)); 
               if(flag){
                   count1++;
               }
               
            }
            if(j<=3){
                if(!Character.isUpperCase(pan.charAt(j))) {}
                else count2++;
            }
            if(j==9){
                if(!Character.isUpperCase(pan.charAt(j))) {}
                else count3++;
            }
            
        }
        
        if(count1==4 && count2==4 && count3==1){
            System.out.println("Valid PAN no"); 
        }
        else  System.out.println("Invalid PAN no");
        
        }
        else System.out.println("Invalid PAN no");
        
    }
    
}