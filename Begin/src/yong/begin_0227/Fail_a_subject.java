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

		System.out.print("���� ������ �Է��ϼ��� = ");
		kor = scanner.nextInt();
		System.out.print("���� ������ �Է��ϼ��� = ");
		math = scanner.nextInt();
		System.out.print("���� ������ �Է��ϼ��� = ");
//		���� ��ĵ�� �ҹ��ڷ� ����> �������� �޾ƿ��� �Ŷ� �빮�ھƴ�
		eng = scanner.nextInt();

		tot = kor + math + eng;

		System.out.println(tot);

		if (tot >= 180) {
			if (kor < 40 || math < 40 || eng < 40) {
				System.out.println("�������� ���� ���հ��Դϴ�.");
			} else {
				System.out.println("�հ�");
			}
		} else {
			System.out.println("���հ�");
		}

		//// �ʱ�ȭ��� �Ѵ�.

//		int math = 0;
//		int eng = 0;
//		int tot = 0;
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("���� ������ �Է��ϼ���.");
//		kor = scanner.nextInt();
//		// System.out.println(kor);
//		System.out.println("���� ������ �Է��ϼ���.");
//		math = scanner.nextInt();
//		System.out.println("���� ������ �Է��ϼ���.");
//		eng = scanner.nextInt();
//
//		tot = kor + math + eng;
//		// System.out.println(tot);
//
//		if (tot >= 180) {
//			if (kor > 40 || math < 40 || eng < 40) {
//				System.out.println("�������հ�");
//
//			} else {
//				System.out.println("�հ�");
//
//			}
//
//		} else {
//			System.out.println("���հ�");
//
//		}

	}

}
