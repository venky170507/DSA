package BinarySearch;

public class SearchIn2DMatrix_I {
    public static boolean searchMatrix(int[][] arr, int target) {
        int n=arr.length,m=arr[0].length;
        
        int low=0,high=n*m-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            int row=mid/m,col=mid%4;

            if(arr[row][col]==target) return true;
            else if(arr[row][col]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=5;

        System.out.println(searchMatrix(arr, target));
    }
}
