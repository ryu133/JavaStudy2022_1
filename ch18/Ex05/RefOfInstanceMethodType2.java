package ch18.Ex05;

//2 �޼ҵ� ���� (���� �޼ҵ� ǥ��)
	//�޼ҵ� ����: ���� �������� �ʰ� ������ �޼ҵ带 �����ؼ� ���
	//���� �޼ҵ� ����

interface A{
	void abc();
}

class B{
	static void bcd() { //static �޼ҵ�: Ŭ���������� ȣ�� ����
		System.out.println("method");
	}
}

public class RefOfInstanceMethodType2 {
	public static void main(String[] args) {
		//���� �޼ҵ� ���� 
		//1 �̳�Ŭ������ ó��
		A a1=new A() {
			@Override
			public void abc() {
				B.bcd(); //static�� ����� ���� �޼ҵ� ȣ��, ��ü �������� Ŭ���������� ȣ��
			}
		};
		
		//2 ���ٽ� ǥ��
		A a2=()->{B.bcd();};
		
		//3 ���� �޼ҵ� ����
		A a3=B::bcd;
		
		a1.abc();
		a2.abc();
		a3.abc();
		
		
		
		
		
	}
}
