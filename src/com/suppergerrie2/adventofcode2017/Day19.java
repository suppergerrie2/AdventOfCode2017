package com.suppergerrie2.adventofcode2017;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day19 {

	static String input;
	
	public static void main(String[] args) {
		System.out.println("Day 19");
		input = Helper.loadFile("day19");
		task1(input);
	}
	
	static void task1(String in) {
		int[][] map = buildMap(in);
		int x = 0;
		int y =0;
		int dir = 0;
		int steps=1;
		for(x = 0; x < map[y].length; x++) {
			if(map[y][x]==1) {
				break;
			}
		}
		String letters = "";
		int lx, ly, ldir;
		while(true) {
			if(getMapValue(y,x,map)>10) {
				letters+=String.valueOf((char)getMapValue(y,x,map));
			}
			lx=x;
			ly=y;
			ldir = dir;
   			if(dir==0) {
				if(getMapValue(y+1,x,map)!=0) {
					y++;
					steps++;
				} else {
					dir=getNextDir(x,y,map, dir);
				}
 			} else if(dir==1) {
				if(getMapValue(y,x+1,map)!=0) {
					x++;
					steps++;
				} else {
					dir=getNextDir(x,y,map, dir);
				}
  			} else if(dir==2) {
				if(getMapValue(y-1,x,map)!=0) {
					y--;
					steps++;
				} else {
					dir=getNextDir(x,y,map, dir);
				}
			} else if(dir==3) {
				if(getMapValue(y,x-1,map)!=0) {
					x--;
					steps++;
				} else {
					dir=getNextDir(x,y,map, dir);
				}
			} else {
				dir = 0;
			}
    		if(lx==x&&ly==y&&ldir==dir) {
   				break;
   			}
		}
		System.out.println(letters);
		System.out.println(steps);
	}
	
	static int getNextDir(int x, int y, int[][] map, int dir) {
		if(dir==0||dir==2) {
			if(getMapValue(y,x+1,map)!=0) {
				dir=1;
			} else if (getMapValue(y,x-1,map)!=0) {
				dir=3;
			}
		} else {
			if(getMapValue(y+1,x,map)!=0) {
				dir=0;
			} else if (getMapValue(y-1,x,map)!=0) {
				dir=2;
			}
		}
		return dir;
	}
	
	static int getMapValue(int y, int x, int[][] map) {
		if(y<0||y>map.length-1||x<0||x>map[y].length-1) {
			return 0;
		}
		return map[y][x];
	}
	
	static int[][] buildMap(String in){
		int[][] map = null;
		String[] lines = in.split("\r\n");
		for(int y = 0; y < lines.length; y++) {
			String[] chars = lines[y].split("");
			for(int x = 0; x < chars.length; x++) {
				if(map==null) {
					map = new int[lines.length][chars.length];
				}
				if(chars[x].equals(" ")) {
					map[y][x] = 0;
				} else if (chars[x].equals("|")) {
					map[y][x] = 1;
				} else if(chars[x].equals("-")) {
					map[y][x] = 2;
				} else if(chars[x].equals("+")) {
					map[y][x] = 3;
				} else {
					map[y][x] = (int)chars[x].charAt(0);
				}
			}
		}
		return map;
	}
}
