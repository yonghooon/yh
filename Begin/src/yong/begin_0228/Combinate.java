package yong.begin_0228;

import java.util.Scanner;

public class Combinate {

	static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		int i = (int) (Math.random() * 100) + 1;
		int num = 0;

		do {

			System.out.print("입력한 숫자 : ");

			num = scanner.nextInt();
			if (num == i) {

				System.out.println("정답입니다.");

				break;

			} else if (num < i) {

				System.out.println("정답보다 답이 작습니다.");

			} else {
				System.out.println("정답보다 답이 큽니다.");
			}

		} while (true);
	}
}
