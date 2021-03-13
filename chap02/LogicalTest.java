package chap02;

import java.util.Scanner;

public class LogicalTest {
	public static void main(String[] args) {
		boolean and, or;
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		and = x % 4 == 0 && x % 5 == 0;
		or = x % 4 == 0 || x % 5 == 0;

		System.out.println(and);
		System.out.println(or);
		System.out.println(or && !and);
	}
}