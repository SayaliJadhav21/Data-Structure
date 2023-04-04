import java.util.Arrays;

public class MergeSortedArrays
{
	public static void main(String[] args) {
	    int[] a = {1,4,7,8};
	    int[] b = {2,5,6};
	    int[] mergedArray = new int[7];
	    if(a.length==0) {
	        System.out.println("Merged array : " + Arrays.toString(b));
	    }
	    if(b.length==0) {
	        System.out.println("Merged array : " + Arrays.toString(a));
	    }
	    int i=0,k=0,j=0;
	    for(;i<a.length && k<b.length;) {
	        if(a[i] < b[k]) {
	            mergedArray[j++] = a[i];
	            i++;
	        } else {
	            mergedArray[j++] = b[k];
	            k++;
	        }
	    }
	    while(i<a.length) {
	        mergedArray[j++] = a[i++];
	    }
	    while(k<b.length) {
	        mergedArray[j++] = b[k++];
	    }
		System.out.println("Merged array : " + Arrays.toString(mergedArray));
	}
}
