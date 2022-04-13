package ch19.Ex08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import javax.print.DocFlavor.READER;

public class Buffer_Reader_Writer {
	public static void main(String[] args) {
		//1 ���� ��ü ����
		File rwFile=new File("ch19/Ex08/BufferedFile.txt");
		
		//2 FileWriter�� �̿��� ���Ͽ� �Է� 
		try (Writer writer=new FileWriter(rwFile);
				BufferedWriter bw=new BufferedWriter(writer);) //������ ����Ű�� ���� Filter
		{
			bw.write("�ȳ��ϼ���\n");
			bw.write("Hello\n"); 
			bw.write('A');
			bw.write('\r');
			bw.write('\n');
			bw.write("�ݰ����ϴ�",2,3);
		} catch (IOException e) {		}
		
		//3 FileReader�� �̿��� ���� �б�
		try (Reader reader=new FileReader(rwFile);
				BufferedReader br=new BufferedReader(reader);)
		{
			//BufferedReader�� �߰��� �޼ҵ�: String readLine(), ������ ��: null, �� ���ξ� �д´�
			//int read(): �� ����Ʈ�� �д´�. ������ ��: -1
			String data;
			while ((data=br.readLine())!=null) {
				System.out.println(data);
			}
		} catch (Exception e) {		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
