package day04;
/*
 *  예제 4 ]
 *  	4자리 연도를 입력하고
 *  	그 해가 윤년인지 아닌지 판별해서 출력하세요.
 *  
 *  	해결은 다중 조건문으로 처리하세요.
 */
import javax.swing.*;
public class Test08 {
	public static void main (String[] args) {
		
		// 연도를 입력받으는 창
		String snum = JOptionPane.showInputDialog("년도를 입력하세요");
		int year = Integer.parseInt(snum);
		
		String str = "";
		
		// if 구문 윤년인지 판단, //조건을 나열할 때 범위가 좁은 것부터 나열
		if (year % 400 == 0){
			str = "윤년";
		} else if(year % 100 == 0 ) {
			str = "평년";
		} else if(year % 4 ==0 ) {
			str = "윤년";
		} else {
			str =" 평년";
		}
		JOptionPane.showMessageDialog(null, "입력한 해"+ year + "년도는" + str + "입니다.");
	}
}
