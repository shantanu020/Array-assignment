package Array2d;

import java.util.Scanner;

public class Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter row");
		int m=scan.nextInt();
		System.out.println("Enter column");
		int n=scan.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("Enter elemenets");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=scan.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i+j<2) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	   
		scan.close();
	}

}
