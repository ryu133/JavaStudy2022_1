package ch19.Ex07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
//InputStream: ±â¹İ ½ºÆ®¸²
	//int => SSS(¹®ÀÚ), SSS(¹®ÀÚ) => int 
//DataInputStream: ±â¹İ ½ºÆ®¸²ÀÇ Ãß°¡ ±â´ÉÀ» Á¦°øÇÏ´Â ½ºÆ®¸², ±â¹İ ½ºÆ®¸²ÀÌ ¹İµå½Ã Á¸ÀçÇØ¾ß ÇÔ. ´Üµ¶ »ç¿ë ºÒ°¡
	//´Ù¾çÇÑ Çü½ÄÀÇ µ¥ÀÌÅÍ¸¦ ºü¸£°Ô Àü¼ÛÇÒ ¶§ »ç¿ë 
	//int => int, double => double º°µµÀÇ º¯È¯À» ÇÏÁö ¾ÊÀ½(¹ÙÀÌÆ®·Î ºĞÇØÇß´Ù°¡ ´Ù½Ã Á¶¸³ÇÏ´Â °úÁ¤À» ÇÏÁö ¾Ê´Â´Ù)

public class DataInputStream1 {
	public static void main(String[] args) {
		//ÆÄÀÏ »ı¼º
		File dataFile=new File("ch19/Ex07/file1.data"); //È®ÀåÀÚ ÁÖÀÇ
		
		//µ¥ÀÌÅÍ ¾²±â
		try (OutputStream os=new FileOutputStream(dataFile);
				DataOutputStream dos=new DataOutputStream(os);) //Ãß°¡ ±â´ÉÀ» Á¦°ø: »ı¼ºÀÚ ³»ºÎ¿¡ ±â¹İ ½ºÆ®¸² Æ÷ÇÔ
		{
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("¾È³çÇÏ¼¼¿ä");
			dos.flush();
		} catch (Exception e) {		} //¸ğµç ¿¹¿ÜÀÇ ÃÖ»óÀ§ Å¬·¡½º Exception: °ÅÀÇ ¸ğµç ¿¹¿Ü¸¦ Ã³¸®ÇÔ
		
		//   #@333333 A ¾È³çÇÏ¼¼¿ä      <<±úÁø°Ô ¾Æ´Ï´Ù?
		//µ¥ÀÌÅÍ ÀĞ±â(DataInputStream)
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
