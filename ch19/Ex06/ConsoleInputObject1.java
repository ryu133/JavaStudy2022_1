package ch19.Ex06;
//System.in: console���� �Է¹ޱ�(�ڹٿ��� �������ִ� ��ü), InputSteam
	//windows: �ֿܼ��� enter: \r\n
	//mac: �ֿܼ��� enter: \n
//System.out: console���� ����ϱ�(�ڹٿ��� �������ִ� ��ü), OutputSteam

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject1 {
	public static void main(String[] args) throws IOException {
		//��Ʈ���� �ѹ� ���� ���� �Ұ�
		
		//1 console���� �Է¹��� ��ü ����
		InputStream is1=System.in; //is1�� �ֿܼ��� �Է¹޾Ƽ� ó���ϴ� ��ü
		
		System.out.println("������ �Է��ϼ���. >>");
		
		int data;
		
		while ((data=is1.read())!='\r') { //1byte �о data ������ �Ҵ�
			System.out.println("���� ������: "+(char)data+" ���� ����Ʈ ��: "+is1.available());
		}
		
		System.out.println(data); //\r : 13
		System.out.println(is1.read()); //\n : 10
		
		
		
		while ((data=is1.read())!='\r') {
			System.out.println((char)data);
		}
		
		
		
		
		
		
	}
}
