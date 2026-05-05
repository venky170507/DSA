package BinarySearch;

public class PeakElementIn2DMatrix {
    public static int findMatrixIndex(int[][] arr,int n,int m,int col)
    {
        int maxvalue=-1,index=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i][col]>maxvalue)
            {
                maxvalue=arr[i][col];
                index=i;
            }
        }

        return index;
    }
    public static int[] findPeakGrid(int[][] arr) {
        int n=arr.length,m=arr[0].length;
        int low=0,high=m-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            int maxRowIndex=findMatrixIndex(arr, n, m, mid);
            int left=(mid-1>=0)?arr[maxRowIndex][mid-1]:-1;
            int right=(mid+1<m)?arr[maxRowIndex][mid+1]:-1;

            if(arr[maxRowIndex][mid]>left && arr[maxRowIndex][mid]>right) return new int[]{maxRowIndex,mid};
            else if (arr[maxRowIndex][mid]<left) high=mid-1;
            else low=mid+1;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr={{10,20,15},{21,30,14},{7,16,32}};

        int[] res = findPeakGrid(arr);

        System.out.println(res[0]+" "+res[1]);
    }
}
