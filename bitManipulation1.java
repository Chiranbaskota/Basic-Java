//Program to get bit at a position (postion must be given from backward)
public class bitManipulation1
{
public static void main(String[] args)
{
    //we can also write code for the position taken from forward but for that different code required for different digit number
    //so we always write code for postion taken from backward
    int a=20;// binary of 20 is 10100
    int pos=2;
    int bitMask=1<<pos;
    if((a&bitMask)==0){
        System.out.println("The bit is zero");

    }
    else{
        System.out.println("The bit is one");
    }
   
    

}
}