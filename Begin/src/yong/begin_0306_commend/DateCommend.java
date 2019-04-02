package yong.begin_0306_commend;

public class DateCommend {

//	  한개 모델은 데이터베이스 한개 테이블 같다.
//	  테이블의 순서 동일하게 적는다.

	private int day;
	private int month;
	private int year;

	public DateCommend(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

}