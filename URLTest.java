package chap05;

import java.util.Scanner;

public class URLTest {
	public static void main(String a[]) {
		String s;
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("URL�� �Է��ϼ��� : ");
			s = in.nextLine();
			if (s.equals("bye"))
				break;
			if (s.endsWith("com"))
				System.out.println(s + "�� 'com'���� �����ϴ�.");
			if (s.contains("java"))
				System.out.println(s + "�� 'java'�� �����մϴ�.");
		}
	}
}
