package extraCredit;

//----------------------------------------------------------------------------------------------
// Extra credit project for CS 1302 at GSU
// Author: Catherine Hume
// Date: 24-04-2019
//----------------------------------------------------------------------------------------------


public class Flower {
	private int number;
	private String sunshineLevel;
	private String name;
	

	//----------------------------------------------------------------------------------------------
	// Getters and Setters
	//----------------------------------------------------------------------------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	public String getSunshine() {
		return sunshineLevel;
	}
	public void setNumber(int number) {
		this. number = number;
	}
	public void setSunshine(String sunshineLevel) {
		this.sunshineLevel = sunshineLevel;
	}
	

	//----------------------------------------------------------------------------------------------
	// Constructor for my flowers
    //----------------------------------------------------------------------------------------------
	public Flower(int number, String sunshineLevel, String name) {
		this.number = number;
		this.sunshineLevel = sunshineLevel;
		this.name = name;
	}

	//----------------------------------------------------------------------------------------------
	// Redefine toString method
    //----------------------------------------------------------------------------------------------
	public String toString() {
		return "I am a flower.";
	}


}

