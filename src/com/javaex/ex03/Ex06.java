package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		
		int point;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		point = sc.nextInt();
		
		if(point>=90) {
			grade = 'A';
		}else if(point>=80) {
			grade = 'B';
		}else if(point>=70) {
			grade = 'C';
		}else if(point>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		/*
		if(point>=90) {
			grade = 'A';
		}else if(90>point && point>=80) {
			grade = 'B';
		}else if(80>point && point>=70) {
			grade = 'C';
		}else if(70>point && point>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		*/
		System.out.println(grade+ "등급");
		
		sc.close();
	}
}
