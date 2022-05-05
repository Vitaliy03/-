import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int n = scanner.nextInt();
		int a = 0;
		int [][] b = new int [n][2];
		for (int i = 0; i < n; i++){
		    for (int j = 0; j < 2; j++){
		        int input = scanner.nextInt();
		        b [i][j] = input;
		    }
		}
		for (int i = 0; i < n; i++){
		    if (((b [i][1]) - (b[i][0])) >= 2){
		            a +=1;
		        }
		        else {
		            a +=0;
		      }
		      
		}
	
		System.out.println(a);
}
}
	
	

