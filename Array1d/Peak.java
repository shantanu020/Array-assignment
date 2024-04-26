package Array1d;

public class Peak {
	public static void peak(int [] arr) {
		int n=arr.length;
		int ele=0;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]) {
				if(arr[i]>ele) {
					ele=arr[i];
				}
			}
			
		}
		System.out.println(ele);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,3,2,6,5};
		int arr2[]= {1,4,7,3,2,6,5};
		peak(arr1);
		peak(arr2);
	}

}
