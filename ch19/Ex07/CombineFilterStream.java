package ch19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//�ϳ��� ��� ��Ʈ���� Filter ��Ʈ���� ���� �� ȥ�վּ� ��� �����ϴ�.
	//���� �������� ó���ϴ� ��Ʈ���� �޼ҵ� ��� ���ο� ���� ������ ���� �� �ִ�.(���� �������� ����� ��Ʈ���� �����ؾ� ��)

//��� ��Ʈ�� FileOutputStream : ���Ͽ� ����(�ϵ忡 ����)
//���� ��Ʈ�� BufferedOutputStream, DataOutputStream
//B: ����(RAM)�� ����ؼ� ������ ó��
//D: �پ��� ���� ����� �״�� ó��

public class CombineFilterStream {
	public static void main(String[] args) {
		//���� ����
		File dataFile=new File("ch19/Ex07/file2.data");
		
		//������ ����
		try (OutputStream os=new FileOutputStream(dataFile);//��� ��Ʈ��
				BufferedOutputStream bos=new BufferedOutputStream(os);//Filter ��Ʈ��: �߰����, �ܵ� ���(x)
				DataOutputStream dos=new DataOutputStream(bos);)//Filter ��Ʈ��: �߰����, �ܵ� ���(x)
		{
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("�ȳ��ϼ���");
			dos.flush();
		} catch (Exception e) {		}
		
		//3 ������ �б�
		try (InputStream is=new FileInputStream(dataFile); //��� ��Ʈ��
				BufferedInputStream bis=new BufferedInputStream(is); //Filter ��Ʈ��: �߰����, �ܵ� ���(x)
				DataInputStream dis=new DataInputStream(bis);) //Filter ��Ʈ��: �߰����, �ܵ� ���(x)
		{
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
