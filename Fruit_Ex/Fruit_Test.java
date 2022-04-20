package Fruit_Ex;

import java.util.ArrayList;
import java.util.Scanner;

/* ��� ���� ���� (������ �����ڿ� super() ���)
 * �������ϵ� �����ؼ� ����
 * 
 */

class Fruit{
	String fruitName; //���� �̸�
	String color; //���� ��
	int large; //���� ũ��
	
	@Override
	public String toString() { //������ ������ ����ϴ� �޼ҵ�
		return "������ �̸� : <"+fruitName+"> �̰�, ���� <"+color+">�̰�, ũ��� <"+large+"> �Դϴ�.";
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
			System.out.println(" 1. ��� | 2. ������ | 3. �ٳ��� | 4. ������� | 5. ����");
			System.out.println("===================================================");
			System.out.println("���� >>");
			
			int selectNo=scanner.nextInt();
			if (selectNo==1) {
				Apple apple=new Apple();
				System.out.println("���ϸ�: ");
				apple.fruitName=scanner.next();
				System.out.println("��: ");
				apple.color=scanner.next();
				System.out.println("ũ��: ");
				apple.large=scanner.nextInt();
				fruits.add(apple);
			}else if (selectNo==2) {
				Orange orange=new Orange();
				System.out.println("���ϸ�: ");
				orange.fruitName=scanner.next();
				System.out.println("��: ");
				orange.color=scanner.next();
				System.out.println("ũ��: ");
				orange.large=scanner.nextInt();
				fruits.add(orange);
			}else if (selectNo==3) {
				Banana banana=new Banana();
				System.out.println("���ϸ�: ");
				banana.fruitName=scanner.next();
				System.out.println("��: ");
				banana.color=scanner.next();
				System.out.println("ũ��: ");
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
		System.out.println("���α׷� ����");
		
		//1~3 �Է¹޾Ƽ� ������ ��ü�� ������ ArrayList<Fruit>�� ����
		
		//4 �����ϸ� Enhanced for���� ����Ͽ� ArrayList�� �ִ� ��� ��ü�� �����
			//������ �̸� : <���> �̰�, ���� <����>�̰�, ũ��� <10> �Դϴ�.
			//<������/�ٳ���>  <��Ȳ/���>  <20/30>
		
		
		
		
		
	}
}
