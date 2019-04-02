/*
 * char 형을 쓰지 않고  int 형을 사용한다.
 * 조건 연산자를 사용한다.
 * 산술연산자 중에 나머지를 구하는 % 연산자를 사용한다.
 * System.in.read()
 * 
 */

package yong.begin_0226;

import java.io.IOException;

public class OddEven {

	public static void main(String[] args) throws IOException {

		System.out.print("숫자를 입력하세요. : ");
		int i;
//		★내가 입력한 숫자★를 정수형으로 변환하기 위해서 -48을 적었다.
//		리드가 1바이트만 읽기때문에 한자리수만 읽을수있다.
		i = System.in.read() - 48;
		System.out.println(i);
		String odd_even;
		odd_even = i % 2 == 0 ? "짝수" : "홀수";
		System.out.println(odd_even);

	}

}
