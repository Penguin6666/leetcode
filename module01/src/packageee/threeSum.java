package packageee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {

	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> lists = threeSum(nums);
		System.out.println(lists);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();
		if (nums.length == 0 || nums[0] > 0 || nums[nums.length - 1] < 0) {
			return list;
		}
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && (nums[i] == nums[i - 1])) {
				continue;
			}
			for (int j = nums.length - 1; i + 1 < j; j--) {
				if (j <= nums.length - 2 && (nums[j] == nums[j + 1])) {
					continue;
				}
				if (nums[i] + nums[j] + nums[j - 1] < 0) {
					break;
				}
				for (int k = j - 1; i < k; k--) {
					int sum = nums[i] + nums[j] + nums[k];
					if (sum > 0) {
						continue;
					}
					if (sum == 0) {
						List<Integer> sublist = new ArrayList<>();
						sublist.add(nums[i]);
						sublist.add(nums[j]);
						sublist.add(nums[k]);
						list.add(sublist);
						break;
					}

					if (sum < 0) {
						break;
					}
				}
			}
		}

		return list;
	}
}
