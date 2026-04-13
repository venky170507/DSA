package ArrayProblems;


public class LongestSubArraywithSumk {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        // int[] arr = {1,2,3,4,5,6};


        // Brute-Force Appraoch 

        // int k=8;
        // int len=0,max=0,sum=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     sum=0;
        //     len=0;
        //     for(int j=i;j<arr.length;j++)
        //     {
        //         sum+=arr[j];
        //         len++;
        //         if(sum==k)
        //         {
        //             max=Math.max(max, len);
        //         }
        //     }
        // }

        // System.out.println("Final Long Length: "+max);



        // Sliding Window Approach 

        int maxlen=0,sum=0,left=0,k=3;

        for(int right=0;right<arr.length;right++)
        {
            sum+=arr[right];

            while (sum>k) 
            {
                sum-=arr[left];
                left++;    
            }

            if(sum==k)
            {
                maxlen=Math.max(maxlen, right-left+1);
            }
        }

        System.out.println("Maximum Length: "+maxlen);
    }
}
