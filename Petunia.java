package extraCredit;

public class Petunia extends Flower{
	private String colour;
	
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getColour() {
		return colour;
	}
	public Petunia (int number, String sunshineLevel, String colour,String name) {
		super(number,sunshineLevel,name);
		this.colour = colour;
		
	}
	public String toString() {
		return super.toString() + "I am a " + this.getColour() + " petunia"; 
	}
	
	
	
}
