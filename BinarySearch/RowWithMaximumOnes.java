package BinarySearch;

public class RowWithMaximumOnes {
    public static int rowWithMax1s(int[][] arr) {
       int maz=0,rownum=-1;

       for(int i=0;i<arr.length;i++)
       {
            int low=0,high=arr[i].length-1;
            int firstIndex=arr[i].length;

            while(low<=high)
            {
                int mid=low+(high-low)/2;

                if(arr[i][mid]==1)
                {
                    firstIndex=mid;
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            int cnt=arr[i].length-firstIndex;
            if(cnt>maz)
            {
                maz=cnt;
                rownum=i;
            }
       }
       return rownum;
    }
    public static void main(String[] args) {
        int[][] arr={{0,0,1,1,1},{0,0,0,0,0},{0,1,1,1,1},{0,0,0,0,0},{0,1,1,1,1}};

        int res = rowWithMax1s(arr);
        System.out.println(res);
    }
}
