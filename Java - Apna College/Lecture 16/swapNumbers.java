import java.util.*;

//Swap 2 Number

public class swapNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //Operations to SWAP
        a = a+b;
        b = a-b;
        a = a-b;

        //After SWAP
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}
