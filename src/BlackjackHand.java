public class BlackjackHand extends Hand {
	private int handValue;
	private boolean soft;

	private void computeValue(){
		handValue = 0;
		boolean aces = false;
		soft = false;
		for (int i = 0; i< numberOfCards(); i++){
			if (nthCard(i).getValue() == PlayingCard.KING ||
					nthCard(i).getValue() == PlayingCard.QUEEN ||
					nthCard(i).getValue() == PlayingCard.JACK) {
				handValue += 10; 

			}else {
				handValue += nthCard(i).getValue();
			}
			if(nthCard(i).getValue() == PlayingCard.ACE) {
				aces = true;
			}
		}
		if (aces && handValue < 12){
			handValue+=10;
			soft = true;
		}
	}
	BlackjackHand(){
		super();
		handValue = 0;
		soft = false;

	}
	public int handValue() {
		return handValue;
	}
	public boolean soft() {
		return soft;
	}
	public void addCard(PlayingCard a) {
		super.addCard(a);
		computeValue();
	}
}
