import java.util.*;

//GCD or HCF

public class Quest7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(a>0 && b>0){
            if(a>b){
                a = a%b;
            }else{
                b = b%a;
            }
        }
        if(a==0){
            System.out.println("GCD: " + b);
        }else {
            System.out.println("GCD: " + a);
        }
        sc.close();
    }
}
