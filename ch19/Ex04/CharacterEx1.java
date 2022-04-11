package ch19.Ex04;

public class CharacterEx1 {
	public static void main(String[] args) {
		//1 char => int 변환
		
		char ch1='A'; //char: 2byte
		System.out.println(ch1); //A
		System.out.println((int)ch1); //65
		
		char ch1_1='a'; //char: 2byte
		System.out.println(ch1_1); //a
		System.out.println((int)ch1_1); //97
		
		char ch2='Z';
		System.out.println(ch2); //Z
		System.out.println((int)ch2); //90
		
		//2 char에 정수(아스키 코드)로 저장할 수 있다
		char ch3=66; //char체 정수 값으로 저장 가능
		System.out.println(ch3); //B
		System.out.println((char)ch3); //B
		System.out.println((int)ch3);  //66
		
		char ch4=65; //char: 2byte
		System.out.println(ch4);
		System.out.println((int)ch4);
		
		
		
		
		
		
		
		
		
		
	}
}
