package a.b.c;

import java.util.Scanner;

public class A {

	static Scanner scanner;

	public static void main(String[] args) {

		String name[] = { "������", "ȫ��ǥ", "���¹�", "�ɻ���", "��ö��" };
		scanner = new Scanner(System.in);

		// �迭�� �ε��� �ʱ�ȭ

		int num = +1;

		do {

			System.out.println("�˻��� �̸��� �Է��ϼ���.");
			System.out.println("�̸�");
			String object = scanner.next();
			for (int i = 0; i < name.length; i++) {
				if (object.equals(name[i])) {
					num = i;
				}
			}

			if (num != 1) {

				System.out.println(object + "�迭��" + "�ε��� ��ȣ��" + num + "�Դϴ�.");
			}

		} while (true);

	}

}