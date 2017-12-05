package com.suppergerrie2.adventofcode2017;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day2 {

	static String input;
	
	public static void main(String[] args) {
		System.out.println("Day 2");
		input=Helper.loadFile("day2");
		System.out.println(task1(input));
		System.out.println(task2(input));
	}
	
	public static int task1(String input) {
		int total = 0;
		String[] rows = input.split("\r\n");
		for(String row : rows) {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			String[] values = row.split("	");
			for(String value : values) {
				min = Math.min(Integer.valueOf(value), min);
				max = Math.max(Integer.valueOf(value), max);
			}
			total+=(max-min);
		}
		return total;
	}
	
	public static int task2(String input) {
		int total = 0;
		String[] rows = input.split("\r\n");
		for(String row : rows) {
			String[] values = row.split("	");
			for(String value : values) {
				int val = Integer.valueOf(value);
				for(String value2 : values) {
					int val2 = Integer.valueOf(value2);
					if(val%val2==0&&val!=val2) {
						total+=val/val2;
						break;
					}
				}
			}
		}
		return total;
	}
	
}
