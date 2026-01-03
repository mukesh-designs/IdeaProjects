import java.util.*;

//Update Bit

public class Bits4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int pos = 1;
        int operation = sc.nextInt(); //operation == 1, Set. operation == 0, clear.
        int BitMask = 1<<pos;

        if(operation == 1){
            int ans = (n|BitMask);
            System.out.println(ans);
        }else{
            int notBitMask = ~BitMask;
            int ans = (n & notBitMask);
            System.out.println(ans);
        }

        sc.close();
    }
}
