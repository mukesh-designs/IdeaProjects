import java.util.*;

//Clear Bit

public class Bits3 {
    public static void main(String args[]){
        int n = 5;
        int pos = 2;
        int BitMask = 1<<pos;
        int notBitMask = ~BitMask;

        int ans = (notBitMask & n);
        System.out.println(ans);
    }
}
