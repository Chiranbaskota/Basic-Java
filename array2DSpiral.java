import java.util.*;
public class array2DSpiral
{
public static void main(String[] args)
{
    //Take number of rows and columns form user
    int rows,columns;
    System.out.println("Enter the number of rows for 2D array");
    Scanner sc=new Scanner(System.in);
    rows=sc.nextInt();
    System.out.println("Enter the number of columns for 2D array");
    columns=sc.nextInt();

    //Declaring 2D array 
    int number[][]= new int[rows][columns];

    //Take 2D array form user
    System.out.println("Enter elements for 2D array");
   for(int i=0; i<rows; i++){
    for(int j=0; j<columns; j++){
        number[i][j]=sc.nextInt();
    }
   }

    //Display entered 2D array 
    for(int i=0; i<rows; i++){
        for(int j=0; j<columns; j++){
            System.out.print(number[i][j]+" ");
        }
        System.out.println();
    }

   int row_start=0;
   int column_start=0;
   int row_end=rows-1;
   int column_end=columns-1;

   System.out.println("The spiral order of entered matrix is ");
   while(row_start<=row_end && column_start<=column_end){//or causes over run of the program

    //1

    for(int col=column_start;col<=column_end;col++){
        System.out.print(number[row_start][col]+" ");
    }
    row_start++;

    //2
    for(int r=row_start;r<=row_end;r++){
        System.out.print(number[r][column_end]+" ");
    }
    column_end--;

    //3
    for(int col=column_end; col>=column_start; col--){
        System.out.print(number[row_end][col]+" ");
    }
    row_end--;

    //4
    for(int r=row_end; r>=row_start; r--){
        System.out.print(number[r][column_start]+" ");
    }
    column_start++;
   }



//System.out.print();
}
}