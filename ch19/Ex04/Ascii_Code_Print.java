package ch19.Ex04;

//ASCII �ڵ� �� ���: 1byte=8bit, ���� ó�� ��Ʈ�� ��ȣ��Ʈ, 7bit�� ����
//1~32 ������ ����� �� ���� Ư���� �ڵ� ex) null, ����� ����, �����(7), ����(10, LF)..
//127: delete
//���� ��� ������ �� 33~126����
//����, ����, Ư������ �� 

//��³���
//=================================
//ASCII		����		ASCII		����
//=================================
// 	33	     !		 34			 &

public class Ascii_Code_Print {
	public static void main(String[] args) {
		char[] c=new char[93];
		System.out.println("=================================");
		System.out.println("ASCII\t����\tASCII\t����");
		System.out.println("=================================");
		for (int i = 33;i<127; i+=2) {
//			c[i]=(char) (33+i);
//			System.out.println((i+33)+"\t"+c[i]+"\t  "+(i+34)+"\t"+(char)c[i+1]);
//			System.out.println(i+"\t"+(char)i+"\t  "+(i+1)+"\t"+(char)(i+1));
			System.out.println(i+"\t"+(char)i+"\t  "+(i+1)+"\t"+(char)(i+1));
			
		}
		
		
		
	}

}
