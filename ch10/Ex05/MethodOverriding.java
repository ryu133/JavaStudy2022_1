package ch10.Ex05;
class A{
	A(){} //�⺻ ������: Ŭ���� ���� �ٸ� �����ڰ� �������� ���� ��� ���� ����
	//�ν��Ͻ� �޼ҵ� �������̵�: ��� ���迡�� �޼ҵ� �������̵��� �ν��Ͻ� �޼ҵ常 �������̵� �ȴ�.
	//��Ӱ��迡�� �ν��Ͻ� �ʵ�, ���� �ʵ�, ���� �޼ҵ�� �������̵����� �ʴ´�
	//�������̵��� ���� �ñ״���(�ĺ���)�� ���ƾ� �Ѵ�. ����Ÿ��, �޼ҵ��, �Ű����� Ÿ��, �Ű����� ����
	void print() {
		System.out.println("class A");
	}
}
class B extends A{
	@Override
	void print() {
		System.out.println("class B");
	}
}
class C extends A{
	@Override
	void print() {
		System.out.println("class C");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		//1 A Ÿ�� A ������ 
		A a=new A();
		a.print();
		//2 B Ÿ�� B ������
		B b=new B();
		b.print();
		//3 C Ÿ�� C ������
		C c=new C();
		c.print();
		//4 A Ÿ�� B ������(�������̵����� A�� print() ȣ�� �� B�� print() ��µ� 
		A ab=new B();
		ab.print(); //A �޼ҵ� ȣ�� ==> B �޼ҵ� ���
		//5 A Ÿ�� C ������(�������̵����� A�� print() ȣ�� �� C�� print() ��µ�
		A ac=new C();
		ac.print();
		
		System.out.println("========");
		A[] arr= {ab,ac}; 
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
		}
		System.out.println("========");
		for (A k : arr) {
			k.print();
		}
		
	}
}
