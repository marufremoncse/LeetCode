import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int nums[] = {3,3};
		int target = 6;
		int res[] = new int[2];
		res = twoSum(nums, target);
		System.out.println(res[0] +" "+ res[1]);
	}
	
	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hMap = new HashMap<>();
        int res[] = new int[2];
        
        for(int i=0;i<nums.length;i++) {
        	if(i>0) {
        		if(hMap.containsKey(target-nums[i])) {
        			res[0] = hMap.get(target-nums[i]);
        			res[1] = i;
        			break;
        		} else {
        			hMap.put(nums[i], i);
        		}
        	} else {
        		hMap.put(nums[i], i);
        	}
        }
        
        return res;
    }

}
