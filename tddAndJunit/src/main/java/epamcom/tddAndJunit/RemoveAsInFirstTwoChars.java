package epamcom.tddAndJunit;

public class RemoveAsInFirstTwoChars {
	public static String removeCharA(String s){
		int length = s.length();
		String result = "";
		if(length == 0){
			result = "";
		}else if(length == 1) {
			if(s.charAt(0) != 'A') {
				result = result + s.charAt(0);
			}
		}else {
			if(s.charAt(0) != 'A') {
				result = result + s.charAt(0);
			} 
			if(s.charAt(1) != 'A') {
				result = result + s.charAt(1);
			}
			if(length > 2) {
				result = result + s.substring(2);
			}
		}
		return result;
	}
}
