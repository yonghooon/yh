package yong.begin_0227;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A {

	private static Object nextint;

	public static void main(String[] args) throws IOException {

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		Scanner scanner = new Scanner(System.in);

		System.out.println("¼ýÀÚ ÀÔ·Â:");
//		int num = System.in.read() - 48;

//		int num = Integer.parseInt((bufferedReader.readLine())

		int num = scanner.nextInt();

		System.out.println(num);

		if (num % 2 == 0) {
			System.out.println(num + "Â¦¼ö");

		} else {

			System.out.println(num + "È¦¼ö");
		}

		scanner.close();
	}

}
