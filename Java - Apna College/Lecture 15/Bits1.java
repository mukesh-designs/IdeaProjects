import java.util.*;

//GetBit

public class Bits1 {
    public static void main(String args[]){
        int n = 5;
        int pos = 3;
        int bitMask = 1<<pos;

        if((n & bitMask) == 0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
    }
}
