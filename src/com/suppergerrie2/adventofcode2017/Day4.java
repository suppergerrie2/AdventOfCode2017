package com.suppergerrie2.adventofcode2017;

import java.util.Arrays;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day4 {

	static String input;
	
	public static void main(String[] args) {
		System.out.println("Day 4");
		input = Helper.loadFile("day4");
		System.out.println(task1(input));
		System.out.println(task2(input));
	}
	
	static int task1(String input) {
		int validAmount=0;
		
		String[] lines = input.split("\r\n");
		
		for(String line : lines) {
			String[] words = line.split(" ");
			boolean valid = true;
			for(int i = 0; i < words.length; i++) {
				for(int j = 0; j < words.length; j++) {
					if(j==i) {
						continue;
					}
					if(words[i].equals(words[j])) {
						valid = false;
					}
				}
			}
			if(valid) {
				validAmount++;
			}
		}
		
		return validAmount;
	}
	
	static int task2(String input) {
		int validAmount=0;
		
		String[] lines = input.split("\r\n");
		
		for(String line : lines) {
			String[] words = line.split(" ");
			boolean valid = true;
			for(int i = 0; i < words.length; i++) {
				char[] chars = words[i].toCharArray();
				Arrays.sort(chars);
				for(int j = 0; j < words.length; j++) {
					if(j==i) {
						continue;
					}
					char[] chars2 = words[j].toCharArray();
					Arrays.sort(chars2);
					if(chars.length==chars2.length) {
						boolean same = true;
						for(int k = 0; k < chars.length; k++) {
							if(chars[k]!=chars2[k]) {
								same = false;
								break;
							}
						}
						if(same) {
							valid = false;
						}
					}
				}
			}
			if(valid) {
				validAmount++;
			}
		}
		
		return validAmount;
	}
	
}
