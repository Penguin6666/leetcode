package packageee;

import java.util.Arrays;

public class maxArea {

	public static void main(String[] args) {
		int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		int area = maxArea(arr);
		System.out.println(area);
	}

	public static int maxArea(int[] height) {
		int result = 0;
		int l = height.length;
		int start = 0;
		for (int i = 0; i < l - 1; i++) {
			int end = 0;
			if (height[i] > start) {
				start = height[i];
				for (int j = l - 1; i < j; j--) {
					if (height[j] > end) {
						end = height[j];
						int min = end < height[i] ? end : height[i];
						int m = (j - i) * min;
						if (m > result) {
							result = m;
						}
						if (end >= height[i]) {
							break;
						}
					}
				}
			}

		}
		return result;
	}
}
