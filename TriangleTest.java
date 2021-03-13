package chap04;

class Triangle {
	double base, height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public double findArea() {
		return base * height / 2;
	}

//	public boolean isSameArea(Triangle t) { // 2번 문제
//		return this.findArea() == t.findArea(); // 2번 문제
=
}

public class TriangleTest {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 5.0);
//		Triangle t2 = new Triangle(5.0, 10.0); // 2번 문제
//		Triangle t3 = new Triangle(8.0, 8.0); // 2번 문제
		System.out.println(t1.findArea());
//		System.out.println(t1.isSameArea(t2)); // 2번 문제
//		System.out.println(t1.isSameArea(t3)); // 2번 문제
	}
}
