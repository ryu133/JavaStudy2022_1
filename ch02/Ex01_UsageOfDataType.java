package ch02;

public class Ex01_UsageOfDataType {

	public static void main(String[] args) {
		//<데이터타입>
		int a=3;
		int b;
		b=4;
		System.out.println(a);
		System.out.println(b);
		
		//선언된 변수는 재선언 할 수 없다. ex) byte a; 불가능
		//다른 데이터 타입의 값을 넣을 수 없다.
		
		char c='a'; //char: 한 글자만 넣을 수 있음. 작은 따옴표 사용
		String d;
		d="이이이이ㅣ잉";
		String e="dd";
		
		
		System.out.println(a+b+c+d+e);
	}

}
