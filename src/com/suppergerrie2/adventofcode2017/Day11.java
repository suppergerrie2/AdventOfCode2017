package com.suppergerrie2.adventofcode2017;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day11 {

	static String input;
	
	static enum moves {
		
		N(0, 1, -1),
		NE(1,0,-1),
		SE(1,-1,0),
		S(0,-1,1),
		SW(-1,0,1),
		NW(-1,1,0);
		
		
		final int x;
		final int y;
		final int z;
		moves(int x, int y, int z){
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Day 11");
		input = Helper.loadFile("day11");
		task12(input);
	}

	static void task12(String in) {
		int dist = 0;
		int maxDist = Integer.MIN_VALUE;
		int x = 0, y = 0, z = 0;
		
		String[] commands = in.split(",");
		for(String command : commands) {
			moves move = moves.valueOf(command.toUpperCase());
			x+=move.x;
			y+=move.y;
			z+=move.z;
			maxDist = Math.max(maxDist, (Math.abs(x) + Math.abs(y) + Math.abs(z)) / 2);
		}

		System.out.println( (Math.abs(x) + Math.abs(y) + Math.abs(z)) / 2);
		System.out.println(maxDist);
	}
}