import java.util.*;

class OccurrenceOfChar{
    
static boolean correct;

public static boolean check(String s) {
      if (s == null) {// checks if the String is null {
         return false;
      }
      int len = s.length();
      for (int i = 0; i < len; i++) {
         // checks whether the character is not a letter
         // if it is not a letter ,it will return false
         if ((Character.isLetter(s.charAt(i)) == false)) {
            return false;
         }
      }
      return true;
   
}
   
   
    
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        
        // input String
        
        System.out.println("Enter a word:"); 
        String str;
        str=input.nextLine();
        
        // check if its a valid string
       
        correct=check(str);
        
        if(correct==false){
           System.out.println("Not a valid string"); 
        }
        else{
        
        // string to char array
        
         char[] ch = new char[str.length()]; 
  
        // Copy character by character into array 
        for (int i = 0; i < str.length(); i++) { 
            ch[i] = str.charAt(i); 
        } 
        
        // case 1 : correct case
        
        System.out.println("Enter the character:");
        String search;
        search=input.nextLine();
        
        int count=0;
        char str2;
        str2=search.charAt(0);
        
        // checking the char to search is valid or not
        if(Character.isLetter(search.charAt(0)) == true && search.length()==1){
            
            for(int i=0;i<str.length();i++){
                if(str2==ch[i]){
                    count++;
                }
            }
        
        // if char found
        if(count==0){
      //  System.out.println("No of '"+search+"' present in the given word is "+count+".");
      System.out.println("The given character '"+search+"' not present in the given word.");
        }
        else{
          //  System.out.println("The given character '"+search+"' not present in the given word.");
          System.out.println("No of '"+search+"' present in the given word is "+count+".");
        }
            
            
        }
        else{
            System.out.println("Given character is not an alphabet");
        } 
        
        
        
        } // end first else
        
        
    }
    
    
    
}