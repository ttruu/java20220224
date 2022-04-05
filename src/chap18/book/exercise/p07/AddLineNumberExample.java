package chap18.book.exercise.p07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		
		String path = "src/chap18/book/exercise/p07/AddLineNumberExample.java";
		
		FileReader reader = new FileReader(path);
		BufferedReader br = new BufferedReader(reader);
		
		int rowNumber = 0;
		String rowData = "";
		while((rowData = br.readLine()) != null) {
			System.out.println(++rowNumber + ":" + rowData);
		}
		
		br.close();
		reader.close();
	}
}
