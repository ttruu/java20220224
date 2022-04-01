//한글
package chap18.lecture.p03reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class App03 {
	public static void main(String[] args) throws Exception {
		String name = "src/chap18/lecture/p03reader/App03.java";
		
		Reader rd = new FileReader(name);
		System.out.print((char)rd.read());
		System.out.print((char)rd.read());
		System.out.print((char)rd.read());
		System.out.print((char)rd.read());
				
		rd.close();
		System.out.println();
		
		// 바이트 단위로 읽기
		InputStream is = new FileInputStream(name);
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		
		// 문자 데이터를 읽을때는 reader를 선택하는게 낫다 
	}
}
