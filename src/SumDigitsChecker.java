import java.io.*;
import java.util.*;

public class SumDigitsChecker {
    public static void main( String[] args )    {
        String s = "";
        String snippet = "";

        String[] t = { "14", "20", "3" };

        for( int i = 0; i < 3; i++ )
        {
            if( i == 0 ) {
                snippet = "{ s = \"\" + SumDigits.sumDigits( \"113315\" ); }";
                { s = "" + SumDigits.sumDigits( "113315" ); }
            }
            if( i == 1 ) {
                snippet = "{ s = \"\" + SumDigits.sumDigits( \"61139\" ); }";
                { s = "" + SumDigits.sumDigits( "61139" ); }
            }
            if( i == 2 ) {
                snippet = "{ s = \"\" + SumDigits.sumDigits( \"1200\" ); }";
                { s = "" + SumDigits.sumDigits( "1200" ); }
            }


            if( !s.equals( t[i]))
            {
                System.out.println( "---- On code snippet:" );
                System.out.println( snippet );
                System.out.println( "---- Expected value of String s:" );
                System.out.println( t[i] );
                System.out.println( "---- Actual value of String s:" );
                System.out.println( s );
                return;
            }
        }
        System.out.println( "Passed all tests." );

    }
}