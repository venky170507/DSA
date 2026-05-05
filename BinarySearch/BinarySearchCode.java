package BinarySearch;

public class BinarySearchCode {
    public static int searchCode(int[] arr , int tar)
    {
        int left=0,right=arr.length-1;

        while(left<=right)
        {
            int mid = left+(right-left)/2;

            if(arr[mid]==tar)
            {
                return mid;
            }
            else if(arr[mid]<tar)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,12,14};
        int target=10;

        int result = searchCode(arr, target);

        if(result!=-1)
        {
            System.out.println("Element Found at index: "+result);
        }
        else
        {
            System.out.println("Element Not Found!");
        }
    }
}
