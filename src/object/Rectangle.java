package object;

class Point {
    public int x = 0;
    public int y = 0;
    //constructor
    public Point(int a, int b) {
        x = a;
        y = b;
    }
}
public class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;    // reference variable of type point

    // four constructors
    public Rectangle() {
        origin = new Point(0, 0);   // object initialized
    }
    public Rectangle(Point p) {     //object passed as parameter
        origin = p;
    }
    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing the area of the rectangle
    public int getArea() {
        return width * height;
    }
    public static void main(String[] args) {
    	Rectangle obj = new Rectangle(10,20);
    	System.out.println(obj.getArea());
		
	}
}
