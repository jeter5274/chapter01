package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		double v01 = 5/4;
		System.out.println(v01);	//정수의 나눗셈 결과 확인  예측치 1.0
		
		double v02 = (double)5 / 4 ;  
		System.out.println(v02); 	//실수를 정수로 나눈 결과 예측치 1.25
		
		double v03 = 5 / (double)4 ;
		System.out.println(v03); 	//정수를 실수로 나눈 결과 예측치 1.25
		
		double v04 = (double)5 / (double)4 ;  
		System.out.println(v04); 	//실수끼리의 나눗셈 결과 예측치 1.25
		
		int v05 = (int)1.3 + (int)1.8 ;  
		System.out.println(v05);    //실수의 정수변환 덧셈결과 예측치 3
		
		int v06 = (int)(1.3+1.8); //3.1을 정수변환
		System.out.println(v06);
		
		//형변환이 일어난 뒤 연산을 실시함

	}

}
