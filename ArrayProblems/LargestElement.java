package ArrayProblems;

public class LargestElement {
    public static void main(String[] args) {
//         Given an array of integers nums, return the value of the largest element in the array
            // Example 1
            // Input: nums = [3, 3, 6, 1]
            // Output: 6
            // Explanation: The largest element in array is 6
            // Example 2
            // Input: nums = [3, 3, 0, 99, -40]
            // Output: 99
            // Explanation: The largest element in array is 99

            int[] nums = {3,3,6,1};
            int largest = nums[0];
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>largest)
                {
                    largest=nums[i];
                }
            }


            System.out.println(largest);


            // Brute-Force Approach :- First Sort the Array and then find the last Element (As the Last is the Larger Element)
            // Better :- There is no better solution for this 
            // Optimal :- The way i have solved is optimal
    }
}
