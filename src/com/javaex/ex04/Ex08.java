package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		int i, j;
		
		for(i=0; i<6; i++) {
			for(j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		/* 수업에서 짠거
		int xline, yline;
		
		for(yline=1; yline<=6; yline++) {
			for(xline=1; xline<=yline; xline++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
	}

}
