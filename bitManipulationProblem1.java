//wap to check wheather the number is perfect square or not.
import java.util.*;
public class bitManipulationProblem1
{
public static void main(String[] args)
{
   double a,b;
    System.out.println("Enter any number");
    Scanner sc=new Scanner(System.in);
    a=sc.nextFloat();
    b=Math.sqrt(a);
    int c=(int)b;
    if((c*c)==a){
        System.out.println("The entered number is perfect square");

    }
    else{
        System.out.println("The entered number is not a perfect square");
    }
//System.out.print();
}
}
