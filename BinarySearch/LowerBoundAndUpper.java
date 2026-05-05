package BinarySearch;

public class LowerBoundAndUpper {
    public static int lower(int[] arr , int target)
    {
        int left=0,right=arr.length-1;
        int ans=arr.length;

        while (left<=right) 
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>=target)
            {
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    public static int Upper(int[] arr , int target)
    {
        int left=0,right=arr.length-1;
        int ans=arr.length;

        while (left<=right) 
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>target)
            {
                ans=mid;
                right=mid-1;
            }    
            else
            {
                left=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,9,9,11};
        int target=9;

        int lower_Index=lower(arr, target);
        if(lower_Index<arr.length)
        {
            System.out.println("Lower Bound : "+lower_Index);
        }
        else
        {
            System.out.println("No Element Found!");
        }


        int Upper_Index=Upper(arr, target);
        if(Upper_Index<arr.length)
        {
            System.out.println("Upper Bound : "+Upper_Index);
        }
        else
        {
            System.out.println("No Element Found!");
        }
    }
}
