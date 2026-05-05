package BinarySearch;

public class BinarySearchRec {
    public static int bs(int[] arr , int left , int right , int target)
    {
        int mid = left+(right-left)/2;
        if(left>right)
        {
            return -1;
        }
        if(arr[mid]==target)
        {
            return mid;
        }
        else if(arr[mid]>target)
        {
            return bs(arr, left, mid-1, target);
        }
        else 
        {
            return bs(arr, mid+1, right, target);
        }
        // return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,8,9};
        int target = 9,left=0,right=arr.length-1;

        int res=bs(arr, left, right, target);
        if(res!=-1)
        {
            System.out.println("Element Found At Index : "+res);
        }
        else
        {
            System.out.println("Element Not Found!");
        }
    }
}
