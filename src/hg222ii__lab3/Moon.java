package hg222ii__lab3;

public class Moon {
	private String name;
	private int diameter;

	public Moon() {

	}

	public Moon(String s, int i) {
		name = s;
		diameter = i;
	}

	public void setMoonName(String s) {
		name = s;
	}

	public String getMoonName() {
		if (name == "") {
			System.out.println("Unknown");
		}
		return name;
	}

	public void setDiameter(int i) {
		diameter = i;
	}

	public int getDiameter() {
		if (diameter > 5262 || diameter < 11) { // limit of the size for largest and smallest moon in the solar system
			diameter = 0;
		}
		return diameter;
	}

}
