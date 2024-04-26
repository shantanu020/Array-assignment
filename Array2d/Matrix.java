package Array2d;
import java.util.Scanner;
public class Matrix {

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
	    int pc=0;
	    int nc=0;
	    int oc=0;
	    int ec=0;
	    int zc=0;

		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]>0) {
					pc++;
				}
				else if(arr[i][j]<0) {
					nc++;
				}else {
					zc++;
				}
				if(arr[i][j]%2==0) {
					ec++;
				}else {
					oc++;
				}
			}
		}
		System.out.println("number of positive numbers\r"
				+pc+ "\r\n"
				+ "number of negative numbers\r"
				+nc+"\r\n"
				+ "number of odd numbers\r"
				+oc+"\r\n"
				+"number of even numbers\r"+ec+"\r\n"+"number of 0\r"+zc);
		scan.close();
	}

}
