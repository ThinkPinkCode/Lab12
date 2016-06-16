
public class Lion extends Player {

	public Lion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getRoshambo() {
		String[] options = {"rock", "paper", "scissors"};
		int choice = (int)((Math.random()*3));
		return options[choice];
		
	}

}
