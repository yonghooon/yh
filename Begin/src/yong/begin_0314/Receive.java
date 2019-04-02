package yong.begin_0314;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {

	private static DatagramSocket datagramSocket;

	public static void main(String[] args) throws IOException {

		datagramSocket = new DatagramSocket(4500);
		while (true) {

			byte[] data = new byte[65508];
			DatagramPacket datagramPacket = new DatagramPacket(data, data.length);
			datagramSocket.receive(datagramPacket);
			System.out.println(datagramPacket.getAddress().getHostAddress());
			System.out.println(">>" + new String(datagramPacket.getData()).trim());
		}

	}
}
