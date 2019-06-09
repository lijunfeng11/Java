package com.homework;

import java.util.Scanner;

public class Demo3_while {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输出一个0-20的数求阶乘");
		int num = input.nextInt();

		if (num >= 0 && num <= 20) {
			
			long jc=1;
			int n=1;
			while (n<=num) {
				jc*=n;
				n++;
			}
			System.out.println(num+"!="+jc);
			
		} else {
			System.out.println("这个数无法计算");
		}
	}

}
