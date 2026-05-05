package BinarySearch;

public class RowWithMaxOnesOptimal {
    public static int rowWithMax1s(int[][] arr) {
        int rowNum=-1;

        int n=arr.length;
        int m=arr[0].length;

        int j=m-1;
        for(int i=0;i<n;i++)
        {
            while(j>=0 && arr[i][j]==1)
            {
                j--;
                rowNum=i;
            }
        }
        return rowNum;
    }
    public static void main(String[] args) {
        int[][] arr={{0,0,1,1,1},{0,0,0,0,0},{0,1,1,1,1},{0,0,0,0,0},{0,1,1,1,1}};

        int res=rowWithMax1s(arr);
        System.out.println(res);
    }
}
