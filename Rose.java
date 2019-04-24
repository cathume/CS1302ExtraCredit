package extraCredit;

public class Rose extends Flower{
	private String scent;
	private int blooms;
	
	
	public void setBlooms(int blooms) {
		this.blooms = blooms;
	}
	public int getBlooms() {
		return blooms;
	}
	public void setScent(String scent) {
		this.scent = scent;
	}
	public String getScent() {
		return scent;
	}
	
	public Rose(int number, String sunshineLevel, String scent, int blooms, String name ) {
		super(number,sunshineLevel,name);
		this.scent = scent;
		this.blooms = blooms;
	}
	
	public void blowInWind() {
		System.out.print("My " + blooms + " roses are blowing in the breeze.");
	}
	public String toString() {
		return "I have roses.";
	}


}
