package com.javaex.ex04;

public class Ex06 {

	public static void main(String[] args) {
		
		int i, j;
		
		for(i=2; i<=9; i++) {
			System.out.println("[" +i+ "단]");
			for(j=1; j<=9; j++) {
				System.out.println(i+ " * " +j+ " = " + (i*j));
			}
			System.out.println(" ");
		}

	}

}
