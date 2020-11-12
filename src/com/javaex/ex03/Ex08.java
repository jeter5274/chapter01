package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		int sub_code;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바  2. C  3. C++  4. 파이썬)");
		sub_code = sc.nextInt();
		
		if(sub_code == 1) {
			System.out.println("R101호");
		}else if(sub_code == 2) {
			System.out.println("R202호");
		}else if(sub_code == 3) {
			System.out.println("R303호");
		}else if(sub_code == 4) {
			System.out.println("R404호");
		}else {
			System.out.println("상담원에게 문의하세요");
		}
		
		sc.close();
	}

}
