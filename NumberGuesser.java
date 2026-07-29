public class NumberGuesser {
    public static void main(String[] args) {

        int secret = 1;
        System.out.println("Our secret is " + " " + secret);
        int[] guesses = { 3, 9, 5, 7, 1 };
        int counter = 0;
        int attempts = 1;
        // System.out.println(counter > guesses.length);
        while (counter < guesses.length) {
            // System.out.println("attempts" + " " + attempts + " " + "guesses" + " " + guesses[counter]);
            if (guesses[counter] == secret) {
                // System.out.println("Found the secret at " + attempts + " attempts");
                break;
            }
            attempts++;
            counter++;
        }
        System.out.println( "Outside of while:" + " " + "attempts" + " " + attempts + " " + "guesses" + " " + guesses[counter]);
    }
}
