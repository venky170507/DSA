package ArrayProblems;

import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] arr ={1,2};

        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(int i : map.keySet())
        {
            if(map.get(i)>(arr.length)/3)
            {
                res.add(i);
            }
        }

        System.out.println(res);
    }
}
