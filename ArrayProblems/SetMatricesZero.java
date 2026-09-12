package ArrayProblems;

public class SetMatricesZero {

    // // Brute Force Approach
    // public static void markRows(int i,int columns,int[][] matrix)
    // {
    //     for(int j=0;j<columns;j++)
    //     {
    //         if(matrix[i][j]!=0) matrix[i][j]=-1;
    //     }
    // }
    // public static void markColumns(int j,int rows,int[][] matrix)
    // {
    //     for(int i=0;i<rows;i++)
    //     {
    //         if(matrix[i][j]!=0) matrix[i][j]=-1;
    //     }
    // }
    // public static void setZeroes(int[][] matrix) {
    //     int rows=matrix.length,column=matrix[0].length;

    //     for(int i=0;i<rows;i++)
    //     {
    //         for(int j=0;j<column;j++)
    //         {
    //             if(matrix[i][j]==0)
    //             {
    //                 markRows(i,column,matrix);
    //                 markColumns(j,rows,matrix);
    //             }
    //         }
    //     }

    //     for(int i=0;i<rows;i++)
    //     {
    //         for(int j=0;j<column;j++)
    //         {
    //             if(matrix[i][j]==-1) matrix[i][j]=0;
    //         }
    //     }
    // }
    



    // // Better Apprach 

    // public void setZeroes(int[][] matrix) {
    //     int rows=matrix.length,column=matrix[0].length;

    //     int[] rowarr=new int[rows];
    //     int[] colarr=new int[column];

    //     for(int i=0;i<rows;i++)
    //     {
    //         for(int j=0;j<column;j++)
    //         {
    //             if(matrix[i][j]==0)
    //             {
    //                 rowarr[i]=1;
    //                 colarr[j]=1;
    //             }
    //         }
    //     }

    //     for(int i=0;i<rows;i++)
    //     {
    //         for(int j=0;j<column;j++)
    //         {
    //             if(rowarr[i]==1 || colarr[j]==1)
    //             {
    //                 matrix[i][j]=0;
    //             }
    //         }
    //     }
    // }


    // Optimal Approach 
    
    public static void main(String[] args) {
        
    }
}
