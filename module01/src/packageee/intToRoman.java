package packageee;

public class intToRoman {
	public static void main(String[] args) {
		System.out.println(intToRoman(1994));
	}

	public static String intToRoman(int num) {
		StringBuilder builder = new StringBuilder();
		int qian = 0;
		int bai = 0;
		int shi = 0;
		int ge = 0;
		ge = num % 10;
		if (num >= 10) {
			shi = num / 10 % 10;
			if (num >= 100) {
				bai = num / 100 % 10;
				if (num >= 1000) {
					qian = num / 1000;
				}
			}
		}

		for (int i = 0; i < qian; i++) {
			builder.append("M");
		}

		builder.append(toRoman(bai, "bai"));
		builder.append(toRoman(shi, "shi"));
		builder.append(toRoman(ge, "ge"));

		return builder.toString();

	}

	private static String toRoman(int num, String str) {
		if (num == 0) {
			return "";
		}
		StringBuilder builder = new StringBuilder();
		String a = "";
		String b = "";
		String c = "";
		if (str == "ge") {
			a = "I";
			b = "V";
			c = "X";
		}
		if (str == "shi") {
			a = "X";
			b = "L";
			c = "C";
		}
		if (str == "bai") {
			a = "C";
			b = "D";
			c = "M";
		}
			if (1 <= num && num <= 3) {
				for (int i = 0; i < num; i++) {
					builder.append(a);
				}
			}
			if (num == 4) {
				builder.append(a);
				builder.append(b);
			}
			if (5 <= num && num <= 8) {
				builder.append(b);
				for (int i = 0; i < num - 5; i++) {
					builder.append(a);
				}
			}
			if (num == 9) {
				builder.append(a);
				builder.append(c);
			}
		return builder.toString();
	}
}
