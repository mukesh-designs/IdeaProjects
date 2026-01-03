import java.util.*;

// Print Prime factors of a number - O(sqrtn*2*sqrtn)

public class primeFactors {
    public static boolean checkPrime(int n){
        int count=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                count++;
                if((n/i)!=i){
                    count++;
                }
            }
        }
        if(count>0){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i*i<=n; i++){
            if(n%i == 0){
                if(checkPrime(i))
                list.add(i);
                if((n/i) != i){
                    if(checkPrime(n/i))
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);

        sc.close();
    }
}
