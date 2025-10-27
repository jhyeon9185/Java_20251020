package ex01;

public class CharAtEx01 {

	public static void main(String[] args) {

		String subject = "자바 프로그래밍";
		
		//원하는 위치 문자열 출력 index 번호 charAt(N);
		char ch = subject.charAt(3);
		
		System.out.println(subject);
		
		//문자열 갯수 세기 .length
		int len = subject.length();
		System.out.println("문자열 길이 " + len);
		
		System.out.println("--------문자열 대체(변경)-------");
		System.out.println("before : " + subject);
		
		// 문장 변경 .replace
		subject = subject.replace("자바", "파이썬");
		System.out.println("after : " + subject);
		
		System.out.println("--------문자열 잘라내기-------");
		String sub2 = subject.substring(4);	//index 4번째부터 전부 출력
		System.out.println(sub2);
		
		String sub3 = subject.substring(4,6); //index 4번째부터 6전까지 추출 ex) 4, 5추출
		System.out.println(sub3);
		
		System.out.println("--------문자열 찾기-------");
		//'프로'라는 단어는 몇번재 index 있는지? .indexof("찾고싶은 문자열");
		int index = subject.indexOf("프로");
		System.out.println("문자열 찾기 : " + index);
		
		// 찾을 수 없는 문자열이라면 '-1'값을 출력함
		index = subject.indexOf("프로그램");
		System.out.println("문자열 찾기 : " + index);
		
		
		System.out.println("--------문자열 분리-------");
		//문자열을 공간 기준으로 분리 [](배열 공간할당), split("분리할 문자열");
		String[] sub4 = subject.split(" ");
		System.out.println(sub4[0]);
		System.out.println(sub4[1]);
		
		System.out.println("--------문자열 합치기-------");
		String s = "대한";
		String  s2 = "민국";
		// 가지고 있는 값에 문자열을 더함 .concat(합치고자 하는 문자열, 변수);
		String  s3 = s.concat(s2);
		System.out.println(s3);
		
		
	}

}
