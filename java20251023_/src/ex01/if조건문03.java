package ex01;

import java.util.Scanner;

public class if조건문03 {

	public static void main(String[] args) {
		
		/*
		 * number >= 90 ~ A
		 *  	  >= 80 ~ B
		 *  	  < 80 	~ C
		 */
		
		//Scanner sc = new Scanner(System.in);
		
		//int number = sc.nextInt();
		
		int number= 50;
		char cha1 = 'F';
		
		if(number >= 90) {
			//System.out.println("A학점");
			cha1 = 'A';
		}else if(number >= 80) {
			cha1 = 'B';
		}else if(number >= 70){
			//System.out.println("C학점");
			cha1 = 'C';
		}else if(number>=50 | number>=60){
			cha1 = 'D';
		}
		
		System.out.println(cha1 + "학점");
		//System.out.println("===프로그램 종료======");
	}

}
