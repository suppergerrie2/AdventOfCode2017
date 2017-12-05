package com.suppergerrie2.adventofcode2017;

import java.util.ArrayList;
import java.util.List;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day0 {
	
	//This is not an official puzzle, this is from the warming up puzzle someone made: https://pastebin.com/BMd61PUv
	
	static int x = 0;
	static int y = 0;
	
	static String input;	
	public static void main(String[] args) {
		System.out.println("Day 0");
		input = Helper.loadFile("day0");
		System.out.println(task1(input));
		System.out.println(task2(input));
	}
	
	static int task1(String in) {
		int dist=0;
		x = y = 0;
		
		String[] commands = in.split(", ");
		
		for(String command : commands) {
			switch(command) {
				case "Up":
					y++;
					break;
				case "Down":
					y--;
					break;
				case "Left":
					x--;
					break;
				case "Right":
					x++;
					break;
				case "A":
					dist = Math.max(calculateDistance(x, y), dist);
					break;
				case "B":
					dist = Math.max(calculateDistance(x, y), dist);
					break;
				case "Start":
					return dist;
			}
		}
		
		return dist;
	}
	
	static int task2(String in) {
		int dist=0;
		x = y = 0;
		List<Marker> markers = new ArrayList<Marker>();
		
		String[] commands = in.split(", ");
		
		for(String command : commands) {
			switch(command) {
				case "Up":
					y++;
					break;
				case "Down":
					y--;
					break;
				case "Left":
					x--;
					break;
				case "Right":
					x++;
					break;
				case "A":
					
					for(Marker marker : markers) {
						if(marker.type.equals("B")) {
							dist = Math.max(calculateDistance(x, y, marker.x, marker.y), dist);
						}
					}
					markers.add(new Marker(x, y, "A"));
					
					break;
				case "B":
					
					for(Marker marker : markers) {
						if(marker.type.equals("A")) {
							dist = Math.max(calculateDistance(x, y, marker.x, marker.y), dist);
						}
					}
					
					markers.add(new Marker(x, y, "B"));
					break;
				case "Start":
					return dist;
			}
		}
		return dist;
	}

	static int calculateDistance(int x1, int y1) {
		return calculateDistance(x1, y1, 0, 0);
	}
	
	static int calculateDistance(int x1, int y1, int x2, int y2) {
		return Math.abs(x2-x1)+Math.abs(y2-y1);
	}
	
}

class Marker {
	
	public int x, y;
	public String type;
	
	
	public Marker(int x, int y, String type) {
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
}
