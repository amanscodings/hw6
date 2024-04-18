import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       
        System.out.println(threeSum(new int[]{0, 1, 1})); 
        System.out.println(threeSum(new int[]{-5, 0, 5, 10, -10, 0}));  
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);  
        List<List<Integer>> result = new ArrayList<>(); 
        for (int i = 0; i < nums.length - 2; i++) {  
        
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1; 
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];  
                if (sum < 0) {
                    left++;  
                } else if (sum > 0) {
                    right--;  
                } else {
                 
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
           
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                }
            }
        }
        return result;
    }
}