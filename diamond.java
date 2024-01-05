public class diamond
{
public static void main(String[] args)
{
    //upper part
    for(int i=1; i<=4; i++){
    //spaces
    for(int j=1; j<=4-i; j++){
        System.out.print(" ");
    }
    //left part
    for(int j=1; j<=i; j++){
        System.out.print("*");
    } 
    //right part
    for(int j=2; j<=i; j++){
        System.out.print("*");
    }   
    System.out.println();
    }

    //lower part
    for(int i=1; i<=4; i++){
        //blank space
    for(int j=1; j<=i-1; j++){
        System.out.print(" ");
    }
        //left part
    for(int j=4; j>=i; j--){
       System.out.print("*");
    }
        //right part
    for(int j=4; j>=i+1; j--){
       System.out.print("*");
    }
    System.out.println();
    }
//System.out.print();
}
}