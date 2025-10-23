package ex01;

import java.util.Scanner;

public class if조건문06 {

	public static void main(String[] args) {
		
		/*
		 * 버스 요금 계산표
		 * 요금 : 2000
		 * 65세 이상 : 무료
		 * 20 ~ 64 : 할인 0%
		 * 15 ~ 19 : 할인 20%
		 * 7 ~ 14  : 할인 50%
		 * 6세 미만  : 무료
		 */
		
		int age = 7;
		int price = 2000;
		double rate = 0;
		
		if(age >=65 | age<7){
			price = 0;
			
		}else if(age>=20 & age<65){
			rate = 0;
			
		}else if(age>=15 & age<20){
			rate = 0.2;
			
		}else{
			rate = 0.5;
		}
		
		if (price != 0) {
			price = (int)(price *(1 - rate));
		}
		
		System.out.println("나이 " + age + "세는 " + price + "요금 입니다.");
	}
}

