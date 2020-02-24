import java.util.*;
class Palindrome{
    
 public static boolean isPalindrome(String str) 
    { 
  
        // Pointers pointing to the beginning 
        // and the end of the string 
        int i = 0, j = str.length() - 1; 
  
        // While there are characters toc compare 
        while (i < j) { 
  
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
  
            // Increment first pointer and 
            // decrement the other 
            i++; 
            j--; 
        } 
  
        // Given string is a palindrome 
        return true; 
    } 
  
    public static void main(String[] args){
        
        // input
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the word");
        
        String str;
        str=input.nextLine();
        
        boolean str2;
        
        int counter=0;
        // checking string characters
        
        for(int i=0;i<str.length();i++){
            if((Character.isLetter(str.charAt(i)) == true)){
                counter++;
            }
        }
        
        str=str.toLowerCase();
        
        if(counter==str.length()){
            
            str2=isPalindrome(str);
            if(str2==true){
            System.out.println(str+" is a Palindrome");
            }
            else{
                System.out.println(str+" is not a Palindrome");
            }
        }
        else{
            System.out.println("Invalid Input");
        }
        
        
        
        
        
        
    }
    
    
}