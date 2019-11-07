import java.util.Scanner;
public class HumanBlackjackPlayer extends BlackjackPlayer{
	public boolean hit(BlackjackHand dealerHand, BlackjackHand playerHand){
		System.out.print("Dealer's Hand: ");
		dealerHand.print();
		System.out.print("PlayerHand's Hand: ");
		playerHand.print();
		Scanner input = new Scanner(System.in);
		String hit1 = "";
		do{
			System.out.println("Do you want to hit? ");
			System.out.println("Type \"yes\" for positive response and \"no\" for a negative response");
			 hit1 = input.next();
		}
		while(!(hit1.equals("yes")|| hit1.equals("no")));
		
		if(hit1.equals("yes"))
			return true;
		else
			return false;


		

		
	}
	public void dealerHit(BlackjackHand dealerHand) {
		System.out.print("Dealer's Hand:");
		dealerHand.print();
		System.out.println("The dealer has hit you.");
	}


	public void playerBusts(BlackjackHand playerHand) {
		System.out.print("Player's Hand:");
		playerHand.print();
		System.out.println("You are busted. Unfortunate.");
		
	}


	public void playerTies(BlackjackHand playerHand, BlackjackHand dealerHand) {
		System.out.print("Dealer's Hand:");
		dealerHand.print();
		System.out.print("\nPlayer's Hand:");
		playerHand.print();
		System.out.println("The Player has tied with the dealer");
		
	}


	public void playerWins(BlackjackHand playerHand, BlackjackHand dealerHand) {
		System.out.print("Dealer's Hand:");
		dealerHand.print();
		System.out.print("\nPlayer's Hand:");
		playerHand.print();
		System.out.println("The Player has won! Congratulations!");
		
	}


	public void dealerBusts(BlackjackHand dealerHand) {
		System.out.print("Dealer's Hand:");
		dealerHand.print();
		System.out.println("The dealer has bust.");
		
	}


	public void dealerWins(BlackjackHand dealerHand, BlackjackHand playerHand) {
		System.out.print("Dealer's Hand:");
		dealerHand.print();
		System.out.print("\nPlayer's Hand:");
		playerHand.print();
		System.out.println("The Dealer has won! Unfortunate for the Player.!");
		
	}
	public static void main (String[] args){
		
	}
}

