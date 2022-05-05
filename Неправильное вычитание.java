import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int [] n = new int [2];
		for (int i = 0; i < 2; i++){
		    int input = scanner.nextInt();
		    n[i] = input;
		}
		for (int i = 0; i < n[1]; i++){
		    if (n[0]%10 !=0){
		        n[0] -= 1;
		    }
		    else {
		        n[0] = n[0]/10;
		    }
		}
		System.out.println(n[0]);
	}
}
