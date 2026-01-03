

public class TypeConversionandCasting {
    public static void main(String args[]) {
        byte b = 127;
        int a = b;

        int c = 257;
        byte k = (byte)c;

        float f = 5.6f;
        int t = (int)f;

        System.out.println(a);
        System.out.println(k);
        System.out.println(t);

        byte num1 = 10;
        byte num2 = 30;
        int result = num1*num2;
        System.out.println(result);

    }
}
