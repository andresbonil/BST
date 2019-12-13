
import java.util.Random;


public class Randp {
    private int[] nums;
    private int numsLeft;
	
    public Randp(int n) {
        initNums(n);
    }
	
    private void initNums(int n) {
    	nums = new int[n];
        numsLeft = n; 
        for (int i = 0; i < n; i++){
        	nums [i] = i + 1;
        }
    }
    
//    private void toShuffle (int a, int b) {
//    	int tempLoc = nums[a];
//    	nums[a]= nums[b];
//    	nums[b] = tempLoc;
//    	
//    }
    
//    private void Shuffle() {
//    	for (int i=0 ; i<nums.length; i++)
//    	{
//   
//    		toShuffle(i, nums.));
//    	}
//    	
//    }
	
    public int nextInt() {
    		if (numsLeft == 0) return 0;
    		int index = (int) (numsLeft * Math.random());
    		numsLeft --;
    		swap(index,numsLeft);
    		return nums[numsLeft];
    }
    
    public void swap (int a, int b) {
    	int tempLoc = nums[a];
   	nums[a]= nums[b];
  	nums[b] = tempLoc;
    		
    	
        // Math.random() should never be called more than once
        // when this method is called.  Recursion is not allowed.
    	
        
    }
}