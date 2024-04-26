package Array1d;

public class EvenSum {
	public static void evenSum(int [] arr) {
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i+=2) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {3,20,4,6,9};
		int arr2[]= {4,3,6,7,1};
		evenSum(arr1);
		evenSum(arr2);
	}

}
