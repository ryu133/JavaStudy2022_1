package ch10.Ex06.Super;

//�ڽ� ��ü�� ������ �� �θ� Ŭ������ �⺻ �����ڸ� ���� ȣ��. super() 
//��� �ڽ� ��ü�� �����ڿ��� super() �����Ǿ� ����

class A{
	A(){
		System.out.println("A class �⺻ ������");
	}
	A(int a){
		System.out.println("A class ���� 1�� ������ "+a);
	}
	A(int a,int b){
		System.out.println("A class ���� 2�� ������ "+a+", "+b);
	}
}
class B extends A{
	B(){
//		super();
		System.out.println("B class �⺻ ������");
	}
	B(String a){
		super(3, 5);
		System.out.println("B class ���ڿ� 1�� ������ "+a);
	}
}
class C extends B{
	C(){
		super("c���� ȣ��");
		System.out.println("C class �⺻ ������");
	}
}
public class SuperMethod2 {
	public static void main(String[] args) {
		C c=new C();
		
	}
}
