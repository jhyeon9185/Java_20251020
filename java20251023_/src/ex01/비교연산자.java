package ex01;

import java.util.Scanner;

public class 비교연산자 {

	public static void main(String[] args) {
		
		int numA = 5;
		int numB = 10;
		
		System.out.println(numA == numB);
		System.out.println(numA != numB);
		System.out.println(numA > numB);
		System.out.println(numA < numB);
		System.out.println(numA <= numB);
		System.out.println(numA >= numB);
		
		System.out.println("---------------");
		String s1 = new String("korea");
		String s2 = new String("korea");
		
		System.out.println(s1.equals(s2));
		// equals -> 값 비교 메소드
		
		System.out.println("========논리 연산========");
		numA = 5;
		numB = 10;
		int numC = 13;
		int numD = 9;
		
		System.out.println(numA < numB);
		System.out.println(numC < numD);

		System.out.println("----AND 연산------");
		System.out.println((numA < numB) && (numC < numD));
		
		System.out.println("----OR 연산-------");
		System.out.println((numA < numB) || (numC < numD));
		
		System.out.println("------NOT 연산-----");
		System.out.println(!(6 > 4));
		
		System.out.println("------XOR 연산-----");
		System.out.println(15 ^ 12);
		
		System.out.println("------삼항 연산자(조건 연산자)-----");
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("나이 입력 : ");	
		int age = sc.nextInt();
		
		String state = (age >= 20) ? "성인" : "미성년";
		System.out.println("당신은 " + state);
		*/
		
		/*
		 * 정수 입력 > 2로 나누어서 나머지가 0이면 짝수, 홀수

		System.out.println("정수 입력 : ");
		int result = sc.nextInt();
		
		String total = ( result % 2 == 0 ) ? "짝수" : "홀수";
		
		System.out.println(result + "는 " + total);
		*/
		
		/*
		 * 정수 입력 : 3으로 나누어서 나머지 0,1,2 판별
		 */
		int number = sc.nextInt();
		//int state = (number % 3 == 0) ? 0 : 1;
		int state = (number % 3 == 0) ? 0 : (number % 3 == 1)? 1 : 2;
		System.out.println(number + "을(를) 3으로 나눈 나머지는 " + state + "입니다.");
		
		
	}

}
