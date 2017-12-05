package com.suppergerrie2.adventofcode2017;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day1 {
	
	static String input;
	
	public static void main(String[] args) {
		System.out.println("Day 1");
		input = Helper.loadFile("day1");
		System.out.println(task1(input));
		System.out.println(task2(input));
	}
	
	public static int task1(String input) {
		int total = 0;
		for(int i = 0; i < input.length(); i++) {
			int nextID = i+1;
			if(i==input.length()-1) {
				nextID=0;
			}
			if(input.charAt(i)==input.charAt(nextID)) {
				total+=Integer.parseInt(String.valueOf(input.charAt(i)));
			}
		}
		return total;
	}
	
	public static int task2(String input) {
		int total = 0;
		for(int i = 0; i < input.length(); i++) {
			int nextID = i + input.length()/2;
			if(nextID>=input.length()) {
				nextID=nextID-input.length();
			}
			if(input.charAt(i)==input.charAt(nextID)) {
				total+=Integer.parseInt(String.valueOf(input.charAt(i)));
			}
		}
		return total;
	}
	
}
