package Notes;

public class StringComparison {
    public static void main(String[] args) {
        String a = "Ali";
        String b = "Ali";
        // == will check if both the refrence variavbles are pointing toward the same
        // object or not
        System.out.println(a == b); // true
        b = "Raza"; // i am changing the object i am just creating the new object in String pool in
                    // heap
        System.out.println(a == b); /*
                                     * false --> now because both the refrence variables are now pointing toward
                                     * different object
                                     */
        // we can also create object of same value
        String c = new String("Ali");
        String d = new String("Ali");
        System.out.println(c == d);

        // if we want to check the values of string equals or not we can do this
        System.out.println(c.equals(d));
    }

}
