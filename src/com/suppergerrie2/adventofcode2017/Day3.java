package com.suppergerrie2.adventofcode2017;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day3 {
	
	static String input;
	
	public static void main(String[] args) {
		System.out.println("Day 3");
		input = Helper.loadFile("day3");
		System.out.println(task1(input));
		System.out.println(task2(input));
	}
	
	static int task1(String _in) {
		int in = Integer.parseInt(_in);

		Map<Integer, Point> spiral = new HashMap<Integer, Point>();

		int x = 0;
		int y = 0;
		spiral.put(1,new Point(0,0));
		int i = 0;
		int temp = 1;
		while(temp<in) {
			for(int right = 0; right <= i; right++) {
				temp++;
				x++;
				spiral.put(temp, new Point(x,y));
			}
			for(int up = 0; up <= i; up++) {
				temp++;
				y++;
				spiral.put(temp, new Point(x,y));
			}			
			for(int left = 0; left <= i+1; left++) {
				temp++;
				x--;
				spiral.put(temp, new Point(x,y));
			}			
			for(int down = 0; down <= i+1; down++) {
				temp++;
				y--;
				spiral.put(temp, new Point(x,y));
			}
			i+=2;
		}
		
		Point loc = spiral.get(in);
		
		return Math.abs(loc.x)+Math.abs(loc.y);
	}
	
	static Map<Point, Integer> spiral = new HashMap<Point, Integer>();
	static int task2(String _in) {
		int in = Integer.parseInt(_in);
		
		int x = 0;
		int y = 0;
		spiral.put(new Point(0,0),1);
		int i = 0;
		int temp = 1;
		while(temp<in) {
			for(int right = 0; right <= i; right++) {
				temp++;
				x++;
				int val = putInSpiral(x,y,in);
				if(val>0) {
					return val;
				}
			}
			for(int up = 0; up <= i; up++) {
				temp++;
				y++;
				int val = putInSpiral(x,y,in);
				if(val>0) {
					return val;
				}
			}			
			for(int left = 0; left <= i+1; left++) {
				temp++;
				x--;
				int val = putInSpiral(x,y,in);
				if(val>0) {
					return val;
				}
			}			
			for(int down = 0; down <= i+1; down++) {
				temp++;
				y--;
				int val = putInSpiral(x,y,in);
				if(val>0) {
					return val;
				}
			}
			i+=2;
		}
		return 0;
	}
	
	static int putInSpiral(int x, int y, int in) {
		int val = calculateValue(x, y, spiral);
		
		if(val>in) {
			return val;
		}
		
		spiral.put(new Point(x,y), val);
		return -1;
	}

	private static int calculateValue(int x, int y, Map<Point, Integer> spiral) {
		int i = 0;
		for(int xOffset = -1; xOffset <= 1; xOffset++) {
			for(int yOffset = -1; yOffset <= 1; yOffset++) {
				if(xOffset==yOffset&&xOffset==0) {
					continue;
				}
				if(spiral.containsKey(new Point(x+xOffset, y+yOffset))) {
					i+=spiral.get(new Point(x+xOffset, y+yOffset));
				}
			}
		}
		return i;
	}
	
}
