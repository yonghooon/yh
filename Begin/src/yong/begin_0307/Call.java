package yong.begin_0307;

public class Call {

	public static void main(String[] args) {

		A a = new A("홍길동", 2000);
		B b = new B("전우치", 4500, "개발");
		System.out.println(a.getName() + a.getSalary());
		System.out.println(b.getDepart());

	}
}
