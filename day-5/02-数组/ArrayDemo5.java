//数组元素查找，查找指定元素第一次在数组中出现的索引
class  ArrayDemo5{
	public static void main(String[] args) {
		int[] arr = {200,250,38,888,444};
		int index=getIndex(arr,250);
		System.out.println("250在数组中第一次出现的索引是"+index);
	}

	public static int getIndex(int[] arr,int value) {
		for (int x=0;x<arr.length ;x++ ) {
			if (arr[x]==value) {
				return x;
			}
		}
	    return -1;       //未找到
	}
}
