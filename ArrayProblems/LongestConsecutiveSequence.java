package ArrayProblems;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,2,1,1};
        
        HashSet<Integer> setl = new HashSet<>();
        for(int num:arr)
        {
            setl.add(num);
        }

        int maxCount = 0;
        for(int num : setl)
        {
            if(!setl.contains(num-1))
            {
                int current = num;
                int count = 1;

                while (setl.contains(current+1)) 
                {
                    current++;    
                    count++;
                }

                maxCount=Math.max(maxCount, count);
            }
        }

        System.out.println(maxCount);
    }
}
