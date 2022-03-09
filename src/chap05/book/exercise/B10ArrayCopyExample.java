package chap05.book.exercise;

public class B10ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		//				원본 ,  0번부터, 복사할 배열, 0번부터, 복사할개수
 		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}
	}
}
