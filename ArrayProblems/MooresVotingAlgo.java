package ArrayProblems;

public class MooresVotingAlgo {
    public static int majorityElement(int[] arr) {
        int cnt=0,ele=0;

        for(int i=0;i<arr.length;i++)
        {
            if(cnt==0)
            {
                ele=arr[i];
                cnt=1;
            }
            else if(arr[i]==ele) cnt++;
            else cnt--;
        }

        int cnt1=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ele) cnt1++;
        }
        if(cnt1>(arr.length)/2) return ele;
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={7, 0, 0, 1, 7, 7, 2, 7, 7};
        int res = majorityElement(arr);
        System.out.println(res);
    }
}
