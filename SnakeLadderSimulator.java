public class SnakeLadderSimulator {
	private static final int LADDER = 1;
	private static final int SNAKE = 2;
	private static final int NO_PLAY = 0;

	public static void main(String[] args) {

		int position = 1;
		int noOfDiceThrow = 0;

		System.out.println("PREVIOUSPOSITION\tDICEROLLING\tPLAYINGOPTION\tNEWPOSITION\n");

		while(position < 100)
		{
			noOfDiceThrow++;
			Random random = new Random();

			int diceRolling = random.nextInt(6) + 1;
			int optionForPlaying = random.nextInt(3);

			System.out.print(position+" \t\t\t");
			System.out.print(diceRolling+"\t\t");

			switch(optionForPlaying){
			case LADDER :
				position += diceRolling;
				if(position > 100) {
					position -=diceRolling;
					System.out.print("Required:" +(100-position)+"\n" );
				}
				else
				System.out.print("Ladder\t\t"+position+"\n");
				break;

			case SNAKE :
				position -= diceRolling;
				if(position < 0)
					position = 0;
				System.out.print("Snake\t\t"+position+"\n");
				break;

			case NO_PLAY:
				System.out.print("No-play\t\t"+position+"\n");

			default :

			}
		}
		System.out.println("Player reach to exact position:- " +position+" and won after throwing the dice:- "+noOfDiceThrow+" times");
	}

}

