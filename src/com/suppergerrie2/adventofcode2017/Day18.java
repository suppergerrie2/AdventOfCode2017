package com.suppergerrie2.adventofcode2017;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day18 {

	static String input;
	
	public static void main(String[] args) {
		System.out.println("Day 18");
		input=Helper.loadFile("day18");
		task1(input);
		task2(input);
	}
	
	static void task1(String in) {
		String[] commands = in.split("\r\n");
		
		Map<String, Long> registers = new HashMap<String, Long>();
		
		long lastFrequency = 0;
		for(int i = 0; i < commands.length; i++) {
			String[] commandParts = commands[i].split(" ");
			switch(commandParts[0]) {
				case "snd":
					lastFrequency = getValue(commandParts[1], registers);
					break;
				case "set":
					registers.put(commandParts[1], getValue(commandParts[2], registers));
					break;
				case "add":
					if(!registers.containsKey(commandParts[1])) {
						registers.put(commandParts[1], 0L);
					}
					
					registers.put(commandParts[1], registers.get(commandParts[1])+getValue(commandParts[2], registers));
					
					break;
				case "mul":
					if(!registers.containsKey(commandParts[1])) {
						registers.put(commandParts[1], 0L);
					}
					
					registers.put(commandParts[1], registers.get(commandParts[1])*getValue(commandParts[2], registers));
					
					break;
				case "mod":
					if(!registers.containsKey(commandParts[1])) {
						registers.put(commandParts[1], 0L);
					}
					
					registers.put(commandParts[1], registers.get(commandParts[1])%getValue(commandParts[2], registers));
					
					break;
				case "rcv":
					if(getValue(commandParts[1], registers)!=0) {
						System.out.println(lastFrequency);
						return;
					}
					break;
				case "jgz":
					if(getValue(commandParts[1], registers)>0) {
						i--;
						i+=getValue(commandParts[2], registers);
					}
					break;
			}
			if(i<0||i>commands.length-1) {
				break;
			}
		}
	}
	
	static void task2(String in) {
		Program18 p0 = new Program18(0,in.split("\r\n"));
		Program18 p1 = new Program18(1,in.split("\r\n"));
		
		while(p0.runCommand(p1)||p1.runCommand(p0)) {
			
		}
		System.out.println(p0.send + " p1: " + p1.send);
	}
	
	public static long getValue(String s, Map<String, Long> registers) {
		if(isNumeric(s)) {
			return Long.valueOf(s);
		} else {
			if(!registers.containsKey(s)) {
				registers.put(s, 0L);
			}
			return registers.get(s);
		}
	}
	
	public static boolean isNumeric(String str)
	{
	  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
	
}

class Program18 {
	
	int id;
	Map<String, Long> registers = new HashMap<String, Long>();
	String[] instructions;
	int cycle = 0;
	
	Queue<Long> messages = new LinkedList<Long>();
	
	public Program18(int i, String[] instructions) {
		id = i;
		this.instructions = instructions;
		registers.put("p", (long)i);
	}
	
	public void receiveValue(long v) {
		messages.add(v);
	}
	
	public int send = 0;
	public boolean runCommand(Program18 p) {
		String[] commandParts = instructions[cycle].split(" ");
		switch(commandParts[0]) {
			case "snd":
				p.receiveValue(Day18.getValue(commandParts[1], registers));
				send++;
				break;
			case "set":
				registers.put(commandParts[1], Day18.getValue(commandParts[2], registers));
				break;
			case "add":
				if(!registers.containsKey(commandParts[1])) {
					registers.put(commandParts[1], 0L);
				}
				
				registers.put(commandParts[1], registers.get(commandParts[1])+Day18.getValue(commandParts[2], registers));
				
				break;
			case "mul":
				if(!registers.containsKey(commandParts[1])) {
					registers.put(commandParts[1], 0L);
				}
				
				registers.put(commandParts[1], registers.get(commandParts[1])*Day18.getValue(commandParts[2], registers));
				
				break;
			case "mod":
				if(!registers.containsKey(commandParts[1])) {
					registers.put(commandParts[1], 0L);
				}
				
				registers.put(commandParts[1], registers.get(commandParts[1])%Day18.getValue(commandParts[2], registers));
				
				break;
			case "rcv":
				if(messages.size()>0) {
					registers.put(commandParts[1], messages.poll());
				} else {
					return false;
				}
				break;
			case "jgz":
				if(Day18.getValue(commandParts[1], registers)>0) {
					cycle--;
					cycle+=Day18.getValue(commandParts[2], registers);
				}
				break;
		}
		cycle++;
		if(cycle<0||cycle>instructions.length-1) {
			return false;
		}
		return true;
	}
	
}
