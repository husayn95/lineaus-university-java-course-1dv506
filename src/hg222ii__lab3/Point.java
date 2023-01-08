package hg222ii__lab3;

public class Point {

	private int x;
	private int y;
	
	
	
	public Point() {
		x=0;
		y=0;
	}
	
	public Point(int x, int y) {
		x = this.x;
		y = this.y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";	
	}

	public boolean isEqualTo(Point p2) {
		
		return x == p2.x && y == p2.y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double distanceTo(Point p) {
		double x1x2 = Math.pow(x - p.getX(), 2);
		double y1y2 = Math.pow(y - p.getY(),  2);
		double d = Math.sqrt((x1x2) + (y1y2));
		return d;
	}
	
	

	public void move(int i, int j) {
		x = x + i;
		y = y + j;
		
	}

	public void moveToXY(int i, int j) {
		x = i;
		y = j;
	}
}
