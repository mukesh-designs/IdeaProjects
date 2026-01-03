import java.util.*;

//Write a function that takes in the radius as input and returns the circumference of a circle.

public class Ques4 {
    public static double circumCircle(int r){
        return (2*r*22)/7;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.println(circumCircle(r));
        sc.close();
    }
}
