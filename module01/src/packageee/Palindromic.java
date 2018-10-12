package packageee;

public class Palindromic {

	public static void main(String[] args) {
		String s = longestPalindrome("cbbd");
		System.out.println(s);
	}

	public static String longestPalindrome(String s) {
		if (s == "") {
			return s;
		}
		String result = s.substring(0, 1);
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = 0; j < i && j < s.length() - i - 1; j++) {
				if (s.charAt(i - j - 1) == s.charAt(i + j + 1)) {
					if ((2 * j + 3) > result.length()) {
						result = s.substring(i - j - 1, i + j + 2);
					}
				} else {
					break;
				}
			}

			if (s.charAt(i) == s.charAt(i + 1)) {
				if (result.length() == 1) {
					result = s.substring(i, i + 2);
				}
				for (int j = 0; j < i && j < s.length() - i - 2; j++) {
					if (s.charAt(i - j - 1) == s.charAt(i + j + 2)) {
						if ((2 * j + 4) > result.length()) {
							result = s.substring(i - j - 1, i + j + 3);
						}
					} else {
						break;
					}
				}
			}
		}

		return result;


	}
}
