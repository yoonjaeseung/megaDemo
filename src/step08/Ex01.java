package step08;

import java.util.Scanner;

/*
 * # 성적 유효성 검사
 * 1. 성적을 입력받는다.
 * 2. 성적이 60점 이상이면 합격, 60점 미만이면 불합격이다.
 * 3. 단, 입력받은 성적이
 *    음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
 *    예) 성적을 잘못 입력했습니다.
 */

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("성적을 입력하세요: ");
		int score = sc.nextInt();

		if (60 <= score && score <= 100) {
			System.out.println("합격");
		}

//		# 이중 if문
//		if (score >= 60) {
//			if (score <= 100) {
//				System.out.println("합격");
//			}
//		}

		if (0 <= score && score < 60) {
			System.out.println("불합격");
		}

		if (100 < score || score < 0) {
			System.out.println("성적을 잘못 입력했습니다.");
		}

	}

}