import java.util.*;

//Print Below Pattern -- Palindromic Pyramid Pattern
/*
        1
      2   2
    3   3   3
  4   4   4   4
5   5   5   5   5
*/

public class Pattern13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=n+1-i){
                    for(int k=i; k>=1; k--){
                        System.out.print(k+" ");
                    }
                }else{
                    System.out.print("  ");
                }
            }
            for(int j=n; j<=2*n-1; j++){
                if(j<=i+n-1){
                    for(int k=2; k<=i; k++){
                        System.out.print(k+" ");
                    }
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
