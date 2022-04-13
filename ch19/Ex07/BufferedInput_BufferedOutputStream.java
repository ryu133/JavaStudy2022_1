package ch19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//BufferedInputStream: InputStream�� ���͸� �����ؼ� �б� ������ ���� ������ �� ��Ʈ��, �ܵ����� ����� �� ����. ��� ��Ʈ���� �߰����
//BufferedOutputStream: OutputStream�� ���͸� �����ؼ� ���� ������ ���� ������ �� ��Ʈ��, �ܵ����� ����� �� ����. ��� ��Ʈ���� �߰����

public class BufferedInput_BufferedOutputStream {
	public static void main(String[] args) {
		//�� ������ ����, Buffered�� ������� �ʰ� ó���ϴ� ���, Buffered�� ����ϴ� ��� �ӵ� ����
		
		File orgFile=new File("ch19\\Ex07\\mycat_origin.jpg"); //���� ���� 
		File copyFile1=new File("ch19\\Ex07\\mycat_copy1.jpg"); //Buffered�� ������� �ʰ� ó���ϴ� ���
		File copyFile2=new File("ch19\\Ex07\\mycat_copy2.jpg"); //Buffered�� ����ϴ� ���
		
		//���� ������ �ϱ� ���� ���� ����
		long start,end,time1,time2; //time1: Buffered�� ������� �ʴ� ���, time2: Buffered�� ����� ���
		
		
		//1 Buffered�� ������� �ʰ� ó���ϴ� ���(BufferedInputStream,BufferedOutputStream)
		start=System.nanoTime(); //���� �ð�
		
		
		try (InputStream is=new FileInputStream(orgFile); //Auto close()
			 OutputStream os=new FileOutputStream(copyFile1); //Auto close()
		) {
			//������ ���� �ڵ� ����
			int data;
			while ((data=is.read())!=-1) { //is���� 1byte �о 
				os.write(data);				//os�� 1byte ����
			}
		} catch (IOException e) {}
		end=System.nanoTime();
		time1=end-start;
		System.out.println("Without Buffered In-Out Stream : "+time1); //���۸� ������� �ʰ� ���� copy1.jpg
		
		//2 Buffered�� ����ؼ� ó���ϴ� ���(BufferedInputStream,BufferedOutputStream)
		start=System.nanoTime();
		
		try (InputStream is=new FileInputStream(orgFile); //��� ��Ʈ��
				BufferedInputStream bis=new BufferedInputStream(is); //�߰� ����� ����ϴ� ��Ʈ��. ������ ������ ó��(Buffer ���)
				OutputStream os=new FileOutputStream(copyFile2); //��� ��Ʈ��
				BufferedOutputStream bos=new BufferedOutputStream(os);) //�߰� ��� ����(����)
		{
			int data;
			while ((data=bis.read())!=-1) { //���۸� ����ؼ� �б� (����)
				bos.write(data); //���۸� ����ؼ� ���� (����)
			}
		} catch (IOException e) {}
		end=System.nanoTime();
		time2=end-start;
		System.out.println("With Buffered In-Out Stream : "+time2);
		
		//Buffered ����� ���(time2), ������� ���� ���(time1)�� ����
		System.out.println("�ӵ� ���� : "+(time1/time2)+"�� ����");
		
		
	}
}
