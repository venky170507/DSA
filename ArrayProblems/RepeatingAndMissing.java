package ArrayProblems;

public class RepeatingAndMissing {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,6};
        int n= arr.length;

        // ArrayList<Integer> res=new ArrayList<>();
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i : arr)
        // {
        //     map.put(i, map.getOrDefault(i, 0)+1);
        // }

        // for(int num : map.keySet())
        // {
        //     if(map.get(num)>1)
        //     {
        //         res.add(num);
        //     }
        // }

        // for(int i=1;i<=arr.length;i++)
        // {
        //     if(!map.containsKey(i))
        //     {
        //         res.add(i);
        //     }
        // }

        // int finalArray[] = new int[res.size()];
        // for(int i=0;i<res.size();i++)
        // {
        //     finalArray[i]=res.get(i);
        // }





        // int[] hash = new int[n+1];
        // for(int i=0;i<n;i++)
        // {
        //     hash[arr[i]]++;
        // }

        // int repeating = -1,missing=-1;

        // for(int i=1;i<=n;i++)
        // {
        //     if(hash[i]==2) repeating=i;
        //     else if(hash[i]==0) missing=i;


        //     if(repeating !=-1 && missing!=-1) break;
        // }

        // System.out.println("Missing Number: "+missing);
        // System.out.println("Repeating Number : "+repeating);

        long s=0,sn,s2=0,s2n;

        sn=(n*(n+1))/2;
        s2n=(n*(n+1)*(2*n+1))/6;

        for(int i=0;i<n;i++)
        {
            s+=arr[i];
            s2+=(arr[i]*arr[i]);
        }

        long val1=s-sn;
        long val2=s2-s2n;

        val2=val2/val1;

        long x=(val1+val2)/2;
        long y=x-val1;

        System.out.println("Repeating : "+x+" Missing : "+y);
    }
}
