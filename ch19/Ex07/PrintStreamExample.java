package ch19.Ex07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

//PrintStream(Filter Stream: �߰� ����� �����ϴ� Stream, ��� ��Ʈ�� �ʿ�)
	//�پ��� ������� ����ϴ� ��Ʈ��. �ڵ����� flush()�� ����ǹǷ� ȣ������ �ʾƵ� ��
		//println(),print(),printf()
		//���Ͽ� ���, �ֿܼ� ���, .. 

public class PrintStreamExample {
	public static void main(String[] args) {
		//1 File ��ü ����
		File outFile1=new File("ch19/Ex07/printstream1.txt");
		File outFile2=new File("ch19/Ex07/printstream2.txt");
		
		//2 PrintStream(FileOutputStream(File))  <���Ͽ� ���
		
		try (OutputStream os1=new FileOutputStream(outFile1);
				PrintStream ps=new PrintStream(os1);)  //Filter ��Ʈ��(�߰� ��� ����), ��� ��Ʈ�� �ʿ�
		{
			ps.println(5.8); //double ��� �� ����
			ps.print(3+"�ȳ�"+12345+"\n"); //��� �� ���� ����
			ps.printf("%d�� ȣ��Ǿ����ϴ�. \n", 7); // "%d" : int ���� ȣ��
			ps.printf("%s %f", "�ȳ�",5.8); //%s : string , %f : double

			//ps.flush(); �ڵ� ȣ���
			
		} catch (Exception e) {	}
		
		
		//3 PrintStream(File)  <���Ͽ� ���
		try (PrintStream ps=new PrintStream(outFile2);){
			ps.println(5.8); //double ��� �� ����
			ps.print(3+"�ȳ�"+12345+"\n"); //��� �� ���� ����
			ps.printf("%d�� ȣ��Ǿ����ϴ�. \n", 7); // "%d" : int ���� ȣ��
			ps.printf("%s %f", "�ȳ�",5.8); //%s : string , %f : double
		} catch (Exception e) {		}
		
		
		//4 PrintStream ps=System.out;  <�ֿܼ� ���
		try (OutputStream os2=System.out;
				PrintStream ps=new PrintStream(os2);)
		{
			ps.println(5.8); //double ��� �� ����
			ps.print(3+"�ȳ�"+12345+"\n"); //��� �� ���� ����
			ps.printf("%d�� ȣ��Ǿ����ϴ�. \n", 7); // "%d" : int ���� ȣ��
			ps.printf("%s %f", "�ȳ�",5.8);
		} catch (Exception e) {		}
		
		System.out.println();
		
		//5 PrintStream ps=System.out;  <�ֿܼ� ���
		try (PrintStream ps=System.out;)
		{
			ps.println(5.8); //double ��� �� ����
			ps.print(3+"�ȳ�"+12345+"\n"); //��� �� ���� ����
			ps.printf("%d�� ȣ��Ǿ����ϴ�. \n", 7); // "%d" : int ���� ȣ��
			ps.printf("%s %f", "�ȳ�",5.8);
		} catch (Exception e) {		}
		
		
		
		
		
	}
}
