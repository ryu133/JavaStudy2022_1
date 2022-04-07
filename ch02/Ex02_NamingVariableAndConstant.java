package ch02;

public class Ex02_NamingVariableAndConstant {

	public static void main(String[] args) {
		//<변수명>
		boolean aaB=true; //변수명의 첫 글자는 소문자로 시작. 대문자는 비권장. 단어를 연결한 경우 첫 단어는 대문자.
		byte 가가=3; //한글 가능(비권장). -125 ~ +127 
		short a_b=55;//특문 언더바_ 가능
		char $a='q'; //특문 달러$ 가능
		//다른 특문은 불가능
		long ab1=3546; //숫자 가능. 첫 글자에는 불가능
		//자바의 예약어는 불가능 ex)class, public 등
		
		final double PI=155.02235; //상수는 앞에 final 사용. 상수: 값을 변경(재할당)할 수 없음. 전체 대문자. 소문자 비권장.
		final int MY_DATA=66;
		final float my_Data=88;//소문자 비권장
		
		//long에 값을 넣을 떄 뒤에 l(소문자)이나 L(대문자)을 붙여줘야 함
		
		System.out.println(aaB+"\n"+가가+"\n"+a_b+"\n"+$a+"\n"+ab1+"\n"+PI+"\n"+MY_DATA+"\n"+my_Data);
	}

}
