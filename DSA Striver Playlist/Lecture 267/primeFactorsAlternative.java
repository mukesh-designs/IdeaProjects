import java.util.*;

// Print Prime factors of a number - O(n)

public class primeFactorsAlternative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(n%i == 0){
                list.add(i);
                while(n%i == 0)
                n=n/i;
            }
        }
        System.out.println(list);

        sc.close();
    }
}
