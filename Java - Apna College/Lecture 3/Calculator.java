import java.util.*;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter Operator: ");
        char op = sc.next().charAt(0);

        switch(op){
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            default:
            System.out.println("Invalid Selection");
        }
        sc.close();
    }
}
