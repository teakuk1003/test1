package chap06;

class Vehicle {
	String color;
	int speed;

	public Vehicle(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
	}

	void show() {
		System.out.println("���� : " + color);
		System.out.println("�ӵ� : " + speed);
	}
}

class Car extends Vehicle {
	int displacement;
	int gears;

	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}

	void show() {
		System.out.println("�ڵ��� ���� : " + color);
		System.out.println("�ڵ��� �ӵ� : " + speed);
		System.out.println("�ڵ��� ��ⷮ : " + displacement);
		System.out.println("�ڵ��� ��� �ܼ� : " + gears);
	}
}

public class OverrideTest {
	public static void main(String[] args) {
		Car c = new Car("�Ķ�", 200, 1000, 5);
		c.show();

		System.out.println();
		Vehicle v = c;
		v.show();
	}
}