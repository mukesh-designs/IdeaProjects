import java.util.*;

//Print Below Pattern -- Diamond Pattern
/*
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        * 
*/

public class Pattern14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=2*n; i++){
            for(int j=1; j<=2*n-1; j++){
                if((j>=n+1-i) && (j<=n-1+i) && (i<=j+n-1) && (j<=3*n-i)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
