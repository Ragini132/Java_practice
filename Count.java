import java.util.*;
class Count{
public static void main(String[] args) {
 
 Scanner input = new Scanner(System.in);

    System.out.println("Enter the no of subjects:");
    int num;
    num=input.nextInt();
    
    if(num<=0){
        System.out.println("Invalid input range");
    }
    else
    {
    int [] array1; 
    array1 = new int[num]; 
    
    
    // getting the score in all subjects
    for(int i=0;i<num;i++){
       array1[i]=input.nextInt(); 
    }
    
    // checking the scores
    
    int pass=0;
    int fail=0;
    for(int j=0;j<num;j++){
        if(array1[j]>=50){
            pass++;
        }
        else fail++;
    }
    if(pass==num){
       System.out.println("Ram passed in all subjects");
    }
    else if (fail==num){
        System.out.println("Ram failed in all subjects");
    }
    else{
        System.out.println("Ram passed in "+pass+" subjects and failed in "+fail+" subjects");
    }
    
    }
    
    
    
    
}
    
}
