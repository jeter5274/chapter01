package com.javaex.ex04;

public class Ex12 {

	public static void main(String[] args) {
		
		for(int i=1; i<=20; i++) {
			/*
			if(i%2==0 || i%3==0) {
				continue;
			}
			System.out.println(i);
			*/
			/*
			//다른표현1
			if(i%2==0 || i%3==0) {
				//요 공간이 비어있어서 어색함
			}else {
				System.out.println(i);
			}
			*/
			
			//다른표현2
			
			if(!(i%2==0 || i%3==0)) {
				System.out.println(i);
			}
			
		}

	}

}
