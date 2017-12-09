package com.suppergerrie2.adventofcode2017;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day9 {

	static String input;
	
	public static void main(String[] args){
		System.out.println("Day 9");
		input = Helper.loadFile("day9");
		System.out.println(task12(input));
	}

	static int task12(String in) {
		int score = 0;
		int charsInGarbage = 0;
		
		int inGroupLayer = 0;
		boolean inGarbage = false;
		for(int i = 0; i < in.length(); i++){
			switch(in.substring(i, i+1)){
				case "{":
					if(!inGarbage){
						inGroupLayer++;
						score+=inGroupLayer;
					} else {
						charsInGarbage++;
					}
					break;
				case "}":
					if(!inGarbage){
						inGroupLayer--;
					} else {
						charsInGarbage++;
					}
					break;
				case "<":
					if(inGarbage){
						charsInGarbage++;
					}
					inGarbage = true;
					break;
				case ">":
					inGarbage = false;
					break;
				case "!":
					i++;
					break;
				default:
					if(inGarbage){
						charsInGarbage++;
					}
					break;
			}
		}
		System.out.println("In garbage: " + charsInGarbage);
		return score;
	}
	
}
