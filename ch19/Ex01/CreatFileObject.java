package ch19.Ex01;

import java.io.File;
import java.io.IOException;

//���� : ��Ŭ�������� ������ ���� �� C:\�� ������ �� ���� ������ ������ �߻��� �� �ִ�.
	//������ �������� ��Ŭ���� �����ϰų� C �Ʒ��� ���� ����

//File ��ü ���� ���� �ĺ��ڸ� ������ ���
	//C:\abc\abc.txt

//1 windows�� ��� : String path="C:\\abc\\abc.txt"        ""���� Ư�����ڸ� ó���ϱ� ���� ��ȣ. \
	//window 10�� ��� : String path="C:/abc/abc.txt"
//2 Mac�� ��� : String path="C:/abc/abc.txt" 

//ȣȯ�� ���� ���������� ����� �� �ִ� �ڵ� �ۼ��ϴ� ��
//String path="C:"+File.separator+"abc"File.separator+"abc.txt"

public class CreatFileObject {
	public static void main(String[] args) throws IOException {
		//1 File ��ü�� ���ּ� ���� ����. �ش� �����̳� ������ �������� �ʴ� ���
		File tempDir=new File("C:/temp001");
		if (!tempDir.exists()) { //�ش� ��ο� �����̳� ������ �����ϸ� true �ƴϸ� false
			tempDir.mkdir(); //���� ����
		}
		System.out.println(tempDir.exists());
		
		//2 File ��ü�� ����ؼ� ���� ����
		File newFile = new File("C:/temp001/newfile.txt"); 
		//C:\ ������ ������ ��� ���� ������ ���� ���� ���� �߻� �� ��Ŭ������ ������ �������� ����
		if (!newFile.exists()) {
			newFile.createNewFile(); //File�� ������ �� ���ܰ� �߻��� �� �ִ�. ����ó�� �ʿ�
		}
		System.out.println(newFile.exists());
		
		//3 ���� ������
		File newFile2=new File("C:\\temp001\\newfile01.txt"); //windows10 ���� ������
		File newFile3=new File("C:/temp001/newfile02.txt"); //windows10, Mac
		if (!newFile2.exists()) {newFile2.createNewFile();}
		if (!newFile3.exists()) {newFile3.createNewFile();}
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		
		//��� OS���� �������� �ĺ� ������ �ڵ�
		File newFile4=new File("C:"+File.separator+"temp001"+File.separator+"newfile01.txt");
		if (!newFile4.exists()) {newFile4.createNewFile();}
		System.out.println(newFile4.exists());
		
		//4 ���� ��η� ó��: �ٸ� �ý������� �̵��� ��� �� �ý��� ȯ�濡 �µ��� ������ �ʿ�
		File newFile5=new File("C:/temp001/newfile05.txt");
		System.out.println(newFile5.getAbsolutePath()); //file ��ü�� ����� ������ ���� ��θ� ���
		
		//5 ��� ��η� ó�� <= ����
		//���� ���� �۾� ������ ��ġ
		System.out.println(System.getProperty("user.dir"));
			//��Ŭ���� ���� ���� ��ġ
		File newFile6=new File("newfile06.txt");
		if (!newFile4.exists()) {newFile6.createNewFile();}
		System.out.println(newFile6.getAbsolutePath());
		
		
		
		
		
	}
}
