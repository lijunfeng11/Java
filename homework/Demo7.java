package com.homework;

import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
		/*
		 * // 输入5个数求他们的平均值 Scanner input = new Scanner(System.in); 
		 * int sum = 0; int i;
		 * for (i = 1; i <= 5; i++) {
		 *  System.out.println("请输入第" + i + "个数");
		 *   int num =input.nextInt();
		 *    if (num < 0) { System.out.println("输入有误"); break; } 
		 *    sum =sum + num;
		 * 
		 * } if (i > 5) { 
		 * System.out.println("平均值为" + (sum / 5.0)); }
		 */

		Scanner input = new Scanner(System.in);
		int sum = 0;
		int i;
		boolean flg = false;// 表示循环中是否出错默认让为false
		for (i = 1; i <= 5; i++) {
			System.out.println("请输入第" + i + "个数");
			int num = input.nextInt();
			if (num < 0) {
				// System.out.println("输入有误");
				flg = true;
				break;
			}
			sum = sum + num;

		}
		// if (i > 5) {
		if (flg == false) {
			System.out.println("平均值为" + (sum / 5.0));
		} else {
			System.out.println("输入有误");
		}
	}
}
