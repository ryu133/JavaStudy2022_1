package ch18.Ex06;

interface A{
	void abc(B b,int k);
}

class B{
	void bcd(int k) { //�ν��Ͻ� �޼ҵ�
		System.out.println(k);
	}
}

public class RefOfInstanceMethodType2_1 {
	public static void main(String[] args) {
		//�ν��Ͻ� �޼ҵ� ���� type2 - �ν��Ͻ� �޼ҵ�
		//�͸� �̳�Ŭ����
		
		A a1= new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		//���ٽ� ǥ��
		A a2= (B b, int k) -> {b.bcd(k);};
		
		//�ν��Ͻ� �޼ҵ� ����
		A a3=B::bcd;	//<= B ��ü�� �Է¹޾Ƽ� bcd() �޼ҵ带 ȣ��
			//��ü�� �빮�ڰ� ���� ��� 1. ���� �޼ҵ� 2. �ν��Ͻ� �޼ҵ����� �Ű������� ��ü�� ��(�Էµ�) �� 
		
		B b=new B();
		
		a1.abc(b, 7);
		a1.abc(b, 8);
		a1.abc(b, 9);
		
		
		
		
		
	}
}
