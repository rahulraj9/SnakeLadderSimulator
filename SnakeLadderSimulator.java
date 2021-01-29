public class SnakeLadderSimulator {
	private static final int LADDER = 1;
	private static final int SNAKE = 2;
	
	public static void main(String[] args){
		Random random = new Random();
		
		int diceRolling = random.nextInt(6) + 1;		
		int optionForPlaying = random.nextInt(3);
		int position = 0;
		
		System.out.println("Previous Position: "+position);
		
		switch(optionForPlaying){
		case LADDER :
			position += diceRolling;
			break;
		case SNAKE :
			position -= diceRolling;
			break;
		default :
			System.out.println("You Are In NOPLAY");
		}
		
		System.out.println("Dice Face: "+diceRolling);
		System.out.println("New Position: " +position);
	}}

