package ex08;

public class MemberService {
	
	private String id;
	private String password;
	
	public boolean login(String id, String password) {
		
		if(id.equals("hong123") && password.equals("1234")) {
			return true;
			
		}else {
			return false;
		}//if
		
	}// loginClass
	
	public void logout(String id) {
		
		System.out.println(id + "님이 로그아웃 되었습니다.");
		
	}// logoutClass
	
	public void login2(String id) {
		System.out.println(id + "님이 로그인 했습니다.");
	}
	
	
}// end
