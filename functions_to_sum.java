import java.util.Scanner;

public class functions_to_sum
{
    public static int sumOfNumber(int a,int b){
        return(a+b);
    }
public static void main(String[] args)
{
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("The sum of "+a +" and "+b +" is "+sumOfNumber(a, b));
//System.out.print();
}

}
