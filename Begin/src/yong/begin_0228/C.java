package yong.begin_0228;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int kor, eng, math, tot;

		float average = 0.0f;

		System.out.println("������ �Է��ϼ���");

		do {
			System.out.println("���� ������ �Է��ϼ���");
			kor = Integer.parseInt(scanner.next());

		} while (kor < 0 || kor > 100);

		do

		{
			System.out.println("���� ������ �Է��ϼ���");
			eng = Integer.parseInt(scanner.next());

		} while (eng < 0 || eng > 100);

		do {

			System.out.println("���� ������ �Է��ϼ���");
			math = Integer.parseInt(scanner.next());
		}

		while (math < 0 || math > 100);
		tot = kor + eng + math;
		average = tot / 3.0f;
		System.out.println("����=" + tot);
//	float���¿����� println���°� �ƴ� printf���·� ������ش�.
		System.out.printf("%.2f", average);

		System.out.println("����");
	}

}
