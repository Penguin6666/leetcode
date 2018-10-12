package packageee;

//Given a string, find the length of the longest substring without repeating characters.
public class LongestSub {
	public static void main(String[] args) {
		int length = lengthOfLongestSubstring("ggububgvfk");
		System.out.println(length);
	}

	public static int lengthOfLongestSubstring(String s) {
		int maxlength = 0;
		int start = 0;
		maxlength = lengthOf(s, start, maxlength);
		return maxlength;
	}

	public static int lengthOf(String s,int start,int maxlength){
		if ((s.length()-start)<=maxlength){
			return maxlength;
		}
		StringBuilder builder = new StringBuilder();
		for (int i = start; i < s.length(); i++) {
			for (int j = 0; j < builder.length(); j++) {
				if (s.charAt(i)==builder.charAt(j)){
					if (builder.length()>=maxlength){
						maxlength = builder.length();
					}
					start = start+j+1;
					return lengthOf(s,start,maxlength);
				}
			}
			builder.append(s.charAt(i));
		}
		if (builder.length()>=maxlength){
			maxlength = builder.length();
		}
		return maxlength;
	}


}
