package ch10.Ex06;
//super Ű���� : �θ� Ŭ������ ��Ī. �޼ҵ� ���ο��� ���. ������ ���ο��� ���.
//super() : ������ ���ο����� ���. �θ� �����ڸ� ȣ���� �� ���
			//�ݵ�� ù ���ο� ��ġ�ؾ���.
//this Ű���� : �ڽ��� ��ü�� ��Ī. �޼ҵ� ���ο��� ���. ������ ���ο��� ���. �ʵ� �̸� ��, �޼ҵ� �̸� �տ��� ���.
//this() : ������ ���ο����� ���. �ڽ��� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���
			//�ݵ�� ù ���ο� ��ġ�ؾ���.
class AAA{
	AAA() {
		System.out.println("AAA ������");
	}
}
class BBB extends AAA{
	BBB(){
//		super();
		System.out.println("BBB ������");
	}
}
class CCC extends AAA{
	CCC(){}
	CCC(int a){
		System.out.println("CCC ������ "+a);
	}
}
class DDD extends CCC{
	DDD(){
		super();
	}
	DDD(int a){
		super(3);
		System.out.println("DDD ������ ���� 1 : "+a);
	}
}
public class SuperMethod1 {
	public static void main(String[] args) {
		//��ü ����
		AAA aaa=new AAA(); //�⺻ ������ ȣ��
		System.out.println("===========");
		
		BBB bbb=new BBB(); //�⺻ ������ ȣ��
		System.out.println("===========");
		CCC ccc=new CCC(); //�⺻ ������ ȣ��
		System.out.println("===========");
		DDD ddd=new DDD(); //�⺻ ������ ȣ��
		System.out.println("===========");
		DDD dd2=new DDD(5);
		
	}
}

