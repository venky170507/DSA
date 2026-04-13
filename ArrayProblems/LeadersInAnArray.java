package ArrayProblems;

import java.util.ArrayList;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr ={10,22,12,3,0,6};
        ArrayList<Integer> res=new ArrayList<>();
        
        // for(int i=0;i<arr.length;i++)
        // {
        //     int inum=arr[i];
        //     boolean isLeader = true;

        //     for(int j=i+1;j<arr.length;j++)
        //     {
        //         if(inum<arr[j])
        //         {
        //             isLeader=false;
        //             break;
        //         }
        //     }

        //     if(isLeader)
        //     {
        //         res.add(inum);
        //     }
        // }

        // System.out.println(res);



        // Optimal Approach 

        int max=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(max<arr[i])
            {
                max=arr[i];
                res.add(arr[i]);
            }
        }

        System.out.println(res);
    }
}
