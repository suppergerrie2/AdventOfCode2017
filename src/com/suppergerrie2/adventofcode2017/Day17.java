package com.suppergerrie2.adventofcode2017;

import java.util.ArrayList;
import java.util.List;

public class Day17 {

	static int input = 369;
	
	
	public static void main(String[] args) {
		System.out.println("Day 17");
		task1(input);
		task2(input);
	}
	
	static void task1(int in) {
		List<Integer> buffer = new ArrayList<Integer>();
		buffer.add(0);
		int loopCount = 50000000;
		int index = 0;
		long startTime = System.nanoTime();
		for(int c = 0; c < loopCount; c++) {
			for(int i = 0; i < in; i++) {
				index++;
				while(index>=buffer.size()) {
					index-=buffer.size();
				}
			}
			if(index>2) {
				buffer.add(c+1);
			} else {
				buffer.add(index+1, c+1);
			}
			index++;
			if(c%1000000==0) {
//				System.out.println(c);
			}
		}
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		
		System.out.println(duration + " " + duration/1000000 ); 
		System.out.println(buffer.get(index));
		System.out.println(buffer.get(1));
	}
	
	static void task2(int in) {
		int loopCount = 50000000;
		int index = 0;
		int length = 1;
		int n = 0;
		long startTime = System.nanoTime();
		for(int c = 0; c < loopCount; c++) {
			for(int i = 0; i < in; i++) {
				index++;
				while(index>=length) {
					index-=length;
				}
			}
			if(index==0) {
				n = c+1;
			} 
			length++;
			index++;
			if(c%1000000==0) {
//				System.out.println(c);
			}
		}
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		
		System.out.println(duration + " " + duration/1000000 ); 
		System.out.println("Task2: " + n);
	}
	
}
