package day04;

/*
 *  문제 1] 
 *  	두 수를 랜덤하게 입력받아서
 *  	첫번째 수가 두번째 수보다 크거나 같으면 "양수"
 *  	두번째 수가 크면 "음수"
 */
public class Ex04 {
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * (19 - 10 + 1) + 10);
		int num2 = (int)(Math.random() * (19 - 10 + 1) + 10);
		
		if (num1 >= num2) {
			 System.out.println("양수");
		} else {
			 System.out.println("음수");
		}
	}
}
