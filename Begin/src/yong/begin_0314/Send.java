package yong.begin_0314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {

	private static DatagramSocket datagramSocket;

	public static void main(String[] args) throws IOException {

		BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
		datagramSocket = new DatagramSocket();

		while (true) {

			System.out.print("보낼 내용 = ");
			String msg = buffered.readLine();
			for (int i = 1; i < 254; i++) {
				InetAddress inet = InetAddress.getByName("127.0.0" + i);
				DatagramPacket datagram;

				datagram = new DatagramPacket(msg.getBytes(), msg.getBytes().length, inet, 4500);
				datagramSocket.send(datagram);
			}
			System.out.println("전송 완료");
		}
	}
}
