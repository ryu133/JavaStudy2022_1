package ch0607.Ex04;
//1. this�� Ű����� ���Ǵ� ���: this.m(�ʵ��� m), this.init()(�ڽ� ��ü�� �޼ҵ� init())
//2. this�� �޼ҵ�� ���Ǵ� ���: this(); <=������ ������ �ٸ� �����ڸ� ȣ���� �� ���
//							�ݵ�� ������ ������ ù �ٿ� �;� ��. �޼ҵ� ���ο����� ����� �� ����.(������ �������� ��� ����)

class Abc{
	Abc(){ //�������� �Ű����� ���� ���� ������
		System.out.println("ù��° �������Դϴ�.");
	}
	Abc(int a){
		this(); //�Ű������� ���� ������ ȣ��. �ݵ�� �������� ù �ٿ� �;���.
		System.out.println("�ι�° �������Դϴ�.");
	}
	Abc(int a,String b){
		this(30); //�Ű������� 1���� ������ ȣ��
		System.out.println("����° �������Դϴ�.");
	}
//	void abc() { 
////		this(); //�޼ҵ� �������� this();�� ����� �� ����
//				//this();<<=�ٸ� �����ڸ� ȣ���� �� ���
//	}
}

public class ThisMethod1 {
	public static void main(String[] args) {
		//��ü ����
		Abc abc=new Abc(); //�Ű������� ���� ������ ȣ��
		System.out.println("===============");
		Abc abc1=new Abc(10); //�Ű������� ���� 1���� �����ڸ� ȣ��
		System.out.println("===============");
		Abc abc2=new Abc(10,"�ȳ�"); //�Ű������� ���� 2���� �����ڸ� ȣ��
	}

}