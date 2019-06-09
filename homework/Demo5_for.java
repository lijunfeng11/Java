package com.homework;

public class Demo5_for {

	public static void main(String[] args) {
		
		/*for(初环条件（2）;始值（1）;循迭代（3）) {
			（4）
			
		}*/
		// for 表达式1 2 3 省略
		// 表达式2 ：省略不写，表示循环条件为True（永远为真）
		// for (int i = 0;; i++) {
		// System.out.println(i);
		// }

		// 表达式1省略
		// int i=1;
		// for(;i<=10;i++) {
		// System.out.println(i);
		// }

		// 表达式3省略
		// for(int i=1;i<=10;) {
		// System.out.println(i);
		// i++;
		// }
		//

		// 表达式1 3省略 和while循环一样
		// int i=1;
		// for(;i<=10;) {
		// System.out.println(i);
		// i++;
		// }
		
		/*
		int j = 5;
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + "+" + j + "=" + (i + j));
			j--;
		}
		*/
		
		/*
		 * 输出 0+5=5 1+4=5 2+3=5 3+2=5 4+1=5 5+0=5 第一三表达式课可以有逗号，第二个不可以有（并 或）
		 */
		int i, j;
		for (i = 0, j = 5; i <= 5; i++, j--) {
			System.out.println(i + "+" + j + "=" + (i + j));
		}

	}

}
