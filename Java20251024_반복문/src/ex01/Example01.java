package ex01;

import java.util.Scanner;

/*
 * 1 ~ 10 홀수 합 구하기
 * continue 사용  
 */

public class Example01 {

	public static void main(String[] args) {
		int money = 0;
		int number = 0;
		
		while(true) {
		System.out.println("1.예금 2.출금 3.잔고 4.종료");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("선택 : ");
		
		number =  Integer.parseInt(sc.nextLine());
		
		switch(number) {
		case 1 : 
			System.out.println("예금액 : ");
			money += Integer.parseInt(sc.nextLine());
			break;
			
		case 2 : 
			System.out.println("출금액 : ");
			money -=  Integer.parseInt(sc.nextLine());
			break;
			
		case 3 :
			System.out.println("잔고 : " );
			System.out.println(money);
			break;
			
		case 4 :
			System.out.println("종료");
			break;
			
		default :
			System.out.println("1 ~ 4 정수 입력");
		}
		
		}
	}

}
