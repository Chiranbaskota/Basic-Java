//Input a string from the user. Create a new string called ‘result’ in which 
//you will replace the letter ‘e’ in the original string with letter ‘i’. 
import java.util.*;
public class stringProblem
{
public static void main(String[] args)
{
   String a,result="";
   System.out.println("Enter any string");
   Scanner sc=new Scanner(System.in);
   a=sc.nextLine();
   for(int i=0; i<a.length(); i++){
    if(a.charAt(i)=='e'){
       result=result+'i'; 
    }
    else{
    result=result+a.charAt(i);
    }
   }
   System.out.println("The resultant string is "+result);
//System.out.print();
}
}