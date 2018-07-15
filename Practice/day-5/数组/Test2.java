class Test2 {
	public static void main(String[] args) {
		int[] arr = {22,33,44,55,66,77,88};
		int index = getIndex(arr,33);
		System.out.println("33第一次出现索引是"+index);
	}
	public static int getIndex(int[] arr,int value) {
		for (int x=0;x<arr.length ;x++ ) {
			if (arr[x]==value) {
				return x;
			}
		}
		return -1;
	}
}
