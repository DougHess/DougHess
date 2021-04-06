package leetCode;

import java.util.Arrays;

public class TwoSum {
	
	public static void main(String agrs[]) {
		int[] num = {9,26,13,24,51};
		int t = 37;
		int[] n = twoSum(num,t);
		System.out.println(Arrays.toString(n));
	}
	    public static int[] twoSum(int[] nums, int target) {
	        int[] ahri = new int[2];
	        int i = 0;
	        int j=1;
	        boolean found = false;
	        for(i = 0; i < nums.length && found ==false ; i++) {
	        	for (j=i+1 ;j<nums.length;j++) {
		        	if (target==nums[i] + nums[j]) {
		        		ahri[0]=i;
		        		ahri[1]=j;
		        		found=true;
		        		break;
		        	}
	        	}
	        }
	        return ahri;
	}
}
