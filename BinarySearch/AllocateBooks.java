package BinarySearch;

public class AllocateBooks {
    public static int helper(int[] arr , int mid)
    {
        int stu=1,pagesCount=0;

        for(int i=0;i<arr.length;i++)
        {
            if(pagesCount+arr[i]<=mid)
            {
                pagesCount+=arr[i];
            }
            else
            {
                stu++;
                pagesCount=arr[i];
            }
        }
        return stu;
    }
    public static int findPages(int[] arr, int m) {
        int maxi=arr[0],sum=0;

        if(m>arr.length) return -1;
        for(int i : arr)
        {
            maxi=Math.max(maxi, i);
            sum+=i;
        }

        int low=maxi,high=sum;


        while(low<=high)
        {
            int mid=low+(high-low)/2;

            int noOfStu=helper(arr, mid);
            if(noOfStu>m) low=mid+1;
            else high=mid-1;            
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr={12,34,67,90};
        int m=2;

        int res=findPages(arr, m);

        System.out.println(res);
    }
}
