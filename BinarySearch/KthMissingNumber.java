package BinarySearch;

public class KthMissingNumber {

    public static int findKthPositive(int[] arr, int k) {
        int low=0,high=arr.length-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            int miss=arr[mid]-(mid+1);

            if(miss<k) low=mid+1;
            else high=mid-1;
        }

        return low+k;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,7,11};
        int k=5;

        System.out.println("Number : "+findKthPositive(arr, k)); 
    }
}
