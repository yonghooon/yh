package yong.begin_0313;

import java.io.File;
import java.io.IOException;

public class A {

	public static void main(String[] args) throws IOException {

		File file = null;
		file = new File("C:\\javaio", "yongtest1111.txt");

		System.out.println(file.listFiles());

		File[] files = file.listFiles();
		System.out.println(file.getName().endsWith("txt"));

	}

}

//	public static void main(String[] args) throws IOException {
////		�ܺ��ڿ����� �����ϴ� �ν��Ͻ��� ������ ���ú����� �����Ѵ�.
//
//		File file = null;
//		file = new File("C:\\javaio");
//
//		System.out.println(file.listFiles());
//
//		File[] files = file.listFiles();
//		System.out.println(file.getName().endsWith("txt"));
//
//	}
//}
