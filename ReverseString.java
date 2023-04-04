import java.util.Arrays;
public class ReverseString
{
	public static void main(String[] args) {
	    String s = "abc";
	    char[] a = s.toCharArray();
	    int n = a.length;
	    for(int i=0; i < n/2; i++) {
	        char temp = a[i];
	        a[i]= a[n-1-i];
	        a[n-1-i] = temp;
	    }
	    s = s.valueOf(a);
		System.out.println("Reversed String : " + s);
	}
}
