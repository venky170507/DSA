package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numrows = 6;

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<numrows;i++)
        {
            List<Integer> row = new ArrayList<>();

            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    row.add(1);
                }
                else
                {
                    row.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }

            result.add(row);
        }

        System.out.println(result);
    }
}
