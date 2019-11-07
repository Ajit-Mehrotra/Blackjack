import java.util.ArrayList;

public class Hand {
	private ArrayList <PlayingCard> playingCardObject; 
	Hand(){
		playingCardObject = new ArrayList <PlayingCard>();
	}
	public int numberOfCards() {
		int numberOfCards = playingCardObject.size();
		return numberOfCards;
	}
	public PlayingCard nthCard(int n){
		return playingCardObject.get(n);
	}
	public void print () {
		for( Object PlayingCard: playingCardObject)
			System.out.println(PlayingCard);
	}
	public void addCard ( PlayingCard newCard) {
		playingCardObject.add(newCard);
	}
	//Extra methods for Drivers
	public ArrayList<PlayingCard> getArrayList() {
		return playingCardObject;
	}
	public String print1() {
		String test = "";
		for( Object PlayingCard: playingCardObject)
			test += PlayingCard;
		return test;
	}

}
