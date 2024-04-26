package Array2d;

import java.util.Scanner;

public class Large {

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
		int max=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
	   System.out.println(max);
		scan.close();
	}

}
