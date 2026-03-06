package ch06;

public class InheritDemo2 {

	public static void main(String[] args) {
		Circle2 c = new Circle2();
		c.radius = 10;
		c.findRadius();
		c.findArea();

		Ball b = new Ball();
		b.radius = 10;
		b.findRadius();
		b.findArea();
	}

}
