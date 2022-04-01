package chap18.book.s180403;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String origin = "picture/다형성01.png";
		String des = "output/other/다형성01_copy.png";
		
		FileInputStream fis = new FileInputStream(origin);
		FileOutputStream fos = new FileOutputStream(des);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다");
	}
}
