package day04;

/*
 * 문제2]
 * 		랜덤하게 다섯자리 숫자를 만들고
 * 		각 자리의 숫자의 합을 구해서 출력해주는 프로그램을 작성하세요.
 * 		
 * 		=> 12345 , 1 + 2 + 3 + 4 + 5
 */

/*
 * 윈도우 창을 띄워서 입력받는 방법
 * 
 * 		라이브러리를 추가한다.
 * 		import javax.swing.*;  [ 윈도우 창 만들어주는 거]
 */
import javax.swing.*;
public class Ex02 {
	public static void main(String[] args) {
		//1 다섯자리
//		String snum = JOptionPane.showInputDialog("다서자리 숫자를 입력하세요!");
//		JOptionPane.showMessageDialog(null, "입력한 숫자: " + snum);
//		JOptionPane.showMessageDialog(null, JOptionPane.ICON_PROPERTY);
		int no = (int)(Math.random() * (99999 - 10000 + 1) + 10000);
		
		// 할일
		// 만단위부터 각 자리수 꺼내서 더해준다.
		int sum = (no / 10000) + (no % 10000/1000) + (no % 1000/100) + (no % 100/ 10) + (no % 1);
		
		JOptionPane.showMessageDialog(null , "랜덤하게 발생된 숫자" + no + "의 각 자릿수의 합은 " + sum + "입니다.");
		
		
		// 1. 랜덤하게 5자리 숫자 생성
//		int num1 = (int)(Math.random() * (99999 - 10000 + 1) +10000);
//
//		// num1 기본값 함축
//		int num2 = num1;
//		
//		int sum = 0;
//		
//		// 일~만의자리 가져오기
//		while(num1>0) {
//		sum += num1 % 10;
//		num1 /= 10;
//		}
//		System.out.printf("랜덤을 통해 불러온 숫자는 %d 이고 각 자리의 숫자의 합은 %d" , num2, sum );
		
	}
}
