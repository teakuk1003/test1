package chap03;

import java.util.Scanner;

public class RPS2Test {
	static String input(String s) {
		Scanner in = new Scanner(System.in);
		System.out.print(s + ": ");
		return in.next();
	}

	static void whosWin(String s1, String s2) {
		if (s1.equals(s2))
			System.out.println("¹«½ÂºÎ!");
		else if (s1.equals("r")) {
			if (s2.equals("p"))
				System.out.println("¿µÈñ, ½Â!");
			else
				System.out.println("Ã¶¼ö, ½Â!");
		} else if (s1.equals("p")) {
			if (s2.equals("s"))
				System.out.println("¿µÈñ, ½Â!");
			else
				System.out.println("Ã¶¼ö, ½Â!");
		} else {
			if (s2.equals("r"))
				System.out.println("¿µÈñ, ½Â!");
			else
				System.out.println("Ã¶¼ö, ½Â!");
		}
	}

	public static void main(String[] args) {
		String c = input("Ã¶¼ö");
		String y = input("¿µÈñ");
		whosWin(c, y);
	}
}