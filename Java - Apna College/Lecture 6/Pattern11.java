import java.util.*;

//Print Below Pattern -- Solid Rhombus Pattern
/*
        * * * * *   
      * * * * *
    * * * * *
  * * * * *
* * * * *
*/

public class Pattern11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*n; j++){
                if((j>=n+1-i) && (j<=2*n-i)){
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
