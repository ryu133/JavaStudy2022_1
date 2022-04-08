package ch19.Ex03;

import java.nio.charset.Charset; //Charset Ŭ����

public class CreateCharsetObject {
	public static void main(String[] args) {
		//���� ���ڵ� ������ �����ϴ� ���
		//1 Charset.defaultCharset() : �ý����� �⺻ �������� �ε�(���ڵ� Ÿ��)
		Charset cs1=Charset.defaultCharset(); //���� �޼ҵ�, �ý����� �⺻ ������ Charset�� �ҷ���
		System.out.println(cs1); //MS949 --> x-windows-949 (MS949�� Ȯ��)
								//UTF-8
		
		//2 Charset.forName("MS949")
		Charset cs2=Charset.forName("MS949");
		System.out.println(cs2);
		
		Charset cs3=Charset.forName("UTF-8");
		System.out.println(cs3);
		
		Charset cs4=Charset.forName("EUC-KR"); //�������� �ʴ� ���ڵ��� ������ ���� �߻�. ���࿹��ó�� �ʿ�
		System.out.println(cs4);
		
		System.out.println(Charset.isSupported("MS949")); //�����Ǵ� ���ڵ����� Ȯ��
		System.out.println(Charset.isSupported("UTF-8"));
		System.out.println(Charset.isSupported("EUC-KR"));
		System.out.println(Charset.isSupported("UTF-16"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
