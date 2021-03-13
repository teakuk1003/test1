package chap04;

class Car {
	String color;
	static int numOfCar = 0;
	static int numOfRedCar = 0;

	public Car(String color) {
		this.color = color;
		numOfCar++;
		if (color.compareToIgnoreCase("red") == 0)
			numOfRedCar++;
	}

	public static int getNumOfCar() {
		return numOfCar;
	}

	public static int getNumOfRedCar() {
		return numOfRedCar;
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");

		System.out.printf("�ڵ��� �� : %d, ������ �ڵ��� �� : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
	}
}