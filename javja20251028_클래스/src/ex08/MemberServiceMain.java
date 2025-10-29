package ex08;

public class MemberServiceMain {

	public static void main(String[] args) {

		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong123", "1234");
		
		if(result) {
			memberService.login2("hong123");
			memberService.logout("hong123");
			
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
			
		}// end if
		
	}// main

}// class
