package Work_1;



public class MaxNumber2 {

	public int Max(int a[],int n) {
		int Max=a[0];
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=a[i];
			if(sum>Max) 
		        Max=sum;
			for(int j=i+1;j<n+i;j++) {
				sum=sum+a[j%n];
				if(sum>Max) {
					Max=sum;
				}
			}
		}
		return Max;
	}
	public static void main(String[] args) {
		MaxNumber2 a = new MaxNumber2();
		int x[] = {1,-5,-6,-3,2};
		int y=a.Max(x, 5);
		System.out.println("成链后的最大值："+y);
	}
}
