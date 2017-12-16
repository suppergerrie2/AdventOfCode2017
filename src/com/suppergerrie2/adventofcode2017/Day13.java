package com.suppergerrie2.adventofcode2017;

import java.util.ArrayList;
import java.util.List;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day13 {

	static String input;
	
	static List<Layer> firewall = new ArrayList<Layer>();
	
	public static void main(String[] args) {
		System.out.println("Day 13");
		input = Helper.loadFile("day13");
		System.out.println(task1(input));
		System.out.println(task2(input));
	}
	
	static int task1(String in) {
		int severity = 0;
		
		buildFirewall(in);
		
		int maxDepth = firewall.get(firewall.size()-1).depth;
		int location = 0;
				
		while(location!=maxDepth+1) {
			for(Layer l : firewall) {
				if(l.depth==location) {
					if(l.scannerPos==0) {
						severity+=l.depth*l.range;
					}
					break;
				}
			}
			
			for(Layer l : firewall) {
				l.moveScanner();
			}
			location++;
		}
		
		
		return severity;
	}
	
	//Slowest solution ever
	static int task2(String in) {	
		long startTime = System.nanoTime();
//		int maxDepth = firewall.get(firewall.size()-1).depth;
//		int location = 0;
		//3400000
		int delay = 3400000;
		
		boolean detected = true;

		while(detected) {
			delay++;
			detected = false;
			for(Layer l : firewall) {
				l.scannerPos=0;
				l.dir=1;
				l.moveScanner(delay + l.depth);
				
				if(delay%100000==0) {
					System.out.println(delay);
				}
				
				if(l.scannerPos==0) {
					detected = true;
					break;
				}
			}
		}
		
//		while(detected) { 112884
//			delay++;
////			System.out.println(delay);
//
//			detected=false;
//			location=0;
//			
//			for(Layer l : firewall) {
//				l.scannerPos = 0;
//				l.dir = 1;
//			}
//			for(int i = 0; i < delay; i++) {
//				for(Layer l : firewall) {
//					l.moveScanner();
//				}
//			}
//			
//			while(location!=maxDepth+1) {
//				for(Layer l : firewall) {
//					if(l.depth==location) {
//						if(l.scannerPos==0) {
//							detected=true;
//						}
//						break;
//					}
//				}
//				
//				if(detected) {
//					break;
//				}
//				
//				for(Layer l : firewall) {
//					l.moveScanner();
//				}
//				location++;
//			}
//		}
		
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		
		System.out.println(duration + " " + duration/1000000 ); 
		
		return delay;
	}
	
	static void buildFirewall(String in) {
		String[] lines = in.split("\r\n");
		for(String line : lines) {
			String[] parts = line.split(": ");
			firewall.add(new Layer(Integer.valueOf(parts[0]), Integer.valueOf(parts[1])));
		}
	}
}

class Layer {
	int depth;
	int range;
	int scannerPos = 0;
	int dir = 1;
	
	public Layer(int depth, int range) {
		this.depth = depth;
		this.range = range;
	}
	
	public void moveScanner(int pico) {
		 for(int i = 0; i < pico; i++) {
			 moveScanner();
		 }
	}

	public int moveScanner() {
		if((scannerPos>=range-1&&dir==1)||(scannerPos<=0&&dir==-1)) {
			dir*=-1;
		}
		
		scannerPos+=dir;

		return scannerPos;
	}
}
