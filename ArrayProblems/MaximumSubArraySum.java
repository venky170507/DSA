package ArrayProblems;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        // int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr = {5,4,-1,7,8};

        // int max=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     int sum=0;
        //     for(int j=i;j<arr.length;j++)
        //     {
        //         sum+=arr[j];

        //         if(sum>max)
        //         {
        //             max=sum;
        //         }
        //     }
        // }

        // System.out.println(max);


        // Kadane's Algorithm 

        int max=0;
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];

            if(sum>max)
            {
                max=sum;
            }

            if(sum<0)
            {
                sum=0;
            }
        }


        if(max<0)
        {
            System.out.println();
        }
        else
        {
            System.out.println(max);
        }
    }
}
