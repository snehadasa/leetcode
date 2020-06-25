import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
	
	public static void reverseMethod1(String arr[]) {
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr));
	}
	
	public static void reverseMethod2(String arr[], int n) {
		int i;
		String dummy;
		
		for(i = 0; i < n/2; i++) {
			dummy = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = dummy;
		}
		
			System.out.println(Arrays.asList(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"I", "am", "Sneha", "Dasa"};
		reverseMethod2(arr, arr.length);
	}

}
