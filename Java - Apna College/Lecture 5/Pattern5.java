import java.util.*;

//Print Below Pattern -- Inverted Half Pyramid (Rotated by 180 degree)
/*
        * 
      * *
    * * *
  * * * *
* * * * *
*/

public class Pattern5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j>=n+1-i){
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
