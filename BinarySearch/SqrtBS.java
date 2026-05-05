package BinarySearch;

public class SqrtBS {
    public static int method(int n)
    {
        int low=1,high=n,ans=0;

        while (low<=high) 
        {
            int mid=low+(high-low)/2;

            if(mid*mid<=n)
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int n=28;
        int res = method(n);
        System.out.println(res);
    }
}
