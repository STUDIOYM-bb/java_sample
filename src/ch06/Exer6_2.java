package ch06;

public class Exer6_2 {

	public static void main(String[] args) {
		MovablePoint y = new MovablePoint(1, 1, 1, 1);

	}

}

class Point {
	// 필드
	private int x, y;

	// 생성자
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 접근자
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void print() {
		System.out.println(x + " " + y);
	}
	// 메서드

}

class MovablePoint extends Point {
	// 필드
	private int xSpeed, ySpeed;

	// 생성자
	MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	// 접근자
	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

	public void setXSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public void setYSpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	public void print() {
		System.out.println(super.getX());
	}
	// 메서드
}
