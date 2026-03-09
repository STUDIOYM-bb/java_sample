package ch07;

public class OuterClassDemo {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InstanceMemberClass instanceClass = outerClass.new InstanceMemberClass();

		OuterClass.StaticMemberClass staticClass = new OuterClass.StaticMemberClass();
	}

}

class OuterClass {
	public OuterClass() {
		PrivateMember privateMember = new PrivateMember();
	}

	static class StaticMemberClass {

	}

	class InstanceMemberClass {

	}

	interface InnerInterface {

	}

	private class PrivateMember {

	}

	void method1() {
		class LocalClass {

		}
	}

	void method2() {
		class LocalClass {

		}
	}
}