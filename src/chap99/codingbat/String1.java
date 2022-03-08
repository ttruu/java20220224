package chap99.codingbat;

public class String1 {

	public String firstTwo(String str) {
		  if (str.length() < 2) {
		    return str;
		  }  return str.substring(0,2);
		}
	
	public String nTwice(String str, int n) {
		  return str.substring(0, n) + str.substring(str.length() - n);
		}

	public String middleThree(String str) {
		  int m = str.length() / 2;
		  return str.substring((m - 1),(m + 2));
		}

	public boolean hasBad(String str) {
		  
		  String s1 = "";
		  String s2 = "";
		  
		  
		  if (str.length() >= 3) {
		    s1 = str.substring(0, 3);
		  }
		  
		  if (str.length() > 3) {
		    s2 = str.substring(1, 4);
		  }
		  
		  return s1.equals("bad") || s2.equals("bad");
		  
		}

	// 또는 
	/*
	public boolean hasBad(String str) {
		int i = str.indexOf("bad");

		return (i == 0) || (i == 1);
	}
	*/
	
	public boolean frontAgain(String str) {
		if (str.length() < 2) {
			return false;
		}

		String end = str.substring(str.length() - 2);
		int i = str.indexOf(end);
		return i == 0;
	}
	
	public String seeColor(String str) {
		  
		  
		  if(str.indexOf("red") == 0) {
		    return "red";
		  }
		  
		  if(str.indexOf("blue") == 0) {
		    return "blue";
		  }
		  
		  return "";
		}

	
}
