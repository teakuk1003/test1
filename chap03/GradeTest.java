package chap03;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();

		switch (x) {
		case 1:
			System.out.println("아주 잘했습니다");
			break;
		case 2:
		case 3:
			System.out.println("잘했습니다");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("보통입니다");
			break;
		default:
			System.out.println("노력해야 겠습니다");

		}

	}

}
