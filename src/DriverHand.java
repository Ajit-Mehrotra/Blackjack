public class DriverHand {
	public static void main (String[] args) {
		System.out.println(testNumberOfCards());
		System.out.println(testNthCard());
		System.out.println(testPrintMethod());

	}
	public static String testNumberOfCards () {
		Hand TEST = new Hand();
		PlayingCard one = new PlayingCard();
		boolean I = false;
		String test = ""; 
		int i = 4000;
		for( int counter = 0; counter < i; counter++ ) {
			TEST.addCard(one);
			
			I  = TEST.getArrayList().size() ==  TEST.numberOfCards();
		}
		test = "****NUMBEROFCARDS Method Works**** : " + I;
		return test;

	}

	public static String testNthCard () {
		Hand rightHand = new Hand();
		Hand leftHand = new Hand();
		PlayingCard ex1 = new PlayingCard();
		PlayingCard ex2 = new PlayingCard();
		boolean I = false;
		String test = ""; 
		int i = 100;
		for( int counter = 0; counter < i; counter++ ) {
			rightHand.addCard(ex1);
			leftHand.addCard(ex2);
			if ((rightHand.getArrayList().get(counter) ==  rightHand.nthCard(counter)) && (leftHand.getArrayList().get(counter) ==  leftHand.nthCard(counter))  ) {
				//System.out.println("Expected Values: " + rightHand.getArrayList().get(counter));
				//System.out.println("Output Values: " + rightHand.nthCards(counter) + "\n\n");
				I = true;
			}

			else
				I = false;
		}
		test = "****NTHCARDS Method Works**** : " + I;
		return test;

	}

	public static String testPrintMethod () {
		Hand TEST = new Hand();
		//System.out.println("INITIAL VAL: " + TEST.print1());
		PlayingCard one = new PlayingCard();
		boolean I = false;
		String test = ""; 
		String a = "";

		int i = 2;
		for( int counter = 0; counter < i; counter++ ) {
			one = new PlayingCard();
			TEST.addCard(one);	
		}
		
		for( Object PlayingCard: TEST.getArrayList()) {
			a += PlayingCard;
		}
		
		if (a.equals(TEST.print1())) {
			//System.out.println("Expected Values: " + a);
			//System.out.println("Output Values: " + TEST.print1() + "\n\n");
			I = true;
		} else {
			I = false;
		}

		test = "****PrintMethod Method Works**** : " + I;
		return test;

	}

}
