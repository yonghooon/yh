// new�� ���� ���������� ��������. �ֳĸ� ���� ����Ǵϱ� ������ �Ұ����ϴ�.
// �׷��� new�� ������ equals�� ����. �ֳĸ� �ּҰ��� Ȯ���ϱ⶧���� �����ϴ�.
// ��� : new������ ==�̰ž������� equals���. <�̰ɿܿ���.

package a.b.c;

public class B {

	public static void main(String[] args) {

		String st1 = new String("�ڹ�");
		String st2 = new String("�ڹ�");
		String st3 = "�ڹ�";
		String st4 = "�ڹ�";

		if (st1 == st2) {

			System.out.println("st1�� st2�� ��ġ�� ����.");
		} else {
			System.out.println("st1�� st2�� ��ġ�� �����ʴ�.");

		}

		if (st3 == st4) {

			System.out.println("st3�� st4�� ��ġ�� ����.");
		}

		if (st1.equals(st2)) {

			System.out.println("st1�� st2�� �������� ����.");
		}
	}

}
