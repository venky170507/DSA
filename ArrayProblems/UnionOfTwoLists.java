package ArrayProblems;

import java.util.ArrayList;

public class UnionOfTwoLists {
    public static void main(String[] args) {
        int[] a={1,1,1,1,2,3,4};
        int[] b={4,4,4,5,6,7};

        int n1=a.length;
        int n2=b.length;
        int i=0,j=0;

        int maxi=Math.max(n1, n2);

        ArrayList<Integer> unionArr=new ArrayList<>(maxi);
        while(i<n1 && j<n2)
        {
            if(a[i]<=b[j])
            {   
                if(unionArr.size()==0 || unionArr.get(unionArr.size()-1)!=a[i])
                {
                    unionArr.add(a[i]);
                }
                i++; 
            }
            else
            {
                if(unionArr.size()==0 || unionArr.get(unionArr.size()-1)!=b[j])
                {
                    unionArr.add(b[j]);
                }
                j++;
            }
        }

        while (j<n2) 
        {
            if(unionArr.size()==0 || unionArr.getLast()!=b[j])
            {
                unionArr.add(b[j]);
            }
            j++;
        }

        while (i<n1) 
        {
            if(unionArr.size()==0 || unionArr.getLast()!=a[i])
            {
                unionArr.add(a[i]);
            }
            i++;    
        }

        System.out.println(unionArr);
    }
}
