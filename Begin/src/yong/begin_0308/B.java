package yong.begin_0308;

public class B {

	public static void main(String[] args) {

		int i = 350;
		int j = 350;
		char c = '��';
		float f = 3.14F;

		String string = Integer.toString(i);
		String string1 = Integer.toString(j);
		String string2 = Character.toString(c);
		String string3 = Float.toString(f);

		System.out.println("int �ڷ��� " + string + string1);
		System.out.println("char �ڷ��� " + string2);
		System.out.println("float �ڷ��� " + string3);

	}

}
