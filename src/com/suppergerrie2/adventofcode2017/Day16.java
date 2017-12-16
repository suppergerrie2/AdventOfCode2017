package com.suppergerrie2.adventofcode2017;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day16 {

	static String input;
	
	public static void main(String[] args) {
		System.out.println("Day 16");
		input=Helper.loadFile("day16");
		task1(input);
		task2(input);
	}
	
	static void task1(String in) {
		String[] moves = in.split(",");
		String[] dancers = "abcdefghijklmnop".split("");
		for(String move : moves) {
			switch(move.substring(0, 1)) {
				case "s":
					int l = Integer.valueOf(move.substring(1));
					
					String s = "";
					for(int i = dancers.length-1; i > dancers.length-1-l; i--) {
						s+=dancers[i];
					}
					s = new StringBuilder(s).reverse().toString();
					for(int i = 0; i < dancers.length-l; i++) {
						s+=dancers[i];
					}
					dancers=s.split("");
					
					break;
				case "x":
					int i1 = Integer.valueOf(move.split("/")[0].substring(1));
					int i2 = Integer.valueOf(move.split("/")[1]);
					String tempDancer = dancers[i1];
					dancers[i1]=dancers[i2];
					dancers[i2]=tempDancer;
					break;
				case "p":
					String p1 = move.split("/")[0].substring(1);
					String p2 = move.split("/")[1];
					boolean swapped = false;
					for(int i = 0; i < dancers.length; i++) {
						if(dancers[i].equals(p1)&&!swapped) {
							for(int j = 0; j < dancers.length; j++) {
								if(dancers[j].equals(p2)&&!swapped) {
									dancers[i]=dancers[j];
									dancers[j]=p1;
									swapped = true;
									break;
								}
							}
						}
						if(swapped) {
							break;
						}
					}
					
					break;
			}
		}
		System.out.println("Task 1:");
		for(String dancer : dancers) {
			System.out.print(dancer);
		}
		System.out.println("");
	}
	
	static void task2(String in) {
		String[] moves = in.split(",");
		String[] dancers = "abcdefghijklmnop".split("");
		int loopCount = 1000000000;
		for(int c = 0; c < loopCount; c++) {
			for(String move : moves) {
				switch(move.substring(0, 1)) {
					case "s":
						int l = Integer.valueOf(move.substring(1));
						
						String s = "";
						for(int i = dancers.length-1; i > dancers.length-1-l; i--) {
							s+=dancers[i];
						}
						s = new StringBuilder(s).reverse().toString();
						for(int i = 0; i < dancers.length-l; i++) {
							s+=dancers[i];
						}
						dancers=s.split("");
						
						break;
					case "x":
						int i1 = Integer.valueOf(move.split("/")[0].substring(1));
						int i2 = Integer.valueOf(move.split("/")[1]);
						String tempDancer = dancers[i1];
						dancers[i1]=dancers[i2];
						dancers[i2]=tempDancer;
						break;
					case "p":
						String p1 = move.split("/")[0].substring(1);
						String p2 = move.split("/")[1];
						boolean swapped = false;
						for(int i = 0; i < dancers.length; i++) {
							if(dancers[i].equals(p1)&&!swapped) {
								for(int j = 0; j < dancers.length; j++) {
									if(dancers[j].equals(p2)&&!swapped) {
										dancers[i]=dancers[j];
										dancers[j]=p1;
										swapped = true;
										break;
									}
								}
							}
							if(swapped) {
								break;
							}
						}
						
						break;
				}
			}
			String test = "";
			for(String d : dancers) {
				test+=d;
			}

			if(test.equals("abcdefghijklmnop")&&loopCount==1000000000) {
				loopCount%=(c+1);
				c=-1;
			}
		}
		System.out.println("Task 2:");
		for(String dancer : dancers) {
			System.out.print(dancer);
		}
		System.out.println("");
	}
	
}
