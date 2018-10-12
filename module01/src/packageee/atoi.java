package packageee;

public class atoi {
	public static void main(String[] args) {
		int i = myAtoi(" -98997");
		System.out.println(i);
	}

	public static int myAtoi(String str) {
		char[] nums = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int start = builder.length();
			if (c != ' ') {
				for (int j = 0; j < nums.length; j++) {
					if (c == nums[j]) {
						builder.append(c);
						break;
					}
				}
				if ((c == '+' || c == '-')) {
					if (builder.length() != 0) {
						break;
					} else {
						builder.append(c);
					}
				}

				int end = builder.length();
				if (start == end) {
					break;
				}
			} else {
				if (builder.length() != 0) {
					break;
				}
			}
		}

		if (builder.length()==0){
			return 0;
		}
		if (builder.length()==1){
			if ((builder.charAt(0)=='+')||(builder.charAt(0)=='-')){
				return 0;
			}
		}
		int result = 0;
		try {
			result = Integer.parseInt(builder.toString());
		} catch (NumberFormatException e) {
			if (builder.charAt(0)=='-'){
				return -2147483648;
			}else {
				return 2147483647;
			}
		}

		return result;
	}
}
