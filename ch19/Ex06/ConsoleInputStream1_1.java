package ch19.Ex06;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputStream1_1 {
	public static void main(String[] args) throws IOException {
		//��Ʈ���� �ѹ� ���� ���� �Ұ�
		
		//1 console���� �Է¹��� ��ü ����
		InputStream is1=System.in; //is1�� �ֿܼ��� �Է¹޾Ƽ� ó���ϴ� ��ü
		
		System.out.println("������ �Է��ϼ���. >>");
		
		int data;
		
		while ((data=is1.read())!='\n') { //1byte �о data ������ �Ҵ�
			System.out.print((char)data);
		}
		
		System.out.println(data); //\n : 10
		System.out.println(is1.read()); // �� ����
		
		
		
		
	}
}
