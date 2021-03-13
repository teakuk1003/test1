package chap02;

import java.util.Scanner;

public class TimeTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("초 단위 정수를 입력하세요 : ");
		int t = in.nextInt();
		int s = t % 60;
		int m = (t / 60) % 60;
		int h = (t / 60) / 60;

		System.out.printf("%d시간 %d분 %d초\n", h, m, s);
	}
}