//倒序

class ArrayDemo3{
	public static void main(String[] args) {
		int[]arr={33,44,55,77,88,99,};
		System.out.println("逆序前");
		printArray(arr);

		reverse(arr);
		System.out.println("逆序后");
		printArray(arr);		
		
	}
	public static void printArray(int[] arr2){		//printArray对应printArray(arr);
		for (int y=0; y<arr2.length; y++) {
			System.out.println(arr2[y]);
		}
	}

	public static void reverse(int[] arr){			//reverse对应reverse(arr);
		for (int x=0;x<arr.length/2;x++ ) {	
			int temp = arr[x];
			arr[x] = arr[arr.length-1-x];           //注意此处为arr.length-1
			arr[arr.length-1-x]=temp;
		}
	}
}
