package com.suppergerrie2.adventofcode2017;

public class Day15 {
	
	static int inputA = 277;
	static int inputB = 349;
	
	public static void main(String[] args) {
		System.out.println("Day 15");
		task1(inputA, inputB);
		task2(inputA, inputB);
	}
	
	static void task1(int inA, int inB) {
		int iterations = (int) (40 * Math.pow(10, 6));
		int valA = inA;
		int valB = inB;
		int match = 0;
		for(int i = 0; i < iterations; i++) {
			valA = nextValueA(valA);
			valB = nextValueB(valB);
			if(getBinary(valA).substring(16, 32).equals(getBinary(valB).substring(16, 32))) {
				match++;
			}
		}
		System.out.println(match);
	}
	
	static void task2(int inA, int inB) {
		int iterations =(int) (5 * Math.pow(10, 6));
		int valA = inA;
		int valB = inB;
		int match = 0;
		for(int i = 0; i < iterations; i++) {
			valA = nextValueA(valA);
			while(valA%4!=0) {
				valA = nextValueA(valA);
			}
			valB = nextValueB(valB);
			while(valB%8!=0) {
				valB = nextValueB(valB);
			}
			if(getBinary(valA).substring(16, 32).equals(getBinary(valB).substring(16, 32))) {
				match++;
			}
		}
		System.out.println(match);
	}
	
	static int nextValueA(long lastValue) {
		return (int) ((lastValue*16807L)%2147483647L);
	}
	
	static int nextValueB(long lastValue) {
		return (int) ((lastValue*48271)%2147483647L);
	}
	
	static String getBinary(int i) {
		String s = Integer.toBinaryString(i);
		while(s.length()<32) {
			s = "0"+s;
		}
		return s;
	}
}
