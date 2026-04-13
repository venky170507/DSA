package ArrayProblems;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4};
        int count = 0;

        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==num)
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(num);
                return;
            }
        }
    }
}
