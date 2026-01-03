import java.util.*;

//Print all divisors

public class printDivisors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                System.out.print(i+" ");
            }
        }
         */
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i*i<=n; i++) {
            if(n%i == 0){
                list.add(i);
                if((n/i) != i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
        
        sc.close();
    }
}
