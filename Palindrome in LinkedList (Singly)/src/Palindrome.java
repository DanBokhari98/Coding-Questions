import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Palindrome<T> {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addFirst(1);
		list.addLast(2);
		list.addLast(2);
		list.addLast(1);
		
		System.out.println(palindromeCheck(list));
		
	}
	
	public static Boolean palindromeCheck(LinkedList<Integer> l) {
		int size = l.size() - 1;
		int sizeDec = size;
		int count = 0;
		for(Integer c : l) {
			if(c == l.get(sizeDec)) count++;
			sizeDec--;
			if(count == size) return true;
		}
		return false; 
		
	}
}
