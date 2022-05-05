import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int [] n = new int [3];
		int a = 0;
		for (int i = 0; i < 3; i ++){
		    int input = scanner.nextInt();
		    n[i] = input;
		}
		int k = n[0];
		for (int w = 0; w < n[2]+1; w++){
		    a += w*k;
		    
		}
		int b = a - n[1];
		if (b > 0){
		    System.out.println(b);
	}
	    else {
	        System.out.println(0);
	    }
	
}
}
