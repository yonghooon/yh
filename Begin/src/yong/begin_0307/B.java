package yong.begin_0307;

public class B extends A {

	String depart;

	public B(String name, int salary, String depart) {

		super(name, salary);
		this.depart = depart;

	}

	public String getDepart() {
		return name + salary + depart;
	}

}
