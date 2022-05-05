/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
		int n = 2;
		int [] number = new int [n];
		for (int i = 0; i < n; i++){
		    int input = scanner.nextInt();
		    number[i] = input;
		    
		}
		int b = number[0] * number [1];
		int c = b/2;
		
		System.out.println(c);
	}
}
