package ex01;

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
	}

}
