package day04;
	
/*
 *  201~ 500까지 세자리 숫자를 받아서(랜덤)
 *  300보다 크면 "300보다 큰수 "
 *  작으면 "300보다 작은수"
 *  가 출력되게 하세요.
 */
public class Ex05 {
	public static void main(String[] args) {
	// 랜덤으로 세자리 수 생성
		int num = (int)(Math.random() * (500 - 201 + 1) + 201);
		String str = "";

	// 300보다 크다면 , 같다면, 작다면
		if (num > 300) {
			str = "큰 수";
		} else if (num == 300) {
			str = "같은 수";
		} else {
			str = "작은 수";
		}
		System.out.println(num + "는 300보다 " + str + "이다.");
	}
}