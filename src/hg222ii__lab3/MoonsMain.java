package hg222ii__lab3;
public class MoonsMain {
	public static void main(String[] args) {

		Planet pluto = new Planet("Pluto", 9, 5, 49.305, 29.658);
		
		Moon charon = new Moon("Charon", 1212);
		Moon hydra = new Moon("Hydra", 113);
		Moon kerberos = new Moon("Kerberos", 19);
		Moon nix = new Moon("Nix", 49);
		Moon styx = new Moon("Styx", 16);
		
		pluto.addMoon(charon);
		pluto.addMoon(hydra);
		pluto.addMoon(kerberos);
		pluto.addMoon(nix);
		pluto.addMoon(styx);
		
		System.out.println("Moons of "+pluto.getName()+":");
		
		for(Moon y: pluto.getMoon()) {
			System.out.println(y.getMoonName());
		}

	}

}
