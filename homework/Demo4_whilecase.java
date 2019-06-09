package com.homework;

import java.util.Random;
import java.util.Scanner;

public class Demo4_whilecase {

	public static void main(String[] args) {
		/*
		 * 
		 * // 任意键郑筛子，询问是否继续 
		 * Scanner input=new Scanner(System.in); 
		 * Random ran=new Random();//生成随机整数（+ -） 
		 * 
		 * System.out.println("按任意键郑筛子");
		 * 
		 * input.next(); 
		 * int num=ran.nextInt(6)+1;//1-6随机整数
		 * System.out.println("你郑了:"+num+"点筛子");
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("是否开始游戏？（yes/no）");
		String answer = input.next();
		int player=0,computer=0;
		
		// answer.equals()yes/no 区分大小写
		// answer.equalsIgnoreCase() 不区分大小写
		while (answer.equalsIgnoreCase("yes")) {
			System.out.println("按任意键郑筛子");
			input.next();
			Random ran = new Random();
			int num1 = ran.nextInt(6) + 1;
			System.out.println("你郑了:" + num1 + "点筛子");

			// 电脑郑筛子
			int num2 = ran.nextInt(6) + 1;
			System.out.println("电脑郑了:" + num2 + "点筛子");

			if (num1 > num2) {
				player++;
				System.out.println("你赢了");
			} else if (num1 < num2) {
				computer++;
				System.out.println("你输了");
			} else {
				System.out.println("平局");
			}

			// 再次输入，循环迭代
			System.out.println("是否再来一次（yes/no）");
			answer = input.next();
		}
		if (player > computer) {
			System.err.println("最终你获胜");
		} else if (player < computer) {
			System.out.println("最终电脑获胜");
		} else {
			System.out.println("最终平局");
		}
		System.out.println("game over");
	}

}
