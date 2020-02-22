import java.util.*;
class Course{
public static void main(String[] args) {
 
 Scanner input = new Scanner(System.in);

    System.out.println("Enter no of course:");
    int num;
    num=input.nextInt();
    
    if(num<=0){
        System.out.println("Invalid Range");
    }
    else
    {
        
    String [] array1; 
    int num2=num+1;
    array1 = new String[num2]; 
    
    System.out.println("Enter course names:");
    
    // getting the all courses
    for(int i=0;i<num2;i++){
       array1[i]=input.nextLine(); 
    }
    
    // course to be searched
    System.out.println("Enter the course to be searched:");
    String search;
    search=input.nextLine();
    
    // checking if course available
    int flag=0;
    
    for(int j=0;j<num2;j++){
        if(search.equals(array1[j])){
            flag++;
            break;
        }
    }
    if(flag==1){
        System.out.println(search+" course is available");
    }
    else if(flag==0){
        System.out.println(search+" course is not available");
    }
    
    } // end first else
    }
    
    
    
    
}
    

