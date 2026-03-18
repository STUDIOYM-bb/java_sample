package ch14;

public class CollaboDemo {

	public static void main(String[] args) {
		final Dish dish = new Dish();
		new Thread(new Customer(dish)).start();
		new Thread(new Cook(dish)).start();
	}

}

class Dish {
	private boolean empty = true;

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
}

class Customer implements Runnable {

	private final Dish dish;

	public Customer(Dish dish) {
		super();
		this.dish = dish;
	}

	public void eat() throws InterruptedException {
		synchronized (dish) {
			while (dish.isEmpty()) { // 요
				dish.wait();
			}
			dish.setEmpty(true);
			System.out.println("음식을 다 먹었습니다.");
			dish.notify();
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				eat();
				Thread.sleep(300);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

class Cook implements Runnable {
	private final Dish dish;

	public Cook(Dish dish) {
		super();
		this.dish = dish;
	}

	public void cook() throws InterruptedException {
		synchronized (dish) {
			while (!dish.isEmpty()) {
				dish.wait();
			}
			dish.setEmpty(false);
			System.out.println("음식이 준비가 되었습니다.");
			dish.notify();
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {

				cook();
				Thread.sleep(500);

			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}

	}

}