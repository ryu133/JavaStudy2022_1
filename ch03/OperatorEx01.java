package ch03;

public class OperatorEx01 {

	public static void main(String[] args) {
		//진법 변환&~
		int data=13;
		
		System.out.println(Integer.toBinaryString(data));//2진수 변환
		System.out.println(Integer.toOctalString(data));//8진수 변환
		System.out.println(Integer.toHexString(data));//16진수 변환
		
		System.out.println(Integer.parseInt("1101",2));//2진수(1101)를 10진수로 변환
		System.out.println(Integer.parseInt("15",8));//8진수(15)를 10진수로 변환
		System.out.println(Integer.parseInt("0D",16));
		
		System.out.println(~3);
		System.out.println(~7);
	}

}
