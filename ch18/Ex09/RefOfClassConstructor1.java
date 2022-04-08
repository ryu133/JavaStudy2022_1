package ch18.Ex09;

interface A{
	B abc(); //���� Ÿ���� B ��ü
}

class B{
	B() {
		System.out.println("1");
	}
	B(int k){
		System.out.println("2");
	}
}

public class RefOfClassConstructor1 {
	public static void main(String[] args) {
		//1 Ŭ���� ������ ����
		//�͸� �̳�Ŭ����
		A a1=new A() {
			@Override
			public B abc() { //abc() ȣ�� �� B ��ü�� �⺻ ������ ���� (����: �ڽ� �̿ܿ� �ٸ� ������ �����ڳ� �޼ҵ带 ȣ��)
				return new B();
			}
		};
		
		//���ٽ� ǥ��
		A a2=()->{return new B();}; //��ü ����
		A a3=()-> new B(); //��� ����. return ���� �� �߰�ȣ�� �����ؾ� ��.
		
		//Ŭ���� ������ ����
		A a4=B::new;
		
		a1.abc();
		a2.abc();
		a3.abc();
		a4.abc();
		
		System.out.println("===============");
		
		
		
		
		
		
		
		
		
	}
}
