package ch04;

public class Ball {

	private double radius = 10.0;
	final double PI = 3.14;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		if (r > 0) {
			radius = r;
		}
	}

	double getVolume() {
		return ((double) 4 / 3) * PI * radius * radius * radius;
	}
}
