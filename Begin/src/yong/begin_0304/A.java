package yong.begin_0304;

import java.util.ArrayList;

public class A {

	@Override
	public String toString() {
		return "A []";
	}

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4 };

//		foreach문은 int i 를 num으로 지정.  
		for (int i : num) {
//			System.out.println(num);
			System.out.println(i);
		}
	}
//
//		B[] num = new B[2];
//		System.out.println(num);

//		B b = new B();
//		ArrayList arrayList = new ArrayList();
//		arrayList.add(1);
//		arrayList.add(3);
//		arrayList.add(b);
//		System.out.println(arrayList);
//
//	}
}
