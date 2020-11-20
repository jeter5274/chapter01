package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		//일반적인 인스턴트 배열의 선언과 생성, 초기화
		 
		int[] intArray = new int[3];
		
		intArray[0]=3;
		intArray[1]=6;
		intArray[2]=9;
		*/
		
		/*
		//배열의 선언 및 생성과 동시에 초기화
		int[] intArray = new int[] {3, 6, 9};
		*/
		
		//배열의 선언 및 생성과 동시에 초기화 축약
		int[] intArray = {3, 6, 9};
		
		//intArray.length -> 3
		
		for(int i=0; i<3; i++) {
			System.out.println(intArray[i]);
		}

	}

}
