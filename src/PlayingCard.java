import java.util.Scanner;
// suits are SPADES, CLUBS, HEARTS, AND DIAMONDS
// 	 Values are Ace, 2-10, Jack, Queen, King
public class PlayingCard {
	private int suit;
	private int value;

	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;

	public static final int CLUBS = 1;
	public static final int DIAMONDS = 2;
	public static final int HEARTS = 3;
	public static final int SPADES = 4;
	private static boolean random = true;


	PlayingCard(int suit1, int value1) {
		suit = suit1;
		value = value1;
	}

	// If random = true, then random values are assigned to suit and value
	// If random  = false, code queries user for the suit and face value
	PlayingCard() {
		if (random) {
			value = (int) (Math.random() * 13 + 1);
			suit = (int) (Math.random() * 4 + 1);
			//  System.out.println(value);
			// System.out.println(suit);
		} else {
			Scanner suitIn = new Scanner(System.in);
			System.out.println("Enter your SUIT. "
					+ "Type the cooresponding Numbers"
					+ " for the SUITS: CLUBS (1), DIAMNODS (2),"
					+ " HEARTS (3), SPADES (4): ");
			suit = suitIn.nextInt();
			//System.out.println(suit);
			Scanner valueIn = new Scanner(System.in);
			System.out.println("Enter your VALUE. "
					+ "Type the cooresponding Numbers "
					+ "for the VALUES: ACE (1), 2-10, JACK (11),"
					+ " QUEEN (12), KING (13): ");
			value = valueIn.nextInt();
			//System.out.println(value);
		}
	}

	public String toString() {
		String nameOfCard = "";
		String suitOfCard = "";
		String valueOfCard = "";


		//finds value of value
		if (value == ACE) {
			valueOfCard = "A";
		} else if (value == JACK) {
			valueOfCard = "J";
		} else if (value == QUEEN) {
			valueOfCard = "Q";
		} else if(value == KING) {
			valueOfCard = "K";
		} else {
			valueOfCard += value ;
		}

		//finds the suit of suit
		if (suit == SPADES) {
			suitOfCard = "SPADES";
		} else if (suit == DIAMONDS) {
			suitOfCard = "DIAMONDS";
		} else if (suit == HEARTS) {
			suitOfCard = "HEARTS";
		} else {
			suitOfCard = "CLUBS";
		}
		nameOfCard = valueOfCard + " of " + suitOfCard;
		return nameOfCard;
	}

	public int getSuit() {
		return suit;
	}

	public int getValue() {
		return value;
	}

	public static void setRandom(boolean a) {
		if (a) random = true;
		else random = false;
	}

	public static void main(String[] args) {
		PlayingCard yeet = new PlayingCard();

	}
}
