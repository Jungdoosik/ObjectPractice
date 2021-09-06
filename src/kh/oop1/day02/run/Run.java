package kh.oop1.day02.run;

import kh.oop1.day02.exam.Coffee;
import kh.oop1.day02.exam.ImportExam;

public class Run {
	public static void main(String[] args) {
		Coffee c = new Coffee();

		ImportExam ie = new ImportExam();
		System.out.println(ie.piExam());
		
		System.out.println(ie.randomExam(10));
		
		System.out.println(ie.sortExam());
		
		
		
	}

}
