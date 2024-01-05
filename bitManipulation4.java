//update the bit 
public class bitManipulation4
{
public static void main(String[] args)
{
    int a=10;//binary of 10 is 1010
    int pos=2;
    int bitMask;
    bitMask=1<<pos;
    //alternative method for bit update or complement or toggle
    System.out.println(a^bitMask);

    //get bit
    if((a&bitMask)!=0){
   //clear bit
   int result1;
   result1=(~bitMask)&a;
   System.out.println(result1);
    }
    else{
    //set bit    
        int result2;
        result2=bitMask|a;
        System.out.println(result2);
    }

//System.out.print();
}
}