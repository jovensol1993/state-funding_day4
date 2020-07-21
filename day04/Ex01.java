package day04;

import java.util.Scanner;

/* 
 * 1.
 * 랜덤하게 두 자리 숫자를 발생시키고
 * 키보드로 두 자리 숫자를 입력하는 
 * 발생된 숫자보다 입력한 숫자가 큰수인지 아닌지 판별하는 프로그램을 작성하세요.
 * 
 * 2.
 * 심화 ]
 * 		입력한 수와 차는 얼마인지 같이 출력하도록 하세요.
 */
import java.util.*;
import javax.swing.*;
public class Ex01 {
	public static void main(String[] args)
	{
		// 1. 랜덤하게 다두 자리 숫자를 만들고
		int no1 = (int)(Math.random() * (99 - 10 + 1) + 10);
		
		// 2. 두 자리 숫자 입력받고 정수형으로 변환
		String snum = JOptionPane.showInputDialog("두 자리 숫자를 입력하세요!");
		// 정수로 변환
		int no2 = Integer.parseInt(snum);// ***질문 강제 형변환하면 안됨?
		
		// 3. 두 수를 비교해서 큰 수에서 작은 수 뺀 차를 구한다.(삼항연산자)
		String str = (no1 > no2)? (no1+ "과" + no2 + "중 큰 수는" + no1 + "이고 차는" + (no1-no2) + "입니다.") : 
					 	 (no1+ "과" + no2 + "중 큰 수는" + no2 + "이고 차는" + (no2-no1) + "입니다.");
		
		JOptionPane.showMessageDialog(null, str);
			
//		// 랜덤하게 두 자리 숫자 발생
//		int num1 = (int)(Math.random() * (99 - 10 + 1) +10);
//
//		// 키보드로 두 자리 숫자 입력 발생
//		Scanner sc = new Scanner(System.in);
//		System.out.println("두 자리 숫자를 입력하시오");
//		int num2 = sc.nextInt();
//
//		//판별하는 삼중다항식
//		String num3 = (num1>num2)? (num2 + " 더 작다.") : (num2 + "가 더 크다");
//		
//		// 차를 구하는 식
//		int num4 = Math.abs(num1-num2);
//		
//		//결과 도출
//		System.out.println(num3);
//		System.out.println("두 수의 차이는" + num4);
	}
}
