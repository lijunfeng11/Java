package com.homework;

import java.util.Random;
import java.util.Scanner;

public class Demo5_do_while {
/**
 * 猜大小
 * @param args
 */
	
	/*改为while循环
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random ran=new Random();//生成随机整数
		int num = ran.nextInt(101)+100;
		int count=0;
		int guess;
		
		System.out.println("请输入100-200之间的整数");
		guess=input.nextInt();
		count++;
		 while (guess!=num);{
			if(guess>num) {
				System.out.println("大了，小点");
			}
			else if (guess<num) {
				System.out.println("小了，大点");
			}
			System.out.println("请输入100-200之间的整数");
			guess=input.nextInt();
			count++;
		}
		System.out.println("恭喜你猜对了"+"用了"+count+"次");
	}

	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random ran=new Random();//生成随机整数
		int num = ran.nextInt(101)+100;
		int count=0;
		int guess;
		do {
			System.out.println("请输入100-200之间的整数");
			guess=input.nextInt();
			count++;
			if(guess>num) {
				System.out.println("大了，小点");
			}
			else if (guess<num) {
				System.out.println("小了，大点");
			}
		} while (guess!=num);
		System.out.println("恭喜你猜对了"+"用了"+count+"次");
	}

}
