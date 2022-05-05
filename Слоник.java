import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int n = scanner.nextInt();
		int a = n/5;
		if (n % 5 == 0){
		    System.out.println(a);
		}
		else {
		    System.out.println(a+1);
		}
}
}
