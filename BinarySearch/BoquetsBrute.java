package BinarySearch;


public class BoquetsBrute {
    public static boolean possibilityCheck(int[] arr,int day,int m , int k)
    {
        int count=0,NoOfBoquest=0,n=arr.length;

        for(int i=0;i<n;i++)
        {
            if(arr[i]<=day)
            {
                count++;
            }
            else
            {
                NoOfBoquest+=(count/k);
                count=0;
            }
        }
        NoOfBoquest+=(count/k);
        if(NoOfBoquest>=m) return true;
        else return false;
    }
    public static int minDays(int[] arr, int m, int k) {
        int n=arr.length,ans=0;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

        if(m*k>n) return-1;

        for(int i : arr)
        {
            min=Math.min(min, i);
            max=Math.max(max, i);  
        }

        int low=min,high=max;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(possibilityCheck(arr, mid, m, k)==true) 
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
        int[] arr={1,10,3,10,2};
        int m=3,k=1;
        
        int res=minDays(arr, m, k);
        System.out.println(res);
    }
}
