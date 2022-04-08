package ch18.Ex10;

interface A{
	B abc(int k); //���� Ÿ���� B ��ü
}

class B{
	B() {
		System.out.println("1");
	}
	B(int k){
		System.out.println("2");
	}
}

public class RefOfClaassConstructor2 {
	public static void main(String[] args) {
		//1 Ŭ���� ������ ����
			//�͸� �̳�Ŭ����
			A a1=new A() {
				@Override
				public B abc(int k) { //abc() ȣ�� �� B ��ü�� ������ ���� (����: �ڽ� �̿ܿ� �ٸ� ������ �����ڳ� �޼ҵ带 ȣ��)
					return new B(3);
				}
			};
			
			//���ٽ� ǥ��
			A a2=(int k)->{return new B(3);}; //��ü ����
			A a3=(k)-> new B(3); //��� ����(��� ǥ��). return ���� �� �߰�ȣ�� �����ؾ� ��. �Ű������� �ϳ��� ��� �ڷ��� ���� ����
			
			//Ŭ���� ������ ����
			A a4=B::new; //B�� 2 ������ ȣ��
			
			a1.abc(3);
			a2.abc(3);
			a3.abc(3);
			a4.abc(3);
				
	}
}
