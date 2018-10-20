import java.util.HashMap;
import java.util.Map;

public class Permutation_Palindrome {
	
	public static boolean isPermPal(String s) {
		s = s.toLowerCase();
		//Edge case
		if(s.length()  == 0 || s.length() == 1) return true;
		Map<Character, Integer> charMap = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if(temp == ' ') continue;
			if(charMap.containsKey(temp)) charMap.put(temp, charMap.get(temp) + 1);
			else {
				charMap.put(temp, 1);
			}
		}
		
		int count = 0;
		
		for(char c : charMap.keySet()) {
			if(charMap.get(c) % 2 == 1) count++;
			if(count == 2) return false;
		}
		return true;
		
	}
	
	
	public static void main(String [] args) {
		String s = "Able I was ere I saw Elba";
		System.out.println(isPermPal(s));
	}
	
}
