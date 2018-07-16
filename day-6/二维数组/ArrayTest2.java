/*
//二维数组求和
class ArrayTest2 {
	public static void main(String[] args) {
		int [][] arr = {{11,22,33},{44,55},{66,77,88,99}};
		int sum = 0;
		for (int x=0;x<arr.length;x++ ) {
			for (int y=0;y<arr[x].length;y++) {
				sum += arr[x][y];
			}
		}
		System.out.println(sum);
	}
}
*/
class ArrayTest2 {
	public static void main(String[] args) {
		int [][] arr = {{11,22,33},{44,55},{66,77,88,99}};
		int sum = ArraySum(arr);
		System.out.println(sum);
	}
	public static int ArraySum(int[][] arr) {
		int sum = 0;
		for (int x=0;x<arr.length;x++ ) {
			for (int y=0;y<arr[x].length;y++) {
				sum += arr[x][y];
			}
		}
		return sum;                              //****记得
	}
}