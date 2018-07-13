//获取最大值
/*
class  ArrayDemo2{
	public static void main(String[] args) {
		int []arr ={56,34,78,98,45};
		int max = arr[0];
	for (int x=1;x<arr.length;x++ )
	{if (arr[x]>max)
	{max=arr[x];
	}
	}
		System.out.println(max);
	}
}
*/
//方法改进

class ArrayMaxDemo {
	public static void main(String[] args) {
		int[] arr ={56,34,78,98,45};
		int max = getMax(arr);
		System.out.println(max);
	}
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int x=1;x<arr.length;x++) {
			if (arr[x]>max)
			{
				max=arr[x];
			}
		}
		return max;
	}
}
