/*
 * char ���� ���� �ʰ�  int ���� ����Ѵ�.
 * ���� �����ڸ� ����Ѵ�.
 * ��������� �߿� �������� ���ϴ� % �����ڸ� ����Ѵ�.
 * System.in.read()
 * 
 */

package yong.begin_0226;

import java.io.IOException;

public class OddEven {

	public static void main(String[] args) throws IOException {

		System.out.print("���ڸ� �Է��ϼ���. : ");
		int i;
//		�ڳ��� �Է��� ���ڡڸ� ���������� ��ȯ�ϱ� ���ؼ� -48�� ������.
//		���尡 1����Ʈ�� �б⶧���� ���ڸ����� �������ִ�.
		i = System.in.read() - 48;
		System.out.println(i);
		String odd_even;
		odd_even = i % 2 == 0 ? "¦��" : "Ȧ��";
		System.out.println(odd_even);

	}

}
