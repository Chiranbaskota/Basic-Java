import java.util.Scanner;
public class arrayProblems3
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
    int temp=0;
    for(int i=0; i<size-1;i++){
        if(number[i]>number[i+1]){
            temp++;
        }

    }
    if(temp==0){
        System.out.println("The entered array is sorted in ascending order.");
    }
    else{
        System.out.println("The entered array is not sorted in ascending order");
    }

//System.out.print();
}
}
