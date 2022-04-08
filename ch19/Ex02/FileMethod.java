package ch19.Ex02;

import java.io.File;

public class FileMethod {
	public static void main(String[] args) {
		//1 C:\�� �۾� ���� ����
		File tempDir=new File("C:/temp");
		if (!tempDir.exists()) {tempDir.mkdir();}
		
		//2 ���� ��ü ���� (C:\Windows)
		File file=new File("C:/Windows");
		
		//3 ���� ��ü�� ���� �޼ҵ� ���
		System.out.println("���� ��� ���: "+file.getAbsolutePath());
		System.out.println("������ ���� ����: "+file.isDirectory());
		System.out.println("������ ���� ����: "+file.isFile());
		System.out.println("����/���� �̸� ���: "+file.getName());
		System.out.println("�θ� ���� ���: "+file.getParent());
		
		File newFile1=new File("C:/temp/abc");
		System.out.println(newFile1.mkdir()); //������ ������ ��� true �̹� �����ؼ� �������� ���� ��� false
			//���� ������ ���� false: �������� ���ߴ�. (���� ������ų� �̹� �����ϰų� ��)
		System.out.println(newFile1.exists());
		
		File newFile2=new File("C:/temp/bcd/cde"); //������ ������ �ѹ��� �����ϱ�
		System.out.println(newFile2.mkdir()); //false, ������������ ���� �Ұ�
		System.out.println(newFile2.mkdirs()); //true, ������������ ����
		
		
		File newFile3=new File("C:/temp/def/hij/klm");
		System.out.println(newFile3.mkdirs()); //�����ϸ� true, �������� ���ϸ� false
		
		//4 File ��ü�� ����ؼ� ���� ������ ���� ����
		File[] fname=file.listFiles(); //file: "C:/windows"������ ��� ������ ������ �̸��� File �迭�� ����
		for (File k : fname) {
			System.out.println((k.isDirectory()?"����: ":"����: ")+k.getName());
		}
		
		
		
		
		
		
	}
}
