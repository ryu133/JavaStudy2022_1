package ch19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream2 {
	public static void main(String[] args) throws IOException {
		//1 �Է� ���� ����
		File inFile=new File("ch19\\Ex04\\FileInputStream1.txt");
		
		InputStream is=null;//��ü ���� //finally ��Ͽ��� close()�� ����ϱ� ����
		
		//2. #1 byte ���� �б� (�� ����Ʈ�� �о ó��)
		try {
			is=new FileInputStream(inFile); //��ü ����
			int data;
			while ((data = is.read()) !=-1) { //������ �����Ƿ� read()�� ���, �ѱ��� ��� read(byte �迭)
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		} finally {
			if (is !=null) {
				try {
					is.close(); //null�� �� close�� �ϸ� IOException �߻�
				} catch (IOException e) {
					
				}
			}
		}
		
		
		
		System.out.println("\n======try-with resource{} �� �����ϱ�===========");
		
		
		try (InputStream is1_1=new FileInputStream(inFile);){
//			try(with resource: ��ü ����) <= close()�� �ڵ����� ��, FileInputStream Closeable �������̽��� ����
			int data;
			while ((data = is1_1.read()) !=-1) { //������ �����Ƿ� read()�� ���, �ѱ��� ��� read(byte �迭)
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		} 
		
		System.out.println();
		System.out.println();
		
		//3. #2-1 n-byte ������ �б�(byte[]�� ó�� ��ġ�������� ���� ������ ����): ���� ����Ʈ�� ���ÿ� �о ó���ӵ��� ����
			//�迭�� ���� ũ�⸸ŭ �о�ͼ� byte�迭�� ����
		InputStream is2=new FileInputStream(inFile); //throws�� ó��
		byte[] byteArray1=new byte[9]; //�迭�� 9��, 0~8����
		int count1;
		while ((count1=is2.read(byteArray1))!=-1) { //-1: ������ ����������
				//is2.read(): 1byte�� �д´�			//�ѱ� ó�� ����
				//is2.read(byteArray1): 9byte�� �д´�. byteArray1�� ����
				//count1: 9, 9, 2
			for (int i = 0; i < count1; i++) {
				System.out.print((char)byteArray1[i]);
			}
//			System.out.println(": count1= "+count1);
//			System.out.println();
//			System.out.println("==========================");
//			String str=new String(byteArray1,Charset.forName("MS949"));
//			System.out.println(str);
		}
		System.out.println();
 
		is2.close();
		
		//3. #2-2 n-byte ������ �ѱ� �б�(�迭 ������ �о �ѱ� ó��)
		InputStream is3=new FileInputStream(inFile);
		byte[] byteArray2=new byte[100];
		int count2;
		
		while ((count2=is3.read(byteArray2))!=-1) { //count2=100,-1
			System.out.println(new String(byteArray2,Charset.forName("MS949")));
		}
		is3.close();
		
		System.out.println("=================");
		
		//4 #3 n-byte ������ �о ����. offset,length ���
		InputStream is4=new FileInputStream(inFile);
		byte[] byteArray3=new byte[9];
		
		int offset=3;
		int length=6;
		int count3=is4.read(byteArray3,offset,length); 
		//length��ŭ �տ��� �о�ͼ� byte[]�� offset��ġ�� ����
		
		for (int i = 0; i < (offset+count3); i++) {
			System.out.print((char)byteArray3[i]);
		}
		
		is4.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
