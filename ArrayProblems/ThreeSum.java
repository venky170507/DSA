package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};


        // Brute - Force (Time Limit Exceeded)
        // List<List<Integer>> res = new ArrayList<>();
        // Set<List<Integer>> st = new HashSet<>();

        // int n= arr.length;

        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         for(int k=j+1;k<n;k++)
        //         {
        //             if(arr[i]+arr[j]+arr[k]==0)
        //             {
        //                 List<Integer> temp = new ArrayList<>();
        //                 temp.add(arr[i]);
        //                 temp.add(arr[j]);
        //                 temp.add(arr[k]);


        //                 Collections.sort(temp);

        //                 st.add(temp);
        //             }
        //         }
        //     }
        // }

        // res.addAll(st);
        // System.out.println(res);

        // Set<List<Integer>> st = new HashSet<>();
        // List<List<Integer>> ans = new ArrayList<>();

        // int n=arr.length;

        // for(int i=0;i<n;i++)
        // {
        //     Set<Integer> hashset = new HashSet<>();
        //     for(int j=i+1;j<n;j++)
        //     {
        //         int third = -(arr[i]+arr[j]);
        //         if(hashset.contains(third))
        //         {
        //             List<Integer> temp = Arrays.asList(arr[i],arr[j],third);    
        //             Collections.sort(temp);
        //             st.add(temp);
        //         }
        //         hashset.add(arr[j]);
        //     }
        // }

        // ans.addAll(st);
        // System.out.println(ans);




        // Optimal Approach 

        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);

        for(int i=0;i<n;i++)
        {
            if(i>0 && arr[i]==arr[i-1])
            {
                continue;
            }
            int j=i+1;
            int k=n-1;

            while(j<k)
            {
                int sum = arr[i]+arr[j]+arr[k];

                if(sum<0)
                {
                    j++;
                }
                else if(sum>0)
                {
                    k--;
                }
                else
                {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    ans.add(temp);

                    j++;
                    k--;

                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--;
                }
            }
        }
        System.out.println(ans);
    }
}
