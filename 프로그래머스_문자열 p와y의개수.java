class Solution {
	boolean solution(String s) {
		int count = 0;
		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p') {
				count++;
			}
			if (s.charAt(i) == 'y') {
				count--;
			}
		}
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}
}

/* 다른사람 답 */

/*
 * class Solution { boolean solution(String s) { s = s.toUpperCase();
 * 
 * return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count(); } }
 */