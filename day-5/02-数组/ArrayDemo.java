//������һ����������ÿһ������
/*class ArrayDemo {
	public static void main(String[] args) {       
		int [] arr = {11,22,33,44,55};
		for (int x=0;x<5 ;x++ )					//arr[0]=11,arr[1]=22,arr[2]=33,arr[3]=44,arr[4]=55,�����ֵ��x���ֻ��Ϊ4
		{	System.out.println(arr[x]);
		}
*/

/*
class ArrayDemo {
	public static void main(String[] args) {
		int [] arr2 = {2,3,5,6,7,3,5,6,7,8,3,3,4,6,544,35};
		for (int y=0; y<arr2.length; y++)      //ע��arr.length��������Ԫ�ظ���
		{System.out.println(arr2[y]);   
		}         	
	}
}
*/
class ArrayDemo {
	public static void main(String[] args) {
		int [] arr2 = {2,3,5,6,7,3,5,6,7,8,3,3,4,6,544,35};
		printArray(arr2);
	}
	public static void printArray(int[] arr){             //���Է���
		for (int y: arr)
		{
			System.out.println(y);
		}
	}

	public static void printArray2(int[] arr2){
		for (int y=0; y<arr2.length; y++)                 //�˴�ΪС�ڣ���<=arr2.length-1
		{
			System.out.println(arr2[y]);
		}
	}
}
