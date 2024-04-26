package Array1d;

public class AllEven {
	public static void allEven(int [] arr) {
		for(int ele:arr) {
			if(ele%2==0) {
				System.out.print(ele+" ");
			}
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {34,21,54,65,43};
		int arr2[]= {4,3,6,7,1};
		allEven(arr1);
		allEven(arr2);
	}

}
