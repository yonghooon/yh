package yong.begin_0304;

import java.util.Scanner;

public class Deviation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] num = new int[3];
		int tot = 0;
		int avege = 0;
		System.out.println("���� �Է�");
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "��° ����.");

			System.out.println(num.length);

			num[i] = scanner.nextInt();

			tot = tot + num[i];

		}
// �������� �����ϱ� ���ؼ� int������ ���� ����ȯ
		avege = (int) tot / num.length;
	}
}
