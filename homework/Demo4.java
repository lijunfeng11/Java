package com.homework;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		// 键盘输入一个年份
		Scanner year = new Scanner(System.in);
		System.out.println("请输入一个要判断的年份");
		// 键盘输入用Scanner类 用nextInt()方法输出整数
		int n = year.nextInt();
		// 用if语句判断是否是闰年 满足条件如下
		// 该年能被4整除但是不能被100整除，或者能被400整除
		if (n % 4 == 0 && n % 100 == 0 || n % 400 == 0) {
			System.out.println("该年为闰年");
		} else {
			System.out.println("该年不是闰年");
		}
	}

}
