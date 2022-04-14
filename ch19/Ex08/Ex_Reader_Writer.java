package ch19.Ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

//reader / writer 사용
//C:/Temp/a/aaa.txt(MS949)
//C:/Temp/b/bbb.txt(UTF-8)
//파일에 입력 후
//파일에서 읽은 내용을 콘솔에 깨짐없이 출력

public class Ex_Reader_Writer {
	public static void main(String[] args) {
		
		File a=new File("C:\\Temp\\a\\aaa.txt");
		File b=new File("C:\\Temp\\b\\bbb.txt");
		
		File aa=new File("C:/Temp/a");
		File bb=new File("C:/Temp/b");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("한글 입력 >>");
		String str=scanner.nextLine();
		
		try (OutputStream os=new FileOutputStream(a);
				OutputStreamWriter osw=new OutputStreamWriter(os);) 
		{
			osw.write(str);
			osw.flush();
		} catch (IOException e) {	System.out.println("a");	}
		
		try (OutputStream os=new FileOutputStream(b);
				OutputStreamWriter osw=new OutputStreamWriter(os,"UTF-8");) 
		{
			osw.write(str);
			osw.flush();
		} catch (IOException e) {	System.out.println("b");	}
		
		
		try (InputStream is=new FileInputStream(a);
				InputStreamReader isr=new InputStreamReader(is);)
		{
			int data;
			while ((data=isr.read())!=-1) {
				System.out.print((char)data);
			}
			System.out.println("\n"+isr.getEncoding());
		} catch (Exception e) {	System.out.println("c");	}
		
		System.out.println();
		
		try (InputStream is=new FileInputStream(b);
				InputStreamReader isr=new InputStreamReader(is,"UTF-8");)
		{
			int data;
			while ((data=isr.read())!=-1) {
				System.out.print((char)data);
			}
			System.out.println("\n"+isr.getEncoding());
		} catch (Exception e) {	System.out.println("d");	}
		
	}
}
