import java.util.Scanner;
class  SwitchDemo5{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("ÇëÊäÈëÔÂ·İ");
	int x = sc.nextInt();

	switch (x){
	case 1:
		System.out.println("´º¼¾");
		break;
	case 2:
		System.out.println("´º¼¾");
		break;
	case 3:
		System.out.println("´º¼¾");
		break;
	case 4:
		System.out.println("ÏÄ¼¾");
		break;
	case 5:
		System.out.println("ÏÄ¼¾");
		break;
	case 6:
		System.out.println("ÏÄ¼¾");
		break;
	case 7:
		System.out.println("Çï¼¾");
		break;
	case 8:
		System.out.println("Çï¼¾");
		break;
	case 9:
		System.out.println("Çï¼¾");
		break;
	case 10:
		System.out.println("¶¬¼¾");
		break;
	case 11:
		System.out.println("¶¬¼¾");
		break;
	case 12:
		System.out.println("¶¬¼¾");
		break;
	default:
		System.out.println("ÊäÈëÔÂ·İ²»Âú×ãÒªÇó");
		break;
	}
	//Ì«Âé·³£¬¿ÉÒÔÈçÏÂ£¬Ê¡ÂÔSystem.out.println("")Óëbreak;
	switch (x){
	case 1:
	case 2:
	case 3:
		System.out.println("´º¼¾");
		break;
	case 4:
	case 5:
	case 6:
		System.out.println("ÏÄ¼¾");
		break;
	case 7:
	case 8:
	case 9:
		System.out.println("Çï¼¾");
		break;
	case 10:
	case 11:
	case 12:
		System.out.println("¶¬¼¾");
		break;
	default:
		System.out.println("ÊäÈëÔÂ·İ²»Âú×ãÒªÇó");
		break;
	}
	}
}
