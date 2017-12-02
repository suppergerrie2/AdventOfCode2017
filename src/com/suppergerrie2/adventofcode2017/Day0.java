package com.suppergerrie2.adventofcode2017;

import java.util.ArrayList;
import java.util.List;

public class Day0 {
	
	//This is not an official puzzle, this is from the warming up puzzle someone made: https://pastebin.com/BMd61PUv
	
	static int x = 0;
	static int y = 0;
	
	static String input = "Down, Left, Right, Up, B, Up, B, B, Up, Left, Right, Up, Down, Right, Left, B, B, Right, Left, Up, Right, Up, Up, Up, Left, Up, Left, B, Left, Up, Down, Right, Right, Up, Up, A, Left, B, Down, Up, Right, A, A, Down, Down, Down, Up, A, Left, Up, Left, Down, B, Left, Up, Down, Down, Up, Up, Up, Up, Up, Right, A, Right, Left, Right, Down, Up, Down, Down, Left, Up, Up, Up, Left, Right, Right, Up, Up, Right, Left, Left, Up, Left, Down, A, Up, Down, Up, Right, Up, Left, Up, Up, Down, Down, B, Right, Left, Down, Up, Down, Down, Down, Right, Right, Left, Left, Down, Down, A, Right, Right, Up, Left, Up, Up, Left, Up, Up, Up, Down, Left, Right, Left, Right, Up, Right, Up, Down, B, Down, Left, Down, Up, Left, Up, Up, B, A, Left, Down, Down, Down, Right, Right, Up, Right, Up, Left, Up, Right, Left, B, A, Up, Right, Down, Up, Up, Down, Up, Right, Down, A, Right, Down, B, Left, Down, Down, A, Up, Up, A, Down, Right, Up, Left, Left, Up, A, Up, Right, B, A, Right, Left, Down, Down, Up, Up, A, A, Right, Left, Left, Up, Up, Right, Up, Down, Up, Left, B, Up, Up, Left, B, Right, Left, Up, Right, Left, Down, Down, Left, Down, Down, Down, Up, Left, B, Down, A, Right, Up, Right, Up, Up, Left, Left, A, Down, Down, Right, B, Left, Right, A, A, Up, B, Right, Down, A, Down, Up, Right, Down, B, Right, Up, Left, Up, Down, Down, Up, Up, Right, Down, B, Down, Up, Up, Right, Left, Right, Up, Down, Right, B, Up, A, Up, Down, Up, Up, Left, Down, Down, Up, Down, Down, A, Right, Right, Right, Up, B, Up, A, Right, Right, Left, Right, Left, Down, Left, Right, Up, B, Up, B, Down, Right, Up, A, Up, Right, Down, Down, Down, Left, Up, Left, Left, Left, Up, Up, Down, Up, Up, Right, B, Right, A, Down, Right, Right, Down, Down, Down, B, Down, Up, Up, Up, Left, Up, Right, Down, Right, Up, Up, Right, A, B, Down, Left, Down, Right, Up, Left, Up, A, Left, Left, Left, Right, Right, Right, Up, Up, Left, Down, B, Left, Up, Up, A, A, Right, Right, Up, A, Left, Down, Left, A, B, Right, Up, Right, Left, Up, Up, Down, A, Right, Up, Left, Left, Left, Left, Right, Down, B, B, Right, Down, A, Right, Up, Right, Down, Up, Down, Up, Up, Left, Right, Down, Up, Down, Left, Down, Down, Left, Up, Left, A, Left, Up, Up, Up, Left, Up, B, B, Up, Left, Right, Left, A, Right, Right, Up, Up, A, A, Left, B, Up, Up, Right, A, Left, Right, Down, Right, Up, Up, Up, A, A, A, B, A, Right, Down, Up, Up, Right, Down, Down, Right, Right, Down, Up, Up, Down, Right, Down, A, Up, Right, Right, A, B, B, B, Up, Right, B, Down, Down, Left, B, B, Down, Left, Up, Down, B, Up, Left, Up, A, Left, Left, Right, A, Right, Left, Left, Left, B, Down, Down, Left, Up, Left, Down, Up, Left, Left, Up, Right, A, Down, Right, Left, Left, Up, Down, A, Up, Down, Left, Right, Left, Down, Up, B, Left, Left, Down, Left, Up, Left, Up, Up, A, Down, Left, A, Up, B, Up, B, Up, Left, Left, A, A, A, Left, Up, Down, Up, Right, Left, Left, Left, Right, Down, A, Left, Left, Up, A, B, A, B, Right, A, Left, A, Right, Right, Down, Up, Down, Up, Left, A, A, Down, Up, Right, Up, Down, Up, Left, Left, Down, Left, A, B, Down, A, Left, Right, Right, Right, Up, Up, Up, A, Right, Left, Down, Left, B, Down, Up, A, Up, Left, Up, Down, Down, A, Down, Down, Up, Right, Down, A, Left, Right, Up, Up, Left, Left, Down, B, Up, A, Right, Down, Down, Down, Left, A, Up, Up, A, Right, Right, Up, Left, A, Down, Left, Right, Up, Left, Up, Right, Left, Left, A, Up, Right, Down, Up, Left, Left, Right, A, A, Down, Right, Up, B, Left, Right, Right, Up, B, Left, Up, Right, Up, Right, Left, Right, Down, Right, Right, Right, Up, Right, B, A, Up, Right, Down, Up, Left, Up, Right, Left, Up, Left, B, Right, Up, Left, Left, Down, Down, Right, A, Up, Up, Down, Down, Left, A, Down, A, Up, A, Down, Left, Up, Up, Up, Down, Left, Left, Up, B, Left, Right, Down, Right, Down, Down, Left, Up, Right, B, Down, Up, Left, Left, Down, A, Up, Left, Left, Right, Left, Left, Left, Down, B, Down, A, Left, Left, Right, Left, Down, Right, Down, B, Down, Left, Down, Up, Right, Left, B, A, Left, B, Down, Right, Left, Left, Down, Right, Left, Down, Left, Left, A, Left, Down, Down, Left, Up, Down, Left, Left, Down, Down, B, Left, Left, Up, Down, Right, Up, Down, Right, Right, B, Left, B, A, A, Down, Down, Down, Right, Up, A, B, Up, Left, Right, Left, Down, Left, Left, A, Up, Left, Left, A, Up, A, Up, Right, Right, Left, Left, Up, Up, Left, Right, Down, Right, Down, Right, Up, Left, Down, Left, A, Right, B, B, Up, Left, Left, Left, Down, Right, Left, Up, Down, Down, A, A, Up, A, Up, Left, Down, Right, Right, Left, Down, B, Up, Up, Left, A, Left, Right, Right, Left, Right, Up, Up, Down, B, A, B, B, Left, Up, Right, Left, Up, Down, Down, Right, Down, Up, Down, Right, Down, Up, Right, B, Left, B, Down, Left, Down, Left, Left, A, Left, Right, Down, Left, Right, Down, Down, Left, Up, Up, Up, Left, B, B, Right, Left, Left, Up, A, Down, Left, Up, Left, A, Right, Down, B, Left, Right, Up, Left, Right, Left, Down, B, Up, B, Up, Left, Left, Left, Right, Up, Right, Left, Down, Left, Right, B, Down, Left, Left, Down, Right, A, Left, Right, Left, Up, A, A, Right, Up, Right, Right, Left, Left, Right, Down, Left, Left, Down, Right, Down, A, Left, Right, Up, Right, B, Right, Right, Left, Right, Down, Up, Down, Left, Down, B, Right, Left, B, B, Up, Down, Up, Right, Left, Up, Down, Up, Down, Up, Down, B, B, B, A, B, Down, Right, B, Down, B, Down, Left, Right, Up, Up, Left, Down, A, Down, Right, Down, Down, Down, Down, B, Up, Up, Down, Right, Up, Down, Up, Right, Up, B, A, A, Down, Down, Up, Right, Right, Right, B, Right, Down, Left, Left, B, Right, Down, Right, Down, Up, Right, Up, Down, Right, Right, Left, B, Down, Down, Left, Down, Left, Left, Up, B, Right, Right, Left, B, Down, Up, Left, Down, Right, Left, Down, Left, Left, Down, Up, Down, Down, Down, Left, Down, Down, Down, Up, Up, Left, Right, A, Up, Left, Down, Right, Up, Down, Right, Right, A, Down, B, A, Down, A, Right, Up, A, A, Left, Up, Down, B, Up, Right, Down, Down, Right, Left, Left, Right, Down, Right, Down, Down, B, Left, B, Right, Up, A, Left, Left, Down, Down, Down, Down, Right, Up, Down, Down, Right, Down, Right, Left, Right, Left, Left, Down, Down, Down, Left, Right, Right, Down, Down, Down, Down, Right, Left, Up, B, Down, Up, Left, B, Up, Right, Down, Down, B, Up, A, Left, Down, Left, Up, B, B, Up, Down, Left, Left, Down, Left, Down, Down, Down, B, Down, Right, Down, Left, Down, Left, Down, Up, Up, B, Up, Left, Left, A, Down, Down, Up, Left, B, Down, Down, Right, Left, Left, Right, Down, Down, Left, A, Up, A, Down, Left, Down, Down, Left, Up, Left, B, Left, Right, Left, A, Down, Left, Right, Left, Right, Down, Right, A, Down, Left, B, Right, Up, B, Up, B, Down, Left, B, A, Up, A, B, Up, Left, Left, Down, Down, Left, A, Left, Left, B, Up, Down, Left, A, Left, B, Down, Up, Down, Right, Up, Left, B, Left, Down, B, Right, Down, Left, Right, Right, Up, Down, Up, Down, Down, Left, Down, Down, Down, Left, Down, Left, Left, A, Up, Down, Down, Down, Up, B, Down, Up, Down, A, Down, Left, Left, Left, Up, Up, Left, Down, Up, Right, Up, Down, Down, A, Right, B, Right, A, B, Right, Down, A, Down, Right, Up, Up, Down, Left, Down, Down, Right, Up, Down, Down, B, Left, Up, A, Right, Up, A, Up, Down, Up, Down, Right, Right, Down, Down, Left, Right, Up, Right, Up, Up, Down, B, Right, Right, Right, Down, Right, A, Down, Right, Right, Down, Right, A, Left, Down, Down, Up, Down, B, Down, Left, Left, Left, Down, Down, B, Left, A, Up, Left, Up, Right, Right, Down, Up, A, Left, B, A, A, Down, A, Down, Left, B, Up, A, Down, Right, Down, B, Down, Right, Left, Down, Up, Down, Down, Right, Up, Left, Down, B, Up, B, Right, Right, Left, Down, Left, A, Right, Down, Down, B, Down, Down, Down, Left, A, Up, B, Up, B, Up, Left, B, Up, Down, Right, Right, Up, Right, B, B, Right, Up, B, Right, B, A, Left, Right, Right, Right, Right, Left, Up, Up, Left, Up, Left, Right, Left, Right, A, A, Down, Right, Up, A, Down, Right, Right, Left, Right, Left, B, Right, Left, A, Left, Left, Up, Right, Up, Right, B, Right, Down, A, Right, Down, Right, B, Right, Right, Left, Down, Down, Down, Up, Left, Left, Right, B, Up, Down, Left, Right, Up, Down, Left, A, Right, Right, A, Left, Left, Right, Right, Left, Right, Left, Left, Left, B, Left, Right, Right, Up, Up, Up, Up, Down, Right, Up, A, Right, Up, Down, Left, Right, Left, Left, Right, Left, Left, Up, Up, A, Right, Right, Down, Left, Left, A, Down, Right, Right, Right, Left, Right, Up, B, Right, Up, Right, Down, Left, B, Up, A, Down, Right, Left, Right, A, Right, Down, Right, B, Right, A, Right, A, Down, Down, Right, Down, Left, Down, A, B, Down, Right, Right, Right, Down, A, Down, Right, Left, Left, Right, B, A, Left, Down, Left, Left, Right, Down, Up, Up, Up, Right, Up, Down, B, A, Right, Right, Up, Down, Left, Left, A, Down, Left, A, Right, B, B, Up, Left, A, Right, Up, Left, Right, B, Left, Left, B, Up, Right, A, Left, Right, Left, Right, Right, B, Right, Right, Right, A, Left, Right, Left, Left, Up, Right, Right, A, Up, Right, Down, Down, B, Left, Up, Down, Right, Right, A, B, Down, Right, Right, Right, Down, Up, Down, Right, Right, Left, Right, Right, A, Right, Down, Up, A, Left, Down, Down, Right, Down, Left, Right, Right, Down, Left, Down, Left, A, Left, A, B, Left, Down, B, Left, Right, Right, B, Right, Right, A, Left, Right, B, B, Down, Up, A, Up, Right, Right, Right, Right, Right, B, Right, A, Up, Left, Right, Down, B, Left, Down, Right, Right, Right, B, Up, A, B, Up, Down, Left, Up, Right, Up, Right, Right, Down, Left, Left, Left, Up, Down, Left, Right, Right, B, Right, Down, Left, Right, Right, A, Up, Down, Up, Left, A, Right, A, Right, Up, Up, Up, Down, Up, A, A, Right, Down, Right, Up, B, Left, Down, Left, A, B, Up, Right, Left, Down, B, Up, Right, Right, Right, Up, Right, Right, Right, Left, Up, Right, A, Right, Up, A, Left, A, B, Up, Right, Down, B, Right, Up, B, Left, Up, Up, Down, Right, B, Right, Right, Right, Left, Up, B, Down, Down, Right, Right, Up, A, Up, Right, Left, Up, Up, Right, Up, B, Right, Down, Right, Right, Left, Up, Left, B, Left, A, Down, Right, B, Right, Left, Down, Right, Left, A, Down, Left, B, Right, Down, Up, Down, B, Down, Up, Right, Right, Up, Right, Right, Up, Left, Right, Right, Left, B, A, B, Down, Right, B, Right, Left, Up, Right, Down, Down, Right, Right, Down, A, B, Right, Down, Right, Down, Right, Right, Right, Left, Right, A, Left, Down, Up, Right, Up, Up, Right, B, Down, Down, Right, Left, Left, A, Down, Right, Up, B, Up, Up, Right, Right, Down, B, Down, Up, Right, A, Down, Start";	
	public static void main(String[] args) {
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
