package hack;
import java.util.Scanner;

public class hack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("ȫ������ ���� ��� ����, ȫ�� �� ��� ����, ȫ�� ���: ");
	Scanner scan = new Scanner(System.in);
	int r = scan.nextInt();
	int e = scan.nextInt();
	int c = scan.nextInt();
	
	if(r == (e-c))
		System.out.println("do not matter!");
	else if(r > (e-c))
		System.out.println("do not adveritise!");
	else
		System.out.println("adveritise!");
	
	
	}

}
