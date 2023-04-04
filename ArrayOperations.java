import java.util.Arrays;

public class ArrayOperations
{
	public static void main(String[] args) {
	    int a[] = {1,2,3,4};
	    int index = 2, value = 5;
	    insert(a, index, value, a.length);
	    System.out.println("a : " + Arrays.toString(a));
	    delete(a, index, a.length);
		System.out.println("a : " + Arrays.toString(a));
	}
	
	public static int[] insert(int[] a,int index, int value, int n) {
	    for(int i = index; i<n-1; i++) {
	        a[i+1] = a[i];
	    }
	    a[index] = value;
	    return a;
	}
	
	public static int[] delete(int[] a,int index, int n) {
	    for(int i = index; i<n-1; i++) {
	        a[i] = a[i+1];
	    }
	    return a;
	}
}
