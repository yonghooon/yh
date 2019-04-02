package yong.begin_0228;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int kor, eng, math, tot;

		float average = 0.0f;

		System.out.println("점수를 입력하세요");

		do {
			System.out.println("국어 점수를 입력하세요");
			kor = Integer.parseInt(scanner.next());

		} while (kor < 0 || kor > 100);

		do

		{
			System.out.println("영어 점수를 입력하세요");
			eng = Integer.parseInt(scanner.next());

		} while (eng < 0 || eng > 100);

		do {

			System.out.println("수학 점수를 입력하세요");
			math = Integer.parseInt(scanner.next());
		}

		while (math < 0 || math > 100);
		tot = kor + eng + math;
		average = tot / 3.0f;
		System.out.println("총점=" + tot);
//	float형태에서는 println형태가 아닌 printf형태로 사용해준다.
		System.out.printf("%.2f", average);

		System.out.println("학점");
	}

}
