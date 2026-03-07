/*3512. Minimum Operations to Make Array Sum Divisible by K
You are given an integer array nums and an integer k. You can perform the following operation any number of times:

Select an index i and replace nums[i] with nums[i] - 1.
Return the minimum number of operations required to make the sum of the array divisible by k.*/
public class lc3512 {

	public static void main(String[] args) {
		int [] nums = {3,2};
		int k = 6;
		int sum=0;
		int len = nums.length;
		int anscount=0;
		int temp=0;
		for(int n:nums) {
			sum+=n;
		}
		int total = sum%k; //4
		for(int l=0;l<len;l++) {
			int r=0;

			if(nums[r]<total) { //3<4 --> r=4
				r++;
			}
			
			while(sum%k != 0) {
				temp=nums[r];
				nums[r] = temp-1;
				sum-=1;
				anscount++;
			}			
		}
		System.out.println(anscount);
	}

}
