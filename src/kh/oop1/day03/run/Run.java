package kh.oop1.day03.run;

import kh.oop1.day03.exam.BasicVariable;
import kh.oop1.day03.exam.BlockExam;
import kh.oop1.day03.exam.FieldExam;

public class Run {

	public static void main(String[] args) {
		//클래스 변수는 사용하려고 하면 클래스명을 써주고
		// .을 입력 후에 해당 클래스변수,메소드 사용할수 있습니다.
		/*System.out.println(FieldExam.var1());
		System.out.println(FieldExam.method1());
		
		//멤버변수는 객체를 생성해서 heap메모리 영역에
		//생성한 후에 접근이 가능합니다.
		//객체를 생성한 후에 변수나 메소드에 접근을 할 수 있습니다.
		FieldExam fe = new FieldExam();
		System.out.println((fe.var2));
		System.out.println(fe.method());
		
		BlockExam be = new BlockExam();
		System.out.println(be.name);*/
		
		//JVM 기본값 확인
		System.out.println("Bool : " + BasicVariable.bool);
		System.out.println("Byte : " + BasicVariable.by);
		System.out.println("Character : " + BasicVariable.ch);
		System.out.println("Double : " + BasicVariable.d);
		System.out.println("Float : " + BasicVariable.f);
		System.out.println("Integer : " + BasicVariable.i);
		System.out.println("Long : " + BasicVariable.l);
		System.out.println("Short : " + BasicVariable.sh);
		System.out.println("String : " + BasicVariable.str);

	}

}
