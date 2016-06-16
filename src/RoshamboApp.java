import java.util.Scanner;

public class RoshamboApp {

	public RoshamboApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		boolean keepPlaying = true;
		boolean keepChoosing = true; 
		boolean keepChoosing2 = true;
		int tieCount = 0;
		int winCount = 0;
		int lossCount = 0;
		String oppChoice = "";
		String opp = "";
		String choice = "";
		
		Tiger newTiger = new Tiger();
		Lion newLion = new Lion();
		Bear newBear = new Bear();		
		
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println("Please enter your name: ");
		String name = reader.nextLine();
		
		while (keepPlaying){
			
		while (keepChoosing){
			
	
		System.out.println("Would you like to play against Tiger, Lion, or Bear?");
		opp = reader.nextLine();
		
			
			if (opp.equalsIgnoreCase("Tiger")){
				oppChoice = newTiger.getRoshambo();
				keepChoosing = false; 
				}
			
			else if (opp.equalsIgnoreCase("Lion")){
				oppChoice = newLion.getRoshambo();
				keepChoosing = false;
			}
			
			else if (opp.equalsIgnoreCase("Bear")){
				oppChoice = newBear.getRoshambo();
				keepChoosing = false; 
			}
			
			else 
				System.out.println("Invalid entry.");
			}
		
		while (keepChoosing2){
		System.out.println("Rock, paper or scissors?");
		choice = reader.nextLine();
		
			if (!choice.equalsIgnoreCase("Rock") || !choice.equalsIgnoreCase("Paper") || !choice.equalsIgnoreCase("Scissors")){
				System.out.println("Invalid entry");
			}
			else
				keepChoosing2=false;
		}
		
		
		System.out.println(name + ": "+ choice );
		System.out.println(opp + ": " + oppChoice);
	
		
		
		
				if(oppChoice.equalsIgnoreCase(choice)){
					System.out.println("It's a tie.");
					tieCount++;
				}
				
				else if (oppChoice.equalsIgnoreCase("Rock")&& choice.equalsIgnoreCase("Scissors")||
					oppChoice.equalsIgnoreCase("Paper")&& choice.equalsIgnoreCase("Rock") ||
					oppChoice.equalsIgnoreCase("Scissors")&& choice.equalsIgnoreCase("Paper")){
					System.out.println(opp + " wins!");
					lossCount++;
				}
				
				else if (choice.equalsIgnoreCase("Rock")&& oppChoice.equalsIgnoreCase("Scissors")||
					choice.equalsIgnoreCase("Paper")&& oppChoice.equalsIgnoreCase("Rock") ||
					choice.equalsIgnoreCase("Scissors")&& oppChoice.equalsIgnoreCase("Paper")){
					System.out.println(name + " wins!");
					winCount++;
					}
		
		
		System.out.println("Your Scoreboard: " + winCount + " wins " + lossCount + " losses " + tieCount + " ties." );
		
		
		System.out.println("Would you like to play again?");
		String keepGoing = reader.nextLine();
		if (keepGoing.equalsIgnoreCase("no")){
			System.out.println("Goodbye!");
			keepPlaying = false;
		}
		}
	}

}
