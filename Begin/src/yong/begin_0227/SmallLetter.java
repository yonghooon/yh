package yong.begin_0227;

import java.io.IOException;

public class SmallLetter {

	public static void main(String[] args) throws IOException {

		System.out.println("���� ����:");

//		(char) c �����´� ���ڸ� ���ڷ� ��������ȯ�� �����ٶ� ��� .. �����˾ш�������

		char c = (char) System.in.read();
		if (c >= 'a' & c <= 'z')

		{
			System.out.println(c + "�� �ҹ����Դϴ�.");

		} else if (c >= 'A' & c <= 'Z') {
			System.out.println(c + "�� �빮���Դϴ�.");

		} else {

			System.out.println("��ҹ��� ���� ���ڸ� �Է��Ͽ����ϴ�.");
		}

	}
}
