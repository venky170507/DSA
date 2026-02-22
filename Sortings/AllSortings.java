package Sortings;

public class AllSortings {

    public static void BubbleSort(int[] arr)
    {
        int n=arr.length;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={9,0,4,5,6,7,2,1};

        if(arr.length==0)
        {
            System.out.println("Array is Empty!");
        }
        else 
        {
            System.out.println("Array Before Sorting: ");
            for(int num:arr)
            {
                System.out.print(num+" ");
            }
            BubbleSort(arr);
            System.out.println("\nArray After Sorting: ");
            for(int num:arr)
            {
                System.out.print(num+" ");
            }
        }
        
    }   
}
