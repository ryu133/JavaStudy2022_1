package ch05;

public class ArgumentOfMainMethod_02 {
	public static void main(String[] args) {
		//main메소드의 인풋 매개변수로 들어오는 배열의 길이를 구하기
		System.out.println(args.length);
		
		//입력 매개변수를 for문으로 출력
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		//입력 매개변수를 향상된 for문(enhances for)으로 출력
		for (String k : args) {
			System.out.println(k);
		}
		
	}
}
