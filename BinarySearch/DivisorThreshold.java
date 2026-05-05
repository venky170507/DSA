package BinarySearch;

public class DivisorThreshold {
    public static int smallestDivisor(int[] arr, int threshold) {
        int ans=-1;

        int maxi=Integer.MIN_VALUE;

        for(int i : arr)
        {
            maxi=Math.max(maxi, i);
        }
        int low=1,high=maxi;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int sum=0;

            for(int i=0;i<arr.length;i++)
            {
                sum+=Math.ceil((double)arr[i]/mid);
            }

            if(sum<=threshold)
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
        int[] arr={1,2,5,9};
        int t=6;

        int res=smallestDivisor(arr, t);
        System.out.println(res);
    }
}
