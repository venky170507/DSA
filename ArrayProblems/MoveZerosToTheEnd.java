package ArrayProblems;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        // int[] arr={0,1,4,0,5,2};
        int[] arr = {0,1,0,0,2};

        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                int temp=arr[i];
                arr[i]=arr[n-1];
                arr[n-1]=temp;
                n--;
            }
        }

        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}
