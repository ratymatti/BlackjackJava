import java.util.Scanner;

public class BlackjackFunctions {
    /**
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */

    public static String hitOrStay(Scanner scanner) {
        System.out.print("hit or stay? ");
        String userOption = scanner.nextLine();

        while (!userOption.equals("hit") && !userOption.equals("stay")) {
            System.out.print("Please write 'hit' or 'stay' ");
            userOption = scanner.nextLine();
        }
        return userOption;
    }
    
    /** 
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns it as int.
     */

    public static int drawRandomCard() {
       double randomCardNumber = Math.random() * 13 + 1;
       return (int)randomCardNumber;
    }

    /**
     * Function name - isBust
     * @param userHandValue
     * @return boolean
     * 
     * Inside the function:
     *    1. Initializes boolean variabe bust as true  
     *    2. Checks that users hand is not bigger than 21
     *    3. Sets bust to be false if it is
     *    4. Returns bust       
     */

    public static boolean isBust(int userHandValue) {
        boolean bust = true;
        if (userHandValue > 21) {
            System.out.println("Bust! Player loses");
            bust = false;
        }
        return bust;
    }
}