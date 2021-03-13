package chap06;

class Circle {
	int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	void show() {
		System.out.println("�������� " + radius + "�� ���̴�.");
	}
}

class ColoredCircle extends Circle {
	String color;

	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}

	void show() {
		System.out.println("�������� " + radius + "�� " + color + " ���̴�.");
	}
}

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		ColoredCircle c2 = new ColoredCircle(10, "������");

		c1.show();
		c2.show();

	}

}
