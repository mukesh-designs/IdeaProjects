import java.util.*;

//Print Below Pattern -- Number Pyramid Pattern
/*
        1
      2   2
    3   3   3
  4   4   4   4
5   5   5   5   5
*/

public class Pattern12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*n-1; j++){
                if((j>=n+1-i) && (j<=n-1+i)){
                    if((i+j)%2!=0){
                        System.out.print("  ");
                    }else{
                        System.out.print(i+ " ");
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
