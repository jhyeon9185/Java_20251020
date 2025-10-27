package ex02;

/*
 * 정수 배열 5개 생성
 * 각 배열 초기화 이후, 각 배열의 합을 구해서 출력
 */

public class ArrayEx02 {

	public static void main(String[] args) {
		
		int[] numArr = {90, 80, 70, 60, 50}; // 간단히
		int sum = 0;
		
		// i 값은 인덱스 넘버
		for(int i=0; i<5; i++) {
			sum += numArr[i];
			
			/*
			 * sum = sum + numArr[0]; 
			 * sum = sum + numArr[1]; 
			 * sum = sum + numArr[2]; 
			 * sum = sum + numArr[3]; 
			 * sum = sum + numArr[4]; 
			 */
			
			System.out.println("총합 : " + sum);
			
		}
		
	}

}
