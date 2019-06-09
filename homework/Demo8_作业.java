package com.homework;

public class Demo8_作业 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 编写一个程序，求出满足下列条件的四位数，该数是一个完全平方数，且第一 三位数字之和为10，第二、四位数之积为10
		// 思路，计算一个数的平方，判断这个平方是否符合要求，如果符合就打印\
		/*for(初环条件（2）;始值（1）;循迭代（3）) {
		（4）}*/		
		for (int n = 30;; n++) {
			int pf = n * n;
			if (pf < 1000) {
				continue;
			}
			if (pf > 10000) {
				break;
			}
			// 四位数拆分1000
			int ge = pf % 10;
			int shi = pf % 100 / 10;
			int bai = pf / 100 % 10;
			int qian = pf / 1000;
			if (qian + shi == 10 && bai * ge == 12) {
				System.out.println(pf);
			}
		}
	}

}
