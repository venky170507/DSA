package BinarySearch;

public class MinInRotArray {
    public static int findMin(int[] arr) {
        int min=Integer.MAX_VALUE;

        int n=arr.length,low=0,high=n-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(arr[low]<=arr[high])
            {
                min=Math.min(min, arr[low]);
                break;
            }

            if(arr[low]<=arr[mid])
            {
                min=Math.min(arr[low], min);
                low=mid+1;
            }
            else
            {
                min=Math.min(arr[mid], min);
                high=mid-1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr={7,8,9,0,1,2,3,4,5,6};

        int res=findMin(arr);
        System.out.println(res);
    }
}
