package edu.kh.variable.ex6;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할
		
		// Scanner 생성
		// -> 프로그램 안에 스캐너라는 기계를 만든 것
		Scanner sc = new Scanner(System.in);
		// import를 안해와서 
		// Scanner를 만들어서 쓰고싶은데 설계도가 없음
		// import 해오라는 에러 발생! ==> import 해오면 오류 해결
		
		//System.out.print("값을 입력하시오 : ");
		//int input1 = sc.nextInt(); // 입력 받은 정수를 input1에 대입
		// nextInt() : 다음 입력된 정수를 읽어옴 (키보드로 입력된 정수를 읽어옴)
		//System.out.println(input1);
		
		//System.out.print("실수만 입력해");
		//double input2 = sc.nextDouble();
	    //System.out.println(input2);
	    
	    System.out.print("입력1 : ");
	    String input3 = sc.next();
	    // next() : 다음 입력된 한 단어를 읽어옴
	    System.out.println(input3);
	    
	    System.out.println("입력2 : ");
	    String input4 = input3 + sc.next();
	    System.out.println(input4);
	}
}
