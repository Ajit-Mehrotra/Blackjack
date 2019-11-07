public class BlackjackDealer{
	public double playBlackjack(BlackjackPlayer player, int numGames) {
		double wins = 0;
		boolean hit;
		for( int counter = 1; counter <= numGames; counter++ ) {

			//created hands for player and dealer
			BlackjackHand handForPlayer = new BlackjackHand();
			BlackjackHand handForDealer = new BlackjackHand();

			// creates one card for Dealer
			PlayingCard cardForDealer = new PlayingCard();

			//Creates two card for the player
			PlayingCard firstCardForPlayer = new PlayingCard();
			PlayingCard secondCardForPlayer = new PlayingCard();

			//Adds one card previously created to the Dealer
			handForDealer.addCard(cardForDealer);

			//Adds two cards previously created to Player
			handForPlayer.addCard(firstCardForPlayer);
			handForPlayer.addCard(secondCardForPlayer);

			//repeatedly calls hit until player stands or busts
			do {

				hit = player.hit(handForDealer, handForPlayer);
				// If the player says yes, then add a random card to hand
				if(hit) {
					PlayingCard newCard = new PlayingCard();
					handForPlayer.addCard(newCard);
				}
				// If the player says no, then hit is set to false, and the loop is broken
				else if(!(hit)) {
					hit = false;
				}
			}while(handForPlayer.handValue() <= 21 && hit);
			// If the player's hand value is greater than 21, then he busts
			if(handForPlayer.handValue() > 21) {
				player.playerBusts(handForPlayer);
			}
			//else if the player's hand is less than or equal to 21
			else if (handForPlayer.handValue() <= 21) {
				PlayingCard newCardForDealer = new PlayingCard();
				handForDealer.addCard(newCardForDealer);
				player.dealerHit(handForDealer);
				while(handForDealer.handValue() < 17) {
					PlayingCard newCardForDealer2 = new PlayingCard();
					handForDealer.addCard(newCardForDealer2);
					player.dealerHit(handForDealer);
				}
				if (handForDealer.handValue() > 21) {
					player.dealerBusts(handForDealer);
					wins++;
				}else if(handForDealer.handValue() > handForPlayer.handValue() ) {
					player.dealerWins(handForDealer, handForPlayer);
				}else if(handForDealer.handValue() == handForPlayer.handValue()) {
					player.playerTies(handForPlayer, handForDealer);
					wins = wins + .5;
				}else if(handForDealer.handValue() < handForPlayer.handValue()) {
					player.playerWins(handForPlayer, handForDealer);
					wins++;

				}
			}

		}
		return wins/numGames;
	}
	public static void main(String[] args) {
		BlackjackDealer Ajit = new BlackjackDealer();
		BlackjackPlayer MsGerb = new HumanBlackjackPlayer();
		System.out.println("Ratio: " + Ajit.playBlackjack(MsGerb, 6));
	}

}

