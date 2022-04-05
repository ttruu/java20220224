package chap18.lecture.p06filter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class App08 {
	public static void main(String[] args) throws Exception {
		String out = "output/FilterExample8.txt";
		
		OutputStream os = new FileOutputStream(out);
		Writer osr = new OutputStreamWriter(os);
		Writer bw = new BufferedWriter(osr);
		
		
		for(int i= 0; i < 10000000; i++) {
			bw.write('가');
		}
		
		
		bw.close();
		osr.close();
		os.close();
		
		System.out.println("end");
	}
}
