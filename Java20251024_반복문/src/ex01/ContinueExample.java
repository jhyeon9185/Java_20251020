package ex01;

/*
 * 1 ~ 10 홀수 합 구하기
 * continue 사용  
 */

public class ContinueExample {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			/*
			if (i % 2 == 1)
				sum += 1;
			*/
			
			if(i % 2 == 0)
				continue;
			sum += 1;
		}
		System.out.println(sum);
	}

}
