import java.util.*;

public class MergeAndSortArrays
{
	public static void main(String[] args) {
	    Integer a[] = {2,5,3};
	    Integer b[] = {6,8,3,1};
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    Collections.addAll(list, a);
	    Collections.addAll(list, b);
	    Collections.sort(list);
		System.out.println("Merged sorted Arrays : " + list);
	}
}
