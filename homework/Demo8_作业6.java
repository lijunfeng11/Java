package com.homework;

import java.util.Scanner;

public class Demo8_作业6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 
		 * 求S=a+aa+aaa+aaaa....a 的值，其中a是一个数字
		 * 例如 2+22+222+2222（此时a=2,n=4）
		 * num=num*10+add
		 */
		
		Scanner input = new  Scanner(System.in);
		System.out.println("请输入1-9的数字");
		int num=input.nextInt();
		System.out.println("请输入要累加次数");
		int n=input.nextInt();
		int add=num;
		int sum=0;
		for (int i = 1; i <= n; i++) {
			sum=sum+num;
			num=num*10+add;
		}
		System.out.println("累加和是"+sum);
	}

}
