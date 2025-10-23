package ex01;

/*
 * 	++A : 선위 연산자
 *  A++ : 후위 연산자
 *  --A : 감소
 *  A-- 
 */

public class 증감연산자 {
	public static void main(String[] args) {
		
		int iNum = 10;
		System.out.println(iNum);
		
		System.out.println("iNum 1증가 - 1번");
		iNum = iNum+ 1;
		System.out.println(iNum);
		
		System.out.println("iNum 1증가 - 2번");
		iNum += 1;
		System.out.println(iNum);
		
		System.out.println("iNum 1증가 - 3번");
		++iNum;
		System.out.println(iNum);
		
		System.out.println("iNum 1증가 - 4번");
		iNum++;
		System.out.println(iNum);
		
		System.out.println("선위 연산자 1증가 - 5번");
		int iNum2 = 1;
		int ia = ++iNum2;
		/*
		 * iNum2 += 1;
		 * ia = iNum2;
		 * 
		 * 가지고 있는 값을 먼저 더함
		 */
		System.out.println(ia);
		System.out.println(iNum2);
		
		System.out.println("후위 연산자 1증가 - 5번");
		iNum2 = 1;
		int iB = iNum2++;
		/*
		 * int iB = iNum2;
		 * iNum2 += 1;
		 * 
		 * 가지고 있는 값을 먼저 대입하고 더함
		 */
		System.out.println(iB);
		System.out.println(iNum2);
	}
}
