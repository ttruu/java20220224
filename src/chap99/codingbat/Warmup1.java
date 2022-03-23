package chap99.codingbat;

public class Warmup1 {
	
	public int close10(int a, int b) {
		int diffa = Math.abs(10 - a);
		int diffb = Math.abs(10 - b);

		if (diffa < diffb) {
			return a;
		} else if (diffa > diffb) {
			return b;
		} else {
			return 0;
		}
	}
	
		public String notString(String str) {

			String front = "";

			if (str.length() >= 3) {
				front = str.substring(0, 3);
			}

			if (front.equals("not")) {
				return str;
			} else {
				return "not " + str;
			}

		}

		
	public boolean nearHundred(int n) {
		// return (n >= 90 && n <= 110) || (n >= 190 && n <= 210);
		return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
	}

	
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
