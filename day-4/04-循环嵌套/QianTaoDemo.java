/*�����������е�*����ѭ��������������ѭ������������
*****
*****
*****
*****
*/
/*
class QianTaoDemo {
	public static void main(String[] args) {
		for (int y=0;y<4;y++ ){
		for (int x=0;x<5;x++ ){
			System.out.print("*");                        //println��print���ǻ����벻���е�����
			}
			System.out.println();                      
		}
	}
}
*/
/*������������״
*
**
***
****
***** 
*/
/*
class QianTaoDemo {
	public static void main(String[] args) {
		for (int x=0;x<5;x++ ){
		for (int y=0;y<=x;y++ ){
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
*/
//������žų˷���
class QianTaoDemo {
	public static void main(String[] args) {
		for (int x=1;x<=9;x++ ){
		for (int y=1;y<=x;y++ ){
			System.out.print((y+"*"+x+"="+y*x)+"\t");   //�˴��ص㣬Ҫ�����,"\t"����'t'��ʾ;�൱��tab��
			/*"\x"��ʾ���⣬��ת���ַ���
			"\r"�س�
			"\n"����
			*/
			}
			System.out.println();
		}
	}
}
