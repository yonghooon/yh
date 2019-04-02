package yong.begin_0227;

import java.io.IOException;

public class SmallLetter {

	public static void main(String[] args) throws IOException {

		System.out.println("영어 문자:");

//		(char) c 이형태는 숫자를 문자로 강제형변환을 시켜줄때 사용 .. 이제알앗닼ㅋㅋㅋ

		char c = (char) System.in.read();
		if (c >= 'a' & c <= 'z')

		{
			System.out.println(c + "는 소문자입니다.");

		} else if (c >= 'A' & c <= 'Z') {
			System.out.println(c + "는 대문자입니다.");

		} else {

			System.out.println("대소문자 외의 문자를 입력하였습니다.");
		}

	}
}
