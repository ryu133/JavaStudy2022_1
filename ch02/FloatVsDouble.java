package ch02;

public class FloatVsDouble {

	public static void main(String[] args) {
		//float: 소수점 이하 7자리까지
		// double: 소수점 이하 15자리까지
		float f1=1.0000001f; //끝에 f나 F를 붙인다.
		double d1=1.000000000000001; //
		System.out.println(f1+"\n"+d1);
	}

}
