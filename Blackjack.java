import java.util.Scanner;

public class Blackjack {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scanner.nextLine();

        int userWinsCount = 0;
        int dealerWinsCount = 0;
        
        while (true) {
            int userCardNumber1 = BlackjackFunctions.drawRandomCard();
            int userCardNumber2 = BlackjackFunctions.drawRandomCard();
            int userHandValue = userCardNumber1 + userCardNumber2;

            System.out.println("\nYou get a\n" + GetCardString.cardString(userCardNumber1) + "\nand a\n" + GetCardString.cardString(userCardNumber2));
            
            System.out.println("Your total is: " + userHandValue);
            boolean isContinue = BlackjackFunctions.isBust(userHandValue);
            
            if (!isContinue) {
                dealerWinsCount++;
            }

            if (isContinue) {
                int dealerCard1 = BlackjackFunctions.drawRandomCard();
                int dealerCard2 = BlackjackFunctions.drawRandomCard();
                int dealerHandValue = dealerCard1 + dealerCard2;

                System.out.println("\nThe dealer shows \n" + GetCardString.cardString(dealerCard1) + "\nand has a card facing down\n" + GetCardString.faceDown());

                while (userHandValue < 21) {
                    String isHitOrStay = BlackjackFunctions.hitOrStay(scanner);

                    if (isHitOrStay.equals("stay")) {
                        break;
                    } else if (isHitOrStay.equals("hit")) {
                        int nextCard = BlackjackFunctions.drawRandomCard();
                        userHandValue += nextCard;

                        System.out.println("\nYou get a\n" + GetCardString.cardString(nextCard) + "\nYour new total is " + userHandValue);
                        isContinue = BlackjackFunctions.isBust(userHandValue);

                        if (!isContinue) {
                            dealerWinsCount++;
                            break;
                        }
                    }  
                }

                if (isContinue) {
                    System.out.println("\nDealer's turn");
                    System.out.println("\nThe dealer's cards are\n" + GetCardString.cardString(dealerCard1) + "\nand a\n" + GetCardString.cardString(dealerCard2));
                    System.out.println("\nDealers total is " + dealerHandValue);

                    while (true) {
                        if (dealerHandValue > 21) {
                            System.out.println("Bust! Dealer loses.");
                            userWinsCount++;
                            isContinue = false;
                            break;
                        }

                        if (dealerHandValue < 17 || dealerHandValue < userHandValue) {
                            scanner.nextLine();
                            int newDealerCard = BlackjackFunctions.drawRandomCard();
                            dealerHandValue += newDealerCard;
                            System.out.println("\nDealer gets a\n" + GetCardString.cardString(newDealerCard) + "\nDealer's total is " + dealerHandValue);
                        } else {
                            break;
                        }

                    }

                    if (isContinue) {
                        if (userHandValue > dealerHandValue) {
                            System.out.println("User wins!");
                            userWinsCount++;
                        } else if (userHandValue == dealerHandValue) {
                            System.out.println("It's a tie!");
                        } else {
                            System.out.println("Dealer wins!");
                            dealerWinsCount++;
                        }
                    }

                }

            }

            System.out.println("\nUsers wins: " + userWinsCount + " - Dealers wins: " + dealerWinsCount );
            
            System.out.println("\nWant to play a new game?");
            String isNewGame = "";

            while (!isNewGame.equals("new") && !isNewGame.equals("quit")) {
                System.out.print("Type 'new' to play  and 'quit' to quit: ");
                isNewGame = scanner.nextLine();
            }

            if (isNewGame.toLowerCase().equals("quit")) {
                break;
            }
        }
        scanner.close();
        System.out.println("\nGoodbye!\n");
    }
}