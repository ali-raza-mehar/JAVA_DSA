package Notes;

public class PrettyPrinting {
    public static void main(String[] args) {
        /*
         * after DOT %. it mean how many digit you wanted to print after decimal point
         */
        float a = 123.456789f;
        System.out.printf("Formatted String %.3f", a);

        System.out.println();
        System.out.printf("Pi : %.4f ", Math.PI);

    }

}
