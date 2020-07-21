package day04;
/*
 * 
 * 문제 3 ] 
 * 		다섯자리 숫자를 입력받아서
 * 		그 숫자가 회문수인지 아닌지 판별해서 출력하세요.
 * 
 * 		참고 ]
 *		회문수란 앞으로 보나 뒤로보나 똑같은 수 
 *		12321 : 회문수
 *		12312 : 회문수가 아니다.
 */
import javax.swing.*;
public class Ex03 {
	public static void main(String[] args) {
		//1 숫자를 입력받는다.
		String snum = JOptionPane.showInputDialog("다섯자리 숫자를 입력하세요");
		
		//2 12321 경우 1과 1비교하고 맞으면 2와2 비교 맞으면 회문수
		String hms = (snum.charAt(0) != snum.charAt(4))? ("문수") :
										(
												(snum.charAt(1) != snum.charAt(3))?
														"문수": "회문수"
														)
												;
		JOptionPane.showMessageDialog(null, hms);
		
//		char ch0 = snum.charAt(0);
//		char ch1 = snum.charAt(1);
//		char ch3 = snum.charAt(3);
//		char ch4 = snum.charAt(4);
//		
//		String str = (ch0 == ch4)? (ch1 == ch3? "회문수이다." : "회문수가 아니다."): "회문수가 아니다.";
//		
//		JOptionPane.showMessageDialog(null, "입력한 숫자" + snum + " 은 " + str);
		
	}
}
