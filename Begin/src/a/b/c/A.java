package a.b.c;

import java.util.Scanner;

public class A {

	static Scanner scanner;

	public static void main(String[] args) {

		String name[] = { "문재인", "홍준표", "유승민", "심상정", "안철수" };
		scanner = new Scanner(System.in);

		// 배열의 인덱스 초기화

		int num = +1;

		do {

			System.out.println("검색할 이름을 입력하세요.");
			System.out.println("이름");
			String object = scanner.next();
			for (int i = 0; i < name.length; i++) {
				if (object.equals(name[i])) {
					num = i;
				}
			}

			if (num != 1) {

				System.out.println(object + "배열의" + "인덱스 번호는" + num + "입니다.");
			}

		} while (true);

	}

}