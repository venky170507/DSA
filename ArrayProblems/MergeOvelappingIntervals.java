package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOvelappingIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        int n=arr.length;
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            int start = arr[i][0];
            int end=arr[i][1];

            if(!ans.isEmpty() && end <= ans.get(ans.size()-1).get(1))
            {
                continue;
            }
            for(int j=i+1;j<n;j++)
            {
                if(arr[j][0]<=end)
                {
                    end=Math.max(end, arr[j][1]);
                }
                else
                {
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
        }

        System.out.println(ans);
    }
}
