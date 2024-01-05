//Write a program to find if a number is a power of 2 or not.

import java.util.*;
public class bitManipulationProblem2
{
public static void main(String[] args)
{
    double a,b;
     Scanner sc=new Scanner(System.in);
     a=sc.nextDouble();
     b=(Math.log(a))/(Math.log(2));
     int c=(int)b;
     if(c==b){
        System.out.println("Entered number is power of 2");
     }
     else{
        System.out.println("Entered number is not power of 2");
     }
     //alternative approach
     int result=(int)a&(int)a-1;
     if(result==0){
        System.out.println("Entered number is power of 2");
     }
     else{
        System.out.println("Entered number is not power of 2");
     }

     
//System.out.print();
}
}