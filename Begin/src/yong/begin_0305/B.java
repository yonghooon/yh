package yong.begin_0305;

public class B {

	public static void main(String[] args) {

		int[][] num = new int[10][10];

//		배열의 값을 반복한다.
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
//				if (j != 1) {
//					num[i][j] = (i * j);
//					System.out.print(j + "X" + i + " = " + (i * j) + "\t");
//				}
				if (i > 0 && j > 1) {
					num[i][j] = (i * j);
					System.out.print(j + "X" + i + " = " + (i * j) + "\t");
				}
			}
			System.out.println();
		}
	}
}
