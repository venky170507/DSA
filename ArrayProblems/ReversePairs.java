package ArrayProblems;

public class ReversePairs {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        int n=arr.length,count=0;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(i<j && arr[i]>2*arr[j])
                {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
