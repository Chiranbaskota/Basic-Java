import java.util.*;
public class problem1
{
//private static char a;

public static void main(String[] args)
{
    int num;
    int countNegative=0,countzero=0,countPositive=0;
    Scanner sc = new Scanner(System.in);
   char a;
    // Scanner sc = new Scanner(System.in);
    do{
   System.out.println("Enter any number you want");
   num=sc.nextInt();
   if(num>0){
countPositive++;
   }
   else if(num<0){
countNegative++;
   }
   else{
    countzero++;
   }
   System.out.println("Enter 1 to continue ");
   System.out.println("Press any other key to exit");
    a = sc.next().charAt(0);
    }while(a=='1');
    System.out.println("The number of negative number entered is "+countNegative);
    System.out.println("The number of positive number entered is "+countPositive);
    System.out.println("The number of zero number entered is "+countzero);
//System.out.print();
}


}
