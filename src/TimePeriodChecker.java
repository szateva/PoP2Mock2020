import java.io.*;
import java.util.*;

public class TimePeriodChecker {
    public static void main( String[] args )    {
        String s = "";
        String snippet = "";

        String[] t2 = { "122h 0m", "6h 3m", "5h 57m" };

        for( int i = 0; i < 3; i++ )
        {
            if( i == 0 ) {
                snippet = "{ \n  TimePeriod t = new TimePeriod( 60, 60 );\n  t.scale( 2 );\n  s = t.toString();\n}";
                {
                    TimePeriod t = new TimePeriod( 60, 60 );
                    t.scale( 2 );
                    s = t.toString();
                }
            }
            if( i == 1 ) {
                snippet = "{ \n  TimePeriod t = new TimePeriod( 0, 121 );\n  t.scale( 3 );\n  s = t.toString();\n}";
                {
                    TimePeriod t = new TimePeriod( 0, 121 );
                    t.scale( 3 );
                    s = t.toString();
                }
            }
            if( i == 2 ) {
                snippet = "{ \n  TimePeriod t = new TimePeriod( 0, 119 );\n  t.scale( 3 );\n  s = t.toString();\n}";
                {
                    TimePeriod t = new TimePeriod( 0, 119 );
                    t.scale( 3 );
                    s = t.toString();
                }
            }


            if( !s.equals( t2[i]))
            {
                System.out.println( "---- On code snippet:" );
                System.out.println( snippet );
                System.out.println( "---- Expected value of String s:" );
                System.out.println( t2[i] );
                System.out.println( "---- Actual value of String s:" );
                System.out.println( s );
                return;
            }
        }
        System.out.println( "Passed all tests." );

    }
}