package hg222ii__lab3;

public class gameMechanics {		
	kingGurka king = new kingGurka();
	princeCarrot carrot = new princeCarrot();
	
	private int XPcarrot = carrot.getXP();
	private int XPking = king.getXP();
	private int i =0;
	
	public void runKingsFist() {	
		System.out.println("Welcome!");
		System.out.println("King Gurka has "+king.getXP()+"XP and his fists to fight.");
		System.out.println("Price Carrot has "+carrot.getXP()+"XP and uses his fists to fight.");
		System.out.println("Let the fight begin!");
		
	while (XPcarrot>0 || XPking >0) {
		i++;
		System.out.println("\nRound "+i+":");
	System.out.println("King Gurka strikes with his fists a deadly blow!");
	
	 if(king.kingsFist()>carrot.carrotsFists()) {
		XPcarrot = XPcarrot - king.kingsFist();
	if(XPcarrot <=0) {
		System.out.println("King Gurka wins! Easy Peasy!");
		break;
	}
	
		System.out.println("XP of Prince Carrot: "+XPcarrot);
	}
	else if (king.kingsFist()<carrot.carrotsFists()) {
		System.out.println("Prince Carrot dodges and hits back!");
		XPking = XPking - carrot.carrotsFists();
		System.out.println("XP of King Gurka: "+ XPking);
		if(XPking <=0) {
			System.out.println("Prince Carrot wins! Incredible!");
			break;
		}
	}
		
	}	
	}
	
	public void runIronTomato() {	
		System.out.println("Welcome!");
		System.out.println("King Gurka has "+king.getXP()+"XP and Iron Tomato to fight.");
		System.out.println("Price Carrot has "+carrot.getXP()+"XP and uses his fists to fight.");
		System.out.println("Let the fight begin!");
		
	while (XPcarrot>0 || XPking >0) {
		i++;
		System.out.println("\nRound "+i+":");
	System.out.println("King Gurka strikes with his Tomato Sword a deadly blow!");
	
	 if(king.ironTomato()>carrot.carrotsFists()) {
		XPcarrot = XPcarrot - king.ironTomato();
	if(XPcarrot <=0) {
		System.out.println("King Gurka wins! Easy Peasy!");
		break;
	}
	
		System.out.println("XP of Prince Carrot: "+XPcarrot);
	}
	else if (king.ironTomato()<carrot.carrotsFists()) {
		System.out.println("Prince Carrot dodges and hits back!");
		XPking = XPking - carrot.carrotsFists();
		System.out.println("XP of King Gurka: "+ XPking);
		
	}
		
		
	}
}
	
}