// new를 쓸때 더블이퀄을 쓸수없다. 왜냐면 힙에 저장되니까 접근이 불가능하다.
// 그래서 new를 쓰때는 equals를 쓴다. 왜냐면 주소값만 확인하기때문에 가능하다.
// 결론 : new쓸때는 ==이거쓰지말고 equals써라. <이걸외워라.

package a.b.c;

public class B {

	public static void main(String[] args) {

		String st1 = new String("자바");
		String st2 = new String("자바");
		String st3 = "자바";
		String st4 = "자바";

		if (st1 == st2) {

			System.out.println("st1과 st2는 위치가 같다.");
		} else {
			System.out.println("st1과 st2는 위치가 같지않다.");

		}

		if (st3 == st4) {

			System.out.println("st3과 st4는 위치가 같다.");
		}

		if (st1.equals(st2)) {

			System.out.println("st1과 st2는 실제값이 같다.");
		}
	}

}
