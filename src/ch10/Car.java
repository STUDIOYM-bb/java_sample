package ch10;

import java.util.Arrays;
import java.util.List;

public class Car {
	private String model;
	private boolean gasoline;
	private int age;
	private int mileage;

	public Car(String model, boolean gasoline, int age, int mileage) {
		this.model = model;
		this.gasoline = gasoline;
		this.age = age;
		this.mileage = mileage;
	}

	public String getModel() {
		return model;
	}

	public boolean isGasoline() {
		return gasoline;
	}

	public int getAge() {
		return age;
	}

	public int getMileage() {
		return mileage;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", gasoline=" + gasoline + ", age=" + age + ", mileage=" + mileage + "]";
	}

	public static final List<Car> cars = Arrays.asList(new Car("소나타", true, 18, 210000),
			new Car("아반테", true, 10, 70000), new Car("싼타페", false, 1, 10000), new Car("코란도", false, 15, 200000),
			new Car("에쿠스", true, 12, 180000), new Car("캐스퍼", true, 2, 50000), new Car("K5", true, 4, 60000),
			new Car("팰리세이드", true, 6, 120000), new Car("스타리아", false, 1, 18000));

}
