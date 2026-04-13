package ArrayProblems;

public class RotateArrayby90 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;

        // Brute -


        // int[][] res=new int[n][n];
        
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         res[j][n-i-1]=arr[i][j];
        //     }
        // }
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         System.out.print(res[i][j]+" ");
        //     }
        //     System.out.println();
        // }



        // In-Place Method

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            int left = 0,right=n-1;

            while(left<right)
            {
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                
                left++;
                right--;

            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
