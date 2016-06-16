
public enum Roshambo {
	ROCK, PAPER, SCISSORS;

	public static String move1;
	public static String move2;
	
	
	
public String compareMoves (String move1, String move2){
	

	if (move1.equalsIgnoreCase(move2)){
		return "Tie!";
	}
	
	if (move1.equalsIgnoreCase("Rock")&&(move2.equalsIgnoreCase("Scissors")) ||
			move1.equalsIgnoreCase("Scissors")&& (move2.equalsIgnoreCase("Rock"))){
		return "Rock wins.";
	}
	
	if (move1.equalsIgnoreCase("Rock")&&(move2.equalsIgnoreCase("Paper"))  ||
			move1.equalsIgnoreCase("Paper")&&(move2.equalsIgnoreCase("Rock")) ){
		return "Paper wins.";
	}
	
	if (move1.equalsIgnoreCase("Scissors")&&(move2.equalsIgnoreCase("Paper"))  ||
			move1.equalsIgnoreCase("Paper")&&(move2.equalsIgnoreCase("Scissors")) ){
		return "Scissors wins.";
	}
	
	return "";
	

}
}

