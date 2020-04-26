package step15;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 */

public class Ex04_1 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int score = 0;
 
		int cnt = 1;
		while (cnt <= 5) {
			int num1 = ran.nextInt(8) + 2;
			int num2 = ran.nextInt(9) + 1;
			int answer = num1 * num2;

			System.out.print("문제: " + num1 + " * " + num2 + " = ");
			int myAnswer = sc.nextInt();
			
			if (answer == myAnswer) {
				System.out.println("정답");
				System.out.println();
				score = score + 20;
			} else {
				System.out.println("오답");
				System.out.println();
			}
			
			cnt = cnt + 1;
		}

		System.out.println("성적: " + score+"점");
	}

}
