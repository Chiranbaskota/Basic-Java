import java.util.*;
public class arrayProblems1
{
public static void main(String[] args)
{
    int size;
    System.out.println("Enter the size of array");
    Scanner sc=new Scanner(System.in);
    size = sc.nextInt();

    //defination of array
    //int number[]={1,2,34,42,51};
    int number[]=new int[size];

     System.out.println("Enter the elements in array");
    for(int i=0; i<size; i++){
        number[i]=sc.nextInt();
    }

    System.out.println("The entered elements is array are displayed below");

    //display the entered elements of array
    //number.length define the size or number of elements in array
    for(int i=0; i<number.length; i++){
        System.out.println(number[i]);
    }

//System.out.print();
}
}