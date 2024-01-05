import java.util.*;
public class Strings1
{
public static void main(String[] args)
{
    System.out.println("Enter any string");
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
//Syntax for character accesing of string : variable.charAt(index)
//Syntax for character input : variable=sc.next().charAt(0)
    for(int i=0; i<a.length(); i++){
        System.out.println(a.charAt(i));
    }
    
   /*  System.out.println(a.length());
    String b=sc.nextLine();
    String c=a+ " "+ b;
    System.out.println(c);*/

   //I have added this line to distinguish between array and string. 
   // int number[]={1,3,5};
    //System.out.println(number.length);


    /*String b="Chiran Bakota";
    String c="c";
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);*/
//System.out.print();
}
}
