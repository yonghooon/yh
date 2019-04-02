package yong.begin_0304;

public class C {

	public static void main(String[] args) {

		int[][] num = new int[3][];

		num[0] = new int[2];
		num[1] = new int[2];
		num[2] = new int[9];

		char c = 'A';

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = c++;

			}
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println("num[" + i + "]" + "[" + j + "]" + "=" + (char) num[i][j]);
			}
		}
	}

}
