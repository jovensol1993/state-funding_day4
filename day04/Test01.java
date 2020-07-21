package day04;
/*
 * 랜덤하게 알파벳 대문자를 발생시켜보자.
 * 랜덤하게 대문자 2개 발생 순서대로 출력되도록
 */
public class Test01 {
	public static void main(String[] args) {
		char ch = (char)(Math.random() * ('Z'-'A' + 1) + 'A'); //[큰-작+1] + 작
		char ch2 = (char)(Math.random() * ('Z'-'A' + 1) + 'A'); //[큰-작+1] + 작
		System.out.printf("랜덤하게 발생된 대문자는" + ch + "입니다.");
		
		
	}
}