package yong.begin_0315;

import java.util.Hashtable;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String name = s.next();

		Hashtable<String, String> n = new Hashtable<String, String>();
		n.put("name", name);
//  �Ӽ��� �θ����� ������ ""���̱� ��
		System.out.println(n.get("name"));

	}

}
