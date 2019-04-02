package yong.begin_0305;

import java.util.Scanner;

public class CalendarArray {

	static Scanner scanner;

	public static void main(String[] args) {

		int year, mon, date, i;
		scanner = new Scanner(System.in);
		while (true) {
			System.out.print(" 연도를 입력하세요(1900년대 이후) :");
			year = scanner.nextInt();

//	  1900년대 이전이 나오면 프로그램을 종료한다.
			if (year < 1900) {
				System.out.println("1900년대 이전 년도입니다. 다시 실행해주세요.");
				System.exit(0);

			}

			System.out.print("월을 입력하세요(1~12월) :");
			mon = scanner.nextInt();
			System.out.println();
			System.out.println("" + year + "년" + mon + "월 달력입니다.");
			System.out.println("--------------------------------------------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토\n");
			System.out.println("---------------------------------------------------------");

//			1년의 날짜를 구하는 수식(365일)
			date = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
			int leafday = 28;
//			윤년을 구한다.
			if (year % 4 == 0 && year / 100 != 0) {
				leafday = 29;

			}

//			월에 대한 날짜를 지정한다.
			int[] month = { 0, 31, leafday, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			for (i = 0; i < mon; i++) {
				date += month[i];

			}

			int weekday = 0;

//		일주일의 시작위치를 일요일로 지정한다.
			weekday = (date + 1) % 7;

//			월의 시작인 1일에 지정된 요일을 제외한 앞의 요일은 빈문자열로 처리한다.
			for (i = 0; i < weekday; i++) {

				System.out.print("\t" + "");
			}
//        월의 반복한다.
			for (i = 1; i <= month[mon]; i++) {
				System.out.printf("%d\t", i);
//				출력할 때의 세로줄은 6줄로 지정
				if ((date + i) % 7 == 6) {
					System.out.println();
				}
			}

			System.out.println("\n----------------------------------------------------------\n");
			System.exit(0);
		}
	}
}
