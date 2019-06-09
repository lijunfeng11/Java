package com.homework;
import java.util.Scanner;
public class Demo3 {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("请输入你的考试成绩：");
		// 键盘输入，需要Scanner类，调用nextInt()获取键盘输入的整数值
		int num1=	input.nextInt();
		System.out.println("请输入你的笔试成绩：");
		int num2=	input.nextInt();
		
		// 如果你笔试成绩和上机成绩同时及格才可以进入下一阶段学习
		if(num1>=60&&num2>=60) {
			System.out.println("恭喜你进入下一阶段");
		}
		else {
			System.out.println("恭喜您得到了老师们的特殊照顾");
		}
	}

}
