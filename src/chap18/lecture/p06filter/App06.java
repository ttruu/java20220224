package chap18.lecture.p06filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class App06 {
	public static void main(String[] args) throws Exception{
		// BufferedReader, BufferedWriter 사용해서
		// output/FilterExample51.txt 를
		// output/FilterExample6.txt로 복사
		
		copyNormal();
		bufferedWriter();
	}
	

	private static void bufferedWriter() throws Exception{
		String path = "output/FilterExample51.txt";
		String des = "output/FilterExample6.txt";
		
		
		Reader origin = new BufferedReader(new FileReader(path)); 
		Writer writer = new BufferedWriter(new FileWriter(des));
		
		int data = 0;
		
		long start = System.currentTimeMillis();
		while ((data = origin.read()) != -1) {
			writer.write(data);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
		
		writer.close();
		origin.close();
		
		System.out.println("복사완료");
		
	}
	
	private static void copyNormal() throws Exception {
		String src = "output/FilterExample51.txt";
		String des = "output/FilterExample6.txt";
		
		Reader rd = new FileReader(src);
		Writer wr = new FileWriter(des);
		
		int data = 0;
		
		long start = System.currentTimeMillis();
		while ((data = rd.read()) != -1) {
			wr.write(data);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);

		
		wr.close();
		rd.close();
		
	}
		
}
