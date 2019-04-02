package yong.begin_0305;

public class 구구단 {

	public static void main(String[] args) {

//		단의 공간 크기를 90으로 지정한다.
		int[] dan = new int[90];

//		두 수의 곱에 대한 공간크기를 90으로 지정한다.
		int[] gugu = new int[90];

//		두 수의 결과의 공간 크기를 90으로 지정한다.
		int[] mult = new int[90];

//	   출력할 크기의 수를 저장할 변수를 선언하고 초기화한다.
		int count = 0;
//	   단을 저장할 변수를 선언하고 값을 할당한다.
		int danint = 2;
//	   단을 반복한다.
		for (int i = 2; i < 10; i++) {
//		1에서 9까지 반복하여 곱한다.
			for (int j = 1; j < 10; j++) {

				// 단을 9까지 누적한다.
				dan[j + count] = i;
//			   곱하는 수를 9까지 누적한다.

			}
		}
	}
}
