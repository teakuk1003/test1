package chap02;

import java.util.Scanner;

public class TemperatureTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("È­¾¾ ¿Âµµ?");
		double f = in.nextDouble();
		double c = (5.0 / 9.0) * (f - 32.0);
		System.out.println("¼·¾¾ ¿Âµµ´Â " + c);
	}
}
