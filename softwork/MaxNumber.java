package Work_1;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

/**
 * 这个类用来求最大子数组和并展示
 * @author 闫文兵
 * 1.0
 * 2019-03-28
 */
public class MaxNumber {
	
	/**
	 * 这是用来求最大子数组和的函数
	 * sum :is current sum 
	 * output none
	 * @return Max
	 */
	public int max(int[] a,int n)
	{
		int sum=0;
		int Max=a[0];
		for(int i=0;i<n;i++)
		{
			if(sum<0) 
			{
				sum=a[i];
			}
			else 
			{
				sum=sum+a[i];
			}
			
			if(sum>Max)
			{
				Max=sum;
			}
		}
		return Max;
	}
	
	/**
	 *  这是用来展示输入数组和展示结果的函数
	 * n is array length;
	 * return none
	 */
	public void show()
	{
		int[] array = new int [20];
		int n=0;
		int Max=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入整数的数量：");
		n=scanner.nextInt();
		System.out.println("请输入整数值：");
		
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
		}
		
		Max=max(array, n);
		System.out.println("最大子数组之和为："+Max);
	}
	public static void main(String[] args) {
		
		//创建对象进行实现
		MaxNumber mn = new MaxNumber();
		mn.show();
	}
}
