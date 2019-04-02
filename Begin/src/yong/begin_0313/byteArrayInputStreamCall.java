package yong.begin_0313;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class byteArrayInputStreamCall {

	public static void main(String[] args) {

		byte[] ys = { 10, 20, 30, 40, 50, 60 };

		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ys);
		int i = 0;
		System.out.print("바이너리 배열 : ");
		while ((i = byteArrayInputStream.read()) != -1) {
			System.out.print(i + " ");
			try {

				byteArrayInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
