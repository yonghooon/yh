package yong.begin_0308;

public class A {

	private String name;
	private int age;

//	 �ҽ����� ����Ʈ���� ��¡ �ʵ� (�ʵ������) ����ϱ�
	public A(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "A [name=" + name + ", age=" + age + "]";
	}

}
