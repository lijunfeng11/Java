package com.paixu;

public class Px {

	public static void main(String[] args) {

		int [] arr= {2,444,5,-6,12};
		System.out.print("排序前");
		printArray(arr);
		bianli(arr);
		System.out.print("排序后");
		printArray(arr);
		
	}

	// 遍历数组元素
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void bianli(int[] arr) {
		// 外层循环i 几轮
		for (int i = 0; i < arr.length - 1; i++) {
			// 内层遍历
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

			System.out.print("第" + (i + 1) + "轮");
			printArray(arr);
		}
	}

}
