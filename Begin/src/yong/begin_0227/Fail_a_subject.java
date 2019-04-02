package yong.begin_0227;

import java.io.IOException;
import java.util.Scanner;

public class Fail_a_subject {

	public static void main(String[] args) throws IOException {

		int kor = 0;
		int math = 0;
		int eng = 0;
		int tot = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("국어 점수를 입력하세요 = ");
		kor = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요 = ");
		math = scanner.nextInt();
		System.out.print("영어 점수를 입력하세요 = ");
//		여기 스캔은 소문자로 쓰기> 위에꺼를 받아오는 거라서 대문자아님
		eng = scanner.nextInt();

		tot = kor + math + eng;

		System.out.println(tot);

		if (tot >= 180) {
			if (kor < 40 || math < 40 || eng < 40) {
				System.out.println("과락으로 인한 불합격입니다.");
			} else {
				System.out.println("합격");
			}
		} else {
			System.out.println("불합격");
		}

		//// 초기화라고 한다.

//		int math = 0;
//		int eng = 0;
//		int tot = 0;
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("국어 점수를 입력하세요.");
//		kor = scanner.nextInt();
//		// System.out.println(kor);
//		System.out.println("수학 점수를 입력하세요.");
//		math = scanner.nextInt();
//		System.out.println("영어 점수를 입력하세요.");
//		eng = scanner.nextInt();
//
//		tot = kor + math + eng;
//		// System.out.println(tot);
//
//		if (tot >= 180) {
//			if (kor > 40 || math < 40 || eng < 40) {
//				System.out.println("과락불합격");
//
//			} else {
//				System.out.println("합격");
//
//			}
//
//		} else {
//			System.out.println("불합격");
//
//		}

	}

}
