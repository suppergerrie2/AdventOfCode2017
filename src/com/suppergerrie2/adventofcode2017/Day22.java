package com.suppergerrie2.adventofcode2017;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day22 {

	public static void main(String[] args) {
		System.out.println("Day 22");
		String input = Helper.loadFile("day22");
		task1(input);
		task2(input);
	}
	
	public static void task1(String input) {
		Map<Point, Boolean> grid = new HashMap<Point, Boolean>();
		String[] rows = input.split("\r\n");
		
		int x = 0;
		int y = 0;
		int dir = 0;
		for(int i = 0; i < rows.length; i++) {
			y = rows.length/2;
			for(int j = 0; j < rows[i].length(); j++) {
				x = rows[i].length()/2;
				if(rows[i].substring(j, j+1).equals("#")) {
					grid.put(new Point(j,i), true);
				} else {
					grid.put(new Point(j,i), false);
				}
			}
		}

		int infectionBursts = 0;
		
		int minX = Integer.MAX_VALUE;
		int minY = Integer.MAX_VALUE;
		int maxX = Integer.MIN_VALUE;
		int maxY = Integer.MIN_VALUE;
		for(int burst = 0; burst < 10000; burst++) {
			boolean infected = false;
			Point pos = new Point(x,y);
			if(grid.containsKey(pos)) {
				infected = grid.get(pos);
			}


			dir+=infected?1:-1;
			if(dir<0) {
				dir=3;
			} else if (dir>3) {
				dir=0;
			}
			grid.put(pos, !infected);
			
			if(!infected) {
				infectionBursts++;
			}
			
			switch (dir) {
				case 0:
					y--;
					break;
				case 1:
					x++;
					break;
				case 2:
					y++;
					break;
				case 3:
					x--;
					break;
				default:
					System.out.println("whut");
			}
			if(x<minX) {
				minX=x;
			} else if(x>maxX) {
				maxX = x;
			}
			if(y<minY) {
				minY = y;
			} else if (y>maxY) {
				maxY=y;
			}
		}
		for(int yPos = minY-2; yPos<maxY+2; yPos++) {		
			String l = "";
			for(int xPos = minX-2; xPos<maxX+2; xPos++) {
				String s = ".";
				if(grid.containsKey(new Point(xPos, yPos))&&grid.get(new Point(xPos, yPos))) {
					s="#";
				}
				if(xPos==0&&yPos==0) {
					s="["+s+"]";
				}
				l+=s+" ";
			}
			System.out.println(l);
		}
		
		System.out.println(infectionBursts);
	}
	
	public static void task2(String input) {
		Map<Point, Integer> grid = new HashMap<Point, Integer>();
		String[] rows = input.split("\r\n");
		
		int x = 0;
		int y = 0;
		int dir = 0;
		for(int i = 0; i < rows.length; i++) {
			y = rows.length/2;
			for(int j = 0; j < rows[i].length(); j++) {
				x = rows[i].length()/2;
				if(rows[i].substring(j, j+1).equals("#")) {
					grid.put(new Point(j,i), 2);
				} else {
					grid.put(new Point(j,i), 0);
				}
			}
		}

		int infectionBursts = 0;
		
		int minX = Integer.MAX_VALUE;
		int minY = Integer.MAX_VALUE;
		int maxX = Integer.MIN_VALUE;
		int maxY = Integer.MIN_VALUE;
		for(int burst = 0; burst < 10000000; burst++) {
			int state = 0;
			Point pos = new Point(x,y);
			if(grid.containsKey(pos)) {
				state = grid.get(pos);
			}

			
			if(state==0) {
				dir--;
			} else if (state == 2) {
				dir++;
			} else if (state == 3) {
				dir+=2;
			}
			
			if(dir<0) {
				dir+=4;
			} else if (dir>3) {
				dir-=4;
			}
			int newState = state+1;
			if(newState>3) {
				newState = 0;
			}
			grid.put(pos, newState);
			
			if(newState==2) {
				infectionBursts++;
			}
			
			switch (dir) {
				case 0:
					y--;
					break;
				case 1:
					x++;
					break;
				case 2:
					y++;
					break;
				case 3:
					x--;
					break;
				default:
					System.out.println("whut");
			}
			if(x<minX) {
				minX=x;
			} else if(x>maxX) {
				maxX = x;
			}
			if(y<minY) {
				minY = y;
			} else if (y>maxY) {
				maxY=y;
			}
		}
		for(int yPos = minY-2; yPos<maxY+2; yPos++) {		
			String l = "";
			for(int xPos = minX-2; xPos<maxX+2; xPos++) {
				String s = ".";
				if(grid.containsKey(new Point(xPos, yPos))) {
					int state = grid.get(new Point(xPos, yPos));
					if(state==0) {
						s=".";
					} else if(state == 1) {
						s="W";
					} else if(state == 2) {
						s="#";
					} else if (state == 3) {
						s="F";
					}
				}
				if(xPos==0&&yPos==0) {
					s="["+s+"]";
				}
				l+=s+" ";
			}
			System.out.println(l);
		}
		
		System.out.println(infectionBursts);
	}
}
