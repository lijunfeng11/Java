package com.shuzu;
/**
 * 
 * @author 李军锋
 *冒泡排序
 *冒泡排序的原理

比较相邻的元素。如果第一个比第二个大，就交换他们两个。对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，
最后的元素应该会是最大的数。针对所有的元素重复以上的步骤，除了最后一个。持续每次对越来越少的元素重复上面的步骤，
直到没有任何一对数字需要比较。
 */


public class PaiXu {

	public static void main(String[] args) {
		int []arr = {1,22,3,44,5,56,8,7};
		System.out.print("冒泡排序前");
		printArray(arr); //打印数组元素
		bubbleSort(arr);//调用排序方法
		System.out.print("冒泡排序后");
		printArray(arr); //打印数组元素
		
	}
	public static void printArray(int [] arr) {
		//循环遍历数组元素
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}
	//定义对数组排序的方法
	public static void bubbleSort(int [] arr) {
		//外层循环 i ： 控制第几轮，如果5个数，最多就比较4轮，所以i的索引从0开始的话，要循环4次，就应该是长度-1 
		for (int i = 0; i < arr.length-1; i++) {
			//内层循环j： 控制每一轮中的元素下标位置，每结束一轮就会出来一个当前这轮中的最大值，则减i,之所以再减1，是因为最后剩一个元素的时候没有相邻的数与其分组，所以不用再比较了
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {//比较两个相邻元素
					//交换两个元素
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.print("第"+(i+1)+"轮排序后");
			printArray(arr);//每轮结束后打印数组元素
		}
	}
	
}
