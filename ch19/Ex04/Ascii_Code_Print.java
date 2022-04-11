package ch19.Ex04;

//ASCII 코드 값 출력: 1byte=8bit, 제일 처음 비트는 부호비트, 7bit가 내용
//1~32 까지는 출력할 수 없는 특수한 코드 ex) null, 헤더의 시작, 경고음(7), 개행(10, LF)..
//127: delete
//실제 출력 가능한 건 33~126까지
//영문, 숫자, 특수문자 등 

//출력내용
//=================================
//ASCII		문자		ASCII		문자
//=================================
// 	33	     !		 34			 &

public class Ascii_Code_Print {
	public static void main(String[] args) {
		char[] c=new char[93];
		System.out.println("=================================");
		System.out.println("ASCII\t문자\tASCII\t문자");
		System.out.println("=================================");
		for (int i = 33;i<127; i+=2) {
//			c[i]=(char) (33+i);
//			System.out.println((i+33)+"\t"+c[i]+"\t  "+(i+34)+"\t"+(char)c[i+1]);
//			System.out.println(i+"\t"+(char)i+"\t  "+(i+1)+"\t"+(char)(i+1));
			System.out.println(i+"\t"+(char)i+"\t  "+(i+1)+"\t"+(char)(i+1));
			
		}
		
		
		
	}

}
