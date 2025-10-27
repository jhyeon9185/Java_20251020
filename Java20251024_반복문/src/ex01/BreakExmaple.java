package ex01;

public class BreakExmaple {

	public static void main(String[] args) {
		
		while(true) {
			
			int num = (int)(Math.random()*6)+ 1; // 1~6사이의 정수
			System.out.println(num);
			
			if(num == 6) 
				break;
			
		}
		System.out.println("프로그램 종료");
	}

}
