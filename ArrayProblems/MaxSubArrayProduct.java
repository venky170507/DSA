package ArrayProblems;

public class MaxSubArrayProduct {
    public static void main(String[] args) {
        int[] arr={2,3,-1,4};
        int pre =1,suf=1;
        int ans = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(pre==0) pre=1;
            if(suf==0) suf=1;

            pre=pre*arr[i];
            suf=suf*arr[arr.length-i-1];
            ans=Math.max(ans, Math.max(pre, suf));
        }

        System.out.println(ans);
    }
}
