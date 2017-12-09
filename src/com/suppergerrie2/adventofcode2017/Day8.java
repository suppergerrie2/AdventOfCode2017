package com.suppergerrie2.adventofcode2017;

import java.util.HashMap;
import java.util.Map;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day8 {

	static String input;
	
	static Map<String, Integer> registerMap = new HashMap<String, Integer>();
	
	public static void main(String[] args){
		System.out.println("Day 8");
		input = Helper.loadFile("day8");
		System.out.println(task12(input));
	}
	
	static int task12(String input){
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		String[] lines = input.split("\r\n");
		for(String line : lines){
			String[] words = line.split(" ");
			String checkRegister = words[4];
			int checkValue = Integer.valueOf(words[6]);
			
			if(!registerMap.containsKey(checkRegister)){
				registerMap.put(checkRegister, 0);
			}
			int checkRegisterValue = registerMap.get(checkRegister);
			boolean check = false;
			switch(words[5]){
				case ">":
					if(checkRegisterValue>checkValue){
						check = true;
					}
					break;
				case "<":
					if(checkRegisterValue<checkValue){
						check = true;
					}
					break;
				case ">=":
					if(checkRegisterValue>=checkValue){
						check = true;
					}
					break;
				case "<=":
					if(checkRegisterValue<=checkValue){
						check = true;
					}
					break;
				case "==":
					if(checkRegisterValue==checkValue){
						check = true;
					}
					break;
				case "!=":
					if(checkRegisterValue!=checkValue){
						check = true;
					}
					break;
			}
			
			if(!registerMap.containsKey(words[0])){
				registerMap.put(words[0], 0);
			}
			int value = registerMap.get(words[0]);
			if(check){
				if(words[1].equals("inc")){
					value+=Integer.valueOf(words[2]);
				} else {
					value-=Integer.valueOf(words[2]);
				}
			}
			max2 = Math.max(value, max2);
			
			
			registerMap.put(words[0], value);
		}

		for(String key : registerMap.keySet()){			
			max = Math.max(registerMap.get(key), max);
		}
		System.out.println("task2: " + max2);
		return max;
	}
	
}
