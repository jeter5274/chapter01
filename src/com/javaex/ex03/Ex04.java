package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int pay, work_time, unit; //급여, 시간, 시간당급여 -> 왜 위에다가 썻는지 고민해보시오 : 작성한 프로그램의 양이 많아졌을 때, 중간중간 변수를 선언하면 나중에 어떤 변수가 있는지 확인이 어려워, 변수를 상단에 모아둠
		unit = 10000;
						
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간 : ");
		work_time = sc.nextInt();
		
		if (work_time > 8) {
			//pay = 8*10000 + ((work_time - 8) * 12000);
			pay = 8*unit + ((work_time - 8) * (int)(unit*1.5));
		}else{
			pay = work_time*unit;
		}
			
		System.out.println("임금은 "+pay+"원 입니다.");
		sc.close();
	}

}
