public class Decomposable {

    public static boolean decomposable( String[] a, String s )
    {
        return false;
    }
    public static void main(String[] args) {
        String a[] = { "pom", "pom", "mop", "ping", "pong" };
        System.out.println( decomposable( a, "mopping" ));
        System.out.println( decomposable( a, "pompom" ));
        System.out.println( decomposable( a, "pingpong" ));
    }
}
