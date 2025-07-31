package com.pradeip.poc.dsa.array;

//Find the length of the longest consecutive elements sequence.
public class LongestConsecutive {

	public static void main(String[] args) {
		int[] nums = { 100, 4, 200, 3, 2 };
		System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums));
	}

	public static int longestConsecutive(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		java.util.Set<Integer> numSet = new java.util.HashSet<>();
		for (int num : nums) {
			numSet.add(num);
		}

		int longestStreak = 0;

		for (int num : numSet) {
			if (!numSet.contains(num - 1)) { // Check if it's the start of a sequence

				int currentNum = num;
				int currentStreak = 1;

				while (numSet.contains(currentNum + 1)) {
					currentNum++;
					// Increment the current streak if the next number is found
					currentStreak++;
				}

				longestStreak = Math.max(longestStreak, currentStreak);
			}
		}

		return longestStreak;
	}
}
