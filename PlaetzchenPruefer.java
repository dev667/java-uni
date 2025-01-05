public class PlaetzchenPruefer {

    static int triedPlaetzchen = 0;
    static int toTry;


    public static void main(String[] args) {

        // Convert the user argument from String to int
        try {
            toTry = Integer.parseInt(args[0]);
            if (toTry < 0)
                throw new IllegalArgumentException();

	        // Call recursive method pruefePlaetzchen and hand over the number of Plaetzchen to try
            int result = pruefePlaetzchen(toTry);
            System.out.println(result);


        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid input. Please enter a valid number.");
            System.exit(2);
        }

    }


    public static int pruefePlaetzchen(int anzahlPlaetzchen) {

        // Strategy
        if ( anzahlPlaetzchen == 0) {
            // Case 1: Returns zero Plaetzchen tried because there are none 
            // or returns the all tried Plaetzchen adding zero
            return triedPlaetzchen;
        }


        if ( anzahlPlaetzchen == 1) {
            // Case 2: Returns one Plaetzchen tried
            // or returns all Plaetzchen tried adding 1
            return triedPlaetzchen += 1;
        }

        if (anzahlPlaetzchen % 2 == 0) {
            // Case 3: If number of Plaetzchen is even


            // Increase number of tried Plaetzchen by 2
            triedPlaetzchen += 2;

            // Recursive call and divide the stack by two
            pruefePlaetzchen( (anzahlPlaetzchen - 2) / 2 );


        } else {
            // Case 4: If number of Plaetzchen is odd
            

            // Increase number of tried Plaetzchen by 1
            triedPlaetzchen += 1;

            //Recursive call and remove one tried Plaetzchen
            pruefePlaetzchen(anzahlPlaetzchen - 1);
        }

        
        // Returns the amount of tried Plaetzchen
        return triedPlaetzchen;
	
    }
}
