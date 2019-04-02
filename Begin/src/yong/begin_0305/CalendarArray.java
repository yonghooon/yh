package yong.begin_0305;

import java.util.Scanner;

public class CalendarArray {

	static Scanner scanner;

	public static void main(String[] args) {

		int year, mon, date, i;
		scanner = new Scanner(System.in);
		while (true) {
			System.out.print(" ������ �Է��ϼ���(1900��� ����) :");
			year = scanner.nextInt();

//	  1900��� ������ ������ ���α׷��� �����Ѵ�.
			if (year < 1900) {
				System.out.println("1900��� ���� �⵵�Դϴ�. �ٽ� �������ּ���.");
				System.exit(0);

			}

			System.out.print("���� �Է��ϼ���(1~12��) :");
			mon = scanner.nextInt();
			System.out.println();
			System.out.println("" + year + "��" + mon + "�� �޷��Դϴ�.");
			System.out.println("--------------------------------------------------------");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��\n");
			System.out.println("---------------------------------------------------------");

//			1���� ��¥�� ���ϴ� ����(365��)
			date = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
			int leafday = 28;
//			������ ���Ѵ�.
			if (year % 4 == 0 && year / 100 != 0) {
				leafday = 29;

			}

//			���� ���� ��¥�� �����Ѵ�.
			int[] month = { 0, 31, leafday, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			for (i = 0; i < mon; i++) {
				date += month[i];

			}

			int weekday = 0;

//		�������� ������ġ�� �Ͽ��Ϸ� �����Ѵ�.
			weekday = (date + 1) % 7;

//			���� ������ 1�Ͽ� ������ ������ ������ ���� ������ ���ڿ��� ó���Ѵ�.
			for (i = 0; i < weekday; i++) {

				System.out.print("\t" + "");
			}
//        ���� �ݺ��Ѵ�.
			for (i = 1; i <= month[mon]; i++) {
				System.out.printf("%d\t", i);
//				����� ���� �������� 6�ٷ� ����
				if ((date + i) % 7 == 6) {
					System.out.println();
				}
			}

			System.out.println("\n----------------------------------------------------------\n");
			System.exit(0);
		}
	}
}
