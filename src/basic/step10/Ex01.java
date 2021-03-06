package basic.step10;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {

		// Q : Math.random과 Random 차이와 Random은 잘 사용되는 클래스인가?
		// A : 상황에 따라 사용하고 util 패키지를 많이 알면 좋음.
		
		Random ran = new Random();

		// 예) 0 ~ 2 사이의 랜덤
		int rNum = ran.nextInt(3); // [0 ~ 2]
		System.out.println(rNum);

		// 문제 1) 1 ~ 5 사이의 랜덤
		rNum = ran.nextInt(5) + 1; // [0 ~ 4] + 1
		System.out.println(rNum);

		// 문제 2) -3 ~ 3 사이의 랜덤
		rNum = ran.nextInt(7) - 3; // [0 ~ 6] -3
		System.out.println(rNum);

	}

}
