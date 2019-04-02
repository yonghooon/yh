package yong.begin_0228;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		System.out.println("입력 년도 이후 2020년까지 윤년과 평년을 확인합니다.");
		Scanner scanner = new Scanner(System.in);

//		 nextint를 사용하지 않고, next로 사용한다.

		System.out.println("연도 입력");

		int i = Integer.parseInt(scanner.next());

		for (int j = i; j < 2021; j++) {

			if (0 == (i % 4) && 0 != (i & 100) || 0 == (i % 400)) {
				System.out.println(i + "년은 윤년입니다.");
			} else {

				System.out.println(i + "년은 평년입니다.");
			}

		}

	}

}
