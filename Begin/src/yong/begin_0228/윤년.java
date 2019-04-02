package yong.begin_0228;

import java.util.Scanner;

public class 윤년 {

	public static void main(String[] args) {

		System.out.println("윤년과 평년을 확인합니다.");
		System.out.println("2020년 이전 까지만 지원합니다,");

		Scanner scanner = new Scanner(System.in);
		System.out.println("연도입력");

		int j;
		j = scanner.nextInt();

		for (int i = j; i < 2021; i++) {

			if (i % 4 == 0) {
				System.out.println(i + "윤년입니다.");
			} else {
				System.out.println("평년입니다.");
			}

		}

	}

}
