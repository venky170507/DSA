package ArrayProblems;

public class LeftRotate_D_Places {

    public static void reversal(int[] arr , int start , int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6};

        // int d=10;
        // int n=arr.length;
        // d=d%n;
        // while(d>0)
        // {
        //     int temp=arr[0];
        //     for(int i=0;i<arr.length-1;i++)
        //     { 
        //         arr[i]=arr[i+1];
        //     }
        //     arr[arr.length-1]=temp;
        //     d--;
        // }

        // for(int i : arr)
        // {
        //     System.out.print(i+" ");
        // }



        // // Another Approach

        // int[] arr = {1,2,3,4,5,6,7};
        // int d=10,n=arr.length;

        // d=d%n;

        // int[] temp = new int[d];

        // for(int i=0;i<d;i++)
        // {
        //     temp[i] = arr[i];
        // }

        // for(int i=d;i<n;i++)
        // {
        //     arr[i-d]=arr[i];
        // }

        // for(int i=0;i<d;i++)
        // {
        //     arr[n-d+i]=temp[i];
        // }

        // for(int i : arr)
        // {
        //     System.out.print(i+" ");
        // }



        // Most Optimal Approach 

        int[] arr = {1,2,3,4,5,6,7};

        int d=4,n=arr.length;
        d=d%n;

        reversal(arr, 0, d-1);

        reversal(arr, d, n-1);

        reversal(arr, 0, n-1);

        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }    
}
