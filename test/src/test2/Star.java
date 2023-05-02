package test2;


import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		
		//상단 -별의 개수 입력 
		System.out.println("별의 갯수를 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		
		
		int star = sc.nextInt();
		
		for(int i=1; i<=star; i++) {
			for(int j=1; j<=star-i; j++) {
				System.out.print("  ");
				
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//하단 입력받은 별의 개수에서 빼주기 
		for(int i=star-1; i>0; i-- ) {
			for(int j=star-1; j>=i; j--) {
				System.out.print("  ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
