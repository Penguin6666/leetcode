package packageee;

public class convert {
	public static void main(String[] args) {
		String convert = convert("PAYPALISHIRING", 3);
		System.out.println(convert);
	}

	public static  String convert(String s, int numRows) {
		if (numRows==1){
			return s;
		}
		int t = (numRows - 1) * 2;
		StringBuilder builder = new StringBuilder();
		for (int j = 0; j < numRows; j++) {
			for (int i = 0; i < s.length(); i++) {
				if (i % t == j || i % t == (t - j)) {
					builder.append(s.charAt(i));
				}
			}
		}
		return builder.toString();
	}
}
