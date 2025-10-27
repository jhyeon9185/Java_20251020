package ex01;

import java.util.Scanner;

public class if조건문02 {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		//int number = sc.nextInt();
		
		int number= 20;
		String str1 = "성인";
		
		if(number<20){
			str1 = "미성년자";
		}
		System.out.println(str1 + "입니다.");
	}

}
