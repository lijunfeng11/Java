package com.homework;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		/**
		 * 
		 * switch语句
		 * 1)case 后面值不能有重复的
		 * 2)case 后面值不可以是变量，只能是常量或者是常量标识符（final）
		 * 3)switch() 中表达式的类型byte\shout\char\int\枚举
		 * jdk1.7以后版本可以是String（更换版本的话项目名右击-->properties-->找Java Compiler）
		 * 4) 则执行匹配case后，代码会继续执行
		 */
		final int num=2;//用final常量标识符,只能被赋值一次
		Scanner input = new Scanner(System.in);
		System.out.println("请输入名次");
		int mingic=input.nextInt();
		switch (mingic) {
		case 1:
			System.out.println("奖励X");
			break;
		//case 2:
		case num:	
			System.out.println("奖励华为");
			break;

		default:
			System.out.println("没有奖励");
			break;
		}
		
		
	}

}
