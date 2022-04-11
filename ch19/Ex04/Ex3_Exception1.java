package ch19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import ch14.Ex04.TryWithResource1;

//1 is1  <=inputstream ��ü (�����η� ���� ms949) ����ó��
//2 is2  <=inputstream ��ü (����η� ���� utf-8) ����ó�� 
		//close() �ڵ� ó��

//������ǲ��Ʈ������ �о ���

public class Ex3_Exception1 {
	public static void main(String[] args) {
		File ms=new File("C:\\Users\\kosmo\\OneDrive - ���Ѵ��б�\\�����T\\java\\kosmo_r\\src\\ch19\\Ex04\\exceptionMS949.txt");
		File utf=new File("ch19/Ex04/exceptionUTF8.txt");
		
		InputStream is1=null; //���� ������ ����. finally ��Ͽ��� close()�� ����ϱ� ����
		byte[] arr=new byte[100];
		int data=0;
		
		//try-catch �������� ó��
		try {
			is1=new FileInputStream(ms); //��ü ����
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} 
		
		try {
			while ((data=is1.read(arr))!=-1) { 
				String str=new String(arr,0,data,Charset.forName("MS949"));
				System.out.println(str);
//				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("������ ���� ���ϴ� ���ܰ� �߻��Ǿ����ϴ�.");
		} finally {
			if (is1!=null) {
				try {is1.close();} catch (Exception e2) {}
			}
		}
		System.out.println();
		
		
		//���� exception�� ���ؼ� ���� try-catch�� ó��
			//�ѱ� ó�� #1 byte[] ����
		InputStream is11=null; //���� ������ ����. finally ��Ͽ��� close()�� ����ϱ� ����
		byte[] arr1=new byte[100];
		int data1=0;
		
		try {
			is11=new FileInputStream(ms); //��ü ����	 FileNotFoundException ���� �߻� ����
			while ((data1=is11.read(arr1))!=-1) { 	//IOException ���� �߻� ����
				//�ѱ� ó�� #2 read(byte�迭)
				String str=new String(arr1,0,data1,Charset.forName("MS949"));
				//�ѱ� ó�� #3 String(byte�迭,offset,length,"���ڵ� Ÿ��")
					//offset:		length:
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println("������ ���� ���ϴ� ���ܰ� �߻��Ǿ����ϴ�.");
		} finally {
			if (is11!=null) {
				try {is11.close();} catch (Exception e2) {}
			}
		}

		
		
		System.out.println();
		
		byte[] arr2=new byte[100];
			//�ѱ� ó�� #1 byte �迭 ����
		try (InputStream is2=new FileInputStream(utf);) {
			//try(with resource): ��ü����, �޸�(RAM) ��� <= close() �ڵ� ó���� AutoCloseable�� close()�� ������ Ŭ����
			while ((data=is2.read(arr2))!=-1) {
					//�ѱ� ó�� #2 is.read(byte �迭)
				String str=new String(arr2,Charset.forName("UTF-8"));
					//�ѱ� ó�� #3 new String(byte�迭,(offset,length,)"encoding")
													//offset,length ���� ����
				System.out.println(str);
//				System.out.print((char)data);
			}
		} catch (Exception e) {
			System.out.println("error");
		}
		
		
	}
}
