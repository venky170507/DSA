package BinarySearch;

public class SearchInsertPosition {
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
        int[] arr={1,3,5,6};
        int target = 4;
        int ans=0;

        int res = searchCode(arr, target);
        if(res!=-1)
        {
            ans=res;
            System.out.println("Element found at Index : "+res);
        }
        else
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]<target && arr[i+1]>target)
                {
                    ans=i+1;
                    System.out.println("Element Not Found an can insert here : "+(i+1));
                    break;
                }
            }
        }
   } 
}
