package ch19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class FileInputStream1 {
	public static void main(String[] args) throws IOException {
		//���� �۾� ���丮 ��ġ Ȯ��
		System.out.println(System.getProperty("user.dir"));
		
		//1 �Է� ���� ����
		//���� ��η� ����
		File inFile1=new File("C:\\Users\\RMJ\\OneDrive - ���Ѵ��б�\\�����T\\java\\kosmo_r\\src\\ch19\\files\\FileInputStream1.txt");
		//��� ��η� ����: ���� �۾� ���丮�� �������� ����
		File inFile=new File("ch19/files/FileInputStream1.txt"); 
		
		//InputStream ��ü�� �����ؾ� ������ ������ ���� �� �ִ�
		InputStream is=new FileInputStream(inFile);
			//InputStream�� �߻�Ŭ����, ���� ��ü�� ������ �� ����. Ÿ�� ������ ����
		
		//������ ������ ���
		
		//UTF-8: ����� 1byte, �ѱ��� 3byte
		//MS949: ����� 1byte, �ѱ��� 2byte
		//EUC-KR: ����� 1byte, �ѱ��� 2byte
		//UTF-16: ����� 2byte, �ѱ��� 2byte ,ù��°�� �ĺ��� BOM 2byte
		
		//�� ����Ʈ �����͸� �о char�� ��ȯ �� ���
		System.out.print((char)is.read()); //read(): �� ����Ʈ�� �о���δ�
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		
		System.out.println();
		System.out.println();
		
		//��Ʈ���� �� ������ �� �̻� ���� �� ����(�޸𸮿��� ������) �ٽ� �б� ���ؼ��� ���ο� ��Ʈ���� �����ؾ� ��
		
		//int read(): �� ����Ʈ�� �о ���� ������ ��� ����� ����, ���� �����Ͱ� ���� ��� -1 ����
		//while ���� ����ؼ� �ѹ��� ���
		InputStream is1=new FileInputStream(inFile);
		
		int data;
		
		while ((data=is1.read())!=-1) { //������ ������ ��ȯ
			System.out.print((char)data);
		}
		
		InputStream is2=new FileInputStream(inFile);
		
		//available(): ��Ʈ���� ���� ����Ʈ ���� ���
		while ((data=is2.read())!=-1) { //������ ������ ��ȯ
			System.out.println("���� ������: "+(char)data+" ���� ����Ʈ ��: "+is2.available());
		}
		is.close();
		is1.close();
		is2.close();
		
		
		
		
		
		
		
		
		
	}
}
