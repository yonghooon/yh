package yong.begin_0227;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SUM {

	public static void main(String[] args) throws NumberFormatException, IOException {

//		시작할때는 new 컨트롤 스페이스로 시작하기 ,단축키로 사용하기 그래야지 어디에 뭘넣어야할지 알수잇음!
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader buffredReader = new BufferedReader(inputStreamReader);

		int su1, su2;
		int tot = 0;
		System.out.println("첫 번째 수 =");
		su1 = Integer.parseInt(buffredReader.readLine());
		System.out.println("두 번째 수=");
		su2 = Integer.parseInt(buffredReader.readLine());

		// 여기서 정수를 호출> if문 활용
		if (su1 > su2) {

			int imsi = su1;
			su1 = su2;
			su2 = imsi;

		}
// 대소문자, 빠진글자 없는지 확인
		for (int i = su1; i <= su2; i++) {
			tot += i;
		}

		System.out.println();
		System.out.println(su1 + "에서" + su2 + "사이의 합은" + tot + "입니다.");
	}
}
