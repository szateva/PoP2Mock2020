public class Decomposable {
    /**
     *
     * loop through the array, create all possible pairs from the strings in the array
     * then check if the newly created pair is equal to the string (a) that is passed in
     *
     */
    public static boolean decomposable( String[] a, String s ) {
        int len = a.length;
        String pair = "";
        Boolean result = null;
        outerloop:
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (a[i] != a[j]) {
                    pair = a[i] + a[j];
                    if (pair.equals(s)) {
                        result =  true;
                        break outerloop;
                    } else result = false;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String a[] = { "pom", "pom", "mop", "ping", "pong" };
        System.out.println( decomposable( a, "mopping" ));
        System.out.println( decomposable( a, "pompom" ));
        System.out.println( decomposable( a, "pingpong" ));
    }
}
