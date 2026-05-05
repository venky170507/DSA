package BinarySearch;

public class ShipCapacity {
    public static int helperFunc(int[] weights,int capacity)
    {
        int nodays=1,load=0;

        for(int i:weights)
        {
            if(load+i>capacity)
            {
                nodays+=1;
                load=i;
            }
            else
            {
                load+=i;
            }
        }
        return nodays;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int ans=0;

        int maxi=0,sum=0;
        for(int i : weights)
        {
            maxi=Math.max(maxi, i);
            sum+=i;
        }

        int low=maxi,high=sum;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            int numdays=helperFunc(weights, mid);
            if(numdays<=days)
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
        int[] weigths={1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        int res=shipWithinDays(weigths, days);
        System.out.println(res);
    }
}
