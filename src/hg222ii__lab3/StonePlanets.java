package hg222ii__lab3;

public class StonePlanets {
public static void main(String[] args) {
	Planet[] planets = new Planet[4];
	Planet mercury = new Planet("Mercury", 1, 0, 0.466, 0.307);
	Planet venus = new Planet("Venus", 2, 0, 0.728, 0.718);
	Planet earth = new Planet("Earth", 3, 1, 1.017, 0.983);
	Planet mars = new Planet("Mars", 4, 2, 1.666, 1.382);
	
	
	planets[0]=mercury;
	planets[1]=venus;
	planets[2]=earth;
	planets[3]=mars;
	
	Moon moon = new Moon("The Moon", 3474);
	Moon phobos = new Moon("Phobos", 22);
	Moon deimos = new Moon("Deimos", 13);
	
	Moon[] moons = new Moon[3];
	moons[0]=moon;
	moons[1]=phobos;
	moons[2]=deimos;
	
	for(Planet x: planets) {
		System.out.println("Planet "+x.getName()+" has aphelion "+x.getAphelion()+"AU, perihelion "+x.getPerihelion()+"AU, and "+x.getNoOfMoons()+" moons");
	
		for (int i = 0; i < moons.length; i++) {
			if(x.getName().equals("Earth")) {
			System.out.println("    "+moons[0].getMoonName());
			break;}
			else if(x.getName().equals("Mars")) {
				System.out.println("    "+moons[1].getMoonName());
				System.out.println("    "+moons[2].getMoonName());
				break;
			}
		}
		
	}
}
}
