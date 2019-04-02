package a.b.c;

public class C {

	public static void main(String[] args) {

		String string = "123";

// 강제형변환...? 
		int i = Integer.parseInt(string);
		System.out.println(i);

		String string2 = "1.058";
		float f = Float.parseFloat(string2);
		System.out.println(f);

	}
}
