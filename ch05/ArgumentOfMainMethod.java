package ch05;

public class ArgumentOfMainMethod {
	public static void main(String[] ar) { //메인 메소드(함수)
/*		메소드의 기본 구조
//		void main(String[] args) { void: 리턴값이 없음을 뜻함. main: 메소드 이름. (): 입력값. 매개변수. 인자
//			메소드 호출 시 실행할 코드;
//		
//		
//		}
	*/	String a=ar[0]; //안녕하세요: 문자열 전송
		String b=ar[1]; //3: 정수
		String c=ar[2]; //3.8: 실수
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//main 메소드에 인자값으로 정수나 실수를 넘겨줄 때 String으로 변환
		System.out.println(b+1);
		System.out.println(c+1);
		System.out.println(a+b+c);
		//String을 정수나 더블형으로 변환해서 연산
		
		int d=Integer.parseInt(b); //b(String)===> Integer 타입으로 변환
		double e=Double.parseDouble(c); //c(String)===> Double 형으로 변환
		
		System.out.println(d+1);
		System.out.println(e+1);
		
		
	}
}
