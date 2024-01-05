public class bufferfly
{
public static void main(String[] args)
{
    //upper part
    for(int i=1; i<=4; i++){

    //left part
    for(int j=1; j<=i; j++){
        System.out.print("*");
    }

    //blank space
    int space=(2*(4-i));
    for(int j=1; j<=space; j++){
    System.out.print(" ");

    }

    //right part
    for(int j=1; j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
    }

    //lower part
    for(int i=4; i>=1; i--){
        //left part
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }

        //blank space
        int space=(2*(4-i));
        for(int j=1; j<=space; j++){
            System.out.print(" ");
        }

        //right part
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();

    }
//System.out.print();
}
}
