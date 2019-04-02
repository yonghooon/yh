package yong.begin_0227;

public class B {

	public static void main(String[] args) {

		int score = 78;

		char grade = 0;

		if (score >= 90) {

			grade = 'A';

		}

		else if (score >= 80) {
			grade = 'B';
		}

		else {

			grade = 'D';
		}
		System.out.println("학점은" + grade + "이다.");
	}
}