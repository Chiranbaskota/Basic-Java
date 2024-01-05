//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;
public class stringProblem1
{
public static void main(String[] args)
{
    int size,totSize=0;
   System.out.println("Enter the size of array of string");
   Scanner sc=new Scanner(System.in);
   size=sc.nextInt();
   String array[]= new String[size];
   for(int i=0; i<array.length; i++){
    array[i]=sc.next();
    totSize=totSize+array[i].length();
   }
   System.out.println("The total length of string entered is: ");
   System.out.println(totSize);

//System.out.print();
}
}
