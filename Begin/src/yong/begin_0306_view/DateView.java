package yong.begin_0306_view;

import java.rmi.activation.ActivationGroupDesc.CommandEnvironment;

import yong.begin_0306_commend.DateCommend;

public class DateView {

	public static void main(String[] args) {

		DateCommend command = new DateCommend(24, 5, 2014);

		int day = command.getDay();
		int month = command.getMonth();
		int year = command.getYear();

		System.out.println("������ ��¥�� " + year + "��" + month + "��" + day + "���Դϴ�.");
	}

}
