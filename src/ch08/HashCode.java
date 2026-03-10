package ch08;

import java.util.Objects;

public class HashCode {

	public static void main(String[] args) {
		Mac m1 = new Mac("16", "i5", "16GB", "black", "iris");
		Mac m2 = new Mac("16", "i5", "16GB", "black", "iris");

		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		System.out.println(m1.hashCode() + ":" + m2.hashCode());
	}

}

class Mac {
	String monitor;
	String cpu;
	String ram;
	String color;
	String gpu;

	public Mac(String monitor, String cpu, String ram, String color, String gpu) {
		this.monitor = monitor;
		this.cpu = cpu;
		this.ram = ram;
		this.color = color;
		this.gpu = gpu;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		} else if (obj instanceof Mac mac) {
//			System.out.println(this.hashCode() + ":" + mac.hashCode());
//			return this.hashCode() == mac.hashCode();
//		}
//		return false;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(monitor, cpu, ram, color, gpu);
	}

	@Override
	public String toString() {
		return "Keyboard [name=" + monitor + "]";
	}
}
