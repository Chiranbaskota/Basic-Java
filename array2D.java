import java.util.*;
public class array2D
{
public static void main(String[] args)
{
    //Entering the number of rows and columns from user
int rows,columns;
System.out.println("Enter the number of rows you want");

Scanner sc=new Scanner(System.in);
rows=sc.nextInt();
System.out.println("Enter the number of columns you want");
columns=sc.nextInt();

   //declaring 2D array
int number[][]=new int[rows][columns];

  //Taking elements of array as inputs form the user 
  System.out.println("Enter the elements for 2D array");
for(int i=0; i<rows; i++){
    for(int j=0; j<columns; j++){
        number[i][j]=sc.nextInt();
    }
}

  //Displaying the elements taken form the users
    System.out.println("The entered elements form the users are : ");
  for(int i=0; i<rows; i++){
    for(int j=0; j<columns; j++){
        System.out.print(number[i][j]+" ");
    }
    System.out.println();
  }

   //To search for the number in the 2D array
  /*int num,check=0;
  System.out.println("Enter the number you want to search in array");
  num=sc.nextInt();
  for(int i=0; i<rows; i++){
    for(int j=0; j<columns; j++){
        if(num==number[i][j]){
            System.out.println(num+"found at location ("+i+","+j+")");
         check++;
        }
        break;
    }
  }
  if(check==0){
    System.out.println("The entered number is not found ");
  }*/

  //To transpose the matirx
  System.out.println("The transpose of entered matrix is ");
  for(int i=0; i<columns; i++){
    for(int j=0; j<rows; j++){
        System.out.print(number[j][i] + " ");
    }
    System.out.println();
  }

//System.out.print();
}
}
