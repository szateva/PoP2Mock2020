import java.util.ArrayList;

public class SumDigits {

    public static int sumDigits( String s )
    {
        int total = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            total += Integer.parseInt("" + s.charAt(i));
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println( sumDigits( "123" ));
        System.out.println( sumDigits( "55555" ));
    }
}
