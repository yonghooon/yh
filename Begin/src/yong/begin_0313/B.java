package yong.begin_0313;

import java.io.IOException;
import java.io.InputStream;

public class B {
	public static void main(String[] args) throws IOException {

		byte[] b = new byte[2];

		InputStream inputStream = System.in;
		int num = inputStream.read() - 48;
//		����ȯ ��ų�Ÿ� �䷱���¸� ������
//		char num = (char) inputStream.read();
		System.out.println(num);

//		System.out.println(inputStream.read());
	}

}
