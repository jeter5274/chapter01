package com.javaex.ex01;

public class Ex01 {
	
	public static void main(String[] args) {
		
		//변수 선언 실습
		int myAge;
		myAge = 25;
		System.out.println(myAge);
		
		myAge = 26;
		System.out.println(myAge);
		
		
		//정수형 실습
		//자료형(int를 정확하게 써야한다)
		int var01 = 3;
		double var02 = -3.4;
		
		//메모리 크기 확인
//		byte var04 = 12345678; //범위를 벗어남 -128~172
//		short var05 = 12345678; //범위를 벗어남 -32768~32767
		int var03 = 12345678;
		long var06 = 12345678;
		
		//long형
		int var07 = 2147483647;
//		int var07_1 = 2147483648; //int의 범위를 넘음
//		long var08 = 2147483648; //long 변수형인데도 안됨
		long var08_1 = 2147483648l; //L기호를 붙여야함(대소 무관)
		long var09 = 2147483647; //int범위의 수를 넣을 떄는 l을 붙이지 않아도 됨
		
		
	}
	
}
