package yong.begin_0228;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		System.out.println("�Է� �⵵ ���� 2020����� ����� ����� Ȯ���մϴ�.");
		Scanner scanner = new Scanner(System.in);

//		 nextint�� ������� �ʰ�, next�� ����Ѵ�.

		System.out.println("���� �Է�");

		int i = Integer.parseInt(scanner.next());

		for (int j = i; j < 2021; j++) {

			if (0 == (i % 4) && 0 != (i & 100) || 0 == (i % 400)) {
				System.out.println(i + "���� �����Դϴ�.");
			} else {

				System.out.println(i + "���� ����Դϴ�.");
			}

		}

	}

}
