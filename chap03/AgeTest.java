package chap03;

import java.util.Scanner;

public class AgeTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		if (in.nextInt() >= 19)
			System.out.println("성년");
		else
			System.out.println("미성년");
	}

}
