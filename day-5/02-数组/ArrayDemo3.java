//����

class ArrayDemo3{
	public static void main(String[] args) {
		int[]arr={33,44,55,77,88,99,};
		System.out.println("����ǰ");
		printArray(arr);

		reverse(arr);
		System.out.println("�����");
		printArray(arr);		
		
	}
	public static void printArray(int[] arr2){		//printArray��ӦprintArray(arr);
		for (int y=0; y<arr2.length; y++) {
			System.out.println(arr2[y]);
		}
	}

	public static void reverse(int[] arr){			//reverse��Ӧreverse(arr);
		for (int x=0;x<arr.length/2;x++ ) {	
			int temp = arr[x];
			arr[x] = arr[arr.length-1-x];           //ע��˴�Ϊarr.length-1
			arr[arr.length-1-x]=temp;
		}
	}
}
