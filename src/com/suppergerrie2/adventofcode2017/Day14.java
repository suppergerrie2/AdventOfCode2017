package com.suppergerrie2.adventofcode2017;

import java.awt.Point;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Day14 {

	static String input = "hxtvlmkl";
	
	public static void main(String[] args){
		System.out.println("Day 14");
		task1(input);
		task2(input);
	}
	
	static void task1(String in){
		int occupied = 0;
		String[] binary = generateDisk(in);
		for(int i = 0; i < binary.length; i++){
			String _bin = binary[i];
			for(int j = 0; j < _bin.length(); j++){
				if(_bin.charAt(j)=="1".charAt(0)){
					occupied++;
				}
			}
			
		}
		System.out.println(occupied);
	}
	
	static int[][] groups = new int[128][128];
	static int[][] binary = new int[128][128];
	static void task2(String in){
		generateDisk(in);
		int group = 1;
		for(int y = 0; y < binary.length; y++){
			for(int x = 0; x < binary[y].length; x++){
				if(binary[y][x]==1){
					if(floodFill(x,y,binary,group)){
						group++;
					}
				}
			}
		}
		group--;
		System.out.println(group);
	}
	
	static boolean floodFill(int x, int y, int[][] binary2, int group) {
		if(x<0||x>binary2[0].length-1||y<0||y>binary2.length-1){
			return false;
		}
		
	    if (binary2[y].length!=1&&groups[x][y]!=0) return false;
	    Queue<Point> toCheck = new LinkedList<Point>();
	    toCheck.add(new Point(x,y));
//	    System.out.println(group);
	    
	    while(toCheck.size()>0){
	    	Point p = toCheck.poll();
		    groups[p.x][p.y] = group;
		    
		    for(int i = -1; i <= 1; i++){
		    	for(int j = -1; j <= 1; j++){
		    		if(Math.abs(j)==Math.abs(i)||p.x+i<0||p.x+i>groups.length-1||p.y+j<0||p.y+j>groups.length-1){
		    			continue;
		    		}
		    		if(binary2[p.y+j][p.x+i]==1&&groups[p.x+i][p.y+j]==0){
		    			toCheck.add(new Point(p.x+i,p.y+j));
		    		}
		    	}
		    }
	    }

	    return true;

	}
	
	static String[] generateDisk(String in){
		String[] hashes = new String[128];
		for(int i = 0; i < hashes.length; i++){
			hashes[i] = generateKnotHash(in+"-"+i);
		}
		
		String[] binaryS = new String[hashes.length];
		for(int i = 0; i < binaryS.length; i++){
			String _bin = new BigInteger(hashes[i], 16).toString(2);
			while(_bin.length()!=128){
				_bin="0" + _bin;
			}
			binaryS[i] = _bin;
			for(int j = 0; j < _bin.length(); j++){
				binary[i][j]=Integer.valueOf(_bin.substring(j,j+1));
			}
		}
		
		return binaryS;
	}
	
	static String generateKnotHash(String in){
		int l = 256;
		int[] list = new int[l];
		for(int i = 0; i < l; i++) {
			list[i] = i;
		}
		String result = "";

		int[] lengths = getLengths(in);

		int skipSize = 0;
		int currentIndex = 0;
		for(int round = 0; round < 64; round++) {
			for(int length : lengths) {
				if(length>list.length) {
					continue;
				}

				int[] toReverse = new int[length];
				for(int i = 0; i < length; i++) {
					int index = i+currentIndex;
					if(index>=list.length) {
						index-=list.length;
					}

					toReverse[i] = list[index];
				}

				for (int i = 0; i < toReverse.length / 2; i++) {
					int temp = toReverse[i];
					toReverse[i] = toReverse[toReverse.length - 1 - i];
					toReverse[toReverse.length - 1 - i] = temp;
				}

				for(int i = 0; i < toReverse.length; i++) {
					int index = currentIndex+i;
					if(index>=list.length) {
						index-=list.length;
					}

					list[index]=toReverse[i];
				}

				currentIndex+=length+skipSize;
				while(currentIndex>list.length) {
					currentIndex-=list.length;
				}
				skipSize++;
			}
		}
				
		int[] xorArray = new int[16];
		for(int i = 0; i < 16; i++) {
			int temp = list[i*16];
			for(int j = 1; j < 16; j++) {
				temp^=list[j+i*16];
			}
			xorArray[i] = temp;
		}
		
		for(int xor : xorArray) {
			String hex = Integer.toHexString(xor);
			while(hex.length()!=2) {
				hex = "0"+hex;
			}
			result+=hex;
		}
		
		return result;
	}
	
	
	static int[] getLengths(String in) {
		int[] suffix = {17, 31, 73, 47, 23};
		List<Integer> lengthsL = new ArrayList<Integer>();
		
		for(int i = 0; i < in.length(); i++) {
			lengthsL.add((int)in.charAt(i));
		}
		
		for(int i = 0; i < suffix.length; i++) {
			lengthsL.add(suffix[i]);
		}
		
		int[] lengths = new int[lengthsL.size()];
		for(int i = 0; i < lengthsL.size(); i++) {
			lengths[i] = lengthsL.get(i);
		}
		
		return lengths;
	}

	
}
