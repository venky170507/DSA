package ArrayProblems;

public class NoOfSubArraysWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};


        // // Brute - Force 

        // int count =0,sum=0,k=3;

        // for(int i=0;i<arr.length;i++)
        // {
        //     sum=0;
        //     for(int j=i;j<arr.length;j++)
        //     {
        //         sum+=arr[j];
        //         if(sum==k)
        //         {
        //             count++;
        //         }
        //     }
        // }

        // System.out.println(count);


        // Optimal 

        int count=0,left=0,sum=0,k=3;

        for(int right=0;right<arr.length;right++)
        {
            sum+=arr[right];

            // if(sum>k)
            // {
            //     sum-=arr[left];
            //     left++;
            // }

            if(sum==k)
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
