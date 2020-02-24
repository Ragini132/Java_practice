import java.util.*;

class Numerology{
    
    public static void main(String[] args){
        
        // input 
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name;
        name=input.nextLine();
        
        // checking for upper case word
        String upname;
        upname=name.toUpperCase();  
        
        int rate=0;
        // is Character check 
        for(int p=0;p<name.length();p++){
        if(Character.isLetter(name.charAt(p))==true){
            rate++;
        }
        
        }
        
        
        
        
        
        // checking valid input
        if(upname.equals(name) && rate==name.length()){
            
            // 2d Array
            
            int arr1[]={1 ,2 ,3 ,4 ,5 ,8 ,3 ,5 ,1 ,1 ,2 ,3 ,4 ,5 ,7 ,8 ,1 ,2 ,3 ,4 ,6 ,6 ,6 ,5 ,1 ,7};
            
            char arr2[]={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L','M','N','O','P','Q' ,'R','S','T','U','V','W','X','Y', 'Z'};
            
            int sum=0;
            for(int j=0; j<name.length();j++){
            for(int i=0;i<arr2.length;i++){
                if(name.charAt(j) == arr2[i]){
                    sum=sum+arr1[i];
                }
                
            }
            }
            System.out.println("Your numerology no is:"+sum);
        
        }
        else{
            System.out.println("Invalid name");
            
        } //end first else
        
        
    }
    
}