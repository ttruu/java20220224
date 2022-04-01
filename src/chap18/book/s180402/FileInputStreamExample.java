package chap18.book.s180402;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/chap18/book/s180402/FileInputStreamExample.java");

			int data;
			while ((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
