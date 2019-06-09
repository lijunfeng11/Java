package com.homework;

public class Demo8_作业3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PI=4.0/1-4/3+4/5-4/7+4/9-4/11+4/13....
		// 为了让结果带小数分子必须是几点零得数 两种转换 一：直接写几点零 二：定义分子直接为double
		
		double fenzi, sum = 0;
		int coun = 0;
		for (fenzi = 1;; fenzi += 2) {
			// 当运算次数是奇数+ 偶数-
			coun++;// 进去循环就是一次操作
			if (coun % 2 == 0) {
				sum = sum - 4 / fenzi;
			} else {
				sum = sum + 4 / fenzi;
			}
			// 判断和是否在范围内，如果在范围内输出结果，跳出循环
			if (sum >= 3.1415926 && sum <= 3.1415927) {
				System.out.println("经历了" + coun + "次运算，结果为" + sum);
				break;
			}
		}
	}

}
