package BinarySearch;

public class KokoEatingBananas {
    public static int findMax(int[] arr) {
        int max=arr[0];

        for(int i : arr)
        {
            if (i>max) max=i;
        }
        return max;
    }
    public static int helperMethod(int[] arr , int hours)
    {
        int totalhrs=0;
        for(int i=0;i<arr.length;i++)
        {
            totalhrs+=Math.ceil((double)arr[i]/hours);
        }
        return totalhrs;
    }
    public static int minEatingSpeed(int[] piles, int h,int maxi) {
        int low=1,high=maxi;
        int ans=0;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int totalh=helperMethod(piles, mid);
            if(totalh<=h) 
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={30,11,23,4,20};
        int maxiel=findMax(arr);

        int res=minEatingSpeed(arr, 5, maxiel);
        System.out.println(res);
    }
}
