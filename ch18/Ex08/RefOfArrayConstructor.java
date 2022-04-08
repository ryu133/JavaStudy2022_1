package ch18.Ex08;

//�迭�� �����ڿ� ����

interface A{
	int[] abc(int len);
}



public class RefOfArrayConstructor {
	public static void main(String[] args) {
		//�迭�� ������ ����
		//1 �͸� �̳�Ŭ����
		A a1=new A() {	//�迭 ����: int[] abc=new int[���� ����];
			@Override
			public int[] abc(int len) { //������ len ���� �Է¹޾Ƽ� �迭�� ���� ũ�� ����
				return new int[len]; 
			}
		};
		
		//2 ���ٽ�
		A a2=(int len)->{return new int[len];};
		
		//�迭�� ������ ���� ǥ��
		A a3=int[]::new;
		
		//�迭 ���� ����
		//int[] array1=new int[3]; <==�迭 ����
		//int[] array2=new int{1,2,3,4,5}; <==����� ���ÿ� �� �Ҵ�
		//int[] array3={1,2,3,4,5}; <==����� ���ÿ� �� �Ҵ�(����)
		
		
		int[] array1= a1.abc(3);
		System.out.println(array1.length);
		
		int[] array2= a2.abc(4);
		System.out.println(array2.length);
		
		int[] array3= a3.abc(5);
		System.out.println(array3.length);
		
		
		
		
		
		
		
		
	}
}
