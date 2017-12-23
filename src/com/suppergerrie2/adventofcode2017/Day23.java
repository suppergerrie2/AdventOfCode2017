package com.suppergerrie2.adventofcode2017;

import java.util.HashMap;
import java.util.Map;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day23 {

	public static void main(String[] args) {
		System.out.println("Day 23");
		String input = Helper.loadFile("day23");
		task(input, false);
//		task(input, true);
		task2();
	}

	static void task(String input, boolean task2) {
		String[] commands = input.split("\r\n");

		Map<String, Long> registers = new HashMap<String, Long>();

		if(task2) {
			registers.put("a", 1L);
		}

		int mulInvoked = 0;
		for(int i = 0; i < commands.length; i++) {
			String[] commandParts = commands[i].split(" ");
			switch(commandParts[0]) {
			case "set":
				registers.put(commandParts[1], getValue(commandParts[2], registers));
				break;
			case "sub":
				if(!registers.containsKey(commandParts[1])) {
					registers.put(commandParts[1], 0L);
				}

				registers.put(commandParts[1], registers.get(commandParts[1])-getValue(commandParts[2], registers));

				break;
			case "mul":
				if(!registers.containsKey(commandParts[1])) {
					registers.put(commandParts[1], 0L);
				}

				registers.put(commandParts[1], registers.get(commandParts[1])*getValue(commandParts[2], registers));
				mulInvoked++;
				break;
			case "jnz":
				if(getValue(commandParts[1], registers)!=0) {
					i--;
					i+=getValue(commandParts[2], registers);
				}
				break;
			}
			if(i<0||i>commands.length-1) {
				break;
			}
		}
		if(task2) {
			System.out.println(registers.get("h"));
		} else {
			System.out.println(mulInvoked);
		}
	}
	
	static void task2() {
		int c = 125400;
//		boolean f;
//		int h = 0;
//		for(int b = 100840; b < c + 1; b+=17) {
//			f = true;
//			for(int d = 2; d < b + 1; d++) {
//				for(int e = 2; e < b + 1; e++) {
//					if(d*e==b) {
//						f=false;
//					}
//				}
//			}
//			if(f) {
//				h++;
//			}
//		}
//		
		int h = 0;
		for(int b = 108400; b < c + 1; b+=17) {
			if(!isPrime(b)) {
				h++;
			}
		}
		System.out.println(h);
	}
	
	//checks whether an int is prime or not.
	static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

	public static long getValue(String s, Map<String, Long> registers) {
		if(isNumeric(s)) {
			return Long.valueOf(s);
		} else {
			if(!registers.containsKey(s)) {
				registers.put(s, 0L);
			}
			return registers.get(s);
		}
	}

	public static boolean isNumeric(String str)
	{
		return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}

}
