package com.homework;

import java.util.Scanner;

public class Demo8_作业4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 
		 * 给一个不多余5位的正整数，要求：1 求他是几位数 2 逆序打印出各位数
		 */
		int num;
		int coun = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个五位数");
		num = input.nextInt();
		if (num >= 0 && num <= 99999) {
			/**
			 * 
			 *例如123 
			 * 123%10=3 打印coun++ 
			 * 123/10=12 
			 * 12%10=2 打印coun++ 
			 * 12/10=1
			 * 总结：初始值  输入数 循环条件num>0  迭代num=num/10
			 */
			
			/**
			 * 初始值 while(boolean 循环条件){ 
			 * //循环操作 
			 * //变量迭代（可以放在循环操作前面也可以放在循环条件后面） 
			 * }
			 * 
			 */
			
			// 求个位 打印 统计
			while (num > 0) {
				int ge = num % 10;
				System.out.println(ge);
				coun++;
				num = num / 10;

			}
			System.out.println("\n这是一个"+coun+"位数");
		} else {
			System.out.println("输入有误");
		}
	}

}
