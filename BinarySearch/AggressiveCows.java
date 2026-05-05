package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static boolean canWePlace(int[] arr , int dist , int cows)
    {
        int cntCows=1,last=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-dist>=dist)
            {
                cntCows++;
                last=arr[i];
            }
            if(cntCows>=dist) return true; 
        }
        return false;
    }
    public static int AggressiveCowss(int[] arr , int k)
    {
        Arrays.sort(arr);
        int n=arr.length,low = 1 ,high=arr[n-1]-arr[0];

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(canWePlace(arr, mid, k)==true)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }

        return high;
    }
    public static void main(String[] args) {
        int[] arr={0,3,4,7,10,9};
        int k=4;

        int res = AggressiveCowss(arr, k);

        System.out.println(res);
    }
}
