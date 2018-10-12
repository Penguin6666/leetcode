package packageee;

import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int[] ints = twoSum(nums, 9);
		System.out.println(Arrays.toString(ints));
	}

	private static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
 		for (int m = 0; m <nums.length ; m++) {
			for (int n = m+1; n <nums.length ; n++) {
				if (nums[m]+nums[n]==target){
					result[0]=m;
					result[1]=n;
					return result;
				}
			}
		}
		return result;
	}
}
