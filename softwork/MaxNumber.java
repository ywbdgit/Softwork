package Work_1;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

/**
 * ��������������������Ͳ�չʾ
 * @author ���ı�
 * 1.0
 * 2019-03-28
 */
public class MaxNumber {
	
	/**
	 * �������������������͵ĺ���
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
	 *  ��������չʾ���������չʾ����ĺ���
	 * n is array length;
	 * return none
	 */
	public void show()
	{
		int[] array = new int [20];
		int n=0;
		int Max=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������������");
		n=scanner.nextInt();
		System.out.println("����������ֵ��");
		
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
		}
		
		Max=max(array, n);
		System.out.println("���������֮��Ϊ��"+Max);
	}
	public static void main(String[] args) {
		
		//�����������ʵ��
		MaxNumber mn = new MaxNumber();
		mn.show();
	}
}
