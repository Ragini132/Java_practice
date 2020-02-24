import java.util.*;
class InitCap{
    
    static String convert(String str) 
    { 
  
        // Create a char array of given String 
        char ch[] = str.toCharArray(); 
        for (int i = 0; i < str.length(); i++) { 
  
            // If first character of a word is found 
            if (i == 0 && ch[i] != ' ' ||  
                ch[i] != ' ' && ch[i - 1] == ' ') { 
  
                // If it is in lower-case 
                if (ch[i] >= 'a' && ch[i] <= 'z') { 
  
                    // Convert into Upper-case 
                    ch[i] = (char)(ch[i] - 'a' + 'A'); 
                } 
                else{
                    
                }
            } 
  
            
                
        } // end for loop
  
        // Convert the char array to equivalent String 
        String st = new String(ch); 
        return st; 
    } 
    
    
    public static void main(String[] args){
        
        // input
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the String:");
        String str;
        str=input.nextLine();
        
        String str2;
        str2=convert(str);
        
        if(str2.equals(str)){
            System.out.println("First character of each word is already in uppercase");
        }
        else{
        
        System.out.println(str2);
        
        
        }
        
        
        
        
        
        
        
        
    }
}