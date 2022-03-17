package chap08.book.s080301;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		rc.turnOn();
		rc.turnOff();
	}
}
