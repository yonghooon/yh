package yong.begin_0225;

public class ParameterVariable {

	public static void parametermethod(char c, int i) {
// ����ƽ �޼ҵ带 �����Ѵ�.

		System.out.println("���� : " + c);
		System.out.println("���� : " + i);

	}

	public static void main(String[] args) {
		char c = '��';
		int i = 33;
		parametermethod(c, i);

	}
}