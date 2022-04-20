package Fruit_Ex;

import java.util.ArrayList;
import java.util.Scanner;

/* 상속 관련 문제 (하위의 생성자에 super() 사용)
 * 실행파일도 압축해서 제출
 * 
 */

class Fruit{
	String fruitName; //과일 이름
	String color; //과일 색
	int large; //과일 크기
	
	@Override
	public String toString() { //과일의 정보를 출력하는 메소드
		return "과일의 이름 : <"+fruitName+"> 이고, 색은 <"+color+">이고, 크기는 <"+large+"> 입니다.";
	}
}

class Apple extends Fruit{
	public Apple() {
		super();
		
	}
}

class Orange extends Fruit{
	public Orange() {
		super();
	}
}

class Banana extends Fruit{
	public Banana() {
		super();
	}
}

public class Fruit_Test {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		ArrayList<Fruit> fruits=new ArrayList<>();
		
		
		while (true) {
			System.out.println("===================================================");
			System.out.println(" 1. 사과 | 2. 오렌지 | 3. 바나나 | 4. 정보출력 | 5. 종료");
			System.out.println("===================================================");
			System.out.println("선택 >>");
			
			int selectNo=scanner.nextInt();
			if (selectNo==1) {
				Apple apple=new Apple();
				System.out.println("과일명: ");
				apple.fruitName=scanner.next();
				System.out.println("색: ");
				apple.color=scanner.next();
				System.out.println("크기: ");
				apple.large=scanner.nextInt();
				fruits.add(apple);
			}else if (selectNo==2) {
				Orange orange=new Orange();
				System.out.println("과일명: ");
				orange.fruitName=scanner.next();
				System.out.println("색: ");
				orange.color=scanner.next();
				System.out.println("크기: ");
				orange.large=scanner.nextInt();
				fruits.add(orange);
			}else if (selectNo==3) {
				Banana banana=new Banana();
				System.out.println("과일명: ");
				banana.fruitName=scanner.next();
				System.out.println("색: ");
				banana.color=scanner.next();
				System.out.println("크기: ");
				banana.large=scanner.nextInt();
				fruits.add(banana);
			}else if (selectNo==4) {
				for (Fruit fruit : fruits) {
					System.out.println(fruit);
				}
			}else if (selectNo==5) {
				break;
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
		
		//1~3 입력받아서 각각의 객체를 생성해 ArrayList<Fruit>에 저장
		
		//4 선택하면 Enhanced for문을 사용하여 ArrayList에 있는 모든 객체를 출력함
			//과일의 이름 : <사과> 이고, 색은 <빨강>이고, 크기는 <10> 입니다.
			//<오렌지/바나나>  <주황/노랑>  <20/30>
		
		
		
		
		
	}
}
