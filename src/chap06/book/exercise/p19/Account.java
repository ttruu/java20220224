package chap06.book.exercise.p19;

public class Account {
	
	public static final int Min_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	private int balance;
	

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		
		if(balance >= Min_BALANCE && balance <= MAX_BALANCE) {
			
			this.balance = balance;
		
		}
		
	}
}
