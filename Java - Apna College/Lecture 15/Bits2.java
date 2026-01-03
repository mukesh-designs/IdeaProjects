import java.util.*;

//Set Bit

public class Bits2 {
    public static void main(String args[]){
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        int ans = (n|bitMask);
        System.out.println(ans);
    }
}
