package ArrayProblems;

public class SecondLargest {
    public static void main(String[] args) {
        // Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.
        // Example 1
        // Input: nums = [8, 8, 7, 6, 5]
        // Output: 7
        // Explanation:
        // The largest value in nums is 8, the second largest is 7
        // Example 2
        // Input: nums = [10, 10, 10, 10, 10]
        // Output: -1
        // Explanation:
        // The only value in nums is 10, so there is no second largest value, thus -1 is returned

        // // Better Solution 

        int[] nums = {8,8,7,6,5};

        // int largest = nums[0];
        // int secondLargestElement = -1;

        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]>largest)
        //     {
        //         largest=nums[i];
        //     }
        // }

        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]>secondLargestElement && nums[i]!=largest)
        //     {
        //         secondLargestElement=nums[i];
        //     }
        // }

        // System.out.println(secondLargestElement);


        // Optinmal Solution 

        int lar=nums[0];
        int seconlar=-1;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>lar)
            {
                seconlar=lar;
                lar=nums[i];
            }

            if(nums[i]>seconlar && nums[i]!=lar)
            {
                seconlar=nums[i];
            }
        }

        System.out.println(seconlar);
    }
}
