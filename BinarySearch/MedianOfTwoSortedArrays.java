package BinarySearch;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        double ans=0;
        int n1=arr1.length,n2=arr2.length,i=0,j=0;

        int n=(n1+n2);
        int ind2=n/2,ind1=ind2-1;
        int cnt=0;
        int indele1=-1,intele2=-1;

        while(i<n1 && j<n2)
        {
            if(arr1[i]<arr2[j])
            {
                if(cnt==ind1) indele1=arr1[i];
                if(cnt==ind2) intele2=arr1[i];
                cnt++;
                i++;
            }
            else
            {
                if(cnt==ind1) indele1=arr2[j];
                if(cnt==ind2) intele2=arr2[j];
                cnt++;
                j++;
            }
        }

        while(i<n1)
        {
            if(cnt==ind1) indele1=arr1[i];
            if(cnt==ind2) intele2=arr1[i];
            cnt++;
            i++;
        }

        while(j<n2)
        {
            if(cnt==ind1) indele1=arr2[j];
            if(cnt==ind2) intele2=arr2[j];
            cnt++;
            j++;
        }

        if(n%2==1)
        {
            ans=(double)intele2;
        }
        else
        {
            ans=(double)(indele1+intele2)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1={1,3};
        int[] arr2={2};

        double res=findMedianSortedArrays(arr1, arr2);
        System.out.println(res);
    }
}
