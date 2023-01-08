package hg222ii_lab3;

public class Point {
	private int x;
	private int y;
		

public Point() {
	x=0;
	y=0;
}

public Point(int X2, int Y2) {
	x =X2;
	y = Y2;
}


/**
 * Metoden move flyttar punkten i x- och y-led.
 * @param moveX
 * @param moveY
 */
public void move(int moveX, int moveY) {
	x = x + moveX;
	y = y + moveY;
}


/**
 * Metoden moveToXY ger punkten helt nya koordinater.
 * @param X
 * @param Y
 */
public void moveToXY(int X, int Y) {
	x = X;
	y = Y;
}

public int getX() {
	return x;
}

public int getY() {
	return y;
}



/**
 * Räknar ut avståndet mellan två punkter och returnerar resultatet
 * @param r: y, respektive x koordinaterna i punkten.
 * @return: avståndet mellan två punkter
 */
public double distanceTo(Point r) {
	double x1x2 = Math.pow(x - r.getX(), 2);
	double y1y2 = Math.pow(y - r.getY(),  2);
	double d = Math.sqrt((x1x2) + (y1y2));
	return d;
}


/**
 * Två punkter är lika (equal) om de har samma koordinater.
 * @param p
 * @return
 */

public boolean isEqualTo(Point p) {
return x == p.x && y == p.y;    //kollar om två punkter är likadana
}   

	/**
	 * Metoden toString ger en sträng med punktens aktuella koordinater lämplig för utskrift.
	 */
	public String toString() {
	return "(" + x + "," + y + ")";		
	}


}
