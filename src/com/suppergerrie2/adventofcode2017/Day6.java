package com.suppergerrie2.adventofcode2017;

import java.util.ArrayList;
import java.util.List;

public class Day6 {
	
	static String input = "5	1	10	0	1	7	13	14	3	12	8	10	7	12	0	6";
	
	static List<String> configs = new ArrayList<String>();
	
	public static void main(String[] args) {
		System.out.println("Day 6");
		System.out.println(task1(input));
		System.out.println(task2(input));
	}
	
	static int task1(String in) {
		int cycles = 0;
		boolean foundLoop = false;
		
		String[] banksS = in.split("	");
		int[] banks = new int[banksS.length];
		for(int i = 0; i < banksS.length; i++) {
			banks[i] = Integer.valueOf(banksS[i]);
		}
		
		while(!foundLoop) {
			String config = "";
			for(int i = 0; i < banks.length; i++) {
				config+=banks[i]+"|";
			}
			if(configs.contains(config)) {
				foundLoop=true;
				break;
			} else {
				configs.add(config);
			}
			
			int max = Integer.MIN_VALUE;
			int maxIndex = -1;
			for(int i = 0; i < banks.length; i++) {
				if(banks[i]>max) {
					max = banks[i];
					maxIndex = i;
				}
			}
			
			int i = maxIndex;
			banks[maxIndex] = 0;
			
			while(max>0) {
				i++;
				
				if(i>=banks.length) {
					i-=banks.length;
				}
				
				banks[i]++;
				max--;
			}
			
			cycles++;
		}
		
		return cycles;
	}
	
	static int task2(String in) {
		configs.clear();
		int cycles = 0;
		int foundAt = 0;
		String found = "";
		boolean foundLoop = false;
		boolean foundSecondLoop = false;
		
		String[] banksS = in.split("	");
		int[] banks = new int[banksS.length];
		for(int i = 0; i < banksS.length; i++) {
			banks[i] = Integer.valueOf(banksS[i]);
		}
		
		while(!foundSecondLoop) {
			String config = "";
			for(int i = 0; i < banks.length; i++) {
				config+=banks[i]+"|";
			}
			if(configs.contains(config)) {
				foundLoop=true;
				if(config.equals(found)) {
					foundSecondLoop=true;
					break;
				}
				
				if(foundAt == 0) {
					foundAt = cycles;
					found = config;
				}
			} else {
				configs.add(config);
			}
			
			int max = Integer.MIN_VALUE;
			int maxIndex = -1;
			for(int i = 0; i < banks.length; i++) {
				if(banks[i]>max) {
					max = banks[i];
					maxIndex = i;
				}
			}
			
			int i = maxIndex;
			banks[maxIndex] = 0;
			
			while(max>0) {
				i++;
				
				if(i>=banks.length) {
					i-=banks.length;
				}
				
				banks[i]++;
				max--;
			}
			
			cycles++;
		}
		
		return cycles-foundAt;
	}
	
}
