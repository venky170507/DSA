package ArrayProblems;

// import java.util.HashMap;

// import java.util.ArrayList;

public class TwoSum {

    public static int[] ArrayMethod(int[] nums , int target)
    {
        int left=0,right=1;
        for(int i=0;i<nums.length;i++)
        {
            if((nums[left]+nums[right])==target)
            {
                return new int[]{left,right};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        // ArrayList Approach 

        // int[] nums = {2,7,11,15};
        // ArrayList<Integer> out = new ArrayList<>();

        // int left = 1,right=0,target=9;

        // for(int i=0;i<nums.length;i++)
        // {
        //     if((nums[left]+nums[right])==target)
        //     {
        //         out.add(right);
        //         out.add(left); 
        //         break;
        //     }
        //     else 
        //     {
        //         left++;
        //         right++;
        //     }
        // }

        // System.out.println(out);

        // Hashmap Approach 

        // int[] nums = {2,7,11,15};
        // int target = 9;
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i=0;i<nums.length;i++)
        // {
        //     int required = target-nums[i];

        //     if(map.containsKey(required))
        //     {
        //         System.out.println(map.get(required)+" "+i);
        //         return;
        //     }

        //     map.put(nums[i], i);
        // }

        // System.out.println(map);



        // With Arrays - Two Pointer Approach

        int[] nums = {2,7,11,15};
        int target=9;
        int[] out = ArrayMethod(nums, target);
        for(int i : out)
        {
            System.out.print(i+" ");
        }
    }
}
