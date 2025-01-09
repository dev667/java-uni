public class Roman {

    /*
    int I = 1;
    int IV = 4;
    int V = 5;
    int IX = 9;
    int X = 10;
    int XL = 40;
    int L = 50;
    int XC = 90;
    int C = 100;
    int CCC = 300;
    int CD = 400;
    int D = 500;
    int CM = 900;
    int M = 1000;
    */

    static String N = "";


    static String roman(int n) {

        // Declare values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


        for (int i = 0; i < values.length; i++)
            if (n >= values[i]) {
                return numerals[i] + roman(n - values[i]);
            }

        // Base case
        if (n == 0) {
            return N;
        }

        return "";
    }

    public static void main(String[] args) {
        // Behandlung fehlender oder falscher Eingabeparameter
        try {
            // Try to parse the first argument as an int
            int N = Integer.parseInt(args[0]);
            String input = args[0];

            if ( 1 <= N && N <= 5000 ) { // && !input.matches("^0+$") ) {
                // System.out.println(N); // Print if value is assigned right
                System.out.println(roman(N)); // Returns roman String of equivalent argument N
            } else {
                System.out.println("Die Zahl muss zwischen 1 und 5000 liegen.");
                System.exit(2);
            }


        } catch (Exception ex) {
            // If first argument cannot be parsed to int
            System.out.println("Bitte eine Zahl als Parameter angeben.");
            System.exit(2);

        }
    }
}


