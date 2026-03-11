package ch10;

import java.util.ArrayList;
import java.util.List;

public class CarDemo {

	public static void main(String[] args) {
		// 디젤 자동차만 모두 찾아보자.
		ArrayList<Car> diesel = findCars(Car.cars, c -> !c.isGasoline());
		// 10년 보다 오래된 자동차만 모두 찾아보자.
		ArrayList<Car> oldCars = findCars(Car.cars, c -> c.getAge() > 10);
		// 10년 보다 오래된 가솔린 자동차만 모두 찾아보자.
		ArrayList<Car> oldGasoline = findCars(Car.cars, c -> (c.isGasoline()) && (c.getAge() > 10));

	}

	public static ArrayList<Car> findCars(List<Car> cars, CarPredicate cp) {
		return new ArrayList<>();
	}
}

@FunctionalInterface
interface CarPredicate {
	boolean test(Car car);
}

@FunctionalInterface
interface CarConsumer {
	void apply(Car car);
}