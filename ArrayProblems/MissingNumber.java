package ArrayProblems;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8,9};

        // Approach 1

        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]!=i+1)
        //     {
        //         System.out.println("Number "+(i+1)+" is Missing!");
        //         return;
        //     }
        // }



        // // Approach - 2

        // int actualSum=0;
        // int OrigiSum =0;

        // int n= arr.length+1;
        // actualSum=(n*(n+1))/2;
        // for(int i=0;i<arr.length;i++)
        // {
        //     OrigiSum+=arr[i];
        // }

        // System.out.println(actualSum+" "+OrigiSum);
        // System.out.println("Missng Number: "+(actualSum-OrigiSum));



        // Approach - 3

        // Xor of any Number by Iteself is Zero (a^a=0)
        // Ex :- 2^2=0 , 0^2=2


        int xor1=0,xor2=0;

        int n=arr.length+1;
        for(int i=1;i<=n;i++)
        {
            xor1^=i;
        }

        for(int num : arr)
        {   xor2^=num;

        }

        System.out.println("Missing Number : "+(xor1^xor2));
    }
}
