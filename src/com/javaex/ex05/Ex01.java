package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		
		/* 
		//로또번호 자동생성기 배열없이(내가 짠거)
		for(int i=0; i<6; i++) {
			
		int num = (int)(Math.random()*45+1);
		
		System.out.print(num+ "\t");
		
		}
		System.out.println("");
		*/
		
		//로또번호 자동생성기 배열없이(수업)
		int n01, n02, n03, n04, n05, n06;
		
		n01 = (int)(Math.random()*45+1);
		n02 = (int)(Math.random()*45+1);
		n03 = (int)(Math.random()*45+1);
		n04 = (int)(Math.random()*45+1);
		n05 = (int)(Math.random()*45+1);
		n06 = (int)(Math.random()*45+1);
		
		System.out.print(n01+ "\t");
		System.out.print(n02+ "\t");
		System.out.print(n03+ "\t");
		System.out.print(n04+ "\t");
		System.out.print(n05+ "\t");
		System.out.println(n06);
				
	}

}
