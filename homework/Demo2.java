package com.homework;

//导入Scanner类
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建Scanner类的对象
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数");
		// 键盘输入，需要Scanner类，调用nextInt()获取键盘输入的整数值
		int num = input.nextInt();
		System.out.println("请输入另一个整数");
		int num1 = input.nextInt();
		System.out.println("请输入一个浮点数");
		// 调用nextDouble()获得键盘输入的浮点数值
		double num2 = input.nextDouble();
		System.out.println("请输入一个字符串");
		// 调用next()获取键盘输入的字符串
		String str = input.next();
		System.out.println(num + "\t" + num1);//分别输出num值  和num1 值
		System.out.println(num + num1);//输出结果直接进行相加
		System.out.println(num2);
		System.out.println(str);
	}

}
