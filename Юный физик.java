import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
		int n = scanner.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		int [][] numbers = new int [n][3];
		for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int input = scanner.nextInt();
                numbers[i][j] = input;
            }   
        }
        for (int i = 0; i < numbers.length; i++) {
            a +=numbers [i][0]; 
        }
        for (int i = 0; i < numbers.length; i++) {
            b +=numbers [i][1];
        }
        for (int i = 0; i < numbers.length; i++){
            c += numbers[i][2];
        }    
        if ((a == 0) & (b == 0) & (c == 0)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
	}
	}


