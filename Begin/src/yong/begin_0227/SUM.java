package yong.begin_0227;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SUM {

	public static void main(String[] args) throws NumberFormatException, IOException {

//		�����Ҷ��� new ��Ʈ�� �����̽��� �����ϱ� ,����Ű�� ����ϱ� �׷����� ��� ���־������ �˼�����!
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader buffredReader = new BufferedReader(inputStreamReader);

		int su1, su2;
		int tot = 0;
		System.out.println("ù ��° �� =");
		su1 = Integer.parseInt(buffredReader.readLine());
		System.out.println("�� ��° ��=");
		su2 = Integer.parseInt(buffredReader.readLine());

		// ���⼭ ������ ȣ��> if�� Ȱ��
		if (su1 > su2) {

			int imsi = su1;
			su1 = su2;
			su2 = imsi;

		}
// ��ҹ���, �������� ������ Ȯ��
		for (int i = su1; i <= su2; i++) {
			tot += i;
		}

		System.out.println();
		System.out.println(su1 + "����" + su2 + "������ ����" + tot + "�Դϴ�.");
	}
}
