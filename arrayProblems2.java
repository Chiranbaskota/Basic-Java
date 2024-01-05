import java.util.*;
public class arrayProblems2
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
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    for(int i=0; i<number.length; i++){
        if(number[i]<min){
            min=number[i];
        }
        if(number[i]>max){
            max=number[i];
        }
    }
    System.out.println("The maximum number entered in array is "+ max);
    System.out.println("The minimum number entered in array is "+ min);

//System.out.print();
}
}
