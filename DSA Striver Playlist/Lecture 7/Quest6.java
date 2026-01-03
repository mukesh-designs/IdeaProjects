import java.util.*;

//Check prime Number or not

public class Quest6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for(int i=2; i*i <n; i++){
            if(n%i == 0){
                count++;
                if((n%i) != i){
                    count++;
                }
            }
        }
        if(count > 0){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }

        sc.close();
    }
}
