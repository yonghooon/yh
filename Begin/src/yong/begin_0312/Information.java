package yong.begin_0312;

public class Information {

	public static void main(String[] args) {
		System.out.println("실행중인 쓰레긴지쓰레드인지 : " + Thread.currentThread().getName());
		System.out.println("우선순위 : " + Thread.currentThread().getPriority());
	}
}
