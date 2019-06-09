package com.homework;

public class Demo8_sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math.sqrt(a)获得a 的平方根
		// 思路 求四位数的平方根，把平方根取（int）整后的，结果和平方根一样，则这个数是完全平方数
		for (int i = 1000; i < 9999; i++) {
			double pfg = Math.sqrt(i);
			if ((int) pfg == pfg) {
				int ge = i % 10;
				int shi = i % 100 / 10;
				int bai = i / 100 % 10;
				int qian = i / 1000;
				if (qian + shi == 10 && bai * ge == 12) {
					System.out.println(i);
				}
			}
		}

	}
}
