package BinarySearch;

public class FloorAndCeil {

    public static int[] getFloorAndCeil(int[] arr, int x) {
       int n=arr.length;
       int ceil=-1,floor=-1;

       int left=0,right=n-1;

       while(left<=right)
       {
            int mid = left+(right-left)/2;

            if(arr[mid]==x)
            {
                return new int[]{x,x};
            }
            else if(arr[mid]<x)
            {
                floor=arr[mid];
                left=mid+1;
            }
            else
            {
                ceil=arr[mid];
                right=mid-1;
            }
       }

       return new int[]{floor,ceil};
    }
    public static void main(String[] args) {
        int[] arr={3,4,4,7,8,10};
        int target=5;

        int[] res = getFloorAndCeil(arr, target);
        System.out.println("Floor: "+res[0]+" Ceil: "+res[1]);
    }
}
