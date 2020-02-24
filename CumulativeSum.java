import java.util.*;
class CumulativeSum{
public static void main(String[] args) {
 
 Scanner input = new Scanner(System.in);

    System.out.println("Enter number of elements");
    int num;
    num=input.nextInt();
    
    if(num<=0){
        System.out.println("Invalid Range");
    }
    else
    {
    int [] array1; 
    array1 = new int[num]; 
    
    System.out.println("Enter the elements");
    // getting the score in all subjects
    for(int i=0;i<num;i++){
       array1[i]=input.nextInt(); 
    }
    
    // summing up
    int sum=0;
    
    for(int i=0;i<num;i++){
        sum=sum+array1[i];
        System.out.print(sum+" ");
        
    }
    
    
    }
    
    
    
    
}
    
}
