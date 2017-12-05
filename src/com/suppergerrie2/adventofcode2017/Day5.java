package com.suppergerrie2.adventofcode2017;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day5 {

	static String input;
	
	public static void main(String[] args) {
		System.out.println("Day 5");
		input = Helper.loadFile("day5");
		System.out.println(task1(input));
		System.out.println(task2(input));
	}
	
	static int task1(String input) {
		int index = 0;
		int steps = 0;
		String[] sNums = input.split("\r\n");
		int[] nums = new int[sNums.length];
		for(int i = 0; i < sNums.length; i++) {
			nums[i] = Integer.valueOf(sNums[i]);
		}
		
		while(index<nums.length) {
			int temp = index;
			index+=nums[index];
			nums[temp]++;
			steps++;
		}
		
		return steps;
	}
	
	static int task2(String input) {
		int index = 0;
		int steps = 0;
		String[] sNums = input.split("\r\n");
		int[] nums = new int[sNums.length];
		for(int i = 0; i < sNums.length; i++) {
			nums[i] = Integer.valueOf(sNums[i]);
		}
		
		while(index<nums.length) {
			int temp = index;
			index+=nums[index];
			if(nums[temp]>=3) {
				nums[temp]--;
			} else {
				nums[temp]++;
			}
			steps++;
		}
		
		return steps;
	}
}
