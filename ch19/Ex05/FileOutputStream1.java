package ch19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//InputStream: �߻� Ŭ���� <= FileInputStream�� ������ Ŭ���� (�б�)
//OutputStream: �߻� Ŭ���� <= FileOutputStream�� ������ Ŭ���� (����)
//FileInputStream: byte ���� ������ �б�
//FileOutputStream: byte ���� ������ ����

//Windows �ܼ��̳� �޸��忡 Enter�� ������ \r\n���� ���� ó����
//Mac : \n

public class FileOutputStream1 {
	public static void main(String[] args) throws IOException {
		//1 �Է� ���� ����
		File outFile=new File("ch19/Ex05/FileOutput1.txt");
			//FileOutputStream�� �������� �ʴ� ������ ������ ���� �� ������
			//FileInputStream ��ο� ������ �����ؾ� ��. ���ٸ� ���� �߻�
		
		//2-1 byte ����
		OutputStream os1=new FileOutputStream(outFile);
		os1.write('J');  //write: IOExceptioin �߻� ����
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r'); //13  <= ���� ����
		os1.write('\n'); //10
		
		//�߿�! write() �� ����(RAM)�� ����, ���۰� �� ���� ���Ͽ� ����
		//		flush() : ���ۿ� ����� ������ ���Ͽ� ������ ����
		
		os1.flush(); //���۰� �� ���� �ʴ��� ������ ���Ͽ� ���� �� <= ���� ����, write()�� ����ϸ� flush() ����� ���� ����
		os1.close(); //close() ȣ�� �� flush() ���� �۵���
		
		//2-2 n-byte ���� ���� (byte[]�� offset���� length���� byte ������ ����)
		OutputStream os2=new FileOutputStream(outFile);  //�����(false) �⺻��. ���� ����  //�̾��(true)
						//FileOutputStream(File o, Boolean append) o:���� ��ü append: true or false
		byte[] byteArray1="Hello!".getBytes();  //Hello!: string --> byte�� ��ȯ�ؾ� ��. getBytes() ���
		
		os2.write(byteArray1);
		os2.write('\n'); //\r�� ���� ����, \n�� �־ windows���� enter �����
		
		os2.flush();
		os2.close(); //
		
		//3 n-byte ���� ���� (byte[]�� offset���� length���� byte ������ ����)
		OutputStream os3=new FileOutputStream(outFile,true); //�̾��
		byte[] byteArray2="Better the last smile than the first laughter".getBytes();
		os3.write(byteArray2,7,8); //7���� 8�� �о ����
		
		os3.flush();
		os3.close();
		
		
		
		
	}
}
