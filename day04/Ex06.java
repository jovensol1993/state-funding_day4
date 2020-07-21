package day04;
/*
 * 문제 3]
 * 		정수 세개 입력 받아서
 * 		제일 큰 수부터 출력 (중첩)
 */
import javax.swing.*;
public class Ex06 {
	public static void main (String[] args) {
		// 정수를 입력받음
		String snum1 = JOptionPane.showInputDialog("첫 번째정수를 입력하세요!");
		String snum2 = JOptionPane.showInputDialog("두 번째정수를 입력하세요!");
		String snum3 = JOptionPane.showInputDialog("세 번째정수를 입력하세요!");
		
		// 형변환
		int a = Integer.parseInt(snum1);
		int b = Integer.parseInt(snum2);
		int c = Integer.parseInt(snum3);
		
		// if문 
//		if (a > b) {
//			if (a > c) {
//				JOptionPane.showMessageDialog(null, a + "<" + b + "<" + c);
//			} else {
//				JOptionPane.showMessageDialog(null, c + "<" + a + "<" + b);
//			}
//		}
		if (a > b) {
			if (a > c) {
				if(b > c) {
					JOptionPane.showMessageDialog(null, a + ">" + b + ">" + c); // 
				} else {
					JOptionPane.showMessageDialog(null, a + ">" + c + ">" + b);
	   		    }
			} else {
	   		    JOptionPane.showMessageDialog(null, c + ">" + a + ">" + b);
				  }
		} else if (a < b){
			if (a < c) {
				if(b < c) {
					JOptionPane.showMessageDialog(null, c + ">" + b + ">" + a);
				} else {
					JOptionPane.showMessageDialog(null, b + ">" + c + ">" + a);
				}
			} else {
				JOptionPane.showMessageDialog(null, b + ">" + a + ">" + c);
			}
		}
		}
		
	}
