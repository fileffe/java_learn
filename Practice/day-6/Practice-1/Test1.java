/*
//二维数组遍历
class Test1 {
	public static void main(String[] args) {
		int[][] arr = {{11,22,33,},{44,55},{66}};

		for (int x=0;x<arr.length ;x++ ) {
			for (int y=0;y<arr[x].length ;y++ ) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
*/
class Test1 {
	public static void main(String[] args) {
		int[][] arr = {{11,22,33,},{44,55},{66}};
		PrintArray(arr);
	}
		public static void PrintArray(int[][] arr) {
			for (int x=0;x<arr.length ;x++ ) {
				for (int y=0;y<arr[x].length ;y++ ) {
					System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
	}

}