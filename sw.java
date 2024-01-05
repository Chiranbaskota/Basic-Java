import java.util.Scanner;

public class sw
{
public static void main(String[] args)
{
    int a;
    System.out.println("Enter 1 to print area of rectangle");
    System.out.println("Enter 2 to print area of circle");
    Scanner sc = new Scanner(System.in);
    a=sc.nextInt();
    switch(a){
        case 1:
        {
            int l,b;
           System.out.println("Enter the length of rectangle");
           l=sc.nextInt();
           System.out.println("Enter the breadth of rectangle");
           b=sc.nextInt();
           System.out.println("The area of the rectangle is ");
           System.out.println(l*b);
           break;
        }
        case 2:
        {
            int r;
            System.out.println("Enter the radius of circle");
            r=sc.nextInt();
            System.out.println("The area of the circle is");
            System.out.println((22/7)*r*r);
            break;
        }
        default:
        {
           System.out.println("Invalid choice");
        }
    }

}
}