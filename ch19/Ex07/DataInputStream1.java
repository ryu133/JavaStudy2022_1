package ch19.Ex07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
//InputStream: ��� ��Ʈ��
	//int => SSS(����), SSS(����) => int 
//DataInputStream: ��� ��Ʈ���� �߰� ����� �����ϴ� ��Ʈ��, ��� ��Ʈ���� �ݵ�� �����ؾ� ��. �ܵ� ��� �Ұ�
	//�پ��� ������ �����͸� ������ ������ �� ��� 
	//int => int, double => double ������ ��ȯ�� ���� ����(����Ʈ�� �����ߴٰ� �ٽ� �����ϴ� ������ ���� �ʴ´�)

public class DataInputStream1 {
	public static void main(String[] args) {
		//���� ����
		File dataFile=new File("ch19/Ex07/file1.data"); //Ȯ���� ����
		
		//������ ����
		try (OutputStream os=new FileOutputStream(dataFile);
				DataOutputStream dos=new DataOutputStream(os);) //�߰� ����� ����: ������ ���ο� ��� ��Ʈ�� ����
		{
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("�ȳ��ϼ���");
			dos.flush();
		} catch (Exception e) {		} //��� ������ �ֻ��� Ŭ���� Exception: ���� ��� ���ܸ� ó����
		
		//   #@333333 A �ȳ��ϼ���      <<������ �ƴϴ�?
		//������ �б�(DataInputStream)
		try (InputStream is=new FileInputStream(dataFile);
				DataInputStream dis=new DataInputStream(is);)
		{
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
