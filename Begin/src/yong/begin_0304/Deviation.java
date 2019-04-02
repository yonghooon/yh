package yong.begin_0304;

import java.util.Scanner;

public class Deviation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] num = new int[3];
		int tot = 0;
		int avege = 0;
		System.out.println("점수 입력");
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 점수.");

			System.out.println(num.length);

			num[i] = scanner.nextInt();

			tot = tot + num[i];

		}
// 안정성을 도모하기 위해서 int형으로 강제 형변환
		avege = (int) tot / num.length;
	}
}
