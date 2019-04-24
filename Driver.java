package extraCredit;
import java.util.*;
public class Driver {
	public static void main (String [] ARGS) {
		ArrayList<Flower> myGarden = new ArrayList<Flower>();
		Flower f1 = new Flower(20,"lots of sun","cat");
		Flower f2 = new Flower(5, "no sun","judy");
		Petunia p1 = new Petunia(5, "lots of sun", "blue","gabby");
		Petunia p2 = new Petunia(3, "lots of sun", "yellow","lulu");
		Rose r1 = new Rose(3, "lots of sun", "strong scent", 15, "jamie");
		Rose r2 = new Rose(2, "lots of sun", "medium scent", 8, "katie");
		ColouredRose cr1 = new ColouredRose ("purple");
		ColouredRose cr2  = new ColouredRose ("blue");
		myGarden.add(cr2);
		myGarden.add(cr1);
		myGarden.add(r1);
		myGarden.add(r2);
		myGarden.add(p1);
		myGarden.add(p2);
		myGarden.add(f1);
		myGarden.add(f2);
		System.out.println(myGarden);
		flowerBubbleSort(myGarden);
		System.out.println(myGarden);
//removing duplicated names 			
		myGarden.remove(cr1);
		myGarden.remove(cr2);
		
// now let look for the flower named "lulu"
//the value returned is the index of the name
		System.out.println(searchTheGarden(myGarden, "lulu", 0, myGarden.size()-1));
		System.out.println(myGarden.get(searchTheGarden(myGarden, "lulu", 0, myGarden.size()-1)));
		
		
	}
	//----------------------------------------------------------------------------------
		//this is a swap method that switches two elements.
	//----------------------------------------------------------------------------------
	
	public static void swap(int i, int j, ArrayList<Flower> garden) {
		Flower temp = garden.get(i);
		garden.set(i, garden.get(j));
		garden.set(j, temp);
	}


	public static void flowerBubbleSort(ArrayList<Flower> garden) {
	//----------------------------------------
	//This bubble sort sorts the ArrayList by how many flowers I have.
	//-----------------------------------------
		for (int pass = 0 ; pass< garden.size()-1; pass++) {
			if (garden.get(pass).getNumber() < garden.get(pass+1).getNumber()){
				swap(pass,pass+1,garden);
			}
		}
	}

	//----------------------------------------------------------------------------------
// This is a search method that finds a flower based on its name. Since our ArrayList has many elements of the same name, we will remove dupliactes for now
	//----------------------------------------------------------------------------------
	
	public static int searchTheGarden(ArrayList<Flower> garden, String targetName, int low, int high) {
		if(low>high) {
			return -1;
		}
		int mid = (low+high)/2;
		int comp = targetName.compareTo(garden.get(mid).getName());
		if (comp > 0) {
			return searchTheGarden(garden, targetName, mid+1, high);
		}else if (comp == 0) {
			return mid;
		}else {
			return searchTheGarden(garden, targetName, low, mid-1);
		}
	}
	
	
}
