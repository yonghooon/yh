package yong.begin_0228;

import java.util.Scanner;

public class Combinate {

	static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		int i = (int) (Math.random() * 100) + 1;
		int num = 0;

		do {

			System.out.print("�Է��� ���� : ");

			num = scanner.nextInt();
			if (num == i) {

				System.out.println("�����Դϴ�.");

				break;

			} else if (num < i) {

				System.out.println("���亸�� ���� �۽��ϴ�.");

			} else {
				System.out.println("���亸�� ���� Ů�ϴ�.");
			}

		} while (true);
	}
}
