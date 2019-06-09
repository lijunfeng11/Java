package com.homework;

public class Demo8_作业2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * 五个人围坐在一起，第五个人说比第四个人大2岁，第四个人说比第三个人大2岁，
 * 第三个人比第二个人大2岁，第二个人比第一个人大2岁，第一个人10岁，
 * 问第五个人几岁
 */
		int old=10;
		for (int i =2; i < 6; i++) {
			old+=2;
		}
		System.out.println("第五个人的年龄是"+old);
	}

}
