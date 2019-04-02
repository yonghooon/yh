package yong.begin_0308;

public class A {

	private String name;
	private int age;

//	 소스에서 컨스트럭터 유징 필드 (필드생성자) 사용하기
	public A(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "A [name=" + name + ", age=" + age + "]";
	}

}
