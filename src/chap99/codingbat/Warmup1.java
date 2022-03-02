package chap99.codingbat;

public class Warmup1 {
	
	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}
	
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		  return ((aSmile && bSmile) || (!aSmile && !bSmile));
		  // !(aSmile ^ bSmile);
		}
	
	public int sumDouble(int a, int b) {
		  int sum = a + b;
		  if ( a == b) {
		    sum = sum * 2;
		  }
		  return sum;
		  // return(a == b ? sum * 2 : sum)
		}
	
	public int diff21(int n) {
		  int diff = 21 - n;
		  return ((diff < 0) ? diff * -2 : diff);
		}
	
	public boolean parrotTrouble(boolean talking, int hour) {
		  return talking && (hour < 7 || hour > 20);
		}

	public boolean makes10(int a, int b) {
		  return (a == 10 || b == 10 || a+b == 10);
		}

	
}
