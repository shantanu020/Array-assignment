package Array1d;

public class maxEle {
	public static void max(int arr[]) {
		int max=0;
		for(int i:arr) {
			if(max<i) {
				max=i;
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {34,21,54,65,43};
		int [] arr2= {4,3,6,7,1};
		max(arr1);
		max(arr2);
	}

}
