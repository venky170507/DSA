package BinarySearch;

public class FirstAndLastOccur {
    // public static int lower(int[] arr , int target)
    // {
    //     int left=0,right=arr.length-1;
    //     int ans=arr.length;

    //     while (left<=right) 
    //     {
    //         int mid=left+(right-left)/2;
    //         if(arr[mid]>=target)
    //         {
    //             ans=mid;
    //             right=mid-1;
    //         }
    //         else{
    //             left=mid+1;
    //         }
    //     }
    //     return ans;
    // }
    // public static int Upper(int[] arr , int target)
    // {
    //     int left=0,right=arr.length-1;
    //     int ans=arr.length;

    //     while (left<=right) 
    //     {
    //         int mid=left+(right-left)/2;
    //         if(arr[mid]>target)
    //         {
    //             ans=mid;
    //             right=mid-1;
    //         }    
    //         else
    //         {
    //             left=mid+1;
    //         }
    //     }
    //     return ans;
    // }
    // public static int[] searchRange(int[] arr, int target) {
    //     int lb=lower(arr, target);
    //     if(lb==arr.length || arr[lb]!=target) return new int[]{-1,-1};
    //     return new int[]{lb,Upper(arr, target)-1};
    // }

    public static int first(int[] arr,int target)
    {
        int first=-1,n=arr.length,low=0,high=n-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(arr[mid]==target)
            {
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }

        return first;
    }

    public static int last(int[] arr , int target)
    {
        int n=arr.length,last=-1,low=0,high=n-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(arr[mid]==target)
            {
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }

        return last;
    }
    public static int[] searchRange(int[] arr, int target)
    {
            int n=arr.length;
            int low=0,high=n-1,first=-1,last=-1;

            int f=first(arr, target);
            int l=last(arr, target);

            return new int[]{f,l};
    }
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=8;

        int[] res=searchRange(arr, target);
        System.out.println("First: "+res[0]+" Last : "+res[1]);

        if(res[0]==-1)
        {
            System.out.println("Element Not Found");
        }
        else
        {
            System.out.println("Occurences of "+target+" is "+(res[1]-res[0]+1));
        }
    }
}
