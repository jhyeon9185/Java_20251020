package ex04;

import java.util.Arrays;

/*
 *  1. 배열 10개 방에 랜덤하게 1~100사이 값 저장
 *  2. 배열에서 최대 값, 최소 값을 출력
 *  3. 10개의 총합 / 평균 구하기
 *  4. 10개의 값 정렬
 */

public class 연습문제02 {

	public static void main(String[] args) {
		
		int[] iArr = new int[10];
		
		for(int i=0; i<iArr.length; i++) {
			// 1번 100개의 난수 생성
			iArr[i] = (int)(Math.random()*100)+1;
		}//end for
		System.out.println(Arrays.toString(iArr));
		
		// 2번 최대, 최소 값 구하기
		int max, min;
		max = min = iArr[0];
		
		for(int i=0; i<iArr.length; i++) {
			
			if(max < iArr[i]) 
				max = iArr[i];
				
			if(min > iArr[i])
				min = iArr[i];
			}// end for
		
			System.out.println("max = " + max);
			System.out.println("min = " + min);
			
			
		// 3. 총합, 평균 구하기
			int sum = 0;
			double avg = 0;
			
			for(int i=0; i<10; i++)
				sum += iArr[i];
			
				avg = (double)sum/iArr.length;
				
			System.out.println("총합 : " + sum);
			System.out.println("평균 : " + avg);
			
			
		// 4. 정렬
			for(int i=0; i<iArr.length; i++) {
				
				for(int j=0; j<iArr.length -i -1; j++) 
					
					if(iArr[j]>iArr[j+1]) {
						
						int tem = iArr[j];
						iArr[j] = iArr[j+1];
						iArr[j+1] = tem;
						
					}//end if
			}//end for 
			
			System.out.println("정렬 : " + Arrays.toString(iArr));
			
		}// main
		
	}// class
