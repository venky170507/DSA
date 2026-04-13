package ArrayProblems;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int wc=0,rc=0,bc=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                wc++;
            }
            else if(nums[i]==1)
            {
                rc++;
            }
            else 
            {
                bc++;
            }
        }

        for(int i=0;i<wc;i++)
        {
            nums[i]=0;
        }
        for(int i=wc;i<wc+rc;i++)
        {
            nums[i]=1;
        }
        for(int i=wc+rc;i<nums.length;i++)
        {
            nums[i]=2;
        }

        for(int i : nums)
        {
            System.out.print(i+" ");
        }
    }
}
