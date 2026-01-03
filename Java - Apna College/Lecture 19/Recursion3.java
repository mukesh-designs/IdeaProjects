import java.util.*;

// Place tiles of size 1*m in a floor of size n*m.

public class Recursion3 {
    public static int placeTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        //Vertically
        int vertPlacements = placeTiles(n-m, m);

        //Horizontally
        int horPlacements = placeTiles(n-1, m);

        return vertPlacements+horPlacements;
    }
    public static void main(String args[]){
        int n = 4, m = 2;
        placeTiles(n, m);
        System.out.println(placeTiles(n, m));
    }
}
