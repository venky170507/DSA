package ArrayProblems;

import java.util.ArrayList;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] A = {1,2,2,3,3,4,5,6};
        int[] B = {2,3,3,5,6,7};

        int n1=A.length;
        int n2=B.length;

        int i=0,j=0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (i<n1 && j<n2) 
        {
            if(A[i] < B[j])
            {
                i++;
            }
            else if (B[j]<A[i]) 
            {
                i++;    
            } 
            else
            {
                ans.add(A[i]);
                i++;j++;
            }
        }

        System.out.println(ans);
    }
}
