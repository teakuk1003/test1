package chap03;

public class Piramid2Test {
	static void printStar(int x) {
		for (int i = 1; i <= x; i++)
			System.out.print("*");
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			printStar(i);
			System.out.println();
		}
	}
}