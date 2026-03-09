package ch07;

public class Exer7_3_4 {

	public static void main(String[] args) {
		Person[] persons = { new Person(40, 175, 68, "박지성"), new Person(32, 170, 75, "홍길동"),
				new Person(20, 180, 70, "손흥민") };

		System.out.println("실행결과 : ");
		for (Person person : persons) {
			System.out.println(person);
		}

	}

}

class Person implements Comparable {
	int age;
	int height;
	int weight;
	String name;

	public Person(int age, int height, int weight, String name) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Person person) {
			return person.age - this.age;
		}
		return -999999;
	}

	@Override
	public String toString() {
		return String.format("Person [이름 = %s, 나이 = %d, 키 = %d, 몸무게 = %d]", name, age, height, weight);
	}

}