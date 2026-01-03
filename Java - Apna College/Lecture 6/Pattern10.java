import java.util.*;

//Print Below Pattern -- Butterfly Pattern
/*
*                 * 
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * *     * * * * 
* * *         * * *
* *             * *
*                 *
*/

public class Pattern10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=2*n; i++){
            for(int j=1; j<= 2*n; j++){
                if(((j <= i) || (j >= (2*n)+1-i)) && ( (j<=(2*n)+1-i) || (j>=i))){
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
