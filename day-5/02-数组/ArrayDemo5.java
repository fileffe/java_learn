//����Ԫ�ز��ң�����ָ��Ԫ�ص�һ���������г��ֵ�����
class  ArrayDemo5{
	public static void main(String[] args) {
		int[] arr = {200,250,38,888,444};
		int index=getIndex(arr,250);
		System.out.println("250�������е�һ�γ��ֵ�������"+index);
	}

	public static int getIndex(int[] arr,int value) {
		for (int x=0;x<arr.length ;x++ ) {
			if (arr[x]==value) {
				return x;
			}
		}
	    return -1;       //δ�ҵ�
	}
}
