import java.util.*;
// Print all divisors - log(n)

public class Quest5A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i*i<=n; i++){
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
