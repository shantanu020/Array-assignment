package Array1d;

public class SecondLargest {
	public static void maxS(int arr[]) {
		int max=0;
		int smax=0;
		for(int i:arr) {
			if(max<i) {
				smax=max;
				max=i;
			}
		}
		System.out.println(smax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int [] arr1= {34,21,54,65,43};
				int [] arr2= {4,3,6,7,1};
				maxS(arr1);
				maxS(arr2);
	}

}
