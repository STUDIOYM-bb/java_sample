package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Exer11_2_check { // git 참고

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();

		set.add(new Person("김열공", 20));
		set.add(new Person("최고봉", 56));
		set.add(new Person("우등생", 16));
		set.add(new Person("나자바", 35));

		Iterator<Person> iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		iterator = set.iterator();
		System.out.println(iterator.next());
	}

}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else if (obj instanceof Person person) {
			if (this.hashCode() == person.hashCode())
				return true;
		}
		return false;

	}

	@Override
	public String toString() {
		return String.format("Person[%s : %d]", name, age);
	}

}