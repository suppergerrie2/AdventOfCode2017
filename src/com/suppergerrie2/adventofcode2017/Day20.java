package com.suppergerrie2.adventofcode2017;

import java.util.ArrayList;
import java.util.List;

import com.suppergerrie2.adventofcodehelper.Helper;

public class Day20 {

	public static void main(String[] args) {
		System.out.println("Day 20");
		String input = Helper.loadFile("day20");
		task1(input);
		task2(input);
	}

	static void task1(String input) {
		String[] particlesInfo = input.split("\r\n");
		Vector3D smallest = new Vector3D(999999, 999999, 999999);
		int id = -1;
		for(int i =0; i < particlesInfo.length; i++) {
			String a = particlesInfo[i].split(" ")[2];
			String[] aparts = a.split(",");
			int x = Integer.valueOf(aparts[0].substring(3));
			int y = Integer.valueOf(aparts[1]);
			int z = Integer.valueOf(aparts[2].substring(0,aparts[2].length()-1));
			Vector3D n = new Vector3D(x,y,z);
			if(n.length()<smallest.length()) {
				smallest = n;
				id=i;
			}
		}
		System.out.println(id);
	}

	static void task2(String input) {
		String[] particlesInfo = input.split("\r\n");
		List<Particle> particles = new ArrayList<Particle>();
		for(int i =0; i < particlesInfo.length; i++) {
			String[] vectors = particlesInfo[i].split(" ");
			String[] aParts = vectors[2].split(",");
			Vector3D acc = new Vector3D(Integer.valueOf(aParts[0].substring(3)),Integer.valueOf(aParts[1]),Integer.valueOf(aParts[2].substring(0,aParts[2].length()-1)));
			String[] vParts = vectors[1].split(",");
			Vector3D vel = new Vector3D(Integer.valueOf(vParts[0].substring(3)),Integer.valueOf(vParts[1]),Integer.valueOf(vParts[2].substring(0,vParts[2].length()-1)));
			String[] pParts = vectors[0].split(",");
			Vector3D pos = new Vector3D(Integer.valueOf(pParts[0].substring(3)),Integer.valueOf(pParts[1]),Integer.valueOf(pParts[2].substring(0,pParts[2].length()-1)));
			particles.add(new Particle(pos, vel, acc));
		}
		int lastCollision = -1;
		int time = 0;
		List<Particle> toRemove = new ArrayList<Particle>();
		while(time-lastCollision<1000) {
			time++;
			for(Particle p : toRemove) {
				particles.remove(p);
			}
			toRemove.clear();
			for(Particle p : particles) {
				p.update();
			}
			for(Particle p : particles) {
				for(Particle p2 : particles) {
					if(p==p2||toRemove.contains(p2)) {
						continue;
					}
					if(p.checkCollisions(p2)) {
						toRemove.add(p2);
						toRemove.add(p);
						lastCollision = time;
					}
				}
			}
		}
		
		System.out.println(particles.size());
	}
}

class Particle{
	Vector3D pos;
	Vector3D vel;
	Vector3D acc;


	public Particle(Vector3D p, Vector3D vel, Vector3D acc) {
		this.pos = p;
		this.vel = vel;
		this.acc = acc;
	}

	public void update() {
		this.vel.add(this.acc);
		this.pos.add(this.vel);
	}

	public boolean checkCollisions(Particle other) {
		return pos.equals(other.pos);
	}

	@Override
	public String toString() {
		return "pos:" + this.pos.toString() + "acc:" + this.acc.toString() + "vel:" + this.vel.toString();
	}
	
	
}

class Vector3D {
	int x;
	int y;
	int z;
	double length;

	public Vector3D(int x, int y, int z) {
		this.x =x ;
		this.y = y;
		this.z = z;
		length = Math.sqrt(x*x+y*y+z*z);
	}

	public void add(Vector3D other) {
		this.x+=other.x;
		this.y+=other.y;
		this.z+=other.z;
		length = Math.sqrt(x*x+y*y+z*z);
	}

	public double length() {
		return length;
	}
	
	@Override
	public boolean equals(Object obj) {
		Vector3D other = (Vector3D) obj;
		return (other.x==this.x)&&(other.y==this.y)&&(other.z==this.z);
	}

	@Override
	public String toString() {
		return "<" + x + "," + y + "," + z + ">";
	}

}