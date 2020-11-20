package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		//로또번호 자동생성기 배열사용
		int[] lottoNums = new int[6];
		
		for(int i=0; i<lottoNums.length; i++) {
			
			lottoNums[i] = (int)(Math.random()*45+1);
		}
		
		for(int i=0; i<lottoNums.length; i++) {
			
			System.out.println(lottoNums[i]);
			
		}
	}

}
