/*
//二维数组遍历
class ArrayTest{
	public static void main(String[] args) {
		int [][]arr = {{1,2,3},{4,5},{6}};

		for (int x=0;x<arr.length ;x++ ) {               //小于，不是小于等于
			for (int y=0;y<arr[x].length ;y++ ) {		 //小于，不是小于等于,记得括号内带x
			System.out.print(arr[x][y]+"\t");
			}
			System.out.println();                        //括号内
		}
	}
}
*/
class ArrayTest{
	public static void main(String[] args) {
		int [][]arr = {{1,2,3},{4,5},{6}};
		PrintArray(arr);
	}
		
		public static void PrintArray(int [][]arr) {
		for (int x=0;x<arr.length ;x++ ) {
			for (int y=0;y<arr[x].length ;y++ ) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();               
		}
	}
}
