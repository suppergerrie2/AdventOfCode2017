package com.suppergerrie2.adventofcode2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day12 {
	
	static String input;
	static Map<Integer, Program1> programs = new HashMap<Integer, Program1>();
	
	public static void main(String[] args) {
		System.out.println("Day 12");
		input = Helper.loadFile("day12");
		System.out.println(task1(input));
	}
	
	static int task1(String in) {
		int programsCount = 0;
		
		String[] responses = in.split("\r\n");
		
		for(String response : responses) {
			String[] responseParts = response.split(" ");
			
			int id = Integer.valueOf(responseParts[0]);
			if(!programs.containsKey(id)) {
				programs.put(id, new Program1(id));
			}
			
			Program1 program = programs.get(id);
			
			for(int i = 2; i < responseParts.length; i++) {
				int cID = Integer.valueOf(responseParts[i].split(",")[0]);
				if(!programs.containsKey(cID)) {
					programs.put(cID, new Program1(cID));
				}
				program.addConnected(programs.get(cID));
			}
		}
		
		programsCount = programs.get(0).getCount();
		
		int groups=1;
		for(Program1 p : programs.values()) {
			if(p.getCount()>0) {
				groups++;
			}
		}
		System.out.println(groups);
		return programsCount;
	}
	
}

class Program1 {
	int id;
	List<Program1> connected = new ArrayList<Program1>();
	
	static List<Program1> test = new ArrayList<Program1>();
	
	public Program1(int id) {
		this.id = id;
	}
	
	public void addConnected(Program1 p) {
//		System.out.println(p.id + " " + id);
		if(id==p.id) {
			return;
		}
//		if(id<p.id) {
			if(!connected.contains(p)) {
				connected.add(p);
			}
//		} else {
//			p.addConnected(this);
//		}
	}
	
	boolean checked = false;
	
	public int getCount() {
//		if(!test.contains(this)) {
//			test.add(this);
//		}
//		for(Program1 p : connected) {
//			p.getCount();
//		}
//		return test.size();
		if(!checked) {
			checked=true;
			if(connected.size()==0) {
				return 1;
			} else {
				int count = 0;
				for(Program1 p : connected) {
					count+=p.getCount();
				}
				return count+1;
			}
		}
		return 0;
	}
}