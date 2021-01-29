public class SnakeLadderSimulator {
	private static final int LADDER = 1;
	private static final int SNAKE = 2;
	private static final int NO_PLAY = 0;
	private static final int PLAYER_1 =1;
	private static final int PLAYER_2 =2;

	public static int Ladder(int diceRolling,int position,int turn) {
		position += diceRolling;
		if(position > 100) {
			position -= diceRolling;
		}
		System.out.println("LADDER::::::Dice Face:- " +diceRolling +"::::Player Position:- "+position+"::::Turn"+turn);
		return position;
	}
	public static int Snake(int diceRolling,int position,int turn) {
		position -= diceRolling;
		if(position < 0) {
			position = 0;
		}
		System.out.println("Snake::::::Dice Face:- " +diceRolling +"::::Player Position:- "+position+"::::Turn"+turn);
		return position;
	}
	public static void turn()
	{

	}
	public static void main(String[] args)
	{
		Random random = new Random();
		int player1Position = 0;
		int player2Position = 0;
		//int turn = 0;
		int noOfDiceThrow =0;
		while(player1Position < 10 && player2Position < 10)
		{
			noOfDiceThrow++;
			int randomlyChooseturn = random.nextBoolean() ? PLAYER_1 : PLAYER_2;
			//System.out.println(randomlyChooseturn);
			int optionForPlaying = random.nextInt(3);
			int diceRolling = random.nextInt(6) + 1;

			switch(optionForPlaying)
			{
				case LADDER :
					if(randomlyChooseturn == PLAYER_1)
					{
						player1Position = Ladder(diceRolling, player1Position,randomlyChooseturn);
					}
				else
					player2Position = Ladder(diceRolling, player2Position,randomlyChooseturn);
					break;
				case SNAKE :
					if(randomlyChooseturn == PLAYER_1)
					{
						player1Position = Snake(diceRolling, player1Position,randomlyChooseturn);
					}
				else
					player2Position = Snake(diceRolling, player2Position,randomlyChooseturn);
					break;
				case NO_PLAY:
					System.out.println("No Play" +randomlyChooseturn);
					default:

			}
		}
		System.out.println("No Of Times Dice Throw:- " +noOfDiceThrow);
		if(player1Position == 5)
			System.out.println("player1 win");
		else
			System.out.println("player2 win");
	}

}

