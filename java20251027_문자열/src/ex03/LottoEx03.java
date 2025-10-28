package ex03;

import java.util.Arrays;

public class LottoEx03 {

	public static void main(String[] args) {
		
		/*
		 * 로또 프로그램 
		 * 배열 : 6칸, int 배열
		 * 로또는 1 ~ 45 랜덤하게 저장
		 * 중복불가
		 */
		
		//lotto 배열 6개 생성
		int[] lotto = new int[6];
		
		
		for(int i=0; i<lotto.length; i++) {
			// 랜덤 난수 생성 -> 난수를 lotto index 배열 방 안에 넣음
			int num = (int)(Math.random()*45)+1;
				lotto[i] = num;
				
				//생성한 난수와 lotto index 배열 방 안에 난수를 비교, 중복체크함
				for(int j=0; j<i; j++) {
					// 만일 중복이라면 i 값(= index 배열번호를)을 줄이고 다시 처음 for문으로 돌아감.
					if(num == lotto[j]) {
						i--;
						break;
					}
				}
			
			
		}
		System.out.println(Arrays.toString(lotto));
	}

}
