class Test {
	public static void main(String[] args) {
		int[] arr={22,33,44,55,66,77,88};
		System.out.println("倒叙前");
		printArray(arr);

		reverse(arr);
		System.out.println("倒叙后");
		printArray(arr);
	}
	public static void printArray(int[] arr){
		for (int x=0;x<arr.length ;x++ ) {
			System.out.println(arr[x]);
		}
	}
	public static void reverse(int[] arr){
		for (int x=0;x<arr.length/2 ;x++ ) {
			int temp = arr[x];
			arr[x] = arr[arr.length-x-1];
			arr[arr.length-x-1]=temp;
		}
	}
}