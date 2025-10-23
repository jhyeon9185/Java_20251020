package ex01;

import java.util.Scanner;

public class if조건문04 {

	public static void main(String[] args) {
		
		/*
		 * number >= 90 ~ A
		 *  	  >= 80 ~ B
		 *  	  <  80	~ C
		 */
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if(number >= 90) {
			System.out.println("A학점");
		}else if(number >= 80){
			System.out.println("B학점");
		}else if(number >= 70){
			System.out.println("C학점");
		}else if(number > 60){
			System.out.println("D학점");
		}else{
			System.out.println("F학점");
		}
		
		System.out.println("=====프로그램 종료======");
	}

}
