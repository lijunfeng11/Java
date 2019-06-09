package com.homework;

public class Demo1 {

	public static void main(String[] args) {
		// 强制类型转换只能转换同类类型数据转换
		// 如：基本数据类型（int->char\double->int） 引用数据(Object->String\Person->Student)
		// 不能使用此方式，进行引用数据类型和基本数据类型之间的转换
		// String s1=(String)d1;错误
		double d1 = 3.1415;
		String s1 = d1 + "";// 链接空字符串进行转换(其他类型转字符串)
		System.out.println(s1);

		//
		String str = "10";
		int i2 = Integer.parseInt(str);// 字符串转整数类型
		System.out.println("i2:" + i2);

		/**
		 * 三目运算符 X?Y:Z 如果X为真执行的是Y操作 否则执行Z X必须是boolean类型表达式
		 * 
		 */
		int num2 = 20;
		String rs = num2 % 2 == 0 ? "偶数" : "奇数";
		System.out.println(rs);
	}

}
