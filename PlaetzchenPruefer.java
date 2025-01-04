public class PlaetzchenPruefer {

    static int triedPlaetzchen = 0;
    static int toTry;


    public static void main(String[] args) {

        // Declare how many Plaetzchen will be tested
        String userInput = args[0];

        // Convert the user input from String to int
        try {
            toTry = Integer.parseInt(userInput);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }


        // Call the method and hand over the amount of Plaetzchen to try

        // Simple cases
        if ( toTry == 0 ) {
            // Case 1: Returns zero Plaetzchen tried because there are none
            System.out.println(toTry);
        }

        else if ( toTry == 1 ) {
            // Case 2: Returns one Plaetzchen tried to the main method
            System.out.println(toTry);
        }
        else
            // Call recursive method pruefePlaetzchen and hand over the number of Plaetzchen to try
            pruefePlaetzchen(toTry);
    }


    public static int pruefePlaetzchen(int anzahlPlaetzchen) {


        // Strategy
        if (anzahlPlaetzchen % 2 == 0) {
            // Case 3: If number of Plaetzchen is even
            int x = anzahlPlaetzchen - 2;
            int y = x / 2;
            anzahlPlaetzchen = y;

            // Increase number if tried Plaetzchen by 2
            if (triedPlaetzchen != 0)
                triedPlaetzchen += 2;
            else
                triedPlaetzchen = 2;

        } else {
            // Case 4: If number of Plaetzchen is odd
            int z = anzahlPlaetzchen - 1;
            anzahlPlaetzchen = z;

            // Increase number of tried Plaetzchen by 1
            if (triedPlaetzchen != 0)
                triedPlaetzchen += 1;
            else
                triedPlaetzchen = 1;

        }


        if ( anzahlPlaetzchen != 0) {
            // Recursive call until no more Plaetzchen are left
            pruefePlaetzchen(anzahlPlaetzchen);
        }

        // Returns the amount of tried Plaetzchen
        if ( anzahlPlaetzchen == 0 ) {
            anzahlPlaetzchen = triedPlaetzchen;
            System.out.println(triedPlaetzchen);
        }

        return anzahlPlaetzchen;
    }



}