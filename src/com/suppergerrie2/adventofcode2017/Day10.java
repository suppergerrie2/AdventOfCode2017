package com.suppergerrie2.adventofcode2017;

import java.util.ArrayList;
import java.util.List;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day10 {

	static int[] list;
	static String input;

	public static void main(String[] args) {
		System.out.println("Day 10");
		input = Helper.loadFile("day10");

		System.out.println(task1(input));
		System.out.println(task2(input));
	}

	static void resetList() {
		int l = 256;
		list = new int[l];
		for(int i = 0; i < l; i++) {
			list[i] = i;
		}
	}
	
	static int task1(String in) {
		resetList();
		int result = 0;

		String[] sLengths = in.split(",");
		int[] lengths = new int[sLengths.length];
		for(int i = 0; i < sLengths.length; i++) {
			lengths[i]=Integer.valueOf(sLengths[i]);
		}

		int skipSize = 0;
		int currentIndex = 0;
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
			if(currentIndex>list.length) {
				currentIndex-=list.length;
			}
			skipSize++;
		}

		result = list[0]*list[1];

		return result;
	}

	static String task2(String in) {
		resetList();
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
