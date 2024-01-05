//Input an email from the user. You have to create a username from the email by 
//deleting the part that comes after ‘@’. Display that username to the user.
import java.util.*;
public class stringProblem3
{
public static void main(String[] args)
{
    String email;
    int index=0;
    System.out.println("Enter the email address");
    Scanner sc=new Scanner(System.in);
    email=sc.nextLine();
    for(int i=0; i<email.length(); i++){
       if(email.charAt(i)=='@'){
       break;
       }
       index++;
    }
    System.out.print("The username is ");
    System.out.println(email.substring(0,index));

//System.out.print();
}
}