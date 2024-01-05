//Write a program to count the number of 1’s in a binary representation of the number.

import java.util.*;
public class bitManipulationProblem4
{
public static void main(String[] args)
{
    int a;
    System.out.println("Enter any number");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
   int pos=-1;
    int bitMask;
    double num=0;
    double c;
     c=0;
     int bit1=0;
    while(a>=c){
        pos++;
        num++;
        c=Math.pow(2,num);
    }
    System.out.println("The number of bits in entered number is "+ (pos+1));
    for(int i=0;i<=pos; i++){
        bitMask=1<<i;
        if((a&bitMask)!=0){
       bit1++;
        }
    }
    System.out.println("The total number of 1's in given number(binary form) is "+bit1);
    
//System.out.print();
}
}
