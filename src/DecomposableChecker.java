import java.io.*;
import java.util.*;

public class DecomposableChecker {
    public static void main( String[] args )    {
        String s = "";
        String snippet = "";

        String[] t = { "true false true", "true true true true false", "false true true false true" };

        for( int i = 0; i < 3; i++ )
        {
            if( i == 0 ) {
                snippet = "{  \n        String a[] = { \"pom\", \"pom\", \"mop\", \"ping\", \"pong\" };\n        s = \"\" + Decomposable.decomposable( a, \"mopping\" );\n        s = s + \" \" + Decomposable.decomposable( a, \"pompom\" );\n        s = s + \" \" + Decomposable.decomposable( a, \"pingpong\" );\n}";
                {
                    String a[] = { "pom", "pom", "mop", "ping", "pong" };
                    s = "" + Decomposable.decomposable( a, "mopping" );
                    s = s + " " + Decomposable.decomposable( a, "pompom" );
                    s = s + " " + Decomposable.decomposable( a, "pingpong" );
                }
            }
            if( i == 1 ) {
                snippet = "{  \n        String a[] = { \"joe\", \"a\", \"aa\", \"ab\", \"b\" };\n        s = \"\" + Decomposable.decomposable( a, \"ajoe\" );\n        s = s + \" \" + Decomposable.decomposable( a, \"baa\" );\n        s = s + \" \" + Decomposable.decomposable( a, \"ab\" );\n        s = s + \" \" + Decomposable.decomposable( a, \"ba\" );\n        s = s + \" \" + Decomposable.decomposable( a, \"baab\" );\n}";
                {
                    String a[] = { "joe", "a", "aa", "ab", "b" };
                    s = "" + Decomposable.decomposable( a, "ajoe" );
                    s = s + " " + Decomposable.decomposable( a, "baa" );
                    s = s + " " + Decomposable.decomposable( a, "ab" );
                    s = s + " " + Decomposable.decomposable( a, "ba" );
                    s = s + " " + Decomposable.decomposable( a, "baab" );
                }
            }
            if( i == 2 ) {
                snippet = "{  \n        String a[] = { \"joe\", \"\", \"aa\", \"ab\", \"b\" };\n        s = \"\" + Decomposable.decomposable( a, \"ajoe\" );\n        s = s + \" \" + Decomposable.decomposable( a, \"baa\" );\n        s = s + \" \" + Decomposable.decomposable( a, \"ab\" );\n        s = s + \" \" + Decomposable.decomposable( a, \"ba\" );\n        s = s + \" \" + Decomposable.decomposable( a, \"aa\" );\n}";
                {
                    String a[] = { "joe", "", "aa", "ab", "b" };
                    s = "" + Decomposable.decomposable( a, "ajoe" );
                    s = s + " " + Decomposable.decomposable( a, "baa" );
                    s = s + " " + Decomposable.decomposable( a, "ab" );
                    s = s + " " + Decomposable.decomposable( a, "ba" );
                    s = s + " " + Decomposable.decomposable( a, "aa" );
                }
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