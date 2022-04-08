package ch19.Ex03;

import java.io.UnsupportedEncodingException;

//EUC-KR: �ѱ� ǥ��, �ѱ� ǥ�� ���� ��ü �� ǥ�� ������ �͸� ������. �� 11000 ->2200�� ǥ��, 8000�ڴ� ǥ�� �ȵ�
	//����: 1byte, �ѱ�: 2byte
//MS949: Microsoft���� ������ �ѱ� ǥ�� ���. 11000�� ��� ǥ�� ����
	//����: 1byte, �ѱ�: 2byte
//UTF-8: ��� ����(web,FTP,Mail,DB, ..),git,Mac <���� ����>
	//����: 1byte, �ѱ�: 3byte
//URF-16: <���� ����>
	//����: 2byte, �ѱ�: 2byte
	
//���ڸ� �ش� ���ڵ� Ÿ������ ����Ʈ ��Ʈ������ ������ ��� �ش� ���ڵ� Ÿ������ ������ �ؾ� ������ �ʴ´�

//��Ŭ�������� ���ڵ� Ÿ�� ���� 3����
	//1 ���� ����: 
	//2 ������Ʈ���� ����: 
	//3 ���Ͽ��� ����: 

	//�켱����- ����>������Ʈ>����(��ũ�����̽�)
public class EUCKR_VS_MS949 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//EUCKR vs MS949
		
		//1 �����ڸ� byte�� �������� �ٽ� String���� ��ȯ 
		byte[] b1="a".getBytes("EUC-KR"); //���ڸ� byte�� ��ȯ => ��Ʈ��ũ�� ���ڸ� byte��Ʈ������ ��ȯ�ؼ� ����
			//���� �߻��� (UnsupportedEncodingException) <= ��Ÿ�� �߻��� ��� ���ڵ��� �� ���� ���ܰ� �߻���
		byte[] b2="a".getBytes("MS949"); //���ڿ� => byte[]
		
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		System.out.println(new String(b1,"EUC-KR")); //byte[] => ���ڿ��� �ٲ�
		System.out.println(new String(b2,"MS949"));
		
		
		//2 �ѱ��� byte�� �������� String���� ��������
		byte[] b3="��".getBytes("EUC-KR");
		byte[] b4="��".getBytes("MS949");
		
		System.out.println(b3.length);
		System.out.println(b4.length);
		
		System.out.println(new String(b3,"EUC-KR"));
		System.out.println(new String(b4,"MS949"));
		
		
		//3 EUC-KR�� ���� ��� ������ �͸� ǥ�� 
		byte[] b5="��".getBytes("EUC-KR"); //�� 11000�� (�� 2200�� ǥ��, 800�� ǥ��x)
		byte[] b6="��".getBytes("MS949");	//11000�� ��� ó��
		
		System.out.println(b5.length);
		System.out.println(b6.length);
		
		System.out.println(new String(b5,"EUC-KR"));
		System.out.println(new String(b6,"MS949"));
		
		
	}

}
