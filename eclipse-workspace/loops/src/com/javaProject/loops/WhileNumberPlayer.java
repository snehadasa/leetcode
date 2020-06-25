package com.javaProject.loops;

public class WhileNumberPlayer {
	
	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquaresUptoLimit() {
		int i = 1;
		while(i*i<limit) {
			System.out.println(i*i);
			i++;
		}
	}

	public void printCubesUptoLimit() {
		int i = 1;
		while(i*i*i < limit) {
			System.out.println(i * i * i);
			i++;
		}
	}

}
