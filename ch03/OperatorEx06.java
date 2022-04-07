package ch03;

public class OperatorEx06 {
//논리 쉬프트를 이용하여 각 비트의 위치 값 알아내기
	public static void main(String[] args) {
		int flags=010110110;
		System.out.println(flags>>>0&1); //0번째 비트값이 출력 0
		System.out.println(flags>>>1&1); //1번째 비트값이 출력 1
		System.out.println(flags>>>2&1); //2번째 비트값이 출력 1
		System.out.println(flags>>>3&1); //3번째 비트값이 출력 0
		System.out.println(flags>>>4&1); //4번째 비트값이 출력 1
		System.out.println(flags>>>5&1); //5번째 비트값이 출력 1
		System.out.println(flags>>>6&1); //6번째 비트값이 출력 0
		
	}

}
