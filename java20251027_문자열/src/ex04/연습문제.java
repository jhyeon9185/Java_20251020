package ex04;

import java.util.Scanner;
import java.util.Arrays;


/*
 *  1. 배열 10개 방에 랜덤하게 1~100사이 값 저장
 *  2. 배열에서 최대 값, 최소 값을 출력
 *  3. 10개의 총합 / 평균 구하기
 *  4. 10개의 값 정렬
 */

public class 연습문제 {

	public static void main(String[] args) {
		
		int[] arry = new int[10];
		int a = 10;
		
		for(int i=0; i<arry.length; i++) {
			arry[i] = (int)(Math.random()*50)+1;
		}//end for
		
		
		for(int i=0; i<arry.length; i++){
			
			for(int j=0; j<arry.length-1 -i; j++) 
				if(arry[j] > arry[j+1]) {
					int temp = arry[j];
					arry[j] = arry[j+1];
					arry[j+1] = temp;
					
				}//end if
		}//end for
		System.out.println(Arrays.toString(arry));
		
		}// main
		
	}// class
