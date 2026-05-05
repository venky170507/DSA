package BinarySearch;

public class KthElementOfTwoSortedArrays {
    public static int kthElement(int[] a, int[] b, int k) {
        int ans=k;

        int i=0,j=0,cnt=1;
        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                if(cnt==k) ans=a[i];
                cnt++;
                i++;
            }
            else
            {
               if(cnt==k) ans=b[j];
               cnt++;
               j++;
            }
        }

        while(i<a.length)
        {
            if(cnt==k) ans=a[i];
            cnt++;
            i++;
        }

        while(j<b.length)
        {
            if(cnt==k) ans=b[j];
            cnt++;
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={2,3,6,7,9};
        int[] b={1,4,8,10};
        int k=5;

        int res=kthElement(a, b, k);
        System.out.println(res);
    }
}
