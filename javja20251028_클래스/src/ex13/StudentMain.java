package ex13;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		System.out.println("이름 : " + s.getName());
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
		
		System.out.printf("평균2 : %.2f\n ", s.getAverage2());
		
		float num = 100.26f;
		System.out.printf("점수 : %.2f\n", num);
		System.out.printf("점수 : %d\n", 100);
		
		System.out.println(s.info());
	}

}
