package hg222ii__lab3;
import java.util.ArrayList;
public class Planet {

	private String name;
	private int positionFromSun;
	private int noOfMoons;
	private double aphelion;
	private double perihelion;
	private ArrayList<Moon> moons = new ArrayList<Moon>(); //arraylist to hold list of moons
	
	public Planet() {

	}

	public Planet(String str, int i, int j, double r, double t) {
		name = str;
		positionFromSun = i;
		noOfMoons = j;
		aphelion = r;
		perihelion = t;
	}

	public String getName() {
		if (name == "") {
			System.out.print("Unknown planet");
		}
		return name;
	}

	public void setName(String str) {
		name = str;
	}

	public int getPositionFromSun() {
		if (positionFromSun < 1 || positionFromSun > 9) {
			positionFromSun = 0;
		}
		return positionFromSun;
	}

	public void setPositionFromSun(int i) {
		positionFromSun = i;
	}

	public int getNoOfMoons() {
		if (noOfMoons < 0 || noOfMoons > 100) {
			noOfMoons = 0;
		}
		return noOfMoons;
	}

	public void setNoOfMoons(int j) {
		noOfMoons = j;
	}

	public double getAphelion() {
		if (aphelion < 0 || aphelion > 50) {
			aphelion = 0;
		}
		return aphelion;
	}

	public void setAphelion(double r) {
		aphelion = r;
	}

	public double getPerihelion() {
		if (perihelion < 0 || perihelion > 50) {
			perihelion = 0;
		}
		return perihelion;
	}

	public void setPerihelion(double t) {
		perihelion = t;
	}
	
	public void addMoon(Moon m) { //method to add moon to the arraylist
		moons.add(m);
	}
	
	public Moon[] getMoon() { //method to get the moon 
		Moon[] i = new Moon[moons.size()];
		i = moons.toArray(i);
		return i;
	}

}
