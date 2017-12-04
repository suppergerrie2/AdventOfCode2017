package com.suppergerrie2.adventofcode2017;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

public class Day3 {
	
	static String input = "325489";
	
	public static void main(String[] args) {
		System.out.println(task1(input));
		System.out.println(task2(input));
	}
	
	static int task1(String _in) {
		int in = Integer.parseInt(_in);

		Map<Integer, Point> spiral = new HashMap<Integer, Point>();

		int x = 0;
		int y = 0;
		spiral.put(1,new Point(0,0));
		String commands = "";
		int i = 0;
		int temp = 1;
		while(temp<in) {
			for(int right = 0; right <= i; right++) {
				commands+="r";
				temp++;
			}
			for(int up = 0; up <= i; up++) {
				commands+="u";
				temp++;
			}			
			for(int left = 0; left <= i+1; left++) {
				commands+="l";
				temp++;
			}			
			for(int down = 0; down <= i+1; down++) {
				commands+="d";
				temp++;
			}
			i+=2;
		}
		for(i = 0; i < commands.length(); i++) {
			String command = commands.substring(i, i+1);
			if(command.equals("u")) {
				y++;
			}
			if(command.equals("d")) {
				y--;
			}
			if(command.equals("r")) {
				x++;
			}
			if(command.equals("l")) {
				x--;
			}
			spiral.put(i+2, new Point(x,y));
		}
		System.out.println("\n" + commands);
		
		Point loc = spiral.get(in);
		
		return Math.abs(loc.x)+Math.abs(loc.y);
	}
	
	static int task2(String _in) {
		int in = Integer.parseInt(_in);
		
		Map<Point, Integer> spiral = new HashMap<Point, Integer>();
		int x = 0;
		int y = 0;
		spiral.put(new Point(0,0),1);
		String commands = "";
		int i = 0;
		int temp = 1;
		while(temp<in) {
			for(int right = 0; right <= i; right++) {
				commands+="r";
				temp++;
			}
			for(int up = 0; up <= i; up++) {
				commands+="u";
				temp++;
			}			
			for(int left = 0; left <= i+1; left++) {
				commands+="l";
				temp++;
			}			
			for(int down = 0; down <= i+1; down++) {
				commands+="d";
				temp++;
			}
			i+=2;
		}
		for(i = 0; i < commands.length(); i++) {
			String command = commands.substring(i, i+1);
			if(command.equals("u")) {
				y++;
			}
			if(command.equals("d")) {
				y--;
			}
			if(command.equals("r")) {
				x++;
			}
			if(command.equals("l")) {
				x--;
			}
			int val = calculateValue(x, y, spiral);
			
			if(val>in) {
				return val;
			}
			
			spiral.put(new Point(x,y), val);
		}
		return 0;
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
