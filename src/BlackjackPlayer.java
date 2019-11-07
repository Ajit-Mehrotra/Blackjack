
public abstract class BlackjackPlayer {
	//The purpose of hit is to allow the player to decide whether or not to hit.
	public abstract boolean hit(BlackjackHand dealerHand, BlackjackHand playerHand);
	//The purpose of hit is to allow the player to decide whether or not to hit.
	//Note that the hit and the dealerHit methods do not actually add cards to the hand, only pass information to and from the player.
	public abstract void dealerHit(BlackjackHand dealerHand);
	public abstract void playerBusts(BlackjackHand playerHand);
	public abstract void playerTies(BlackjackHand playerHand, BlackjackHand dealerHand);
	public abstract void playerWins(BlackjackHand playerHand, BlackjackHand dealerHand);
	public abstract void dealerBusts(BlackjackHand dealerHand);
	public abstract void dealerWins(BlackjackHand dealerHand, BlackjackHand playerHand);
	
}
