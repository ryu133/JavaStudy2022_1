package ch18.Ex07;

interface A{
	int abc(String str);
}


public class RefOfInstanceMethodType2_2 {
	public static void main(String[] args) {
		//�ν��Ͻ� �޼ҵ� ���� type2 - ���� �޼ҵ�
		//1 �͸� �̳�Ŭ����
		A a1=new A() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		
		//2 ���ٽ� ǥ��
		A a2=(String str)-> str.length();
		
		//3 �ν��Ͻ� �޼ҵ� ���� type2
		A a3=String::length;
		
		System.out.println(a1.abc("�ȳ�"));
		System.out.println(a2.abc("�ȳ��ϼ���"));
		System.out.println(a3.abc("�ȳ��ϼ��� �ݰ����ϴ�"));
		
		
		
		
		
		
	}
}
