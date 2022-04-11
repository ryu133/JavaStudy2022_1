package ch19.Ex04;

//대문자 A~Z, 소문자 a~z까지 아스키 코드값 출력 for문 사용
//출력 결과 
//A, 65
//B, 66
//======
//a,97
//..


public class CharacterEx2 {
	public static void main(String[] args) {
		char[] c=new char[26];
		for (int i = 0; i < 26; i++) {
			c[i]=(char) (65+i);
			System.out.println(c[i]+", "+(int)c[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < 26; i++) {
			c[i]=(char) (97+i);
			System.out.println(c[i]+", "+(int)c[i]);
		}
		
		
	}
}
