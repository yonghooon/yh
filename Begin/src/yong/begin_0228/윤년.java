package yong.begin_0228;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {

		System.out.println("����� ����� Ȯ���մϴ�.");
		System.out.println("2020�� ���� ������ �����մϴ�,");

		Scanner scanner = new Scanner(System.in);
		System.out.println("�����Է�");

		int j;
		j = scanner.nextInt();

		for (int i = j; i < 2021; i++) {

			if (i % 4 == 0) {
				System.out.println(i + "�����Դϴ�.");
			} else {
				System.out.println("����Դϴ�.");
			}

		}

	}

}
