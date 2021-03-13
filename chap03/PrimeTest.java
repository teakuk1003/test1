package chap03;

import java.util.Scanner;

public class PrimeTest {
	static boolean isPrime(int x) {
		int temp;
		for (int i = 2; i <= x / 2; i++) {
			temp = x % i;
			if (temp == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		System.out.print("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();

		if (isPrime(num))
			System.out.println(num + "는 소수입니다.");
		else
			System.out.println(num + "는 소수가 아닙니다.");
	}
}
