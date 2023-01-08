package hg222ii__lab3;

public class MarsMain {
	public static void main(String[] args) {
		Planet p = new Planet();
		Planet o = new Planet("", 12, 132, 50.443, -0.415);  //all invalid values to demonstrate that validation of inputs is working
		System.out.println("Using the constructor");
		System.out.println(o.getName() + ":");
		System.out.println("    Position from sun: " + o.getPositionFromSun());
		System.out.println("    Moons: " + o.getNoOfMoons());
		System.out.println("    Aphelion: " + o.getAphelion());
		System.out.println("    Perihelion: " + o.getPerihelion() + "\n");

		System.out.println("Using the methods");
		p.setName("Pluto");
		System.out.println(p.getName() + ":");
		p.setPositionFromSun(9);
		System.out.println("    Position from sun: " + p.getPositionFromSun());
		p.setNoOfMoons(5);
		System.out.println("    Moons: " + p.getNoOfMoons());
		p.setAphelion(49.305);
		System.out.println("    Aphelion: " + p.getAphelion());
		p.setPerihelion(29.658);
		System.out.println("    Perihelion: " + p.getPerihelion());
	}
}
