package kh.oop1.day03.exam;

public class FieldExam {
	// [접근제한자][예약어]자료형 변수명 [=초기값];
	// 클래스 변수(모든 객체가 공통적으로 속성을 가질떄
	// 사용을하고 생성할때 메모리영역에 같이 생성이 되기 떄문에
	// 꼭 필요한 공통적인 속성을 가진 변수에 사용을 해야합니다.)
	public static int var1() {
		int var1 = 10;
		return var1;
		
	}
	 
	
	//멤버변수(인스턴스변수)
	//각각의 객체(인스턴스)마다 개별적인 속성을 가져야할때
	//멤버변수(인스턴스 변수)를 사용하게 됩니다.
	public int var2;
	private int var3; //캡슐화 원칙으로 private 사용
	int var4; // 접근제한자 생략시 default 접근제한자
	
	// 생성자
	public FieldExam() {
		String var5 = "생성자 지역변수"; // 지역변수
		System.out.println(var5);
	}
	
	//초기화블럭
	{
		String var6 = "초기화블럭 지역변수"; //지역변수
		System.out.println(var6);
	}
	
	// 메소드
	public String method() {
		String var7 ="메소드 안의 지역변수"; //지역변수
		return var7;
	}
	
	public static String method1() {
		String var8 = "static 안의 지역변수"; //지역번수
		return var8;
	}
}
