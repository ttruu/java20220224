package chap10.lecture.p03checked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App05 {
	public static void main(String[] args) {
		// 하나 try블럭 사용
		// 여러 catch 블럭 사용
		// 컴파일 오류 해결 
		
		FileReader fr;
		try {
			fr = new FileReader("");
			fr.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
