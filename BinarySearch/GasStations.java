package BinarySearch;

public class GasStations {
    public static double minimiseGasStations(int[] arr,int k)
    {
        int n=arr.length;

        int howMany[] = new int[n-1];

        for(int gasStations=1;gasStations<=k;gasStations++)
        {
            double maxSections=-1;
            int maxIndex=-1;

            for(int i=0;i<n-1;i++)
            {
                double diff=arr[i+1]-arr[i];
                double sectionLength=diff/(howMany[i]+1);

                if(sectionLength>maxSections)
                {
                    maxSections=sectionLength;
                    maxIndex=i;
                }
            }

            howMany[maxIndex]++;
        }

        double maxAns=-1;

        for(int i=0;i<n-1;i++)
        {
            double diff=arr[i+1]-arr[i];
            double sectionLength=diff/(howMany[i]+1);
            maxAns=Math.max(maxAns, sectionLength);
        }
        return maxAns;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int k=10;

        double res=minimiseGasStations(arr, k);
        System.out.println("Minimum Max Distance Possible : "+res);
    }
}
