import java.util.*;
class CompatibleArrays{
    
    public static void main(String[] args){
        
        // input
        System.out.println("Enter the size for First array:");
        Scanner input=new Scanner(System.in);
        
        int size1;
        size1=input.nextInt();
        
        if (size1<=0){
            System.out.println("Invalid array size");
        }
        else
        {    
           
            // get array1 input
           int arr1[];
           arr1 =new int[size1];
        
            System.out.println("Enter the elements for First array:");
            for(int i=0;i<size1;i++)
            {
               arr1[i]=input.nextInt();
            }
        
        
            System.out.println("Enter the size for Second array:");
        
            // check size of second array
            int size2;
            size2=input.nextInt();
            
            
            
            if(size2>0){
                
                int arr[];
                arr =new int[size2];
                System.out.println("Enter the elements for Second array:");
                
                 for(int i=0;i<size2;i++){
                   arr[i]=input.nextInt();
                 }
        
                
            
            
            // comparing the two Arrays
            
            if(size1!=size2){
                System.out.println("Arrays are Not Compatible");
            }
            else{
                 
                 // comparing each elements
                 int counter=0;
                 for(int p=0;p<size1;p++){
                     if(arr1[p]>=arr[p]){
                         counter++;
                     }
                     
                 } // end for loop
                
                if(counter==size1){
                    System.out.println("Arrays are Compatible");
                }
                else {
                    System.out.println("Arrays are Not Compatible");
                }
                
            }// else end
            } // if end
            else{
                System.out.println("Invalid array size");
            }
            
            
                
                
            
            
            
        
            
            
        } // end first else
    }
    
    
    
    
}