package Sortings;
import java.util.*;
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

    public static void SelectionSort(int[] arr)
    {
        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            int minIndex=i;
            for (int j=0;j<n;j++)
            {
                if(arr[j]<minIndex)
                {
                    minIndex=j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={9,0,4,5,6,7,2,1};

        if(arr.length==0)
        {
            System.out.println("Array is Empty!");
        }
        else
        {
            System.out.println("1.Bubble Sort");
            System.out.println("2.Selection Sort");

            System.out.println("Enter Your Sorting Choice : ");
            int choice = sc.nextInt();

            System.out.println("Array before Sorting : ");
            for(int num : arr)
            {
                System.out.print(num +" ");
            }

            switch(choice)
            {
                case 1:
                    BubbleSort(arr);
                    break;
                case 2:
                    SelectionSort(arr);
                    break;
                default:
                    System.out.println("Invalid Input");
                    sc.close();
            }
            

            System.out.println("\nArray After Sorting : ");
            for(int num : arr)
            {
                System.out.print(num +" ");
            }
        }
        

        
    }   
}
