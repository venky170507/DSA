package ArrayProblems;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean Question(int[] arr)
    {
        HashSet<Integer> hset = new HashSet<>();

        for(int num:arr)
        {
            if(hset.contains(num))
            {
                return true;
            }
            hset.add(num);
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1};

        // HashMap<Integer,Integer> ans = new HashMap<>();

        // for(int i : arr)
        // {
        //     ans.put(i, ans.getOrDefault(i, 0)+1);
        // }

        // for(int i : ans.keySet())
        // {
        //     if(ans.get(i)>1)
        //     {
        //         System.out.println("Element "+i+" is Duplicate");
        //         return;
        //     }
        // }
        Question(arr);

    }
}
