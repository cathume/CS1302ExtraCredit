package extraCredit;

public class ColouredRose extends Rose{
	private String colour = "red";
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getColour() {
		return colour;
	}
	
	public ColouredRose(String colour) {
		super(5, "lots of sun", "mild scent", 2, "Rose");
		this.colour = colour;
		
	}
	
	public void blowInWind() {
		super.blowInWind();
		System.out.print(" These are " + colour + " roses.");
	}
}
