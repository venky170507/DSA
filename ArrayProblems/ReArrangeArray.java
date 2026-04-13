package ArrayProblems;

public class ReArrangeArray {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};

        int[] res = new int[nums.length];
        int p=0,n=1;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                res[p]=nums[i];
                p+=2;
            }
            else
            {
                res[n]=nums[i];
                n+=2;
            }
        }

        for(int i : res)
        {
            System.out.print(i+" ");
        }
    }
}
