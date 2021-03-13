package chap02;

import java.util.Scanner;

public class CylinderTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("원기둥의 밑면의 반지름은? ");
		double r = in.nextDouble();
		System.out.print("원기둥의 높이는? ");
		double h = in.nextDouble();
		System.out.println("원기둥이 부피는 " + 3.14 * r * r * h);
	}
}