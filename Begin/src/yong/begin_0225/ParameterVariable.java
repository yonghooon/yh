package yong.begin_0225;

public class ParameterVariable {

	public static void parametermethod(char c, int i) {
// 스태틱 메소드를 선언한다.

		System.out.println("성별 : " + c);
		System.out.println("나이 : " + i);

	}

	public static void main(String[] args) {
		char c = '남';
		int i = 33;
		parametermethod(c, i);

	}
}