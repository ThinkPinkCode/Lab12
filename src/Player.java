
public abstract class Player {
	private String name;
	private String roshamboVal;

	public abstract String getRoshambo();{
		
	}

	public String getName() {
		return name;
	}

	public String getRoshamboVal() {
		return roshamboVal;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoshamboVal(String roshamboVal) {
		this.roshamboVal = roshamboVal;
	} 

}
