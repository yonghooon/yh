package yong.begin_0308;

public class B {

	public static void main(String[] args) {

		int i = 350;
		int j = 350;
		char c = '돈';
		float f = 3.14F;

		String string = Integer.toString(i);
		String string1 = Integer.toString(j);
		String string2 = Character.toString(c);
		String string3 = Float.toString(f);

		System.out.println("int 자료형 " + string + string1);
		System.out.println("char 자료형 " + string2);
		System.out.println("float 자료형 " + string3);

	}

}
