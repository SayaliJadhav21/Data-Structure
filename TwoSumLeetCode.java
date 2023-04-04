public class TwoSumLeetCode
{
    //Time complexity O(n^2)
	public static void main(String[] args) {
	    int[] nums = {2,7,11,15};
	    int target = 9;
	    int index1=0, index2=index1+1;
	    int flag = 0;
	    while(nums[index1] + nums[index2] != target) {
	        int rem = target - nums[index1];
	        for(int i=index1+1;i<nums.length;i++) {
    	       if(nums[i]==rem) {
    	            index2 = i;
    	            flag =1;
    	            break;
    	       }
    	    }
    	    if(flag == 1)
    	        break;
    	    else
    	        index1 = index1+1;
	    }
		System.out.println("["+index1+ ", "+ index2 + "]");
	}

    //Another solution (Time Efficient O(n))
    public static int[] twoSum(int[] nums, int target) {
        
        int res[] = new int[2];
        int sum = target;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=1;i<nums.length;i++) {
            map.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++) {
            sum = target - nums[i];
            if(map.containsKey(sum) && i!=map.get(sum)) {
                res[0]=i;
                res[1]=map.get(sum);
                break;
            }
        }        
        return res;
        
    }
}
