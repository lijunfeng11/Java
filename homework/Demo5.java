package com.homework;

import java.awt.image.ImageProducer;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		/**
		 * 
		 * 多重if 
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("请输入你的存款（万）"); 
		 * double money = input.nextDouble(); 
		 * if(money >= 200) { System.out.println("可以买保时捷");
		 * 
		 * } else if (money >= 50) { System.out.println("可以买宝马");
		 * 
		 * }else if (money<=50) { System.out.println("可以买吉利");
		 * 
		 * }else { System.out.println("可以买比亚迪"); }
		 * 
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入机票的原价：");
		double jp = input.nextDouble();
		System.out.println("请输入出行的月份：");
		int month = input.nextInt();
		System.out.println("请输入机票类型：");
		int cs1 = input.nextInt();
		if (month >= 4 && month <= 10 && cs1 == 1) {
			System.out.println("此月为旺季,头等舱打9折" + jp * 0.9);
		} else if (month >= 4 && month <= 10 && cs1 == 0) {
			System.out.println("此月为旺季,头等舱打7.5折" + jp * 0.75);

		}
		if (month < 4 && month > 10 && cs1 == 1) {
			System.out.println("此月为淡季,头等舱打6折" + jp * 0.6);
		} else if (month < 4 && month > 10 && cs1 == 0) {
			System.out.println("此月为淡季,头等舱打7.5折" + jp * 0.75);
		}
		
	}

}
