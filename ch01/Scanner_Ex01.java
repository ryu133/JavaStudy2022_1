package ch01;

import java.util.Scanner;

public class Scanner_Ex01 {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 성별을 빈칸으로 분리하여 입력해 주세요.");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("이름은 "+name+", ");
		String city=sc.next();
		System.out.println("도시는 "+city+", ");
		int age=sc.nextInt();//정수값을 입력받음
		System.out.println("나이는 "+age+", ");
		double vision=sc.nextDouble();//실수값을 입력받음
		System.out.println("시력은 "+vision+", ");
		boolean glasses=sc.nextBoolean();//true or false
		System.out.println("안경 여부는 "+glasses+" 입니다.");
		sc.close();
	}

}
