package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		String name;
		int age;
		double tall;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.println("키를 입력해주세요");
		System.out.print("키 : ");
		tall = sc.nextDouble();
		
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+" 키는 "+tall+" 입니다.");
	}

}
