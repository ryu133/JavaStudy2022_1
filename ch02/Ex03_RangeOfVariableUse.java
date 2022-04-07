package ch02;

public class Ex03_RangeOfVariableUse {

	public static void main(String[] args) {
		//전역변수와 지역변수
		int value1=3;
		{
			int value2=5;
			System.out.println(value1);
			System.out.println(value2);
		}
		System.out.println(value1);
		//System.out.println(value2);
	}

}
