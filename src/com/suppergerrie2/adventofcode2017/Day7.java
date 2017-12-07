package com.suppergerrie2.adventofcode2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day7 {

	static String input;
	
	static Map<String, Program> programs = new HashMap<String, Program>();
	
	public static void main(String[] args) {
		System.out.println("Day 7");
		input = Helper.loadFile("day7");
		System.out.println(task1(input));
//		System.out.println(task2(input));
	}
	
	static String task1(String _in) {
		generateTowerStructure(_in);
		
		Program p = programs.get(_in.split("\r\n")[0].split(" ")[0]);
		while(p.parent!=null) {
			p = p.parent;
		}
		
		p.recalculateTowerWeight();
		System.out.println(p.getUnbalancedProgramWeight());
		
		return p.name;
	}
	
	static int task2(String _in) {
		int newWeight = 0;
		
		if(programs.size()==0) {
			generateTowerStructure(_in);
		}
		
		Program bottomProgram = programs.get(_in.split("\r\n")[0].split(" ")[0]);
		while(bottomProgram.parent!=null) {
			bottomProgram = bottomProgram.parent;
		}
		bottomProgram.recalculateTowerWeight();
		Map<Integer, Integer> weightCount = new HashMap<Integer, Integer>();
		for(Program p : bottomProgram.programs) {
			if(weightCount.containsKey(p.towerWeight)) {
				weightCount.put(p.towerWeight, weightCount.get(p.towerWeight)+1);
			} else {
				weightCount.put(p.towerWeight, 1);
			}
		}
		int minAmount = Integer.MAX_VALUE;
		int maxWeight = -1;
		for(int weight : weightCount.keySet()) {
			if(weightCount.get(weight)<minAmount) {
				minAmount = weightCount.get(weight);
				maxWeight = weight;
			}
		}
		System.out.println(maxWeight);
		return newWeight;
	}
	
	static void generateTowerStructure(String _in) {
		String[] lines = _in.split("\r\n");
		for(String line : lines) {
			String[] words = line.split(" ");
			String name = words[0];
			if(programs.containsKey(name)) {
				System.err.println("Wait whut");
			}
			int weight = Integer.valueOf(words[1].substring(1, words[1].length()-1));
			programs.put(name, new Program(name, weight));
		}
		for(String line : lines) {
			if(line.contains("->")) {
			
				String[] words = line.split(" ");
				String name = words[0];
				for(int i = 3; i < words.length; i++) {
					words[i]=words[i].replace(",", "");
					
					if(programs.containsKey(words[i])) {
						programs.get(name).addProgram(programs.get(words[i]));;
					} else {
						System.err.println("Can this happen?");
					}
				}
			}
		}
	}
}

class Program {
	public String name;
	public int weight;
	public List<Program> programs;
	public Program parent;
	public int towerWeight;
	
	public Program(String name, int weight) {
		this.name = name;
		this.weight = weight;
		this.programs = new ArrayList<Program>();
	}
	
	public void addProgram(Program p) {
		this.programs.add(p);
		p.parent = this;
	}
	
	public int recalculateTowerWeight() {
		for(Program p : programs) {
			towerWeight+=p.recalculateTowerWeight();
		}
		
		towerWeight+=this.weight;
//		if(programs.size()==0) {
//			return weight;
//		}
		
		
		return towerWeight;
	}
	
	public int getUnbalancedProgramWeight() {
		Map<Integer, Integer> countWeightOccurance = new HashMap<Integer, Integer>();
		if(programs.size()>0) {
			for(Program p : programs) {
 				int count = 1;
 				if(countWeightOccurance.containsKey(p.towerWeight)) {
					count += countWeightOccurance.get(p.towerWeight);
				}
				countWeightOccurance.put(p.towerWeight, count);
			}
			
			int leastCommon=Integer.MAX_VALUE;
			int lCWeight = -1;
			int mostCommon = Integer.MIN_VALUE;
			int mCWeight = -1;
			for(int weight : countWeightOccurance.keySet()) {
				if(countWeightOccurance.get(weight)<leastCommon) {
 					leastCommon = countWeightOccurance.get(weight);
 					lCWeight = weight; 
				}
 				if(countWeightOccurance.get(weight)>mostCommon) {
 					mostCommon = countWeightOccurance.get(weight);
 					mCWeight = weight; 
				}
			}
			
			if(leastCommon==programs.size()) {
				return -1;
			}
			
			String unbalancedTowerName = "";
			for(Program p : programs) {
				if(p.towerWeight==lCWeight) {
					unbalancedTowerName = p.name;
					int topWeight = p.getUnbalancedProgramWeight();
					if(topWeight==-1) {
						return p.weight-(lCWeight-mCWeight);
					} else {
						return topWeight;
					}
				}
			}
			System.out.println(unbalancedTowerName);
			return lCWeight;
		}
		return -1;
	}
}
