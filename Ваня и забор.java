import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int a = 0;
		int [] n = new int [2];
		for (int i = 0; i < 2; i++){
		    int input = scanner.nextInt();
		    n[i] = input;
		}
		int [] b = new int [n[0]];
		for (int i = 0; i < n[0]; i++){
		    int input = scanner.nextInt();
		    b[i] = input;
		}
		for (int i = 0; i < n[0]; i++){
		    if (b[i] <= n[1]){
		        a +=1;
		    }
		    else{
		        a+=2;
		    }
		}	
		System.out.println(a);
		}
	
	}

