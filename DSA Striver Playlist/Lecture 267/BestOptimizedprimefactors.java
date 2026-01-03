import java.util.*;

// Print Prime factors of a number - O(sqrtn*logn)

public class BestOptimizedprimefactors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                list.add(i);
                while(n%i == 0)
                n = n/i;
            }
        }
        if(n != 1) list.add(n);
        System.out.println(list);

        sc.close();
    }
}
