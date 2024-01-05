import java.util.Scanner;

public class loops
{
public static void main(String[] args)
{
    int n,sum=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number upto which you want to print sum");
    n=sc.nextInt();
    for(int i=1; i<=n; i++)
    {
        sum=sum+i;
    }
    System.out.print("The sum of first "+n+" natural number is "+sum);
   // System.out.print(n);
    //System.out.print(" natural number is ");
    //System.out.println(sum);



//System.out.print();
}
}