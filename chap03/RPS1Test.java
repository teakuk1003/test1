package chap03;

import java.util.Scanner;

public class RPS1Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Ã¶¼ö: ");
		String c = in.next();
		System.out.print("¿µÈñ: ");
		String y = in.next();

		if (c.equals(y))
			System.out.println("¹«½ÂºÎ!");
		else if (c.equals("r")) {
			if (y.equals("p"))
				System.out.println("¿µÈñ, ½Â!");
			else
				System.out.println("Ã¶¼ö, ½Â!");
		} else if (c.equals("p")) {
			if (y.equals("s"))
				System.out.println("¿µÈñ, ½Â!");
			else
				System.out.println("Ã¶¼ö, ½Â!");
		} else {
			if (y.equals("r"))
				System.out.println("¿µÈñ, ½Â!");
			else
				System.out.println("Ã¶¼ö, ½Â!");
		}
	}
}
